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

 Date: 05/05/2019 17:57:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `del` int(255) NOT NULL DEFAULT 0,
  `enable` int(255) NOT NULL,
  PRIMARY KEY (`id`, `account`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'username', '1234', 0, 1);
INSERT INTO `user` VALUES (4, 'bai', '$2a$10$xu79slIH9P5VN8Bwm51W2uo.gG3V9ZFJfp4wysYa3UPwQ4r9Ln2HS', 0, 1);
INSERT INTO `user` VALUES (5, 'admin', '$2a$10$jzCVU.Tudwhu51Oq813jpOJx93ubJEsMxgaHvkmXBnyOewWRuABqe', 0, 1);

SET FOREIGN_KEY_CHECKS = 1;
