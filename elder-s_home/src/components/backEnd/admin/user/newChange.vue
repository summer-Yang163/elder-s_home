<style scoped>

</style>
<template>
  <Icon type="edit" @click="show(index)"></Icon>

</template>
<script>
  import AddModal from './systemModal'
  export default {
    components:{AddModal},
    data(){
      return {
      }
    },
    methods:{
      show (index) {
        console.log(index)
        this.$Modal.info({
          title: '用户信息',
          content: `姓名：${this.data6[index].name}<br>年龄：${this.data6[index].age}<br>地址：${this.data6[index].address}`
        })
      },
      remove (index) {
        this.data6.splice(index, 1);
      }
    }
//    components:{Vhead}
  }
</script>
