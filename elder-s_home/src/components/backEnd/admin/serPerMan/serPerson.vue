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
        <Breadcrumb-item href="#">社区服务人员管理</Breadcrumb-item>
        <Breadcrumb-item>服务人员基本信息</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button style="margin-right:25px;" @click=" add()">新增</Button>
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
  import AddModal from './addPerson'
  import sysHead from '../../common/adminName'
  import axios from 'axios'
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
            key:'servicePersonId'
          },
          {
            title: '工号',
            key: 'serviceJobNum'
          },
          {
            title: '姓名',
            key: 'serviceName'
          },
          {
            title: '用户名',
            key: 'userName'
          },
          {
            title: '密码',
            key: 'password'
          },
          {
            title: '性别',
            key: 'serviceGender'
          },
          {
            title: '电话',
            key: 'servicePhone'
          },
          {
            title: '年龄',
            key: 'serviceAge'
          },
          {
            title: '服务社区',
            key: 'communityId'
          },
          {
            title: '工作年限',
            key: 'serviceWorkTime'
          },
          {
            title: '工作职位',
            key: 'serviceWorkPosition'
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
        servicePersonId: '1',
          serviceJobNum: '201305000023',
          serviceName: '里斯',
          userName:'zhangsan',
          password:'888888',
          serviceGender:'1',
            serviceGenderName:'男',
          servicePhone:'18362881781',
          serviceAge:'29',
          communityId:'1',
          serviceWorkTime:'4年',
          serviceWorkPosition:'社区主管'
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
