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
  <AddModal :ModalType="ModalType":conData ="userData" @changeMod ='onResChange'></AddModal>
    <sysHead></sysHead>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站后台管理</Breadcrumb-item>
        <Breadcrumb-item href="#">用户管理</Breadcrumb-item>
        <Breadcrumb-item>普通用户管理</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button style="margin-right:25px;"  @click=" add()">新增</Button>
        <!--<Button >批量删除</Button>-->
      </div>
    </div>
    <div class="layout-content">
      <div class="layout-content-main">
        <row v-bind:style = "{display:spinshow}">
          <Col class="demo-spin-col" >
          <Spin fix>加载中...{{spinshow}}</Spin>
        </Col>
        </row>
        <div v-bind:style = "{display:'none'}">
        <Table border :columns="columns4" :data="data1"></Table>
        <Page  class="page" :total="pageTotal" show-total :page-size=pageSize @on-change="getUserData"></Page>
        </div>
      </div>
    </div>'
    <div class="layout-copy">
      2017-05 &copy; TalkingData
    </div>
  </div>

</template>
<script>
import AddModal from './userAdd'
import sysHead from '../../common/adminName'
import axios from 'axios'
  export default {
    components:{AddModal,sysHead},
    data(){
          return {
            ModalType:false,
            userData:'',
            columns4: [
              {
                type: 'index',
                width: 60,
                align: 'center',
                title:'#',
                key:'userDetailsId'
              },{
                title: '用户名',
                key: 'userDetatilsUser.userName'
              },{
                title: '登陆密码',
                key: 'password'
              },
              {
                title: '真实姓名',
                key: 'trueName'
              },
              {
                title: '性别',
                key: 'userGender'
              },
              {
                title: '电话',
                key: 'userPhone'
              },
              {
                title: '年龄',
                key: 'userAge'
              },
              {
                title: '邮箱',
                key: 'userEmail'
              },
//              {
//                title: '入住社区',
//                key: ''
//              },
              {
                title: '地址',
                key: 'userAddress'
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
                userDetatilsUser:{
                  userName: 'deh',
                  password: 'dee',
                },
                trueName: 'deee',
                userGender:'1',
                userPhone:'11',
                userAge:'1',
                userEmail:'2222',
                userAddress:'22',
                userDetailsId:2}
            ],
            pageSize:6,
            pageTotal:0,
            spinshow:'block'
          }
      },
    created(){
        this.getUserData(1)
    },
    computed:{

    },
    watch:{
      '$route': 'getUserData(1)'
    },
    methods:{
      getUserData(current){
        this.spinshow = 'none'
        const getUserUrl = this.HOST+'/userDetails/queryAllUserDetailsByPage'
        axios.post(getUserUrl,({
          currentPage:current,
          pageSize:this.pageSize
        })).then((response) =>{
//          console.log(response.data.success)
            if(response.data.success){
              console.log(this.spinshow)
              const pageMode = response.data.pageMode
              console.log(pageMode.totalRows);
                this.pageTotal = pageMode.totalRows
//              const userData = response.data.dataList
//                data1 = response.data.dataList

              this.$nextTick()
//              console.log(this.spinShow)
            }
        if(!response.data.success){
          data1 = response.data;
        }else{
          next(false)
        }
      },(response)=>{
              console.log(2)
//        next(false)
      }).catch((error)=>{
          console.log(3)
//        next(false)
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
      },
      remove (index) {
        console.log(index)
//        this.data6.splice(index, 1);
      },
    }
  }
</script>
<!-- 增删改查-->
