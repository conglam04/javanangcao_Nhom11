-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: travel_suggest
-- ------------------------------------------------------
-- Server version	9.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `destinations`
--

DROP TABLE IF EXISTS `destinations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destinations` (
  `destination_id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`destination_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destinations`
--

LOCK TABLES `destinations` WRITE;
/*!40000 ALTER TABLE `destinations` DISABLE KEYS */;
INSERT INTO `destinations` VALUES (1,'Đà Nẵng','Thành phố mộng mơ','Việt Nam',NULL,'2024-12-17 18:31:35','2024-12-19 00:52:30',1222),(2,'Hội An','Phố Cổ','Việt Nam',NULL,'2024-12-17 18:49:01','2024-12-19 00:53:09',1222222),(3,'Paris','Thành phố ánh sáng','Pháp',NULL,'2024-12-17 19:00:07','2024-12-17 19:00:07',1500),(4,'Tokyo','Thủ đô Nhật Bản','Nhật Bản',NULL,'2024-12-17 19:00:07','2024-12-17 19:00:07',2000),(5,'Paris','The city of lights and love.','France',NULL,'2024-01-01 03:00:00','2024-12-19 01:12:40',3000000),(6,'Sydney','Famous for the Sydney Opera House.','Australia',NULL,'2024-01-02 04:00:00','2024-12-19 01:12:49',2500000),(7,'Kyoto','Known for its classical Buddhist temples.','Japan',NULL,'2024-01-03 05:00:00','2024-12-19 01:12:54',3400000),(8,'New York','The city that never sleeps.','USA',NULL,'2024-01-04 02:00:00','2024-12-19 01:13:01',8000000),(9,'Cape Town','Stunning scenery and wildlife.','South Africa',NULL,'2024-01-05 01:30:00','2024-12-19 01:13:04',89000000),(10,'Rome','Home to the Colosseum and Roman history.','Italy',NULL,'2024-01-06 07:00:00','2024-12-19 01:13:10',3400000),(11,'Rio de Janeiro','Famous for its Carnival and beaches.','Brazil',NULL,'2024-01-07 08:30:00','2024-12-19 01:13:16',4550000),(12,'Hanoi','A city with rich history and culture.','Vietnam',NULL,'2024-01-08 09:00:00','2024-12-19 01:13:21',45000000);
/*!40000 ALTER TABLE `destinations` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-19 13:46:14
