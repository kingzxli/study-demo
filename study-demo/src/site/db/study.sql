/*
 Navicat Premium Data Transfer

 Source Server         : docker_mysql
 Source Server Type    : MySQL
 Source Server Version : 50730
 Source Host           : 127.0.0.1:3306
 Source Schema         : study

 Target Server Type    : MySQL
 Target Server Version : 50730
 File Encoding         : 65001

 Date: 31/05/2020 20:07:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` varchar(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `db_source` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES ('1', 'king', '源1');
INSERT INTO `dept` VALUES ('2', 'fang', '源1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
