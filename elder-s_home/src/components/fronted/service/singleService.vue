<style scoped>
  .main {
    width: 80%;
    min-width:960px;
    min-height:100vh;
    margin: 0 auto 60px;
    /*position: relative;*/
    overflow: visible;;
  }
  .ivu-menu-dark {
    /*opacity: 0.7;*/
    background: #aaa799;
  }
  .main .main_left{
    float:left;
    width:50%;
    height:520px;
  }
  .main .main_left .bigSrc{
    display:block;
    width:100%;
    height:400px;
  }
  .main .main_left li{
    display:inline-block;
    width:23%;
    height:100px;
    margin:10px 1%;
  }
  .main .main_left img{
    display:block;
    width:100%;
    height:100%;
  }
  .main .main_left .text{
    position: relative;
    left:0;
    bottom: 30px;
    line-height: 30px;
    width:100px;
    text-align: center;
    color:white;
    background-color: rgba(105, 105, 105, 0.56);
  }
  .main .main_right{
    float:left;
    width:50%;
    padding-left:10px;
  }
  .main_right ul{
    width:100%;
  }
  .main_right  .card{
    overflow: visible;
  }
  .main_right .title{
    font-size: 16px;
    color: #333;
    max-height: 40px;
    overflow: hidden;
    line-height: 20px;
    margin-top: 8px;
    margin-bottom: 8px;
    font-weight: 700;
  }
  .main_right .price{
     background-color: #faf5f8;
  }
  .main_right .real-price{
    font-family: arial;
    font-size: 48px;
    margin-left: 20px;
    display: inline-block;
    position: relative;
    color: #f43499;
    line-height: 1.2;
    margin-top: 13px;
  }
  .main_right .Original_price{
    color: #666;
    font-size: 14px;
  }
  .main_right .card_left{
    display:inline-block;
    width:150px;

    /*font-weight: bold;*/
  }
  .main_right .card_li{
    margin-bottom:10px;
    overflow:visible;
  }
  .main_right li{
    text-align: left;
    line-height:30px;
    margin-bottom: 5px;
  }
  .main_right li .li_left{
    /*display:inline-block;*/
    /*width:150px;*/
    /*font-weight: bold;*/
  }
  .main_right li .li_right{
    /*display:inline-block;*/
  }

</style>
<template>
  <div>
    <div class="main ">
      <Breadcrumb>
        <Breadcrumb-item href="/service">
          <Icon type="ios-home-outline"></Icon> 服务概览
        </Breadcrumb-item>
        <Breadcrumb-item >
          <span style="color:orange"><Icon type="pound"></Icon> {{ProjectData.projectName}}服务详情</span>
        </Breadcrumb-item>
      </Breadcrumb>
      <div class="main_left">
        <img :src="bigSrc" class="bigSrc">
        <!--<div  class="text">{{Text}} </div>-->
        <ul>
          <li @click="exchange(item,index)"  v-for="(item,index) in   ProjectData.projectServicePicture" :key="item.index">
            <img :src="item">
          </li>
        </ul>
      </div>
      <div class="main_right">
        <Card  class="card">
          <!--<div >-->
            <div class="card_li">{{ProjectData.typeName}}</div>
          <div class="title card_li">{{ProjectData.projectName}}</div>
          <div class="price card_li">
            <span  class="real-price" >
              <span  style="font-size: 20px;">￥</span>
              <span>{{ProjectData.projectSalePrice}}</span>
            </span>
            <span class="Original_price"style="text-decoration: line-through;">￥{{ProjectData.projectPrice}}</span>
          </div>
          <div class="card_li">
            <span class="card_left">内容</span>
            <span>{{ProjectData.projectContentDescrible}}</span>
          </div>
          <div class="card_li">
            <span class="card_left">适用条件</span>
            <span>{{ProjectData.projectServiceConditions}}</span>
          </div>
          <div class="card_li">
            <span class="card_left">请选择服务人员</span>
            <Select v-model="projOrder.serviceOrderId" style="width:200px"placeholder="请选择服务人员">
              <Option v-for="item in serviceData" :value="item.value" :key="item">{{ item.label }}</Option>
            </Select>
          </div>
          <div class="card_li">
            <span class="card_left">请选择老人</span>
            <Select v-model="projOrder.oldId" style="width:200px"placeholder="请选择老人">
              <Option v-for="item in oldData" :value="item.value" :key="item">{{ item.label }}</Option>
            </Select>
          </div>
          <div class="card_li ">
            <span class="card_left">请选择服务时间</span>
            <Date-picker type="datetimerange" format="yyyy-MM-dd HH:mm" placeholder="选择日期和时间（不含秒）" style="display:inline-block;width: 200px" v-model="projOrder.time"></Date-picker>
          </div>

          <div class="card_li">
            <span class="card_left">选择支付方式</span>
            <Select v-model="projOrder.payWays" style="width:200px"placeholder="请选择支付方式">
              <Option v-for="item in payFunction" :value="item.value" :key="item">{{ item.label }}</Option>
            </Select>
          </div>
          <div class="card_li">
            <span class="card_left">备注信息</span>
            <Input v-model=" projOrder.remarks" type="textarea" :rows="4" placeholder="请输入需要服务人员注意的信息"></Input>
          </div>
          <div class="card_li"style="text-align:center;">
            <Button style="background-color: #f10180;border: 1px solid #f10180;color:white;" @click="handleSubmit(projOrder)">提交订单</Button>
          </div>
        </Card>
      </div>
    </div>
    <!--<Button @click="modal2 = true">自定义页头和页脚</Button>-->
    <Modal v-model="modal2" width="360">
      <p slot="header" style="color:#f60;text-align:center">
        <!--<Icon type="information-circled"></Icon>-->
        <span>请使用支付宝扫码支付</span>
      </p>
      <div style="text-align:center">
       <img :src="srcPay" style="width:100%;height:100%;">
      </div>
      <div slot="footer">
        <Button type="error" size="large" long  @click="pay()">支付完成</Button>
      </div>
    </Modal>
  </div>
