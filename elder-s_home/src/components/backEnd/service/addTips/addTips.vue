<style scoped>
  #account--editor {
    width: 100%;
    min-height: 330px;
    height: auto;
  }
  .layout-breadcrumb {
    padding: 10px 15px 0;
  }

  .layout-content {
    min-height: 200px;
    margin: 15px;
    overflow: hidden;
    background: #fff;
    border-radius: 4px;
  }

  .layout-breadcrumb .addDelete{
    /*border-top:1px solid #c1c3c5;*/
    float:right;
    /*padding:10px;*/
  }
  .layout-content-main {
    padding: 10px;
  }
  .layout-copy {
    text-align: center;
    padding: 10px 0 20px;
    color: #9ea7b4;
  }

  .layout-content-main .page{
    float:right;
    padding: 10px 0;
  }
</style>
<template>
  <div>
    <sysHead></sysHead>
    <div class="layout-breadcrumb" style="overflow: hidden;">
      <Breadcrumb style="float:left;line-height: 32px;">
        <Breadcrumb-item href="#">时光驿站社区服务工作系统</Breadcrumb-item>
        <Breadcrumb-item href="#">发布养老贴士</Breadcrumb-item>
        <Breadcrumb-item>新增养老贴士</Breadcrumb-item>
      </Breadcrumb>
    </div>
    <div class="layout-content">
      <div class="layout-content-main">
        <div type="text/plain" id="account--editor"></div>
      </div>
    </div>
    <div class="layout-copy">
      2017-05 &copy; TalkingData
    </div>

  </div>
</template>
<script>
  import WangEditor  from 'wangeditor'
  import sysHead from '../../common/adminName'
  import axios from 'axios'
  export default {
    components:{sysHead},
    data(){
      return {
        dataInterface: {
          editorUpImgUrl: 'http://upload-images.jianshu.io/upload_images/5900178-f4fa868feeff264e.jpg?imageMogr2/auto-orient/strip%7CimageView2/2'  // 编辑器插入的图片上传地址
        },
        editor: '',  // 存放实例化的wangEditor对象，在多个方法中使用
      }
    },
    ready(){
      this.createEditor();
    },
    beforeDestroy(){
      this.destroyEditor();
    },
    methods: {
      createEditor(){  // 创建编辑器
        this.editor = new WangEditor('account--editor');
        this.initEditorConfig();  // 初始化编辑器配置，在create之前
        this.editor.create();  // 生成编辑器
        this.editor.$txt.html('<p>要初始化的内容</p>');  // 初始化内容
        $('#account--editor').css('height', 'auto');  // 使编辑器内容区自动撑开，在css中定义min-height
      },
      destroyEditor(){  // 销毁编辑器，官方没有给出完美方案。此方案是作者给出的临时方案
        this.editor.destroy();  // 这个没有完全销毁实例，只是作了隐藏
        // $('#account--editor').remove();  // 不报错的话，这一步可以省略
        this.editor = null;
        WangEditor.numberOfLocation--;  // 手动清除地图的重复引用，作者的临时解决方案。否则单页面来回切换时，地图报错重复引用
      },
      initEditorConfig(){  // 初始化编辑器配置
        this.editor.config.fontsizes = {  // 字号配置，增加14px
          // 格式：'value': 'title'
          1: '12px',
          2: '13px',
          3: '14px',
          4: '16px',
          5: '18px',
          6: '24px',
          7: '32px',
          8: '48px'
        };
        this.editor.config.uploadImgUrl = this.dataInterface.editorUpImgUrl;  // 图片上传地址

        this.editor.config.uploadImgFileName = '_img';  // 统一指定上传的文件name，需要指定。否则默认不同的上传方式是不同的name

        const usersecret = window.localStorage.getItem('usersecret');  // 获取 usersecret

        this.editor.config.uploadParams = {  // 自定义上传参数配置
          usersecret: usersecret
        };

      },
      getEditorContent(){  // 获取编辑器 内容区内容
        this.editorContent = this.editor.$txt.html();  // 获取 html 格式
        // this.editor.$txt.text();  // 获取纯文本
        // this.editor.$txt.formatText();  // 获取格式化后的纯文本
      },
    }
  }
</script>
<!-- 增删改查-->
