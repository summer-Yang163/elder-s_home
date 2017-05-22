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
    <AddModal :ModalType="ModalType" @changeMod ='onResChange'></AddModal>
    <div class="layout-header">

    </div>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站后台管理</Breadcrumb-item>
        <Breadcrumb-item href="#">用户管理</Breadcrumb-item>
        <Breadcrumb-item>系统账号管理</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button  @click="ModalType = true" style="margin-right:25px;">新增</Button>
        <!--<Button >批量删除</Button>-->
      </div>
    </div>
    <div class="layout-content">
      <div class="layout-content-main">
        <Table border :columns="columns4" :data="data1"></Table>
        <Page  class="page" :total=data1.length show-total :page-size=pagelength @on-change="change"></Page>
      </div>
    </div>
    <div class="layout-copy">
      2017-05 &copy; TalkingData
    </div>
  </div>

</template>
<script>
  import AddModal from './systemModal'
  export default {
      components:{AddModal},
    data(){
      return {
        pagelength:8,
        ModalType:false,
        columns4: [
          {
            type: 'index',
            width: 60,
            align: 'center',
            title:'#'
          },
          {
            title: '用户名',
            key: 'User_Name'
          },
          {
            title: '用户密码',
            key: 'Password'
          },
          {
            title: '用户类型',
            key: 'Type_Name'
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
            User_Name: '王小明',
            Password: '123456',
            Type_Name: '普通用户'
          },
          {
            User_Name: '张小刚',
            Password: '123456',
            Type_Name: '网站工作人员'
          },
          {
            User_Name: '王小明',
            Password: '123456',
            Type_Name: '普通用户'
          },
          {
            User_Name: '王小明',
            Password: '123456',
            Type_Name: '普通用户'
          },
          {
            User_Name: '张小刚',
            Password: '123456',
            Type_Name: '网站工作人员'
          },
          {
            User_Name: '王小明',
            Password: '123456',
            Type_Name: '普通用户'
          }
        ],
        getUrl:'/api/18342/register'
      }
    },
    created:function() {
      // 组件创建完后获取数据，
      // 此时 data 已经被 observed 了
      this.fetchData()
    },
    computed:{

    },
    watch:{
      '$route': 'fetchData'
    },
    methods:{
      onResChange(val){
          this.ModalType = val //外部改变ModalType的值
      },
      modify (index) {
          console.log(index)
        this.$Modal.info({
          title: '用户信息',
          content: `用户名：${this.data1[index].User_Name}<br>用户密码：${this.data1[index].Password}<br>用户类型：${this.data1[index].Type_Name}`
        })
      },
      remove (index) {
          console.log(index)
//        this.data6.splice(index, 1);
      },
      fetchData () {
          console.log('enter')
        this.error = this.post = null
        this.loading = true
        this.getPost(this.$route, (err, post) => {
          this.loading = false
          if (err) {
            this.error = err.toString()
          } else {
            this.post = post
          }
        })
      },
      getPost(data){
          console.log(data)
        this.$http.post(this.getUrl,data).then((json)=>{
        console.log(json.data);
      },(json)=>{
        this.$Message.info('获取信息成功');
      })
      },
      change(page){
        console.log(page)
      }
    }

  }
</script>
<!--
增加方法、删除方法、修改方法、整体删除方法、获取json数据
-->
