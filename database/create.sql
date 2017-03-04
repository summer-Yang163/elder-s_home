-- create database,and set default character
CREATE DATABASE elder
  DEFAULT CHARACTER SET utf8
  COLLATE utf8_general_ci;

-- 用户表，用于用户登录系统
CREATE TABLE user (
  user_id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(255),
  password VARCHAR(255),
  type     INT DEFAULT 1 -- 用户类型，1表示业主，2表示服务人员，3表示超级管理员
);

-- 业主表,关联表：老人表，用户表
CREATE  TABLE owner(
  user_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),
  gender INT DEFAULT NOT NULL , -- 性别，1表示男，2表示女
  phone VARCHAR(255) -- 业主的联系电话

);
-- 老人表，关联表：业主表
CREATE TABLE old_man(
  old_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),
  user_id INT,-- 老人所在房子的业主
  gender INT,
  relationship VARCHAR(255), -- 和业主的关系
  phone VARCHAR(255) -- 老人的联系方式
);
-- 服务人员表
CREATE TABLE admin(
  user_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),
  gender INT ,  -- 年龄
  phone VARCHAR(255),
  job_num VARCHAR(255), -- 员工号
  -- work_time VARCHAR(255),
  community_id INT -- 服务的社区，关联社区表
);

-- 社区表
CREATE TABLE community(
  community_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),-- 社区名字
  address VARCHAR(255),-- 社区地址
  phone VARCHAR(255),-- 社区联系电话
  photo VARCHAR(255) -- 社区照片
);
-- 创建公司表
CREATE TABLE company(
  company_id MULTIPOINT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255), -- 公司名字
  qualified VARCHAR(255),-- 合格证明
  isShow INT, -- 是否合格
  address VARCHAR(255), -- 公司地址
  phone VARCHAR(255)  -- 公司的电话
);

-- 创建服务表
CREATE TABLE service(
  service_id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255),
  content VARCHAR(255),
  user_id INT,  -- 服务人员
  price long, -- 市场价
  sale_price LONG, -- 促销价格
  begin_time long, -- 服务开始时间
  end_time LONG, -- 服务结束时间
  num int -- 服务名额
);
-- 服务详情表
CREATE TABLE service_user(
  su_id INT PRIMARY KEY  AUTO_INCREMENT,
  service_id int,-- 服务
  old_id INT,-- 被服务的人老人
  real_price LONG,-- 实际的价格
  user_id int , -- 服务的工作人员
  begin_time long, -- 开始时间
  end_time LONG, -- 结束时间
  comment_rank int, -- 评价等级，一共五个等级：1-5
  comment VARCHAR(255) ,-- 评论
  isPay int -- 1表示已经付款，2表示未付款
);


-- 新闻表
CREATE TABLE news(
  news_id INT PRIMARY KEY  AUTO_INCREMENT,
  news_title VARCHAR(255), -- 新闻标题
  news_content VARCHAR(255), -- 新闻内容
  time long, -- 发布时间
  importent int ,-- 新闻的重要程度
  user_id INT -- 发布人
);

-- 个性化提示
CREATE TABLE tip(
  ti_id INT PRIMARY KEY  AUTO_INCREMENT,
  user_id INT,
  service_person INT, -- 工作人员
  content VARCHAR(255), -- 提醒内容
  time long, -- 提醒时间
  isComplete int ,-- 是否完成
  comment VARCHAR(255) -- 评论内容
);