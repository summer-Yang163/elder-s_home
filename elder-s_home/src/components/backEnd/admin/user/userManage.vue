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
    <div class="layout-header">
    </div>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站后台管理</Breadcrumb-item>
        <Breadcrumb-item href="#">用户管理</Breadcrumb-item>
        <Breadcrumb-item>普通用户管理</Breadcrumb-item>
      </Breadcrumb>
      <div class="addDelete">
        <Button style="margin-right:25px;" >新增</Button>
        <!--<Button >批量删除</Button>-->
      </div>
    </div>
    <div class="layout-content">
      <div class="layout-content-main">
        <Table border :columns="columns4" :data="data1"></Table>
        <Page  class="page" :total=data1.length show-total :page-size=pageSize></Page>
      </div>
    </div>
    <div class="layout-copy">
      2017-05 &copy; TalkingData
    </div>
  </div>

</template>
<script>
  import axios from 'axios'
  export default {
      data(){
          return {
            columns4: [
              {
                type: 'index',
                width: 60,
                align: 'center',
                title:'#'
              },
              {
                title: '姓名',
                key: 'name'
              },
              {
                title: '性别',
                key: ''
              },
              {
                title: '年龄',
                key: 'age'
              },
              {
                title: '电话',
                key: ''
              },
              {
                title: '入住地址',
                key: ''
              },
              {
                title: '地址',
                key: 'address'
              },
              {
                title: '关联老人',
                key: ''
              },
              {
                title: '关系',
                key: ''
              },
              {
                title: '用户等级',
                key: ''
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
                age: 18,
                address: '北京市朝阳区芍药居'
              },
              {
                name: '张小刚',
                age: 25,
                address: '北京市海淀区西二旗'
              },
              {
                name: '李小红',
                age: 30,
                address: '上海市浦东新区世纪大道'
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
            ],
            pageSize:8
          }
      },
    beforeRouteEnter (to, from, next) {
       const HOST = 'http://127.0.0.1:8087/elder_home'
      const valiNameUrl=HOST+'/user/validateUserName/'+'zhangsan'
      axios.post(valiNameUrl).then((response) =>{
        if(!response.data.success){
          data1 = response.data;
        }else{
          next(false)
        }
      },(response)=>{
        next(false)
      }).catch((error)=>{
        next(false)
      });
//      axios.get(to.params.id, (err, post) =>{
//      if (err) {
//        // display some global error message
//        next(false)
//      } else {
//        next(vm => {
//          vm.post = post
//        })
//      }
//    })
  },
  watch:{

  }
  }
</script>
