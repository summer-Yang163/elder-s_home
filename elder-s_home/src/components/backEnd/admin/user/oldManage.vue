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
        <Breadcrumb-item>社区老人管理</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button  style="margin-right:25px;"@click=" add()" >新增</Button>
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
          <Page  class="page" :total='pageTotal' show-total :page-size=pageSize @on-change="getUserData"></Page>
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
        spinshow:true,
        ModalType:false,
        userData:'',
        pageTotal:0,
        pageSize:6,
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
            key: 'oldGenderName'
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
          }
        ]

      }
    },
    components:{sysHead,AddModal},
    created(){
      this.getUserData(1)
    },
    watch:{
      '$route': 'getUserData(1)'
    },
    methods:{
      getUserData(current){
        console.log(current)
        const getUserUrl = this.HOST+'/oldMan/queryAllOldManByPage';
        axios.post(getUserUrl,{
          currentPage:current,
          pageSize:this.pageSize
        }).then((response) =>{
          console.log(response)
              this.spinShow = !this.spinShow;
              if(response.data.success) {
                const Mode = response.data.pageMode;
                console.log(Mode)
                for (let i = 0; i < Mode.dataList.length; i++) {

                  if (Mode.dataList[i].oldGender) {
                    Mode.dataList[i].oldGenderName = Mode.dataList[i].oldGender == 1 ? '男' : '女';
                  } else {
                    Mode.dataList[i].oldGenderName = ''
                  }
                }
                  this.pageTotal = Mode.totalRows;
                  this.data1 = Mode.dataList
                }
              else
                {
                  this.$Message.error('获取数据失败！')
                }

      }).catch((error)=>{
          this.$Message.error('请重新获取数据！')
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
        this.userData = this.data1[index];
      },
      remove (index) {
        console.log(index)
        console.log(this.data1[index].oldId);
        const delUrl = this.HOST+'/oldMan/deleteOldManByUserId/'+this.data1[index].oldId
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
//        this.data6.splice(index, 1);
      }

    }
  }
</script>
