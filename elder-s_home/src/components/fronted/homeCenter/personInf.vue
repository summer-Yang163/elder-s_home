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
.fromCard li{
  overflow: auto;
}
.fromCard p{
  line-height:40px;
}
.fromCard  .li_left{
  float:left;
  width:100px;
  margin-right:20px;
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
    <Button type="ghost" style="float:right;" @click="modify=true">修改</Button>
  </Breadcrumb>
  <Card class='fromCard' v-if="modify">
    <Form :model="formLeft" label-position="left" :label-width="100">
      <Form-item label="真实姓名" >
        <Input v-model="formLeft.trueName" ></Input>
      </Form-item>
      <Form-item label="性别" prop="gender">
        <Radio-group v-model="formLeft.gender" >
          <Radio label="male" >男</Radio>
          <Radio label="female" >女</Radio>
        </Radio-group>
      </Form-item>
      <Form-item label="电话">
        <Input v-model="formLeft.phone"></Input>
      </Form-item>
      <Form-item label="年龄">
        <Input v-model="formLeft.age"></Input>
      </Form-item>
      <Form-item label="邮箱">
        <Input v-model="formLeft.email"></Input>
      </Form-item>
      <Form-item label="用户住址">
        <Input v-model="formLeft.address"></Input>
      </Form-item>
      <Form-item label="关联老人">
        <Input v-model="formLeft.oldName"></Input>
      </Form-item>
      <Form-item>
        <Button type="primary" @click="handleSubmit('formValidate')">提交</Button>
        <Button type="ghost" @click="handleReset('formValidate')" style="margin-left: 8px">重置</Button>
      </Form-item>
    </Form>
  </Card>
    <Card class='fromCard' v-if="" title="个人信息卡片">
      <ul>
        <li>
          <p class="li_left">真实姓名</p>
          <p class="li_right" >李明 </p>
        </li>
        <li>
          <p class="li_left">性别</p>
          <p class="li_right" >男 </p>
        </li>
        <li>
          <p class="li_left">电话</p>
          <p class="li_right" >18326111111 </p>
        </li>
        <li>
          <p class="li_left">年龄</p>
          <p class="li_right" >28 </p>
        </li>
        <li>
          <p class="li_left">邮箱</p>
          <p class="li_right" >123456789@qq.com </p>
        </li>
        <li>
          <p class="li_left">用户住址</p>
          <p class="li_right" >安徽省合肥市 </p>
        </li>
        <li>
          <p class="li_left">关联老人</p>
          <p class="li_right" >李志明 </p>
        </li>
      </ul>
    </Card>
  </div>
</template>
<script>
  import axios from 'axios' //引入axios
  import * as types from '../../../store/types'
  const local
export default{
    data(){
        return {
          modify:'',
          formLeft: {
            trueName: '',
            gender: '',
            phone: '',
            age: '',
            email: '',
            address: '',
            oldName: ''
          }
        }
    },
  beforeRouteEnter (to, from, next) {
//        console.log
//    axios.get(to.params.id, (err, post) =>{
//    if (err) {
//      // display some global error message
//      next(false)
//    } else {
//      next(vm => {
//        vm.post = post
//      })
//    }
//  })
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
