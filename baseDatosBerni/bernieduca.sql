CREATE DATABASE  IF NOT EXISTS `bernieduca` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bernieduca`;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `actividad`
--

DROP TABLE IF EXISTS `actividad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `actividad` (
  `idActividad` int NOT NULL AUTO_INCREMENT,
  `nom_act` varchar(45) NOT NULL,
  `calif_act` int DEFAULT NULL,
  `num_act` int NOT NULL,
  `descrip_act` text NOT NULL,
  `reque_act` text NOT NULL,
  `obje_act` text NOT NULL,
  `fechaCreacion_act` datetime NOT NULL,
  `actua_act` text NOT NULL,
  `intento_act` int DEFAULT NULL,
  PRIMARY KEY (`idActividad`),
  UNIQUE KEY `idActividad_UNIQUE` (`idActividad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actividad`
--

LOCK TABLES `actividad` WRITE;
/*!40000 ALTER TABLE `actividad` DISABLE KEYS */;
/*!40000 ALTER TABLE `actividad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prog_act`
--

DROP TABLE IF EXISTS `prog_act`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prog_act` (
  `idProgAct` int NOT NULL AUTO_INCREMENT,
  `idUsuario_fk` int NOT NULL,
  `idActividad_fk` int NOT NULL,
  `num_act` int NOT NULL,
  `nom_act` varchar(45) NOT NULL,
  `calif_act` int DEFAULT NULL,
  `intento_act` int DEFAULT NULL,
  PRIMARY KEY (`idProgAct`),
  UNIQUE KEY `idProgAct_UNIQUE` (`idProgAct`),
  KEY `idUsuario_fk_idx` (`idUsuario_fk`),
  KEY `idActividad_fk_idx` (`idActividad_fk`),
  CONSTRAINT `idActividad_fk` FOREIGN KEY (`idActividad_fk`) REFERENCES `actividad` (`idActividad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idUsuario_fk` FOREIGN KEY (`idUsuario_fk`) REFERENCES `usuario` (`idUsuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prog_act`
--

LOCK TABLES `prog_act` WRITE;
/*!40000 ALTER TABLE `prog_act` DISABLE KEYS */;
/*!40000 ALTER TABLE `prog_act` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `nombre_us` varchar(45) NOT NULL,
  `apellidos_us` varchar(45) NOT NULL,
  `correo_us` varchar(45) NOT NULL,
  `telefono_us` varchar(10) NOT NULL,
  `gen_us` varchar(1) NOT NULL,
  `user_us` varchar(20) NOT NULL,
  `password_us` varchar(20) NOT NULL,
  `inicioSesion_us` datetime DEFAULT '0000-00-00 00:00:00',
  `ultimaSesion_us` datetime DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `idUsuario_UNIQUE` (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-13 21:47:46
