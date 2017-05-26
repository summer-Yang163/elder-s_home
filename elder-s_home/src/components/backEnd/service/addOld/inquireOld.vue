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
    <sysHead></sysHead>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站社区服务工作系统</Breadcrumb-item>
        <Breadcrumb-item href="#">社区老人信息添加</Breadcrumb-item>
        <Breadcrumb-item>已有老人信息</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <!--<Button  style="margin-right:25px;"@click=" add()" >新增</Button>-->
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
  import sysHead from '../../common/adminName'
  import AddModal from './addOld'
  import axios from 'axios'

  export default {
    data(){
      return {
        spinshow:false,
        ModalType:false,
        userData:'',
        pageSize:8,
        columns4: [
          {
            type: 'index',
            width: 60,
            align: 'center',
            title:'#',
            key:'oldId'
          },
          {
            title: '姓名',
            key: 'oldName'
          },
          {
            title: '性别',
            key: 'oldGender'
          },
          {
            title: '电话',
            key: 'oldPhone'
          }, {
            title: '年龄',
            key: 'oldAge'
          }, {
            title: '身份证号',
            key: 'idCard'
          },
          {
            title: '老人图片',
            key: 'oldPhoto'
          },
          {
            title: '紧急联系人',
            key: 'oldEmContact'
          }, {
            title: '紧急联系电话',
            key: 'oldEmPhone'
          },
          {
            title: '入住社区',
            key: 'oldCommunityId'
          },
          {
            title: '备注',
            key: 'remarks'
          }
        ],
        data1: [
        ]

      }
    },
    components:{sysHead},
    created(){
      this.getUserData(1)
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
      }


    }
  }
</script>
