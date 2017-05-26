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
        <Breadcrumb-item href="#">时光驿站后台管理</Breadcrumb-item>
        <Breadcrumb-item href="#">新闻管理</Breadcrumb-item>
        <Breadcrumb-item>已有新闻管理</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <!--<Button style="margin-right:25px;"  @click=" add()">新增</Button>-->
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
    </div>'
    <div class="layout-copy">
    2017-05 &copy; TalkingData
  </div>
  </div>

</template>
<script>
//  import AddModal from './addNews'
  import sysHead from '../../common/adminName'
  import axios from 'axios'
  export default {
    components:{sysHead},
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
            key:'newsId'
          },{
            title: '新闻标题',
            key: 'newsTitle'
          },{
            title: '新闻简介',
            key: 'newsBrief'
          },
          {
            title: '发布时间',
            key: 'publishTime'
          },
          {
            title: '重要程度',
            key: 'importent'
          },
          {
            title: '新闻发布人',
            key: 'servicePersonId'
          },
          {
            title: '发布社区',
            key: 'communityName'
          },
          {
            title: '类型',
            key: 'communityNewsType'
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
        data1: [],
        pageSize:7,
        pageTotal:0,
        spinshow:true
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
        const getUserUrl = this.HOST+'/userDetails/queryAllUserDetailsByPage'
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
        const deleteUrl = this.HOST+'/userDetails/deleteUserDetailsByUserDetailsId/'+this.data1[index].userDetailsId
        axios.post(deleteUrl).then((json)=>{
          if(json.data.success){
            this.$Message.success('删除账号成功');
            this.$router.go(0)
          }else{
            this.$Message.error('删除账号失败');
          }
        }).catch((error)=>{
          this.$Message.error('删除失败');
        })
//        this.data6.splice(index, 1);
      },
    }
  }
</script>
<!-- 增删改查-->
