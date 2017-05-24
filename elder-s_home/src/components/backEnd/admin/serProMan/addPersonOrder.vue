<style scoped>

</style>
<template>
  <Modal
    v-model="modal1=myModal"
    :title = "this.$props.conData === false? '新增服务订单' : '修改服务订单'"
    @on-ok="ok(formValidate)"
    @on-cancel="cancel" width="500"   :styles="{top: '20px'}">
    <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="100">
      <Form-item label="服务订单编号" prop="serviceOrderId">
        <Input v-model="formValidate.serviceOrderId" placeholder="请输入服务订单编号"></Input>
      </Form-item>
      <Form-item label="服务项目名称" prop="projectName">
        <Input v-model="formValidate.projectName" placeholder="请输入服务项目名称"></Input>
      </Form-item>
      <Form-item label="服务老人" prop="oldName">
        <Input v-model="formValidate.oldName" placeholder="请关联服务老人"></Input>
      </Form-item>
      <Form-item label="服务工作人员" prop="serviceName">
        <Input v-model="formValidate.serviceName" placeholder="请关联服务工作人员"></Input>
      </Form-item>
      <Form-item label="下单用户" prop="userName">
        <Input v-model="formValidate.userName" placeholder="请输入下单用户"></Input>
      </Form-item>
      <Form-item label="服务次数" prop="serviceNum">
        <Input v-model="formValidate.serviceNum" placeholder="请输入服务次数"></Input>
      </Form-item>
      <Form-item label="服务实际价格" prop="servicePrice">
        <Input v-model="formValidate.servicePrice" placeholder="请输入服务实际价格"></Input>
      </Form-item>
      <Form-item label="服务开始时间" prop="beginTime">
        <Input v-model="formValidate.beginTime" placeholder="请填写服务开始时间"></Input>
      </Form-item>
      <Form-item label="服务结束时间" prop="endTime">
        <Input v-model="formValidate.endTime" placeholder="请填写服务结束时间"></Input>
      </Form-item>
      <Form-item label="服务地点" prop="serviceAddress">
        <Input v-model="formValidate.serviceAddress" placeholder="请输入服务地点"></Input>
      </Form-item>
      <Form-item label="用户评价单号" prop="evaluationId">
        <Input v-model="formValidate.evaluationId" placeholder="请输入服务评价单号"></Input>
      </Form-item>
      <Form-item label="支付状态" prop="payStatus">
        <Input v-model="formValidate.payStatus" placeholder="请填写订单支付状态"></Input>
      </Form-item>
      <Form-item label="订单状态" prop="orderStatus">
        <Input v-model="formValidate.orderStatus" placeholder="请填写订单状态"></Input>
      </Form-item>
      <Form-item label="备注" prop="remarks">
        <Input v-model="formValidate.remarks" placeholder="填写服务订单备注信息"></Input>
      </Form-item>
    </Form>
  </Modal>
</template>
<script>
  export default {
    props:[ 'ModalType','conData'],
    data(){
      return {
//          title:this.$props.conData ? '修改用户管理' : '新增用户管理',
        modal1:false,
        myModal:this.ModalType,//首先建立一个props的副本
        fromData:this.conData,
        formValidate:   {
            serviceOrderId: '',
            projectName: '',
            oldName: '',
            serviceName:'',
            userName:'',
            serviceNum:'',
            servicePrice:'',
            beginTime:'',
            endTime:'',
            serviceAddress:'',
            evaluationId:'',
            payStatus:'',
            orderStatus:'',
            remarks:'',
          },
        ruleValidate: {
          serviceOrderId: [
            { required: true, message: '订单编号不能为空', trigger: 'blur' }
          ],
          projectName:[
            { required: true, message: '订单编号不能为空', trigger: 'blur' }
          ],
          oldName: [
            { required: true, message: '关联老人不能为空', trigger: 'blur' },
          ],
          userName: [
            { required: true, message: '下单用户不能为空', trigger: 'blur' }
          ],
          serviceNum: [
            { required: true, message: '服务人员不能为空', trigger: 'blur' },
          ],
          servicePrice:[
            { required: true, message: '服务实际价格不能为空', trigger: 'blur' },
          ],
          beginTime:[
            { required: true, message: '订单开始时间不能为空', trigger: 'blur' },
          ],
          endTime:[
            { required: true, message: '订单结束时间不能为空', trigger: 'blur' },
          ],
          serviceAddress:[
            { required: true, message: '服务地址不能为空', trigger: 'blur' },
          ],
          evaluationId:[
            { required: true, message: '订单评价编号不能为空', trigger: 'blur' },
          ],
          payStatus:[
            { required: true, message: '订单支付状态不能为空', trigger: 'blur' },
          ],
          orderStatus:[
            { required: true, message: '订单状态不能为空', trigger: 'blur' },
          ]
        },
        addUrl:'/api/'
      }
    },
    watch:{
      ModalType(val){
        this.myModal = val //监听外部对ModalType的变更，并同步到组件内的data
      },
      myModal(val){
        this.$emit('changeMod',val)//组件内对myModal改变后向外部发送事件通知
      },
      conData(val){
        this.fromData = val
        if(this.fromData){
          this.formValidate = this.fromData
        }
      }
    },
    computed:{
    },
    methods:{

      ok (data) {

        if(data.name&&data.password&&data.type){
//          this.$http.post(this.addUrl,data).then((json)=>{
////            console.log(json.data);
//            this.$Message.info('新增账号成功');
//          },(json)=>{
//            this.$Message.info('新增账号失败');
//          })
//        }else{
//          this.$Message.warning('请将账号信息填写完整!');
        }
      },
      cancel () {
        this.$Message.info('取消新增账号');
      },
      handleSubmit (name) {
        this.$refs[name].validate((valid) => {
          if (valid) {
            this.$Message.success('提交成功!');
          } else {
            this.$Message.error('表单验证失败!');
          }
        })
      },
      handleReset (name) {
        this.$refs[name].resetFields();
      }
    },
    computed:{
    }

  }
</script>
