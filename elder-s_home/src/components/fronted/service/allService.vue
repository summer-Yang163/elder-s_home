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
              <!--<router-link to="1" class="">-->

                <div class="content">
                  <h3>{{service.name}}</h3>
                  <router-link to="1" >
                  <img :src="service.src" >
                  </router-link>
                  <p class="text"> {{service.describle}}</p>
                  <p class="text">服务价格：{{service.price}}</p>
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
import src11 from '../../../assets/service/1.jpg'
import src12 from '../../../assets/home/weishi.jpeg'
import src13 from '../../../assets/home/lifa.jpg'
import src14 from '../../../assets/home/service10.jpg'
import src21 from '../../../assets/home/service.jpg'
import src22 from '../../../assets/home/peihu.jpg'
import src23 from '../../../assets/home/chiyao.jpg'
import src24 from '../../../assets/home/xueya.jpg'
import src31 from '../../../assets/home/dianshi.jpg'
import src32 from '../../../assets/home/kaisuo.jpg'
import src33 from '../../../assets/home/shuilongtou.jpg'
import src34 from '../../../assets/home/kongtiao.jpg'
import src41 from '../../../assets/home/maicai.jpg'
import src42 from '../../../assets/home/daigou.jpg'
import src43 from '../../../assets/home/baojie.jpg'
import src44 from '../../../assets/home/xiyi.jpg'
import src51 from '../../../assets/home/service8.jpg'
import src52 from '../../../assets/home/service2.jpg'
import src53 from '../../../assets/home/service4.jpg'
import src54 from '../../../assets/home/service9.jpg'
import src61 from '../../../assets/home/zixun.jpg'
import src62 from '../../../assets/home/shudao.jpg'
import src63 from '../../../assets/home/tianqi.jpg'
import src64 from '../../../assets/home/jieri.jpg'

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
                src:src11,

              }, { name:'助餐',
              describle:'帮助老人吃饭',
              price:'10.00',
              limitNumber:'50',
              condition:'',
              src:src12,

            }, { name:'理发',
              describle:'为老人打理头发',
              price:'10.00',
              limitNumber:'50',
              condition:'',
              src:src13,

            }, { name:'陪护',
              describle:'陪伴老人',
              price:'20.00',
              limitNumber:'50',
              condition:'',
              src:src14,
            }]
        },{
          typeName:'医疗保健',
          serviceDetail:[{ name:'陪同就医',
            describle:'陪同老人去医院看病',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src21,
          },{ name:'帮助老人康复',
            describle:'陪同老人去医院看病',
            price:'30.00',
            limitNumber:'50',
            condition:'',
            src:src22,
          },{ name:'提醒老人吃药',
            describle:'在具体时间点通知老人吃药',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src23,
          },{ name:'检查老人血压',
            describle:'定期检车老人血压状况',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src24,
          }]
        },{
          typeName:'物业维修',
          serviceDetail:[{ name:'电视维修',
            describle:'为老人修理家里电视',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src31,
          },{ name:'开锁服务',
            describle:'帮助老人开锁',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src32,
          },{ name:'水龙头修理',
            describle:'帮助老人修理水龙头',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src33,
          },{ name:'空调修理',
            describle:'帮助老人修理空调',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src34,
          }]
        },{
          typeName:'家政便民',
          serviceDetail:[{ name:'买菜烧饭',
            describle:'帮助行动不便的老人买菜做饭',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src41,
          },{ name:'代购商品',
            describle:'根据老人需求帮助老人购物',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src42,
          },{ name:'家庭保洁',
            describle:'帮助老人清洁家里',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src43,
          },{ name:'洗衣洗被',
            describle:'帮助老人洗衣洗被',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src44,
          }]
        },{
          typeName:'娱乐学习',
          serviceDetail:[{ name:'老人借书服务',
            describle:'社区图书馆允许老人借书，可以送书上门',
            price:'2.00',
            limitNumber:'50',
            condition:'',
            src:src51,
          },{ name:'老人课堂',
            describle:'为老人多样的学习课堂',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src52,
          },{ name:'老人中心预约',
            describle:'提前预约老人中心，方便工作人员安排座位',
            price:'0.00',
            limitNumber:'50',
            condition:'',
            src:src53,
          },{ name:'老人交流',
            describle:'组织老人交流会',
            price:'0.00',
            limitNumber:'50',
            condition:'',
            src:src54,
          }]
        },{
          typeName:'人文关怀',
          serviceDetail:[{ name:'心理咨询',
            describle:'倾听老人心情，接受心理问题咨询',
            price:'20.00',
            limitNumber:'50',
            condition:'',
            src:src61,
          },{ name:'疏导长者情绪',
            describle:'帮助老人恢复心情，安慰老人',
            price:'10.00',
            limitNumber:'50',
            condition:'',
            src:src62,
          },{ name:'特殊天气提醒',
            describle:'特殊天气时提醒老人加衣、防滑等',
            price:'1.00',
            limitNumber:'50',
            condition:'',
            src:src63,
          },{ name:'节日祝贺',
            describle:'在各种节日为老人送去节日关怀',
            price:'0.00',
            limitNumber:'50',
            condition:'',
            src:src64,
          }]
        }]

      }
    }
  }
</script>
