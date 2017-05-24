<style scoped>

</style>
<template>
  <Modal
    v-model="modal1=myModal"
    :title = "this.$props.conData === false? '新增服务项目' : '修改服务项目'"
    @on-ok="ok(formValidate)"
    @on-cancel="cancel" width="500"   :styles="{top: '20px'}">
    <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="100">
      <Form-item label="服务名称" prop="projectName">
        <Input v-model="formValidate.projectName" placeholder="请输入服务名称"></Input>
      </Form-item>
      <Form-item label="服务内容描述" prop="projectContentDescrible">
        <Input v-model="formValidate.projectContentDescrible" placeholder="请输入服务内容描述"></Input>
      </Form-item>
      <Form-item label="服务价格" prop="projectPrice">
        <Input v-model="formValidate.projectPrice" placeholder="请输入服务价格"></Input>
      </Form-item>
      <Form-item label="服务名额" prop="projectLimitedNumber">
        <Input v-model="formValidate.projectLimitedNumber" placeholder="请输入服务限制名额"></Input>
      </Form-item>
      <Form-item label="服务适用条件" prop="projectServiceConditions">
        <Input v-model="formValidate.projectServiceConditions" placeholder="请输入服务适用条件"></Input>
      </Form-item>
      <Form-item label="服务促销价格" prop="projectSalePrice">
        <Input v-model="formValidate.projectSalePrice" placeholder="请输入服务促销价格"></Input>
      </Form-item>
      <Form-item label="服务时间" prop="projectServiceTime">
        <Input v-model="formValidate.projectServiceTime" placeholder="请输入服务时间"></Input>
      </Form-item>
      <Form-item label="服务图片" prop="projectServicePicture">
        <Input v-model="formValidate.projectServicePicture" placeholder="请选择服务图片"></Input>
      </Form-item>
      <Form-item label="是否特色服务" prop="isFeatures">
         <Radio-group v-model="formValidate.isFeatures">
           <Radio label="1">是</Radio>
           <Radio label="0">否</Radio>
         </Radio-group>
       </Form-item>
      <Form-item label="备注" prop="remarks">
        <Input v-model="formValidate.remarks" placeholder="填写服务项目备注信息"></Input>
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
        formValidate: {
          projectName: '',
          projectContentDescrible: '',
          projectPrice: '',
          projectLimitedNumber:'',
          projectServiceConditions:'',
          projectSalePrice:'',
          projectServiceTime:'',
          projectServicePicture:'',
          isFeatures:'',
          remarks:''
        },
        ruleValidate: {
          projectName: [
            { required: true, message: '服务名称不能为空', trigger: 'blur' }
          ],
          projectContentDescrible: [
            { required: true, message: '服务内容描述不能为空', trigger: 'blur' },
          ],
          projectPrice: [
            { required: true, message: '服务价格不能为空', trigger: 'blur' }
          ],
          projectLimitedNumber: [
            { required: true, message: '服务名额不能为空', trigger: 'blur' },
          ],
          isFeatures: [
            { required: true, message: '请选择是否特色服务', trigger: 'blur' },
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
