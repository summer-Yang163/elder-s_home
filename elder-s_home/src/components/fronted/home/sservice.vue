<template>
  <Collapse v-model="value2" accordion>
    <Panel  v-for="(item,index) in service" :key="item.index">
      {{item.classify}}
      <p slot="content">{{item.introduction}}</p>
    </Panel>
  </Collapse>
</template>
<script>
  export default {
    data () {
      return {
        value2: '0',
        service:[{
            classify:'生活照料',
            introduction:'老人生活多有不便，需要在生活方面给予充分的照料，社区提供的生活照料服务主要有：送餐、助餐、理发、陪护等，我们接受您的服务订单，诚挚为您服务'
        },{
          classify:'医疗保健',
          introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
        },{
          classify:'物业维修',
          introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
        },{
            classify:'家政便民',
            introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
          },{
            classify:'娱乐学习',
            introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
          },{
          classify:'精神慰藉',
          introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
        }]
      }
    }
  }
</script>
