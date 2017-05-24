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
    <AddModal :ModalType="ModalType":conData ="userData" @changeMod ='onResChange'></AddModal>
    <sysHead></sysHead>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站后台管理</Breadcrumb-item>
        <Breadcrumb-item href="#">用户管理</Breadcrumb-item>
        <Breadcrumb-item>系统账号管理</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button  @click=" add()" style="margin-right:25px;">新增</Button>
        <!--<Button >批量删除</Button>-->
      </div>
    </div>
    <div class="layout-content">
      <div class="layout-content-main">
        <row v-show="!spinshow">
          <Col class="demo-spin-col" >
          <Spin fix>数据加载中...</Spin>
          </Col>
        </row>
        <div v-show="spinshow">
          <Table border :columns="columns4" :data="data1"></Table>
          <Page  class="page" :total="pageTotal" show-total :page-size=pageSize @on-change="getUserData"></Page>
        </div>
      </div>
    </div>
    <div class="layout-copy">
      2017-05 &copy; TalkingData
    </div>
  </div>

</template>
<script>
  import AddModal from './systemModal'
  import sysHead from '../../common/adminName'
  import axios from 'axios'

  export default {
      components:{AddModal,sysHead},
    data(){
      return {
        pageSize:7,
        ModalType:false,
        userData:'',
        spinshow:false,
        columns4: [
          {
            type: 'index',
            width: 60,
            align: 'center',
            title:'#',
            key:'userId'
          },
          {
            title: '用户名',
            key: 'userName'
          },
          {
            title: '用户密码',
            key: 'password'
          },
          {
            title: '用户类型',
            key: 'typeName'
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
        ],
        getUrl:'/api/18342/register',
        pageTotal:0,
      }
    },
    created:function() {
      // 组件创建完后获取数据，
      // 此时 data 已经被 observed 了
      this.getUserData(1)
    },
    computed:{
    },
    watch:{
      '$route': 'getUserData(1)'
    },
    methods:{
      getUserData(current){
        console.log(current)
        const getUserUrl = this.HOST+'/user/queryAllUserByPage'
        axios.post(getUserUrl,{
          currentPage:current,
          pageSize:this.pageSize
        }).then((response) =>{
            console.log(response)
          if(response.data.success){
            const dataMode = response.data.pageMode.dataList
                for(let i =0;i<dataMode.length;i++){
                  dataMode[i].typeName =  dataMode[i].userUserType.typeName
                }
                this.data1 = dataMode
            this.pageTotal = this.pageTotal = response.data.pageMode.totalRows
          }else{
              this.$Message.error('获取数据失败')
          }
          this.spinshow = true
      }).catch((error)=>{
          this.$Message.error('获取数据失败')
      });
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
        this.userData.typeId = this.userData.typeId.toString()
      },
      remove (index) {
          console.log(index)
        console.log(this.data1[index].userId);
          const delUrl = this.HOST+'/user/deleteUserByUserId/'+this.data1[index].userId
        console.log(delUrl)
        axios.post(delUrl).then((response) =>{
          if(response.data.success){
              this.$router.go(0)
          }else{
            this.$Message.error('删除数据失败')
          }
        },(response)=>{
          this.$Message.error('获取数据失败')
        }).catch((error)=>{
          this.$Message.error('获取数据失败')
        });
      }
    }
  }
</script>
<!--
增加方法、删除方法、修改方法、整体删除方法、获取json数据
-->
