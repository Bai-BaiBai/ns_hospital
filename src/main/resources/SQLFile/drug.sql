/*
 Navicat MySQL Data Transfer

 Source Server         : MYSQL57_3307
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3307
 Source Schema         : nshis

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 05/05/2019 17:57:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for drug
-- ----------------------------
DROP TABLE IF EXISTS `drug`;
CREATE TABLE `drug`  (
  `DrugNo` int(11) NOT NULL AUTO_INCREMENT,
  `DrugName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `DrugFormat` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `DrugGrnre` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `ProDate` date NULL DEFAULT NULL,
  `EXP` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Company` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `DrugBatchNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Price` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Unit` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`DrugNo`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of drug
-- ----------------------------
INSERT INTO `drug` VALUES (1, '健胃消食片', '24片/盒', '非处方药', '2019-01-04', '24月', '内蒙古兰祥制药有限公司', '20190104Z', '9', '盒');
INSERT INTO `drug` VALUES (2, '蚂蚁大力丸', '1000粒/盒', '处方药', '2019-01-04', '24月', '河北汪一鸣假药有限公司', '20190104Z', '8', '盒');
INSERT INTO `drug` VALUES (3, '脑残丸', '6粒/瓶', '非处方药', '2019-01-04', '100年', '内蒙古楷文制药有限公司', '20190104Z', '100', '瓶');
INSERT INTO `drug` VALUES (4, '补脑益肠丸', '89粒/瓶', '非处方药', '2019-01-04', '23月', '内蒙古赵昌伟制药有限公司', '20190104Z', '9', '瓶');
INSERT INTO `drug` VALUES (5, '鸦片', '10粒/包', '非处方药', '2019-01-04', '10月', '内蒙古佳明有限公司', '20190104Z', '9', '包');
INSERT INTO `drug` VALUES (6, '肾宝', '10粒/瓶', '处方药', '2019-01-14', '10月', '内蒙古铎宝制药有限公司', '20190104Z', '100', '瓶');

SET FOREIGN_KEY_CHECKS = 1;
