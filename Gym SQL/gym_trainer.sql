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
-- Table structure for table `trainer`
--

DROP TABLE IF EXISTS `trainer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trainer` (
  `tr_id` int(11) NOT NULL,
  `tr_name` char(15) NOT NULL,
  `tr_type` char(20) DEFAULT NULL,
  `tr_phno` bigint(20) DEFAULT NULL,
  `tr_email` varchar(50) DEFAULT NULL,
  `tr_dob` date DEFAULT NULL,
  `tr_age` int(11) DEFAULT NULL,
  `tr_gen` char(8) DEFAULT NULL,
  `tr_level` varchar(8) DEFAULT NULL,
  `tr_sal` double DEFAULT NULL,
  PRIMARY KEY (`tr_id`,`tr_name`),
  KEY `tr_name` (`tr_name`),
  CONSTRAINT `trainer_chk_1` CHECK ((`tr_age` >= 18))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trainer`
--

LOCK TABLES `trainer` WRITE;
/*!40000 ALTER TABLE `trainer` DISABLE KEYS */;
INSERT INTO `trainer` VALUES (1,'Adarsh','Calisthenics',6360584064,'aneesh@gmail.com','1999-01-01',21,'Male','Level 3',48000),(2,'Dhanraj','Weightlifting',9880588910,'dhanraj@gmail.com','1999-10-16',20,'Male','Level 2',28000),(3,'Dhanush','Cardio',8974563210,'dhanush@gmail.com','1999-04-08',20,'Male','Level 3',60000);
/*!40000 ALTER TABLE `trainer` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trainer_BEFORE_INSERT` BEFORE INSERT ON `trainer` FOR EACH ROW BEGIN
if new.tr_level='Level 1' and new.tr_type='Aerobics' then
set new.tr_sal='10000';
elseif new.tr_level='Level 1' and new.tr_type='Calisthenics' then
set new.tr_sal='12000';
elseif new.tr_level='Level 1' and new.tr_type='Weightlifting' then
set new.tr_sal='14000';
elseif new.tr_level='Level 1' and new.tr_type='Cardio' then
set new.tr_sal='15000';
elseif new.tr_level='Level 2' and new.tr_type='Aerobics' then
set new.tr_sal='20000';
elseif new.tr_level='Level 2' and new.tr_type='Calisthenics' then
set new.tr_sal='24000';
elseif new.tr_level='Level 2' and new.tr_type='Weightlifting' then
set new.tr_sal='28000';
elseif new.tr_level='Level 2' and new.tr_type='Cardio' then
set new.tr_sal='30000';
elseif new.tr_level='Level 3' and new.tr_type='Aerobics' then
set new.tr_sal='40000';
elseif new.tr_level='Level 3' and new.tr_type='Calisthenics' then
set new.tr_sal='48000';
elseif new.tr_level='Level 3' and new.tr_type='Weightlifting' then
set new.tr_sal='56000';
else
set new.tr_sal='60000';
end if;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `trainer_BEFORE_UPDATE` BEFORE UPDATE ON `trainer` FOR EACH ROW BEGIN
if new.tr_level='Level 1' and new.tr_type='Aerobics' then
set new.tr_sal='10000';
elseif new.tr_level='Level 1' and new.tr_type='Calisthenics' then
set new.tr_sal='12000';
elseif new.tr_level='Level 1' and new.tr_type='Weightlifting' then
set new.tr_sal='14000';
elseif new.tr_level='Level 1' and new.tr_type='Cardio' then
set new.tr_sal='15000';
elseif new.tr_level='Level 2' and new.tr_type='Aerobics' then
set new.tr_sal='20000';
elseif new.tr_level='Level 2' and new.tr_type='Calisthenics' then
set new.tr_sal='24000';
elseif new.tr_level='Level 2' and new.tr_type='Weightlifting' then
set new.tr_sal='28000';
elseif new.tr_level='Level 2' and new.tr_type='Cardio' then
set new.tr_sal='30000';
elseif new.tr_level='Level 3' and new.tr_type='Aerobics' then
set new.tr_sal='40000';
elseif new.tr_level='Level 3' and new.tr_type='Calisthenics' then
set new.tr_sal='48000';
elseif new.tr_level='Level 3' and new.tr_type='Weightlifting' then
set new.tr_sal='56000';
else
set new.tr_sal='60000';
end if;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-29  8:04:05
