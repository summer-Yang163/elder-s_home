<style scoped>
  .breadCrumb{
    margin:10px 10px;
    padding:0 0 10px;
    border-bottom:1px solid #d7dde4;
  }
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
  .main .main_right{
    float:left;
    /*width:750px;*/
    /*margin-left:100px;*/
    /*width:77%;*/
  }
  .layout-content-main .page{
    float:right;
    padding: 10px 0;
  }
</style>
<template>
  <div style="margin-bottom:70px;">
    <AddModal :ModalType="ModalType":conData ="userData" @changeMod ='onResChange'></AddModal>
    <Breadcrumb class="breadCrumb">
      <Breadcrumb-item href="/homeCenter">
        <Icon type="ios-home-outline"></Icon> 家人中心
            </Breadcrumb-item>
      <Breadcrumb-item href="/homeCenter/personTips" >
        <span style="color:orange"><Icon type="pound"></Icon>个性化提醒</span>
      </Breadcrumb-item>
      <Select v-model="model1"  style="width:150px ;float:right;margin-bottom: 10px;"value="model1" >
        <Option v-for="item in cityList" :value="item.value" :key="item">{{ item.label }}</Option>
      </Select>
      <!--<Button type="ghost" @click="modify=!Inf">修改</Button>-->

    </Breadcrumb>

    <div class="layout-content">
      <div class="layout-content-main">
        <Col class="demo-spin-col" v-if="spinshow">
        <Spin fix>数据加载中...</Spin>
        </Col>
        <div v-else>

          <Table border :columns="columns4" :data="data1"></Table>
          <Page  class="page" :total=data1.length show-total :page-size=pageSize @on-change="getUserData"></Page>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
  import axios from 'axios' //引入axios
  import * as types from '../../../store/types'
  const localStorage = window.localStorage
  import AddModal from '../common/addEvaluate'


  export default{
    components:{AddModal},

    data(){
      return {
        ModalType:false,
        userData:'',
        cityList: [
          {
            value: '1',
            label: '已过时提醒'
          },
          {
            value: '2',
            label: '未过时提醒'
          }
        ],
        model1: '1',
        columns5: [
          {
            type: 'index',
            width: 60,
            align: 'center',
            title:'#',
            key:'tipId'
          },
//          {
//            title: '提醒时间',
//            key: 'tipTime'
//          },
//          {
//            title: '提醒内容',
//            key: 'tipContent'
//          },
          {
            title: '提醒时间',
//            key: 'erl',
            children:[
            {
              title: '提醒时间',
              key: 'tipTime'
            },
            {
              title: '提醒内容',
              key: 'tipContent'
            }]
          },
//          {
//            title: '提醒内容',
//            key: 'erl'
//          },
          {
            title: '提醒人',
            key: 'serviceName'
          },

//          {
//            title: '是否完成提醒',
//            key: 'isComplete'
//          },
//          {
//            title: '用户评价单号',
//            key: 'evaluationId'
//          },
          {
            title: '备注',
            key: 'remarks'
          },
          {
            title: '添加评价',
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
                      this.add(params.index)
                    }
                  }
                },'添加评价')]
              )
            }
          }
        ],
        columns4:[
          {
            title: '测试',
            children: [
              {
                title: '测试2',
                children: [
                  {
                    title: '测试4',
                    children: [
                      {title: '测试5'},
                      {
                        title: '测试6',
                        children: [
                          {title: '测试7'}
                        ]
                      }
                    ]
                  },
                  {
                    title: '测试3'
                  }
                ]
              },
              {
                title: '测试3'
              }
            ]
          }
        ],
        data1:[],
        data2: [

//          {
//            tipId:'1',
////            tipTime:'2017年5月13日',
////            tipContent:'提醒诸葛流云老人吃药',
//            serviceName:'香菱',
//            isComplete:'1',
//            remarks:'注意药品用量'
//          },
//          {
//            tipId:'1',
//            erl: {
//              tipTime:'2017年5月13日',
//              tipContent:'提醒诸葛流云老人吃药'
//            },
////            tipTime:'2017年5月11日',
////            tipContent:'天气升温，注意提醒老人避暑',
//            serviceName:'晴雯',
//            isComplete:'1',
//            remarks:'家里适当准备降温的水果'
//          },
//          {
//            tipId:'1',
//            erl: {
//              tipTime:'2017年5月13日',
//              tipContent:'提醒诸葛流云老人吃药'
//            },
////            tipTime:'2017年5月7日',
////            tipContent:'老人最近心情不好，希望家人注意老人情绪',
//            serviceName:'香菱',
//            isComplete:'1',
//            remarks:'如有需要可以请求社区服务'
//          },{
//            tipId:'1',
//            erl: {
//              tipTime:'2017年5月13日',
//              tipContent:'提醒诸葛流云老人吃药'
//            },
////            tipTime:'2017年5月3日',
////            tipContent:'诸葛流云老人生日，记得回家与老人一起过生日哦',
//            serviceName:'香菱',
//            isComplete:'1',
//            remarks:'祝长寿'
//          }
        ],
        pageSize:4,
        spinshow:false
      }
    },
    created(){
      this.getUserData(1)
    },

    methods:{
      add(){
        this.ModalType=true;
        this.userData =false
      },
      onResChange(val){
        this.ModalType = val //外部改变ModalType的值
      },
      handleAdd () {
        this.formDynamic.items.push({
          value: ''
        });
      },
      handleRemove (index) {
        this.formDynamic.items.splice(index, 1);
      },
//      getUserData(current){
//        const getUserUrl = this.HOST+'/userDetails/queryAllUserDetailsByPage'
//        axios.post(getUserUrl,({
//          currentPage:current,
//          pageSize:this.pageSize
//        })).then((response) =>{
//          if(response.data.success){
//            console.log(response.data)
//            const Mode = response.data.pageMode
//            this.pageTotal = Mode.totalRows
//            this.data1 = Mode.dataList
//            for(let i =0;i<Mode.dataList.length;i++){
//              Mode.dataList[i].userGenderName=Mode.dataList[i].userGender==1? '男':'女';
//              if(Mode.dataList[i].userDetatilsUser){
//                Mode.dataList[i].userName= Mode.dataList[i].userDetatilsUser.userName
//                Mode.dataList[i].password= Mode.dataList[i].userDetatilsUser.password
//              }else{
//                Mode.dataList[i].userName= ''
//                Mode.dataList[i].password= ''
//              }
//            }
//            this.spinshow = true
//          }else{
//            this.$Message.error('获取数据失败！')
//          }
//        }).catch((error)=>{
//          this.$Message.error('请重新获取数据！')
//        });
//      },
      getUserData(current){
        if(localStorage.token =='王五'){
          this.data1  = this.data2
        }
      }
    }
  }
</script>
