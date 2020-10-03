CREATE DATABASE  IF NOT EXISTS `gym` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `gym`;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: gym
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `members`
--

DROP TABLE IF EXISTS `members`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `members` (
  `mbr_id` int(11) NOT NULL,
  `mbr_name` char(15) NOT NULL,
  `mbr_phno` bigint(20) DEFAULT NULL,
  `mbr_email` varchar(50) DEFAULT NULL,
  `mbr_dob` date DEFAULT NULL,
  `mbr_age` int(11) DEFAULT NULL,
  `mbr_gen` char(8) DEFAULT NULL,
  `tr_name` char(15) DEFAULT NULL,
  PRIMARY KEY (`mbr_id`,`mbr_name`),
  KEY `mbr_name` (`mbr_name`),
  KEY `members_ibfk_1` (`tr_name`),
  CONSTRAINT `members_ibfk_1` FOREIGN KEY (`tr_name`) REFERENCES `trainer` (`tr_name`) ON DELETE SET NULL ON UPDATE CASCADE,
  CONSTRAINT `members_chk_1` CHECK ((`mbr_age` >= 15))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `members`
--

LOCK TABLES `members` WRITE;
/*!40000 ALTER TABLE `members` DISABLE KEYS */;
INSERT INTO `members` VALUES (50,'Abhishek',7954813206,'abhishek@gmail.com','1999-02-09',20,'Male','Adarsh'),(51,'Darshan',8745012365,'darshan@gmail.com','1999-11-10',20,'Male','Adarsh'),(52,'Jerin',8541236975,'jerin@gmail.com','1999-07-07',20,'Male','Dhanraj'),(53,'Jeevan',7964123025,'jeevan@gmail.com','1999-04-16',20,'Male','Dhanush'),(54,'Hemanth',8201463927,'hemanth@gmail.com','1999-10-12',20,'Male','Dhanush');
/*!40000 ALTER TABLE `members` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-29  8:04:07
