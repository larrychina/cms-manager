--创建数据库
create database cms_manager;
--使用数据库

use cms_manager;

create table user(

id bigint not null auto_increment comment '用户id',

login_name varchar(16) comment '登录名',

password varchar(64) comment '密码',

user_name varchar(16) comment '用户名',

email varchar(16) comment '邮箱' ,

mobile varchar(12) comment '电话',

userType tinyint(2) comment '用户类型',

status tinyint(2) comment '用户状态',

photo varchar(64) comment '用户头像',

primary key(id)

)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT charset=utf8 comment='用户信息表'