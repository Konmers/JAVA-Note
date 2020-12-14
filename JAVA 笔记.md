# JAVA 笔记

## JAVA 体系

### JDK 初步

#### 其他方向的基础

### JAVA Web 编程

#### 针对Web程序

### J2SE

#### 桌面级应用

### J2EE

#### 企业级应用

### J2ME

#### 移动设备

### 移动增值

#### SP运营商



## *语言 

1. 解释型    （ 文件需要二次转换成系统可识别文件）

    java

2. 编译型    （ 文件一次性转换成系统可识别文件）

   c、c++ 

### JDK 

又称 J2SDK      全称  java 2 Software Devleopment Kit   

Java 2 软件开发包

包含 JRE + 开发工具集(eq:javac编译工具等)

`开发需要JDK`

### JRE

全称 Java Runtime Environment

Java 运行环境

包含 JVM + Java SE 标准类库

`用户需要JRE`



## 基础

### JAVA 语言特点

- 面向对象

  两个要素：类、对象

  三个特征：封装、继承、多态

- 健壮性：

  去除C 的指针

  自动垃圾回收机制    但是仍会出现内存溢出、内存泄漏

- 跨平台性：write once,run anywhere （一次编写，所有平台都可以运行） 功劳在于 JVM

### Java程序运行机制及运行过程

#### 两大核心机制

1. Java 虚拟机 （ Java Virtual Machine ）

   可实现 `一次编译，各平台运行`  平台（UNIX、Windows、Other Platform等）

2. 垃圾收集机制（ Garbage collection ） 

   源程序（*.java 源文件） -> Java 编辑器 -> 字节码 （ *.class  字节码文件）

    -> 类装载器  ->  字节码校验器  ->  解释器  ->  操作系统平台 显示
   
   

### Java Application 

1. java 源文件以 ` .java ` 为扩展名，基本组成部分是类 ` .class`

2. 一个源文件 只能有一个 `public` 类，并且`public`类名必须是`源文件`

3. Java 项目执行入口 为` main()`方法，格式：

   ` public static void main(String args[]){ ... }`

   或者  arguments 

   ` public static void main(String[] args){ ... }`

4. 类名 大驼峰 每个单词首字母大写

5. 方法名 变量名 小驼峰  第二个单词首字母大写

6. 每行必须以 ` ;` 结尾

7. 注释符  comment

   - ` 单行  //  `

   - `多行 /*  ....  */   `

   - `JAVA特有 文档 且doc识别 格式：   `

      ` /**`

     `@author 指定Java程序的作者`

     `@version 指定源文件的版本` 

      ` ...    ` 

      `*/  `

     操作方式 根目录  cmd 

     ```
     javadoc -d 自定义文件名 -author -version 源文件.java
     ```

8. 输出语句 

   `System.out.println()` 先输出数据  后换行

   `System.out.print()` 只输出数据
   
9. Java API



### 语法

#### 	关键字（keyword）

#### 	保留字 （reserved word）

​		 goto 、const

#### 	标识符（Identifier）

​		自定义变量 类名 方法名 接口名 包名等

​		命名规范：

​			包名：多单词组成，所有字母小写： xxxxyyyzzz

​			类名、接口名： 大驼峰 多单词组成，所有单词首字母大写： XxxYyyZzz   

​			变量名、方法名：小驼峰 多单词组成，第一个单词首字母小写，后面所有单词首字母大写：xxxYyyZzz

​			常量名: 所有字母都大写，多单词下划线连接：XXX_YYYY_ZZZ

#### 变量 variable 

​		基本数据类型

​			数值型

​					整型  byte(1字节 = 8 bit), short(2字节), int(4字节), long(8字节)

​					浮点类型 float(4字节), double(8字节)

​					字符型  char(1字节)

​					布尔型 boolean （true/false）

​		引用数据类型j 

​			接口 interface

​			数组 array

#### 类型转换 （7种类型 不包括boolean）

​		自动类型转换提升

​				byte、 char、short -> int -> long -> float -> double -> string

​				计算值的类型 由字节数大的决定

​				byte\char\short 三种类型计算 结果必须时 int 

​		强制类型转换

​				自动类型提升运算的 逆运算

​	 				1.需要使用强转符： ()
 					2.注意 强制类型转换，会导致精度损失

​		String类型变量

​				1.String 属于引用数据类型,字符串
​				2.申明String变量，使用一对 ""
​				3.String 可以和 8种数据类型做运算，只能时连接运算： +
​				4.运算结果也时 string

#### 进制

二进制 (binary): 0,1 满2进1，以0b或0B开头。

十进制 (decimal): 0-9 满10进1。

八进制 (octal): 0-7 满8进1，以0开头。

十六进制 (hex): 0-9及A-F或a-f 满16进1，以0x或0X开头  。

eq: 0x21AF +1 = 0X21B0

#### 运算符

##### 算术运算符

- +(正数) -(负数) +(加) -(减) *(乘) /(除) %(取模)  ++(自增)  --(自减) 

##### 赋值运算符

-  = 

  当两边数据类型不一致，自动转换类型或强制转换

  支持连续赋值

- += ， -= ， *= ， /= ， %= ，

##### 比较运算符（关系运算符   ture/flase） 

- == ，！= ， <,  >,  <= , >=

##### 逻辑运算符

- & 逻辑与  &&短路与

  		区分 & , &&
    		相同点
    		1. & 与 && 的运算结果相同
      		2.当符号左边为 true,二者都会执行符号右边的运算
      		不同
      		1.当符号左边为 false,& 继续执行右边运算，&& 短路原则 停止运算

- |逻辑或    ||短路或

  		区分 | , || 
    		相同点
    		1. | 与 || 的运算结果相同
      		2.当符号左边为  flase , 二者都会执行符号右边的运算
      		不同
      		1.当符号左边为 true , | 继续执行右边运算  ||  短路原则 停止运算

- ！逻辑非   ^ 逻辑异或

  ![image-20201208172558719](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201208172558719.png)


##### 位运算符

```
 1. 位运算操作都是整型的数据
 2. << 向左移1位，相当于 * 2
 	>> 向右移1位，相当于 / 2
 	e q : 2 * 8  ?  2 << 3  : 8 << 1
```


![image-20201209094418059](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201209094418059.png)

![image-20201209100335577](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201209100335577.png)

##### 三元运算符 

```
(条件表达式)? 表达式1 ：表达式2
1.条件表达式结果为 boolean类型
2.条件表达式结果 true执行表达式1  flase执行表达式2
3.三元运算符可嵌套三元

eq:
max =( m >n) ? m : n ;
maxStr =( m >n) ? "m大" : ((m == n) ? "相等" : "n小" ) ;
```

`运算符优先级`

![image-20201209105105599](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201209105105599.png)





#### 流程控制

##### 	顺序结构

##### 	分支结构

1. if - else

   * Math.randow() 随机数
   * variable.equals("") 判断变量是否等于括号字符串 结果是 ture/false

2. switch - case


##### 	循环结构

![image-20201211101807213](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201211101807213.png)

1. for
2. while
3. do while



### OO

### Exception

### Array

### 基础类

### I/O Stream

### Collection / Generic

### Thread

### TCP/UDP

### GUI

### Meta Data

### Regular Expression