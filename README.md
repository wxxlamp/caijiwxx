# 菜鸡王星星

### 简介
本工程为比赛仓库，选手是[王石博](https://wxxlamp.cn)

### 运行环境
* IDE： JetBrains Intellij IDEA
* 编程语言：Java/Oracle JDK1.8.0_231
* 打包工具：Apache Maven 3.6.2

### 运行方式
1. 首先从git当中将项目clone到本地：
`git@github.com:wxxlamp/caijiwxx.git`
2. 移动到项目目录中
`cd caijiwxx`
3. 然后通过maven对项目打包：
`mvn install -Dmaven.test.skip=true`
4. 打包之后移动到target目录，运行该jar包
`java -cp caijiwxx-1.0-SNAPSHOT.jar cn.wxxlamp.ApplicationRunner`

### 运行结果
```java
第 1 个宝箱开启完成，神秘数字是：3229170
第 2 个宝箱开启完成，神秘数字是：1135497
第 3 个宝箱开启完成，神秘数字是：2125891
第 4 个宝箱开启完成，神秘数字是：3041721
第 5 个宝箱开启完成，神秘数字是：179272
第 6 个宝箱开启完成，神秘数字是：1295904
第 7 个宝箱开启完成，神秘数字是：395138
第 8 个宝箱开启完成，神秘数字是：1871275
第 9 个宝箱开启完成，神秘数字是：99911
第 10 个宝箱开启完成，神秘数字是：1695112
所有宝箱的神秘数字依次如下：
3229170 1135497 2125891 3041721 179272 1295904 395138 1871275 99911 1695112 
```
