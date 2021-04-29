-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: myshop
-- ------------------------------------------------------
-- Server version	8.0.24

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
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `num` int DEFAULT NULL,
  `price` double(10,0) DEFAULT NULL,
  `total` double(255,0) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `picture` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (1,'a',2,100,200,'CS','o','img/icon/holder_110.png'),(2,'b',2,20,40,'CS','o','img/icon/holder_110.png');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `item` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `num` int NOT NULL,
  `price` double(11,0) NOT NULL,
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'a',100,100,'img/icon/holder_110.png','a'),(2,'b',100,20,'img/icon/holder_110.png','a'),(3,'c',100,20,'img/icon/holder_110.png','a'),(4,'d',100,20,'img/icon/holder_110.png','a'),(5,'e',100,20,'img/icon/holder_110.png','a'),(6,'f',10,20,'img/icon/holder_110.png','b'),(7,'g',10,20,'img/icon/holder_110.png','c'),(8,'h',10,20,'img/icon/holder_110.png','d'),(9,'i',10,20,'img/icon/holder_110.png','d'),(10,'j',10,20,'img/icon/holder_110.png','d'),(11,'aa',10,20,'img/icon/holder_110.png','a'),(12,'bb',10,20,'img/icon/holder_110.png','a'),(13,'bc',10,20,'img/icon/holder_110.png','a'),(14,'dc',10,20,'img/icon/holder_110.png','b'),(15,'ad',10,20,'img/icon/holder_110.png','b'),(16,'gg',10,20,'img/icon/holder_110.png','b'),(17,'ta',10,20,'img/icon/holder_110.png','b'),(18,'cv',10,20,'img/icon/holder_110.png','b'),(19,'cs',10,20,'img/icon/holder_110.png','b'),(20,'fg',10,20,'img/icon/holder_110.png','b'),(21,'qw',10,20,'img/icon/holder_110.png','c'),(22,'qe',10,20,'img/icon/holder_110.png','c'),(23,'wr',10,20,'img/icon/holder_110.png','c'),(24,'wt',10,20,'img/icon/holder_110.png','c'),(25,'yy',10,20,'img/icon/holder_110.png','c'),(26,'tc',10,20,'img/icon/holder_110.png','c'),(27,'rc',10,20,'img/icon/holder_110.png','c'),(28,'gs',10,20,'img/icon/holder_110.png','d'),(29,'jn',10,20,'img/icon/holder_110.png','d'),(30,'nm',10,20,'img/icon/holder_110.png','d'),(31,'nj',10,20,'img/icon/holder_110.png','d'),(32,'tk',10,20,'img/icon/holder_110.png','d');
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order1`
--

DROP TABLE IF EXISTS `order1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order1` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `num` int DEFAULT NULL,
  `price` double(11,0) DEFAULT NULL,
  `total` double(11,0) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `picture` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order1`
--

LOCK TABLES `order1` WRITE;
/*!40000 ALTER TABLE `order1` DISABLE KEYS */;
INSERT INTO `order1` VALUES (1,'a',3,100,300,'a','o','1','img/icon/holder_110.png'),(2,'b',1,20,20,'CS','o','2','img/icon/holder_110.png'),(3,'b',1,20,20,'CS','o','3','img/icon/holder_110.png'),(4,'b',1,20,20,'CS','o','4','img/icon/holder_110.png'),(5,'a',3,100,300,'CS','o','1','img/icon/holder_110.png'),(6,'a',3,100,300,'CS','o','1','img/icon/holder_110.png'),(7,'c',4,20,80,'CS','o','1','img/icon/holder_110.png'),(8,'b',3,20,60,'CS','o','1','img/icon/holder_110.png');
/*!40000 ALTER TABLE `order1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `type` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
INSERT INTO `type` VALUES (1,'a');
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `sex` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'admin','admin','0','13203366196','male','1316196993@qq.com','CS'),(2,'a','a','1','13203366196','male','1316196993@qq.com','CS'),(3,'b','b','1','13203366196','male','1316196993@qq.com','CS'),(4,'c','c','1','13203366196','male','1316196993@qq.com','CS'),(5,'s','s','1','13203366196','male','1316196993@qq.com','CS'),(6,'d','d','1','13203366196','male','1316196993@qq.com','CS'),(7,'q','q','1','13203366196','male','1316196993@qq.com','CS'),(8,'w','w','1','13203366196','male','1316196993@qq.com','CS'),(9,'e','e','1','13203366196','male','1316196993@qq.com','CS'),(11,'z','z','1','13203366196','male','1316196993@qq.com','CS'),(12,'o','o','1','1316196993@qq.com','female','13203366196','CS');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'myshop'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-29 17:53:16
