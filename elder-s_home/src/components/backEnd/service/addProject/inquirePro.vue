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
        <Breadcrumb-item href="#">时光驿站社区服务工作系统</Breadcrumb-item>
        <Breadcrumb-item href="#">发布服务项目</Breadcrumb-item>
        <Breadcrumb-item>服务项目查看</Breadcrumb-item>
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
          <Page  class="page" :total="pageTotal"  show-total :page-size=pageSize @on-change="getUserData"></Page>
        </div>
      </div>
    </div>
    <div class="layout-copy">
      2017-05 &copy; TalkingData
    </div>
  </div>

</template>
<script>
  import AddModal from './addProject.vue'
  import sysHead from '../../common/adminName'
  import axios from 'axios'
  export default {
    components:{AddModal,sysHead},
    data(){
      return {
        pageTotal:0,
        ModalType:false,
        userData:'',
        columns4: [
          {
            type: 'index',
            width: 60,
            align: 'center',
            title:'#',
            key:'projectId'
          },{
            title: '服务名称',
            key: 'projectName'
          },{
            title: '服务内容描述',
            key: 'projectContentDescrible'
          },
          {
            title: '服务价格',
            key: 'projectPrice'
          },
          {
            title: '服务名额',
            key: 'projectLimitedNumber'
          },
          {
            title: '服务适用条件',
            key: 'projectServiceConditions'
          },
          {
            title: '服务促销价格',
            key: 'projectSalePrice'
          },
          {
            title: '服务时间',
            key: 'projectServiceTime'
          },
          {
            title: '服务图片',
            key: 'projectServicePicture'
          },
          {
            title: '是否特色服务',
            key: 'isFeaturesName'
          },
          {
            title: '项目类型',
            key: 'typeName'
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
//          {
//            projectId: 'deh',
//            projectName: 'dee',
//            projectContentDescrible: 'deee',
//            projectPrice:'1',
//            projectLimitedNumber:'11',
//            projectServiceConditions:'1',
//            projectSalePrice:'2222',
//            projectServiceTime:'22',
//            projectServicePicture:2,
//            isFeatures:'22',
//            remarks:2,
//            }
        ],
        pageSize:6,
        spinshow:true
      }
    },
    created(){
      this.getUserData(1)
    },
    methods:{
      getUserData(current){
        console.log(current)
        const getUserUrl = this.HOST+'/project/queryAllProjectByPage';
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
              if (Mode.dataList[i].isFeatures) {
                Mode.dataList[i].isFeaturesName = Mode.dataList[i].isFeatures == 1 ? '是' : '否';
              } else {
                Mode.dataList[i].isFeaturesName = ''
              }
              Mode.dataList[i].typeName = Mode.dataList[i].projectProjectType.typeName
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
        this.userData = this.data1[index]
      },
      remove (index) {
        const delUrl = this.HOST+'/project/deleteProjectByProjectId/'+this.data1[index].projectId;
        axios.post(delUrl).then((response) =>{
          if(response.data.success){
            this.$router.go(0)
          }else{
            this.$Message.error('删除数据失败')
          }
        }).catch((error)=>{
          this.$Message.error('获取数据失败')
        });
      }
    }
  }
</script>
<!-- 增删改查-->
