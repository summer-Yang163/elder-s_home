<style scoped>
.breadCrumb{
    margin:10px 10px;
    padding:0 0 10px;
    border-bottom:1px solid #d7dde4;
  }
.fromCard{
  width:400px;
  /*margin-left:30px;*/
  margin:0 auto;
}
</style>
<template>
  <div>
  <Breadcrumb class="breadCrumb">
    <Breadcrumb-item href="/homeCenter">
      <Icon type="ios-home-outline"></Icon> 家人中心
            </Breadcrumb-item>
    <Breadcrumb-item href="/homeCenter/personInf" >
      <span style="color:orange"><Icon type="pound"></Icon> 个人信息</span>
    </Breadcrumb-item>
    <Button type="ghost" style="float:right;" >修改</Button>
  </Breadcrumb>
  <Card class='fromCard'>
    
    <Form :model="formLeft" label-position="left" :label-width="100">
      <Form-item label="姓名" >
        <Input v-model="formLeft.input1" disabled="true"></Input>
      </Form-item>
      <Form-item label="性别" prop="gender">
        <Radio-group v-model="formLeft.gender" >
          <Radio label="male" disabled="true">男</Radio>
          <Radio label="female" disabled="true">女</Radio>
        </Radio-group>
      </Form-item>

      <Form-item label="电话">
        <Input v-model="formLeft.input3"></Input>
      </Form-item>
      <Form-item label="年龄">
        <Input v-model="formLeft.input4"></Input>
      </Form-item>
      <Form-item label="邮箱">
        <Input v-model="formLeft.input5"></Input>
      </Form-item>
      <Form-item label="用户住址">
        <Input v-model="formLeft.input6"></Input>
      </Form-item>
      <Form-item label="关联老人">
        <Input v-model="formLeft.input7"></Input>
      </Form-item>
      <Form-item>
        <Button type="primary" @click="handleSubmit('formValidate')">提交</Button>
        <Button type="ghost" @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
      </Form-item>
    </Form>
  </Card>
  </div>
</template>
<script>
export default{
    data(){
        return {
          formLeft: {
            input1: '小八',
            gender: 'female',
            input3: '18326187811',
            input4: '18',
            input5: '2448415727@qq.com',
            input6: '住址',
            input7: '李向阳'
          }
        }
    },
  methods:{
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
  }
}
</script>
