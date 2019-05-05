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

 Date: 05/05/2019 17:57:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for store
-- ----------------------------
DROP TABLE IF EXISTS `store`;
CREATE TABLE `store`  (
  `import_id` int(11) NOT NULL,
  `store_id` int(20) NOT NULL AUTO_INCREMENT,
  `drug_id` int(20) NULL DEFAULT NULL,
  `import_date` date NULL DEFAULT NULL,
  `remain_num` double(20, 0) NULL DEFAULT NULL,
  `supply` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `unit` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `location` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`store_id`) USING BTREE,
  INDEX `drug_id`(`drug_id`) USING BTREE,
  CONSTRAINT `drug_id` FOREIGN KEY (`drug_id`) REFERENCES `drug` (`DrugNo`) ON DELETE NO ACTION ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of store
-- ----------------------------
INSERT INTO `store` VALUES (1, 1, 1, '2019-01-07', 30, '供应商1号', '箱', '2号仓库');
INSERT INTO `store` VALUES (2, 2, 2, '2019-01-07', 20, '供货商2号', '箱', '2号仓库');
INSERT INTO `store` VALUES (3, 3, 3, '2019-01-08', 70, '供货商1号', '箱', '3号仓库');
INSERT INTO `store` VALUES (4, 4, 4, '2019-01-08', 33, '供货商4号', '箱', '2号仓库');

SET FOREIGN_KEY_CHECKS = 1;
