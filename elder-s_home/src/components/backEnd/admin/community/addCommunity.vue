<style scoped>

</style>
<template>
    <Modal
      v-model="modal1=myModal"
      :title = "this.$props.conData === false? '新增社区管理' : '修改社区管理'"
      @on-ok="ok(formValidate)"
      @on-cancel="cancel" width="500"   :styles="{top: '20px'}">
      <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="100">
        <Form-item label="社区名称" prop="communityName">
          <Input v-model="formValidate.communityName" placeholder="请输入社区名称"></Input>
        </Form-item>
        <Form-item label="社区服务电话" prop="communityPhone">
          <Input v-model="formValidate.communityPhone" placeholder="请输入社区服务电话"></Input>
        </Form-item>
        <Form-item label="负责员工" prop="servicePersonId">
          <Input v-model="formValidate.servicePersonId" placeholder="请输入负责员工工号"></Input>
        </Form-item>
        <Form-item label="社区图片" prop="communityPhoto">
          <Input v-model="formValidate.communityPhoto" placeholder="请选择社区图片"></Input>
        </Form-item>
        <Form-item label="社区描述" prop="communityDescribe">
          <Input v-model="formValidate.communityDescribe" placeholder="请进行社区描述"></Input>
        </Form-item>
        <Form-item label="平均房价" prop="communityHousePrice">
          <Input v-model="formValidate.communityHousePrice" placeholder="请输入社区平均房价"></Input>
        </Form-item>
        <Form-item label="租房价格" prop="communityRentPrice">
          <Input v-model="formValidate.communityRentPrice" placeholder="请输入社区租房价格"></Input>
        </Form-item>
        <Form-item label="社区地址" prop="communityAddressId">
          <Input v-model="formValidate.communityAddressId" placeholder="请输入社区地址"></Input>
        </Form-item>
        <Form-item label="相关服务" prop="communityServiceId">
          <Input v-model="formValidate.communityServiceId" placeholder="请填写相关服务代号"></Input>
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
            communityId: '',
            communityName: '',
            communityPhone: '',
            servicePersonId:'',
            communityPhoto:'',
            communityDescribe:'',
            communityHousePrice:'',
            communityRentPrice:'',
            communityAddressId:'',
            communityServiceId:''
          },
          ruleValidate: {
            communityName: [
              { required: true, message: '社区名称不能为空', trigger: 'blur' }
            ],
            communityPhone: [
              { required: true, message: '社区服务电话不能为空', trigger: 'blur' },
            ],
            servicePersonId: [
              { required: true, message: '社区服务人员不能为空', trigger: 'blur' }
            ],
            communityPhoto: [
              { required: true, message: '社区图片不能为空', trigger: 'blur' },
            ],
            communityDescribe: [
                { required: true, message: '社区描述不能为空', trigger: 'blur' }
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
