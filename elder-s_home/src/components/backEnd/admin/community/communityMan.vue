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
  .layout-header {
    height: 60px;
    background: #fff;
    box-shadow: 0 1px 1px rgba(0, 0, 0, .1);
  }
  .layout-content-main .page{
    float:right;
    padding: 10px 0;
  }
</style>
<template>
  <div >
  <AddModal :ModalType="ModalType":conData ="userData" @changeMod ='onResChange'></AddModal>
    <sysHead></sysHead>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站后台管理</Breadcrumb-item>
        <Breadcrumb-item href="#">社区管理</Breadcrumb-item>
        <Breadcrumb-item>社区基本情况</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button  style="margin-right:25px;"  @click=" add()">新增</Button>
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
import AddModal from './addCommunity'
import sysHead from '../../common/adminName'
import axios from 'axios'
import src1 from '../../../../assets/community/1.jpg'

export default {
   components:{AddModal,sysHead},
    data(){
      return {
           ModalType:false,
           userData:'',
           pageSize:6,
          spinshow:false,
        columns4: [
          {
            type: 'index',
            width: 60,
            align: 'center',
            title:'#',
            key:'communityId'
          },
          {
            title: '社区名称',
            key: 'communityName'
          },
          {
            title: '社区电话',
            key: 'communityPhone'
          },
          {
            title: '负责员工',
            key: 'servicePersonName'
          },
          {
            title: '社区图片',
            key: 'communityPhoto'
          },
//          {
//            title: '社区描述',
//            key: 'communityDescribe'
//          },
          {
            title: '平均房价',
            key: 'communityHousePrice'
          },
          {
            title: '租房价格',
            key: 'communityRentPrice'
          },
          {
            title: '社区地址',
            key: 'communityAddressName'
          },
//          {
//            title: '相关服务',
//            key: 'communityServiceId'
//          },
//          {
//            title: '详情',
//            width: 70,
//            key: 'Type_Name',
//            render: (h,params) => {
//              return h('div',[
//                h('span', {
//                  props: {
//                    type: 'edit'
//                  },
//                  on: {
//                    click: () => {
//                      this.modify(params.index)
//                    }
//                  }
//                },'详情')]
//              )
//            }
//          },
          {
            title: '详情修改',
            width: 100,
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
                },'详情修改')]
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
        formValidate: {
          communityId: '',
          communityName: '',
          communityPhone: '',
          servicePersonId:'',
          communityPhoto:'',
          communityDescribe:'',
          communityHousePrice:'',
          communityRentPrice:'',
          communityAddressId:'',
          communityServiceId:''
        },
        data1: [
          {
            communityId:'',
            communityName:'北苑家园',
            communityPhone:'0551--63831525',
            communityAddressId:'1',
            communityAddressName:'湖北省荆州市沙市区',
            servicePersonId:'1',
            servicePersonName:'里斯',
            communityDescribe:'北苑家园占地13.25公顷，紧邻荆州市商业繁华区，交通便利，周边学校、医院等公共服务设施齐备，且分布均匀，地理位置优越。北苑家园定位高端，项目规划、设计、施工、后期的服务与管理等各个方面不断完善和学习先进的理念，项目一经推出即受到广大消费者的厚爱与追捧。',
            communityHousePrice:'8000',
            communityRentPrice:'1400',
            communityPhoto:src1,
            communityServiceId:'1,2,3,4,5,6,7,8,9,10'
      }
        ]
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
