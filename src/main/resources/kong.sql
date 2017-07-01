/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.28 : Database - kong
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kong` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `kong`;

/*Table structure for table `apis` */

DROP TABLE IF EXISTS `apis`;

CREATE TABLE `apis` (
  `id` varchar(128) NOT NULL,
  `upstream_url` varchar(128) NOT NULL,
  `uris` varchar(128) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `apis` */

/*Table structure for table `consumer` */

DROP TABLE IF EXISTS `consumer`;

CREATE TABLE `consumer` (
  `id` varchar(128) NOT NULL,
  `consumer_id` varchar(128) DEFAULT NULL,
  `created_at` varchar(128) DEFAULT NULL,
  `key_consumer` varchar(128) DEFAULT NULL,
  `secret` varchar(128) DEFAULT NULL,
  `username` varchar(128) DEFAULT NULL,
  `jwt_token` varchar(512) DEFAULT NULL,
  `app_name` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `consumer` */

insert  into `consumer`(`id`,`consumer_id`,`created_at`,`key_consumer`,`secret`,`username`,`jwt_token`,`app_name`) values ('1','123','1123','123','123','123','123','123'),('2','123','222','222','222','222','222','222'),('22ab5fc9-c339-43f7-84f0-a804655a8e23',NULL,'1498890033000',NULL,NULL,'testinsert',NULL,NULL),('3','333',NULL,NULL,NULL,NULL,NULL,NULL),('3c85650c-66bd-480c-8c62-77c9bf9d8bc4','3c85650c-66bd-480c-8c62-77c9bf9d8bc4','1498891719000','02a5d51235a642a795919aa157a7f492','05e502f08544404185c33560371d5b71','testinsert',NULL,NULL),('4','444','444','44',NULL,NULL,NULL,NULL),('73df7417-e28c-43c6-983e-c266ede1df83',NULL,'1498890122000',NULL,NULL,'testinsert',NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
