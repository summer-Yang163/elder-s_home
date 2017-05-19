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
            introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人'
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
