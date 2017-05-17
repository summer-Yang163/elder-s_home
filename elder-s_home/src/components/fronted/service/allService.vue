<style scoped>

  .footer{
    clear:both;
    position:static;
    width:100%;
    height:60px;
    background-color: #b8bfc8;
    text-align:center;
    padding-top:8px;
    z-index:100;
  }
  .card ul{

  }
  .card ul li{
    display:inline-block;
    width:25%;
    min-height:400px;
  }
  .card  .content img{
    width:90%;
    height:300px;
  }
</style>
<template>
  <div >
    <div style="overflow: auto">
      <h2  style="float:left"> 总体社区服务展示：</h2>
      <Cascader :data="community" trigger="hover"style="width:200px;float:right; "placeholder="查找单个社区服务"></Cascader>
    </div>
    <!--<div class="content">-->
      <div class="classification" v-for="(item,index) in  allService":key="index">
        <h2 style="color:orange" >{{item.typeName}}</h2>
        <Card  class="card" >
          <ul >
            <li v-for="(service,index) in  item.serviceDetail" :key="index">
              <!--<router-link :to="item.url" >-->

                <div class="content">
                  <h3>{{service.name}}</h3>
                  <img :src="service.src" >
                  <p class="text"> {{service.describle}}</p>
                  <p class="text">发布时间：{{service.price}}</p>
                </div>
              <!--</router-link>-->
            </li>
          </ul>
          <!--<Page class="page" :total="40" size="small" show-elevator show-sizer ></Page>-->
        </Card>
      </div>
  </div>
</template>
<script>
import src1 from '../../../assets/service/1.jpg'
import src2 from '../../../assets/service/doctor1.jpg'

  export default {
    components: { },
    data () {
      return {
        community: [{
          value: 'beijing',
          label: '北京',
          children: [
            {
              value: 'gugong',
              label: '故宫'
            },
            {
              value: 'tiantan',
              label: '天坛'
            },
            {
              value: 'wangfujing',
              label: '王府井'
            }
          ]
        },
          {
          value: 'jiangsu',
          label: '江苏',
          children: [
            {
              value: 'nanjing',
              label: '南京',
              children: [
                {
                  value: 'fuzimiao',
                  label: '夫子庙',
                }
              ]
            },
            {
              value: 'suzhou',
              label: '苏州',
              children: [
                {
                  value: 'zhuozhengyuan',
                  label: '拙政园',
                },
                {
                  value: 'shizilin',
                  label: '狮子林',
                }
              ]
            }
          ],
        }],
        allService:[{
          typeName:'生活照料',
          serviceDetail:[
              { name:'送餐',
                describle:'为老人提供基本午餐',
                price:'10.00',
                limitNumber:'50',
                condition:'',
                src:src1,

              }, { name:'助餐',
              describle:'为老人提供基本午餐',
              price:'10.00',
              limitNumber:'50',
              condition:'',
              src:src1,

            }, { name:'理发',
              describle:'为老人提供基本午餐',
              price:'10.00',
              limitNumber:'50',
              condition:'',
              src:src1,

            }, { name:'陪护',
              describle:'为老人提供基本午餐',
              price:'10.00',
              limitNumber:'50',
              condition:'',
              src:src1,
            }]
        },{
          typeName:'医疗保健',
          serviceDetail:[{ name:'陪同就医',
            describle:'陪同老人去医院看病',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'代买药品',
            describle:'陪同老人去医院看病',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'提醒老人吃药',
            describle:'在具体时间点通知老人吃药',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'检查老人血压',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          }]
        },{
          typeName:'物业维修',
          serviceDetail:[{ name:'家电维修',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src1,
          },{ name:'开锁服务',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src1,
          },{ name:'水龙头修理',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src1,
          },{ name:'空调修理',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src1,
          }]
        },{
          typeName:'家政便民',
          serviceDetail:[{ name:'买菜烧饭',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'代购商品',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'家庭保洁',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'洗衣洗被',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          }]
        },{
          typeName:'娱乐学习',
          serviceDetail:[{ name:'老人借书服务',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'老人课堂',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'老人中心预约',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'老人交流',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          }]
        },{
          typeName:'人文关怀',
          serviceDetail:[{ name:'心理咨询',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'疏导长者情绪',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'特殊天气提醒',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          },{ name:'节日祝贺',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src2,
          }]
        }]

      }
    }
  }
</script>
