<template>
  <Table border :columns="columns4" :data="data1"></Table>
</template>
<script>
  export default {
    data () {
      return {
        columns4: [
          {
            type: 'selection',
            width: 60,
            align: 'center',
            title:'序号'
          },
          {
            title: '姓名',
            key: 'name'
          },
          {
            title: '性别',
            key: ''
          },
          {
            title: '年龄',
            key: 'age'
          },
          {
            title: '电话',
            key: ''
          },
          {
            title: '入住地址',
            key: 'address'
          },
          {
            title: '地址',
            key: 'address'
          },
          {
            title: '入住老人',
            key: 'address'
          },
          {
            title: '关系',
            key: 'address'
          },
          {
            title: '用户等级',
            key: 'address'
          },
          {
            title: '编辑',
            key: 'address'
          },
          {
            title: '删除',
            key: 'address'
          }
        ],
        data1: [
          {
            name: '王小明',
            age: 18,
            address: '北京市朝阳区芍药居'
          },
          {
            name: '张小刚',
            age: 25,
            address: '北京市海淀区西二旗'
          },
          {
            name: '李小红',
            age: 30,
            address: '上海市浦东新区世纪大道'
          },
          {
            name: '周小伟',
            age: 26,
            address: '深圳市南山区深南大道'
          }
        ]
      }
    }
  }
</script>
