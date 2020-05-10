# Intent_URL
1.创建activity_geturl_intent.xml，并在其中增加一个EditText组件和一个按钮组件

![image](https://github.com/wuji-coder/Intent_URL/blob/master/image/1.png)

2.在MainActivity指定视图，并为按钮增加点击事件监听，获取输入框内的内容，将其解析为Uri对象，作为Intent的data，并设置Intent的动作为Intent.ACTION_VIEW，运行之后可以看到有不同的浏览器选择。

![image](https://github.com/wuji-coder/Intent_URL/blob/master/image/2.png)
