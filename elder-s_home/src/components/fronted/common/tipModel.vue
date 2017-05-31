<style >
  .vertical-center-modal{
    display: flex;
    align-items: center;
    justify-content: center;
  }
  .ivu-modal{
    top: 0;

  }
</style>
<template>
  <!--<Button @click="modal9 = true">距离顶部 20px</Button>-->
  <Modal
    title="2017年5月28日提醒"
    v-model="modal9"
    :styles="{top: '100px'}" style="text-align: center;"width="300">
    <p style="font-size:15px;line-height:30px;">亲：今天是{{oldname}}<span style="font-size:20px;color:orangered">生日</span>哦，不要忘记回去陪他过生日哦</p>
    <!--<p>对话框内容</p>-->
    <!--<p>对话框内容</p>-->
  </Modal>
  <!--<Button @click="modal10 = true">垂直居中</Button>-->
  <!--<Modal-->
    <!--title="对话框标题"-->
    <!--v-model="modal10"-->
    <!--class-name="vertical-center-modal">-->
    <!--<p>对话框内容</p>-->
    <!--<p>对话框内容</p>-->
    <!--<p>对话框内容</p>-->
  <!--</Modal>-->
</template>
<script>
  export default {
    data () {
      return {
        oldname:'曹植',
        modal9: true,
        modal10: false,
      }
    }
  }
</script>
