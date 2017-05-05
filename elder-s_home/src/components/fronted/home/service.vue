<template>
  <Collapse v-model="value2" accordion="1">
    <Panel  v-for="item in service">
      {{item.classify}}
      <p slot="content">{{item.introduction}}</p>
    </Panel>
  </Collapse>
</template>
<script>
  export default {
    data () {
      return {
        value2: '1',
        service:[{
            classify:'史蒂夫·乔布斯',
            introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
        },{
          classify:'史蒂夫·乔布斯',
          introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
        },{
          classify:'史蒂夫·乔布斯',
          introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
        },{
            classify:'史蒂夫·乔布斯',
            introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
          },{
            classify:'史蒂夫·乔布斯',
            introduction:'史蒂夫·乔布斯（Steve Jobs），1955年2月24日生于美国加利福尼亚州旧金山，美国发明家、企业家、美国苹果公司联合创办人。'
          }]
      }
    }
  }
</script>