</template>
<script>
  import src1 from '../../../assets/home/peihu.jpg'
  import src2 from '../../../assets/home/service10.jpg'
  import src3 from '../../../assets/home/service5.png'
  import src4 from '../../../assets/home/home2.jpg'
  import paySrc from '../../../assets/home/pay.png'

  const localStorage = window.localStorage
  import axios from 'axios' //引入axios

  export default {
    components: {},
    data () {
      return {
        srcPay:paySrc,
        bigSrc:src1,
        Text:'小区全景图',
        ProjectData: {
          projectName: '陪护',
          typeName:'生活照料',
          projectContentDescrible: '陪老人解闷',
          projectPrice: '60',
          projectLimitedNumber:'10',
          projectServiceConditions:'无基本要求',
          projectSalePrice:'50',
          projectServiceTime:'2017年6月1日上午',
          projectServicePicture:[src1,src2,src3,src4],
          isFeatures:'否',
          remarks:'逗老人开心',
          projectTypeId:'1'
        },
        projOrder:{
          serviceOrderId: '',
          projectId: '',
          oldName: '',
          serviceName:'',
          oldId:'',
          serviceNum:'',
          servicePrice:'',
          beginTime:'',
          endTime:'',
          serviceAddress:'',
          evaluationId:'',
          payStatus:'',
          orderStatus:'',
          remarks:'',
          payWays:'',
          time:''
        },
        //服务项目id，服务人员id，老人id，支付方式，备注信息
        oldData:[{
          value: '1',
          label: '曹植'
        },
          {
            value: '2',
            label: '小乔'
          }],
        serviceData:[
          {
            value: '1',
            label: '史湘云'
          },
          {
            value: '2',
            label: '香菱'
          },
          {
            value: '3',
            label: '晴雯'
          }
//          ,
//            {
////            value:'史湘云',label:'1',
//          servicePersonId:'',serviceName:'史湘云'
//        },{
////          value:'香菱',label:'2',
//          servicePersonId:'',serviceName:'香菱'
//        },{
////          value:'香菱',label:'3',
//          servicePersonId:'',serviceName:'香菱'
//        }
 ],
        payFunction:[{
          value: '1',
          label: '线上支付'
          },
          {
            value: '2',
            label: '线下支付'
          }],
        modal2:false
      }
    },
    methods:{
      exchange:function(data,index){
        this.bigSrc = data;
        this.Text = this.community.imgText[index];
      },
      handleSubmit(data){
        if(!localStorage.token){
          this.$Message.warning('使用该功能前请先登录!');
        }else{
            console.log(data)
            console.log(this.ProjectData.projectServiceTime)
            if(data.serviceOrderId&&data.oldId&&data.payWays){
              if(data.payWays == '1'){
                //线上支付
                this.modal2 = true

                //支付完成后的提醒

              }else{
                //线下支付
                this.$Message.success('请记得及时付款哦!');
                this.$router.go(0)
              }
            }else{
              this.$Message.warning('请将表单填写完整!');
            }
        }
      },
      pay(){
        this.modal2 = false;
        this.$Message.success('支付完成!');
        this.$router.go(0)
      }
    },
    computed:{
      name:function(){
        return this.$route.params.id
      }
    }
  }

</script>
