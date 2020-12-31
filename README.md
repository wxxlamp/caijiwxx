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
`java -cp caijiwxx-1.0-SNAPSHOT.jar cn.wxxlamp.ApplicationRunner
`

