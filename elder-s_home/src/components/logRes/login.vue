<style scoped>
  #login {
    margin-top: 40px;
  }
  #blogin Button {
    width: 100px;
  }
</style>
<template>
  <Form ref="formInline" :model="formInline" :rules="ruleInline" inline id="login">
    <Form-item prop="userName">
      <Input   type="text" v-model="formInline.userName" placeholder="Username">
      <Icon type="ios-person-outline" slot="prepend"></Icon>
      </Input>
    </Form-item>
    <Form-item prop="password">
      <Input type="password" v-model="formInline.password" placeholder="Password">
      <Icon type="ios-locked-outline" slot="prepend"></Icon>
      </Input>
    </Form-item>
    <Form-item id='blogin'>
      <Button type="primary" @click="handleSubmit(formInline)">登录</Button>
    </Form-item>
  </Form>
</template>
<script>
  import axios from 'axios' //引入axios
  import * as types from '../../store/types'
  export default {
    data () {
      const validateName = (rule, value, callback)=>{
        if(!value){
          callback(new Error('请输入用户名'));
        }else{
            if(value.length>30){
              callback(new Error('用户名长度不得大于30个字符'));
            }else{
              const valiNameUrl = this.HOST+'/user/validateUserName/'+value;
              axios.post(valiNameUrl).then((response) =>{
                if(!response.data.success){
                  callback();
                }else{
                  callback(new Error('用户名不存在'));
                }
              },(response)=>{
                callback(new Error('用户名不存在'));
              }).catch(function(error){
                callback(new Error('用户名不存在'));
              });
            }
        }
      };
        return {
        formInline: {
          userName: '',
          password: ''
        },
        ruleInline: {
          userName: [
            {validator: validateName,  trigger: 'blur'}
          ],
          password: [
            {required: true, message: '请填写密码', trigger: 'blur'},
            {type: 'string', min: 6, message: '密码长度不能小于6位', trigger: 'blur'},{type: 'string', max: 30, message: '密码长度不能大于30位', trigger: 'blur'}
          ]
        },
        loginUrl:this.HOST+'/user/userLogin',
      }

    },
    methods: {
      handleSubmit(data) {
        if(data.userName&&data.password){
          axios.post(this.loginUrl,data).then((response) =>{
            if(response.data.success){
              this.$Message.success('提交成功!');
              this.$store.commit(types.LOGIN, data.userName);
              //判断权限:1 普通用户 2 社区服务人员 3 普通管理员 4 超级管理员
              switch(response.data.Type_Id){
                case 1:
                  this.$router.push({path:'/Home'});
                      break;
                case 2:
                  this.$router.push({path:'/serviceWork'});
                      break;
                case 3:
                  this.$router.push({path:'/serviceWork'});
                      break;
                case 4:
                  this.$router.push({path:'/backEnd'});
                      break;
              }
            }else{
              this.$Message.error('用户名或密码错误!');
            }
          },(response)=>{
            this.$Message.error('登陆失败!');
          }).catch(function(error){
            this.$Message.error('登陆失败!');
          });
        }else{
          this.$Message.warning('请将登陆信息填写完整!');
        }
      }
    }
  }
</script>
