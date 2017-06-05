<template>
  <Modal
    v-model="modal1=myModal"
    title = "新增用户评价"
    @on-ok="ok(formValidate)"
    @on-cancel="cancel" width="500"   :styles="{top: '60px'}">
    <Form ref="projOrder" :model="evaluation" :label-width="100">
      <Form-item label="评价内容" prop="evaluationContent" >
        <Input v-model=" evaluation.evaluationContent" type="textarea" :rows="4" placeholder="请输入用户评价"></Input>
      </Form-item>
      <Form-item label="请选择满意程度" prop="isSatisfaction">
        <Rate v-model="evaluation.isSatisfaction"></Rate>
      </Form-item>
    </Form>
  </Modal>
</template>
<script>
  export default {
    props:[ 'ModalType','conData'],
    data () {
      return {
        modal1:false,
        myModal:this.ModalType,//首先建立一个props的副本
        fromData:this.conData,
          evaluation:{
            evaluationContent:'',
            isSatisfaction:0
          }
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
    methods: {
      ok (data) {
        if(data.evaluationContent&&data.isSatisfaction){
            const addUrl = this.HOST+'/userDetails/insertUserDetails'
            axios.post(addUrl,data).then((json)=>{
              console.log(json.data)
              if(json.data.success){
                this.$Message.success('新增评价成功');
//                this.$router.go(0)
              }else{
                this.$Message.error('新增评价失败');
              }
            }).catch((error)=>{
              this.$Message.error('新增失败');
            })
        }else{
          this.$Message.warning('请将必填信息填写完整!');
        }
      },
      cancel () {
          this.$Message.info('取消评价');
      }

    }
  }
</script>
