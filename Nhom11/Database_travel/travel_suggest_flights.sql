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
-- Table structure for table `flights`
--

DROP TABLE IF EXISTS `flights`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flights` (
  `flight_id` int NOT NULL AUTO_INCREMENT,
  `airline_name` varchar(100) NOT NULL,
  `departure_city` varchar(100) NOT NULL,
  `arrival_city` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '',
  `departure_time` datetime NOT NULL,
  `arrival_time` datetime NOT NULL,
  `price` decimal(10,2) NOT NULL,
  `available_seats` int NOT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flights`
--

LOCK TABLES `flights` WRITE;
/*!40000 ALTER TABLE `flights` DISABLE KEYS */;
INSERT INTO `flights` VALUES (1,'Vietnam Airlines','Hanoi','','2024-12-20 10:00:00','2024-12-20 13:00:00',120.50,100,'2024-12-18 03:00:00'),(2,'Bamboo Airways','Hanoi','','2024-12-21 15:00:00','2024-12-21 18:00:00',150.75,80,'2024-12-18 03:00:00'),(3,'Jetstar','Ho Chi Minh City','','2024-12-22 08:00:00','2024-12-22 10:30:00',90.60,120,'2024-12-18 03:00:00'),(4,'Vietnam Airlines','Da Nang','','2024-12-23 12:00:00','2024-12-23 14:30:00',110.80,90,'2024-12-18 03:00:00'),(5,'VietJet Air','Hanoi','','2024-12-24 09:00:00','2024-12-24 11:00:00',75.25,150,'2024-12-18 03:00:00'),(6,'Bamboo Airways','Ho Chi Minh City','','2024-12-25 16:00:00','2024-12-25 18:30:00',130.00,85,'2024-12-18 03:00:00'),(7,'Jetstar','Da Nang','','2024-12-26 14:00:00','2024-12-26 16:30:00',95.45,110,'2024-12-18 03:00:00'),(8,'VietJet Air','Hanoi','','2024-12-27 11:00:00','2024-12-27 13:00:00',80.90,140,'2024-12-18 03:00:00');
/*!40000 ALTER TABLE `flights` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-19 13:46:13
