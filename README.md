# cms-manager

## 写在前面的话 ##

  	一直想写一个属于自己小项目，出于懒惰和没有时间的原因，一直等到了现在，趁这段时间没事，争取把它完成了，也就当自己学习进步的一个过程了。现在网上脚手架很多，也写的十分优秀，自己也想在学习过程中写一个属于自己的脚手架，纯属自学练习，人不能懒惰，还是要每天写一点代码的，保持自己不断进步。

## 项目介绍 ##

	本项目是一个简单的cms管理的脚手架，项目模块：
		1, 核心模块cms-core
		1，用户模块cms-user
		2, 内容模块cms-content
		3, 论坛模块
		4，网页模块cms-web

## 内置功能 ##

1，用户管理：用户是系统操作者，该功能主要完成系统用户配置。

2，机构管理：配置系统组织机构（公司、部门、小组），树结构展现，可随意调整上下级。

3，区域管理：系统城市区域模型，如：国家、省市、地市、区县的维护。

4，菜单管理：配置系统菜单，操作权限，按钮权限标识等。

5，角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。

6，字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否、男女、类别、级别等。

7，操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。

8，连接池监视：监视当期系统数据库连接池状态，可进行分析SQL找出系统性能瓶颈。


## 技术选型 ##

### 1、后端 ###

核心框架：Spring Framework 4.0

安全框架：Apache Shiro 1.2

视图框架：Spring MVC 4.0

服务端验证：Hibernate Validator 5.1

布局框架：SiteMesh 2.4

工作流引擎：Activiti 5.15、FoxBPM 6

任务调度：Spring Task 4.0

持久层框架：MyBatis 3.2

数据库连接池：Alibaba Druid 1.0

缓存框架：Ehcache 2.6、Redis

日志管理：SLF4J 1.7、Log4j

工具类：Apache Commons、Jackson 2.2、Xstream 1.4、Dozer 5.3、POI 3.9

### 2、前端  ###

JS框架：jQuery 1.9。

CSS框架：Twitter Bootstrap 2.3.1。

客户端验证：JQuery Validation Plugin 1.11。

富文本：CKEcitor

文件管理：CKFinder

动态页签：Jerichotab

手机端框架：Jingle

数据表格：jqGrid

对话框：jQuery jBox

下拉选择框：jQuery Select2

树结构控件：jQuery zTree

日期控件： My97DatePicker

## 4、平台 ##

	服务器中间件：在Java EE 5规范（Servlet 2.5、JSP 2.1）下开发，支持应用服务器中间件 有Tomcat 7、Jboss 7、WebLogic 10、WebSphere 8。

	数据库支持：目前仅提供MySql、Oracle数据库的支持，但不限于数据库，平台留有其它数据库支持接口， 可方便更改为其它数据库，如：SqlServer 2008、MySql 5.5、H2等

	开发环境：Java EE、Eclipse、Maven、Git