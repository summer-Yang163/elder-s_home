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
        <Breadcrumb-item href="#">用户管理</Breadcrumb-item>
        <Breadcrumb-item>社区老人管理</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button  style="margin-right:25px;"@click=" add()" >新增</Button>
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
            name: '王小明',
            password: '123456',
            classify: '普通用户'
          },
          {
            name: '张小刚',
            password: '123456',
            classify: '网站工作人员'
          },
          {
            name: '李小红',
            password: '123456',
            classify: '超级管理员'
          },
          {
            name: '周小伟',
            age: 26,
            address: '深圳市南山区深南大道'
          },
          {
            name: '王小明',
            age: 18,
            address: '北京市朝阳区芍药居'
          },
          {
            name: '张小刚',
            age: 25,
            address: '北京市海淀区西二旗'
          }
        ]

      }
    },
    components:{sysHead,AddModal},
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
      }

    }
  }
</script>
