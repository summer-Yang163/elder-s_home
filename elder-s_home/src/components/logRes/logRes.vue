<style scoped>
  .background{
    background-image: url(../../assets/login-bg.png);
    background-size: 100 100;
    display: block;
    height: 100%;
    width: 100%;
    position:absolute; top:0; left:0;
  }
  .logRes {
    display: block;
    position: relative;
    left: 900px;
    top: 50px;
    width: 370px;
  }
  #blogin Button {
    width: 100px;
  }
  .logRes a {
    display: block;
    text-align: left;
    margin-bottom: 20px;
  }
  .input {
    margin-bottom: 20px;
  }
</style>
<template>
  <div class="background">
    <Vhead></Vhead>
    <div style="background:#eee;padding: 20px" class="logRes">
      <Modal v-model="modal1" title="请重置密码"
             @on-ok="ok(formTop)" @on-cancel="cancel" width="350">
        <Form ref="formTop" :model="formTop" :rules="ruleValidate" label-position="top">
          <Form-item class="input" prop="phone">
            <Input v-model="formTop.phone" icon="ios-information-outline"
                   placeholder="请输入手机号" style="width: 250px"></Input>
          </Form-item>
          <Form-item class="input" prop="verification">
            <Input v-model="formTop.verification" placeholder="请输入验证码" style="width: 180px"></Input>
            <Button type="primary" @click="verifiCode(formTop.phone)">点击获取验证码</Button>
          </Form-item>
          <Form-item prop="password">
            <Input v-model="formTop.password" icon="locked" placeholder="请输入密码" style="width: 300px"></Input>
          </Form-item>
        </Form>
      </Modal>
      <Card :bordered="false" style="text-align:center">
        <Tabs value="name1">
          <Tab-pane label="登陆" name="name1">
            <Login></Login>
            <a type="primary" @click="modal1 = true">忘记密码？</a>
          </Tab-pane>
          <Tab-pane label="注册" name="name2">
            <Register></Register>
          </Tab-pane>
        </Tabs>
      </Card>
    </div>
  </div>
</template>
<script>
  import Vhead from '../fronted/common/vheader'
  import Login from './login'
  import Register from './register'


  export default {
    components: {Register, Login, Vhead},
    data () {
      return {
        modal1: false,
        formTop: {
          phone: '',
          verification: '',
          password: ''
        },
//        phongVerification: RegExp('/^1(3|4|5|7|8)\d{9}$/'),
        ruleValidate: {
          phone: [
            {required: true, message: '手机号码不能为空', trigger: 'blur'},
            {  type: "number", required: true, pattern: /^1(3|4|5|7|8)d{9}$/, message: '手机号码格式不正确', trigger: 'blur'}
          ],
          verification: [
            {required: true, message: '验证码不能为空', trigger: 'blur'}
          ],
          password: [
            {required: true, message: '请填写新密码', trigger: 'blur'}
          ]
        },
        resetUrl:'http://rapapi.org/mockjs/18342/register',
        verifiCodeUrl:'http://rapapi.org/mockjs/18342/register'
      }
    },
    methods: {
      ok (data) {
        if(data.phone&&data.verification&&data.password){
            this.$http.post(this.resetUrl,data).then((json)=>{
              console.log(json.data);
              this.$Message.info('重置密码成功');
            },(json)=>{
              this.$Message.info('重置密码失败');
            })
        }else{
          this.$Message.warning('请将重置密码信息填写完整!');
        }
      },
      cancel () {
        this.$Message.info('取消重置密码');
      },
      verifiCode(phone){
          if(!phone){
            this.$Message.warning('请填写手机号');
          }else{
            this.$http.post(this.verifiCodeUrl,phone).then((json)=>{
              console.log(json.data);
              this.$Message.info('获取验证码成功');
            },(json)=>{
              this.$Message.error('获取验证码失败');
            })
          }
      }

    }
  }


</script>
