/*
 Navicat Premium Data Transfer

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 14/09/2020 17:16:55
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, 'test', '$2a$10$kWyNMxV.6fgkGN12OEWJkujtSPsbMRIVKvahW3MHNpqUQ4TK5q6Jy', 'ROLE_USER');
INSERT INTO `user` VALUES (2, 'admin', '$2a$10$sQHpL34X9NmyylyeWFMmcedyQO8fV.AE/9h/oBr049yWUpUIdwMe.', 'ROLE_USER');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
