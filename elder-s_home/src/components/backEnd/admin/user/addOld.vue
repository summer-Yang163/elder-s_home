<style scoped>

</style>
<template>
  <Modal
    v-model="modal1=myModal"
    :title = "this.$props.conData === false? '新增老人信息' : '修改老人信息'"
    @on-ok="ok(formValidate)"
    @on-cancel="cancel" width="500"   :styles="{top: '20px'}">
    <Form ref="formValidate" :model="formValidate" :rules="ruleValidate" :label-width="100">
      <Form-item label="老人姓名" prop="oldName">
        <Input v-model="formValidate.oldName" placeholder="请输入老人姓名"></Input>
      </Form-item>
      <Form-item label="性别" prop="oldGender">
        <Radio-group v-model="formValidate.oldGender">
          <Radio label="1">男</Radio>
          <Radio label="2">女</Radio>
        </Radio-group>
      </Form-item>
      <Form-item label="电话" prop="oldPhone">
        <Input v-model="formValidate.oldPhone" placeholder="请输入老人电话"></Input>
      </Form-item>
      <Form-item label="年龄" prop="oldAge">
        <Input v-model="formValidate.oldAge" placeholder="请输入老人年龄"></Input>
      </Form-item>
      <Form-item label="身份证号" prop="idCard">
        <Input v-model="formValidate.idCard" placeholder="请输入老人身份证号"></Input>
      </Form-item>
      <Form-item label="老人图片" prop="oldPhoto">
        <Input v-model="formValidate.oldPhoto" placeholder="请选择老人图片"></Input>
      </Form-item>
      <Form-item label="紧急联系人" prop="oldEmContact">
        <Input v-model="formValidate.oldEmContact" placeholder="请输入老人紧急联系人"></Input>
      </Form-item>
      <Form-item label="紧急联系电话" prop="oldEmPhone">
        <Input v-model="formValidate.oldEmPhone" placeholder="请输入老人紧急联系电话"></Input>
      </Form-item>
      <Form-item label="入住社区" prop="oldCommunityId">
        <Input v-model="formValidate.oldCommunityId" placeholder="请输入老人入住社区"></Input>
      </Form-item>
      <Form-item label="备注" prop="remarks">
        <Input v-model="formValidate.remarks" placeholder="备注信息"></Input>
      </Form-item>
    </Form>
  </Modal>
</template>
<script>
  export default {
    props:[ 'ModalType','conData'],
    data(){
      return {
        modal1:false,
        myModal:this.ModalType,//首先建立一个props的副本
        fromData:this.conData,
        formValidate: {
          oldName: '',
          oldGender: '',
          oldPhone: '',
          oldAge:'',
          idCard:'',
          oldPhoto:'',
          oldEmContact:'',
          oldEmPhone:'',
          oldCommunityId:'',
          remarks:''
        },
        ruleValidate: {
          oldName: [
            { required: true, message: '姓名不能为空', trigger: 'blur' }
          ],
          oldGender: [
            { required: true, message: '性别不能为空', trigger: 'blur' },
          ],
          oldPhone: [
          { required: true, message:'电话不能为空', trigger: 'blur' }
          ],
          oldAge: [
            { required: true, message: '年龄不能为空', trigger: 'blur' }
          ],
          idCard: [
            { required: true, message: '身份证号不能为空', trigger: 'blur' },
          ],
          oldEmContact: [
          { required: true, message:'紧急联系人不能为空', trigger: 'blur' }
          ],
          oldEmPhone: [
            { required: true, message: '紧急联系电话不能为空', trigger: 'blur' }
          ],
          oldCommunityId: [
            { required: true, message: '入住社区不能为空', trigger: 'blur' },
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
