-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 112.74.178.85    Database: elder
-- ------------------------------------------------------
-- Server version	5.5.53-0ubuntu0.14.04.1



/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `advice_classification`
--
use elder;
DROP TABLE IF EXISTS `advice_classification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `advice_classification` (
  `Advice_Classify_Id` int(20) NOT NULL,
  `Name` varchar(200) NOT NULL,
  `Parent_Id` int(20) NOT NULL,
  PRIMARY KEY (`Advice_Classify_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `advice_classification`
--

LOCK TABLES `advice_classification` WRITE;
/*!40000 ALTER TABLE `advice_classification` DISABLE KEYS */;
/*!40000 ALTER TABLE `advice_classification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `area` (
  `Area_Id` int(20) NOT NULL,
  `Area_Name` varchar(100) NOT NULL,
  `Parent_Id` int(20) NOT NULL,
  PRIMARY KEY (`Area_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authority`
--

DROP TABLE IF EXISTS `authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authority` (
  `Authority_Id` int(20) NOT NULL,
  `Authority_Name` varchar(200) NOT NULL,
  PRIMARY KEY (`Authority_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authority`
--

LOCK TABLES `authority` WRITE;
/*!40000 ALTER TABLE `authority` DISABLE KEYS */;
/*!40000 ALTER TABLE `authority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `community`
--

DROP TABLE IF EXISTS `community`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `community` (
  `Community_Id` int(20) NOT NULL,
  `Community_Name` varchar(255) NOT NULL,
  `Community_Phone` varchar(13) NOT NULL,
  `Service _Person_Id` int(20) NOT NULL,
  `Community_Photo` varchar(255) NOT NULL,
  `Community_Describe` varchar(255) NOT NULL,
  `Community_House_Price` double(10,2) DEFAULT NULL,
  `Community_Rent_Price` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`Community_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community`
--

LOCK TABLES `community` WRITE;
/*!40000 ALTER TABLE `community` DISABLE KEYS */;
/*!40000 ALTER TABLE `community` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `community_address`
--

DROP TABLE IF EXISTS `community_address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `community_address` (
  `Community_Address _Id` int(20) NOT NULL AUTO_INCREMENT,
  `Area_Id` int(20) NOT NULL,
  `Community_Id` int(11) NOT NULL,
  PRIMARY KEY (`Community_Address _Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community_address`
--

LOCK TABLES `community_address` WRITE;
/*!40000 ALTER TABLE `community_address` DISABLE KEYS */;
/*!40000 ALTER TABLE `community_address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `community_news`
--

DROP TABLE IF EXISTS `community_news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `community_news` (
  `News_Id` int(20) NOT NULL AUTO_INCREMENT,
  `News_Title` varchar(255) DEFAULT NULL,
  `News_Content` varchar(255) NOT NULL,
  `Publish_Time` bigint(20) NOT NULL,
  `Importent` int(4) NOT NULL,
  `Service _Person_Id` int(20) NOT NULL,
  `News_Brief` varchar(255) NOT NULL,
  `Community_Id` int(4) NOT NULL,
  `Community_News_Type` int(4) NOT NULL,
  PRIMARY KEY (`News_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community_news`
--

LOCK TABLES `community_news` WRITE;
/*!40000 ALTER TABLE `community_news` DISABLE KEYS */;
/*!40000 ALTER TABLE `community_news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `community_service`
--

DROP TABLE IF EXISTS `community_service`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `community_service` (
  `Community_Service_Id` int(20) NOT NULL AUTO_INCREMENT,
  `Area_Id` int(20) NOT NULL,
  `Project_Id` int(20) NOT NULL,
  PRIMARY KEY (`Community_Service_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community_service`
--

LOCK TABLES `community_service` WRITE;
/*!40000 ALTER TABLE `community_service` DISABLE KEYS */;
/*!40000 ALTER TABLE `community_service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `community_service_person`
--

DROP TABLE IF EXISTS `community_service_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `community_service_person` (
  `Community_Service_Person_Id` int(20) NOT NULL AUTO_INCREMENT,
  `Community_Id` int(20) NOT NULL,
  `Project_Id` int(20) NOT NULL,
  `Service _Person_Id` int(20) NOT NULL,
  PRIMARY KEY (`Community_Service_Person_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community_service_person`
--

LOCK TABLES `community_service_person` WRITE;
/*!40000 ALTER TABLE `community_service_person` DISABLE KEYS */;
/*!40000 ALTER TABLE `community_service_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company` (
  `Company_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Company_Name` varchar(200) NOT NULL,
  `Company_Qualified` varchar(255) NOT NULL,
  `Company_Address` varchar(255) NOT NULL,
  `Company_Phone` varchar(13) NOT NULL,
  `Company_Legal_Person` varchar(255) NOT NULL,
  PRIMARY KEY (`Company_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_project`
--

DROP TABLE IF EXISTS `employee_project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_project` (
  `Employ_Project_Id` int(20) NOT NULL,
  `Service _Person_Id` int(20) NOT NULL,
  `Project_Id` int(20) NOT NULL,
  `Evaluation_Id` int(20) NOT NULL,
  PRIMARY KEY (`Employ_Project_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_project`
--

LOCK TABLES `employee_project` WRITE;
/*!40000 ALTER TABLE `employee_project` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluation` (
  `Evaluation_Id` int(20) NOT NULL AUTO_INCREMENT,
  `Service_Order_Id` int(20) NOT NULL,
  `Evaluation_Content` varchar(255) DEFAULT NULL,
  `Is_Satisfaction` int(4) DEFAULT NULL,
  `Remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Evaluation_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluation`
--

LOCK TABLES `evaluation` WRITE;
/*!40000 ALTER TABLE `evaluation` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `old_advice`
--

DROP TABLE IF EXISTS `old_advice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `old_advice` (
  `Old_Advice _Id` int(20) NOT NULL,
  `Old_Advice_Title` varchar(255) NOT NULL,
  `Old_Advice_Content` varchar(255) NOT NULL,
  `Publish_Time` bigint(20) NOT NULL,
  `Service_Person_Id` int(20) NOT NULL,
  `Advice_Classify_Id` int(20) NOT NULL,
  `Old_Advice_Brief` varchar(255) NOT NULL,
  PRIMARY KEY (`Old_Advice _Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `old_advice`
--

LOCK TABLES `old_advice` WRITE;
/*!40000 ALTER TABLE `old_advice` DISABLE KEYS */;
/*!40000 ALTER TABLE `old_advice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `old_man`
--

DROP TABLE IF EXISTS `old_man`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `old_man` (
  `Old_Id` int(20) NOT NULL,
  `Old_Name` varchar(200) NOT NULL,
  `Old_Gender` int(2) NOT NULL,
  `Old_Phone` varchar(13) NOT NULL,
  `Old_Age` int(3) NOT NULL,
  `Old_Photo` varchar(255) DEFAULT NULL,
  `User_Id` int(20) DEFAULT NULL,
  `Old_Relationship` varchar(128) DEFAULT NULL,
  `Old_Em_Contact` varchar(128) NOT NULL,
  `Old_Em_Phone` varchar(13) NOT NULL,
  `Old_Community_Id` int(4) NOT NULL,
  `Remarks` varchar(255) DEFAULT NULL,
  `Id_Card` int(20) NOT NULL,
  PRIMARY KEY (`Old_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `old_man`
--

LOCK TABLES `old_man` WRITE;
/*!40000 ALTER TABLE `old_man` DISABLE KEYS */;
/*!40000 ALTER TABLE `old_man` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `Project_Id` int(20) NOT NULL AUTO_INCREMENT,
  `Project_Name` varchar(200) NOT NULL,
  `Project_Content_Describle` varchar(255) NOT NULL,
  `Project_Price` double(10,2) NOT NULL,
  `Project_Limited_Number` int(4) NOT NULL,
  `Project_Service_Conditions` varchar(200) DEFAULT NULL,
  `Project_Sale_Price` double DEFAULT NULL,
  `Project_Service_Time` bigint(20) DEFAULT NULL,
  `Project_Service_Picture` varchar(255) DEFAULT NULL,
  `Is_Features` int(4) DEFAULT NULL,
  `Remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Project_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_order`
--

DROP TABLE IF EXISTS `service_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_order` (
  `Service_Order_Id` int(20) NOT NULL AUTO_INCREMENT,
  `Old_Id` int(20) NOT NULL,
  `User_Id` int(20) NOT NULL,
  `Service_Person_Id` int(20) NOT NULL,
  `Project_Id` int(20) NOT NULL,
  `Service_Num` int(4) NOT NULL,
  `Service_Price` double(10,2) DEFAULT NULL,
  `Begin_Time` bigint(20) NOT NULL,
  `End_Time` bigint(20) NOT NULL,
  `Service_Address` varchar(255) DEFAULT NULL,
  `Evaluation_Id` int(20) NOT NULL,
  `Pay_Status` int(4) NOT NULL,
  `Order_Status` int(4) NOT NULL,
  `Remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Service_Order_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_order`
--

LOCK TABLES `service_order` WRITE;
/*!40000 ALTER TABLE `service_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_person`
--

DROP TABLE IF EXISTS `service_person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `service_person` (
  `Service _Person_Id` int(20) NOT NULL,
  `Service_Name` varchar(200) NOT NULL,
  `Service_Gender` int(2) NOT NULL,
  `Service_Phone` varchar(13) NOT NULL,
  `Service_Age` int(3) DEFAULT NULL,
  `Service_Job_Num` varchar(40) NOT NULL,
  `Community_Id` int(20) NOT NULL,
  `Service_Work_Time` varchar(3) DEFAULT NULL,
  `Service_Work_Position` varchar(100) DEFAULT NULL,
  `User_Id` int(20) NOT NULL,
  PRIMARY KEY (`Service _Person_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_person`
--

LOCK TABLES `service_person` WRITE;
/*!40000 ALTER TABLE `service_person` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tip`
--

DROP TABLE IF EXISTS `tip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tip` (
  `Tip_Id` int(20) NOT NULL AUTO_INCREMENT,
  `User_Id` int(20) NOT NULL,
  `Service _Person_Id` int(20) NOT NULL,
  `Tip_Content` varchar(255) DEFAULT NULL,
  `Tip_Time` bigint(20) NOT NULL,
  `Is_Complete` int(4) DEFAULT NULL,
  `Evaluation_Id` int(20) NOT NULL,
  `Remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Tip_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tip`
--

LOCK TABLES `tip` WRITE;
/*!40000 ALTER TABLE `tip` DISABLE KEYS */;
/*!40000 ALTER TABLE `tip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `User_Id` int(20) NOT NULL AUTO_INCREMENT,
  `Type_Id` int(20) NOT NULL,
  `User_Name` varchar(200) NOT NULL,
  `Password` varchar(200) NOT NULL,
  `Is_Hide` int(2) DEFAULT NULL,
  `User_Details_Id` int(20) DEFAULT NULL,
  `Service_Person_Id` int(20) DEFAULT NULL,
  PRIMARY KEY (`User_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,1,'王五','888888',1,1,NULL),(2,3,'zhangsan','888888',2,2,NULL),(3,2,'lisi','888888',2,3,NULL),(4,1,'wangwu','888888',2,NULL,NULL),(5,1,'maliu','888888',2,NULL,NULL),(7,1,'zhaosi','888888',2,7,NULL),(8,1,'liuneng','888888',2,8,NULL),(9,4,'renming','888888',2,9,NULL),(10,1,'zhonguo','666888',2,6,NULL),(11,1,'caopi','888666',2,20,NULL),(22,1,'12772','1234567',2,21,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_authority`
--

DROP TABLE IF EXISTS `user_authority`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_authority` (
  `User_Authority_Id` int(20) NOT NULL,
  `User_Id` int(20) NOT NULL,
  `Authority_Bitmap` varchar(100) NOT NULL,
  PRIMARY KEY (`User_Authority_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_authority`
--

LOCK TABLES `user_authority` WRITE;
/*!40000 ALTER TABLE `user_authority` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_authority` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_details` (
  `User_Details_Id` int(20) NOT NULL AUTO_INCREMENT,
  `True_Name` varchar(200) DEFAULT NULL,
  `User_Gender` int(2) DEFAULT NULL,
  `User_Phone` varchar(20) DEFAULT NULL,
  `User_Age` int(3) DEFAULT NULL,
  `User_Email` varchar(100) DEFAULT NULL,
  `Community_Id` int(20) DEFAULT NULL,
  `User_Address` varchar(200) NOT NULL,
  `User_Id` int(20) DEFAULT NULL,
  `Is_Hide` int(2) NOT NULL,
  PRIMARY KEY (`User_Details_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` VALUES (1,'诸葛亮',1,'18788836331',23,'229707654@qq.com',1,'安徽省巴中县',1,1),(2,'曹操2',1,'18725647899',45,'245678945@qq.com',1,'安徽省太湖石',2,2),(3,'马超',1,'18765654433',43,'228707689@qq.com',1,'安徽省宣城市',3,2),(6,'颜良',1,'18765654433',56,'228707689@qq.com',1,'安徽省芜湖市',10,2),(7,'文丑',1,'18765654433',57,'228707689@qq.com',1,'安徽省芜湖市',7,2),(8,'关羽',1,'18765654433',46,'228707689@qq.com',1,'安徽省芜湖市',8,2),(9,'王朗',1,'18765654433',65,'228707689@qq.com',1,'安徽省芜湖市',9,2),(20,'曹丕',2,'18765654433',65,'228707689@qq.com',1,'安徽省巢湖市',11,2),(21,'yangxin',2,'18321717111',18,'244815178@qq.com',NULL,'安徽省合肥市包河区',22,2);
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_type`
--

DROP TABLE IF EXISTS `user_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_type` (
  `Type_Id` int(20) NOT NULL AUTO_INCREMENT,
  `Type_Name` varchar(200) NOT NULL,
  PRIMARY KEY (`Type_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_type`
--

LOCK TABLES `user_type` WRITE;
/*!40000 ALTER TABLE `user_type` DISABLE KEYS */;
INSERT INTO `user_type` VALUES (1,'普通用户'),(2,'社区服务人员'),(3,'普通管理员'),(4,'超级管理员');
/*!40000 ALTER TABLE `user_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-26 17:07:47
