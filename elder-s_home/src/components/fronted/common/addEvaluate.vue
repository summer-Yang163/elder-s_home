<template>
  <Button @click="modal2 = true">自定义页头和页脚</Button>
  <Modal v-model="modal2" width="360">
    <p slot="header" style="color:#f60;text-align:center">
      <Icon type="information-circled"></Icon>
      <span>增加评论</span>
    </p>
    <div style="text-align:center">
        <Input v-model=" projOrder.remarks" type="textarea" :rows="4" placeholder="请输入评价"></Input>
    </div>
    <div slot="footer">
      <Button type="error" size="large" long :loading="modal_loading" @click="del">删除</Button>
    </div>
  </Modal>
</template>
<script>
  export default {
    data () {
      return {
        modal2: false,
        modal_loading: false
      }
    },
    methods: {
      del () {
        this.modal_loading = true;
        setTimeout(() => {
          this.modal_loading = false;
          this.modal2 = false;
          this.$Message.success('删除成功');
        }, 2000);
      }
    }
  }
</script>
