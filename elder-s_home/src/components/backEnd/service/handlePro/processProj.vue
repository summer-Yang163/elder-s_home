<style scoped>
  .layout-breadcrumb {
    padding: 10px 15px 0;
  }

  .layout-content {
    min-height: 200px;
    margin: 15px;
    overflow: hidden;
    background: #fff;
    border-radius: 4px;
  }

  .layout-breadcrumb .addDelete{
    /*border-top:1px solid #c1c3c5;*/
    float:right;
    /*padding:10px;*/
  }
  .layout-content-main {
    padding: 10px;
  }
  .layout-copy {
    text-align: center;
    padding: 10px 0 20px;
    color: #9ea7b4;
  }

  .layout-content-main .page{
    float:right;
    padding: 10px 0;
  }
  .demo-spin-icon-load{
    animation: ani-demo-spin 1s linear infinite;
  }
  @keyframes ani-demo-spin {
    from { transform: rotate(0deg);}
    50%  { transform: rotate(180deg);}
    to   { transform: rotate(360deg);}
  }
  .demo-spin-col{
    height: 200px;
    text-align: center;
    position: relative;
    font-size:30px;
    /*border: 1px solid #eee;*/
  }

</style>
<template>
  <div >
    <!--<AddModal :ModalType="ModalType":conData ="userData" @changeMod ='onResChange'></AddModal>-->
    <sysHead></sysHead>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站社区服务工作系统</Breadcrumb-item>
        <Breadcrumb-item href="#">社区服务项目处理</Breadcrumb-item>
        <Breadcrumb-item>服务项目处理进度</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <!--<Button style="margin-right:25px;"  @click=" add()">新增</Button>-->
        <!--<Button >批量删除</Button>-->
      </div>
    </div>
    <div class="layout-content">
      <div class="layout-content-main">
        <Col class="demo-spin-col" v-if="spinshow">
        <Spin fix>加载中...</Spin>
        </Col>
        <div v-else>
          <Table border :columns="columns4" :data="data1"></Table>
          <Page  class="page" :total=data1.length show-total :page-size=pageSize @on-change="getUserData"></Page>
        </div>
      </div>
    </div>
    <div class="layout-copy">
      2017-05 &copy; TalkingData
    </div>
  </div>

</template>
<script>
//  import AddModal from './addPersonOrder'
  import sysHead from '../../common/adminName'
  import axios from 'axios'
  export default {
    components:{sysHead},
    data(){
      return {
        ModalType:false,
        userData:'',
        columns4: [
//          {
//            type: 'index',
//            width: 60,
//            align: 'center',
//            title:'#'
//          },
          {
            title: '服务订单编号',
            key: 'serviceOrderId',
          },{
            title: '服务项目名称',
            key: 'projectName'
          },
          {
            title: '服务老人',
            key: 'oldName'
          },
          {
            title: '服务工作人员',
            key: 'serviceName'
          },
          {
            title: '下单用户',
            key: 'userName'
          },
          {
            title: '服务次数',
            key: 'serviceNum'
          },
          {
            title: '服务实际价格',
            key: 'servicePrice'
          },
          {
            title: '服务开始时间',
            key: 'beginTime'
          },
          {
            title: '服务结束时间',
            key: 'endTime'
          },
          {
            title: '服务地点',
            key: 'serviceAddress'
          },
          {
            title: '用户评价单号',
            key: 'evaluationId'
          },
          {
            title: '支付状态',
            key: 'payStatus'
          },
          {
            title: '订单状态',
            key: 'orderStatus'
          },
          {
            title: '备注',
            key: 'remarks'
          },
          {
            title: '修改',
            width: 70,
            key: 'Type_Name',
            render: (h,params) => {
              return h('div',[
                h('span', {
                  props: {
                    type: 'edit'
                  },
                  on: {
                    click: () => {
                      this.modify(params.index)
                    }
                  }
                },'修改')]
              )
            }
          },
          {
            title: '删除',
            width: 70,
            key: 'action',
            render: (h,params) => {
              return h('div',[
                h('span', {
                  props: {
                    type: 'close-round'
                  },
                  on: {
                    click: () => {
                      this.remove(params.index)
                    }
                  }
                },'删除')
              ])
            }
          }
        ],
        data1: [
          {
            serviceOrderId: '2017040180001',
            projectName: '送餐',
            oldName: '曹植',
            serviceName:'李四',
            userName:'王五',
            serviceNum:'1',
            servicePrice:'10',
            beginTime:'2017-04-01 10:00',
            endTime:'2017-04-01 12:00',
            serviceAddress:'百旺家苑1栋1单元302室',
            evaluationId:'2017040160001',
            payStatus:'已支付',
            orderStatus:'已完成',
            remarks:'不吃甜食',
          },
          {
            serviceOrderId: '2017040180002',
            projectName: '理发',
            oldName: '曹丕',
            serviceName:'李四',
            userName:'zhangsan',
            serviceNum:'1',
            servicePrice:'10',
            beginTime:'2017-04-21 10:00',
            endTime:'2017-04-21 12:00',
            serviceAddress:'百旺家苑1栋2单元302室',
            evaluationId:'2017040160002',
            payStatus:'已支付',
            orderStatus:'已完成',
            remarks:'尽量上午',
          },  {
            serviceOrderId: '201704018003',
            projectName: '特殊天气提醒',
            oldName: '诸葛亮',
            serviceName:'wangwu',
            userName:'zhaosi',
            serviceNum:'10',
            servicePrice:'1',
            beginTime:'2017-04-01 10:00',
            endTime:'2017-04-21 12:00',
            serviceAddress:'百旺家苑1栋1单元504室',
            evaluationId:'2017040160003',
            payStatus:'已支付',
            orderStatus:'已完成',
            remarks:'请遇到特殊天气时电话提醒',
          }
        ],
        pageSize:4,
        spinshow:false
      }
    },
    created(){
      this.getUserData(1)
    },
    watch:{
    },
    methods:{
      getUserData(current){
        console.log(current)
        const getUserUrl = this.HOST+'/user/queryAllCommonUserByPage/'+current+'/'+this.pageSize
//        axios.get(getUserUrl).then((response) =>{
//              this.spinShow = !this.spinShow
//              console.log(response)
////        if(!response.data.success){
////          data1 = response.data;
////        }else{
////          next(false)
////        }
//      },(response)=>{
//              console.log(2)
////        next(false)
//      }).catch((error)=>{
//          console.log(3)
////        next(false)
//      });
      },
      add(){
        this.ModalType=true;
        this.userData =false
      },
      onResChange(val){
        this.ModalType = val //外部改变ModalType的值
      },
      modify (index) {
        this.ModalType=true;
        this.userData = this.data1[index]
      },
      remove (index) {
        console.log(index)
//        this.data6.splice(index, 1);
      },
    }
  }
</script>
<!-- 增删改查-->
