# 在Android中集成FFmpeg

标签（空格分隔）： Android

---
原文链接：https://www.zybuluo.com/Tyhj/note/1184684
### 集成方法

Step 1. Add the JitPack repository to your build file
```
//Add it in your root build.gradle at the end of repositories:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```
//Add the dependency
dependencies {
	        implementation 'com.github.tyhjh:FFmpeg:-SNAPSHOT'
	}
```
### 使用方法：
```java
//调用FFmpeg命令，command为FFmpeg命令，返回值为0，则操作成功
String command;
int result = FFmpeg.getsInstance().run(command.split(" "));
```


### 图片转GIF示例

```java
//本项目提供一个视频转GIF示例，其他功能可以通过调用FFmpeg命令自己实现
new Thread(new Runnable() {
            @Override
            public void run() {
                String pathFrom = "/mnt/sdcard/av.mp4";
                String pathTo = "/mnt/sdcard/av.gif";
                Setting setting = new Setting(true,
                        1080,
                        1920,
                        20,
                        0,
                        20);
                Mv2Gif.convert(pathFrom, pathTo, setting);
            }
        }).start();
```

相关文章：[Android录屏+视频转Gif实现](https://www.jianshu.com/p/81cb36b610f4)
项目源码：https://github.com/tyhjh/FFmpeg