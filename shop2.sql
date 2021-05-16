/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 80011
Source Host           : localhost:3306
Source Database       : shop

Target Server Type    : MYSQL
Target Server Version : 80011
File Encoding         : 65001

Date: 2021-05-16 22:20:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `price` double(10,0) DEFAULT NULL,
  `total` double(255,0) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `picture` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('1', 'a', '2', '100', '200', 'CS', 'o', 'img/icon/a1.jpg');

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `num` int(11) NOT NULL,
  `price` double(11,0) NOT NULL,
  `picture` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `comment` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of item
-- ----------------------------
INSERT INTO `item` VALUES ('1', 'a', '97', '100', 'img/icon/a1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('2', 'b', '98', '20', 'img/icon/a1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('3', 'c', '97', '20', 'img/icon/c3.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('4', 'd', '91', '20', 'img/icon/d1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('5', 'e', '97', '20', 'img/icon/a2.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('6', 'f', '10', '20', 'img/icon/a2.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('7', 'g', '8', '20', 'img/icon/b1.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('8', 'h', '10', '20', 'img/icon/c1.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('9', 'i', '10', '20', 'img/icon/c1.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('10', 'j', '10', '20', 'img/icon/b1.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('11', 'aa', '10', '20', 'img/icon/b2.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('12', 'bb', '10', '20', 'img/icon/c2.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('13', 'bc', '10', '20', 'img/icon/c2.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('14', 'dc', '10', '20', 'img/icon/b2.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('15', 'ad', '10', '20', 'img/icon/f1.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('16', 'gg', '10', '20', 'img/icon/b3.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('17', 'ta', '10', '20', 'img/icon/b3.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('18', 'cv', '10', '20', 'img/icon/c1.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('19', 'cs', '10', '20', 'img/icon/c1.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('20', 'fg', '10', '20', 'img/icon/c2.jpg', 'b', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('21', 'qw', '10', '20', 'img/icon/f1.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('22', 'qe', '10', '20', 'img/icon/b2.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('23', 'wr', '10', '20', 'img/icon/b2.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('24', 'wt', '10', '20', 'img/icon/c3.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('25', 'yy', '10', '20', 'img/icon/c3.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('26', 'tc', '10', '20', 'img/icon/e1.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('27', 'rc', '10', '20', 'img/icon/e2.jpg', 'c', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('28', 'gs', '10', '20', 'img/icon/e1.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('29', 'jn', '10', '20', 'img/icon/e3.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('30', 'nm', '10', '20', 'img/icon/d1.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('31', 'nj', '10', '20', 'img/icon/f1.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('32', 'tk', '10', '20', 'img/icon/d1.jpg', 'd', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('33', 'zxc', '10', '20', 'img/icon/d1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('34', 'zxb', '10', '20', 'img/icon/d1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用。');
INSERT INTO `item` VALUES ('35', 'zxz', '10', '20', 'img/icon/d1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用');
INSERT INTO `item` VALUES ('36', 'qqw', '10', '20', 'img/icon/d1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用');
INSERT INTO `item` VALUES ('37', 'xy7', '10', '30', 'img/icon/d1.jpg', 'a', '通过这款万能遥控器，可以将家中所有支持红外、射频遥控的电器设备统一控制，支持多场景设置，方便用户使用');

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `price` double(11,0) DEFAULT NULL,
  `total` double(11,0) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', 'a', '3', '100', '300', 'a', null);

-- ----------------------------
-- Table structure for order1
-- ----------------------------
DROP TABLE IF EXISTS `order1`;
CREATE TABLE `order1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `price` double(11,0) DEFAULT NULL,
  `total` double(11,0) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `picture` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of order1
-- ----------------------------
INSERT INTO `order1` VALUES ('1', 'a', '3', '100', '300', 'CS', 'o', '1', 'img/icon/a1.jpg');
INSERT INTO `order1` VALUES ('2', 'b', '1', '20', '20', 'CS', 'o', '2', 'img/icon/a1.jpg');
INSERT INTO `order1` VALUES ('3', 'b', '1', '20', '20', 'CS', 'o', '3', 'img/icon/a1.jpg');
INSERT INTO `order1` VALUES ('4', 'b', '1', '20', '20', 'CS', 'o', '4', 'img/icon/a1.jpg');
INSERT INTO `order1` VALUES ('5', 'a', '3', '100', '300', 'CS', 'o', '2', 'img/icon/a1.jpg');
INSERT INTO `order1` VALUES ('7', 'c', '4', '20', '80', 'CS', 'o', '1', 'img/icon/c3.jpg');
INSERT INTO `order1` VALUES ('9', 'b', '2', '20', '40', 'CS', 'o', '1', 'img/icon/a1.jpg');
INSERT INTO `order1` VALUES ('10', 'b', '2', '20', '40', 'CS', 'o', '2', 'img/icon/a1.jpg');
INSERT INTO `order1` VALUES ('11', 'c', '3', '20', '60', 'CS', 'o', '1', 'img/icon/c3.jpg');
INSERT INTO `order1` VALUES ('12', 'd', '5', '20', '100', 'CS', 'o', '1', 'img/icon/d1.jpg');
INSERT INTO `order1` VALUES ('13', 'd', '4', '20', '80', 'CS', 'o', '1', 'img/icon/d1.jpg');
INSERT INTO `order1` VALUES ('14', 'e', '3', '20', '60', 'CS', 'o', '1', 'img/icon/a2.jpg');
INSERT INTO `order1` VALUES ('15', 'g', '2', '20', '40', 'CS', 'o', '1', 'img/icon/b1.jpg');
INSERT INTO `order1` VALUES ('16', 'c', '3', '20', '60', 'CS', 'o', '1', 'img/icon/c3.jpg');
INSERT INTO `order1` VALUES ('17', 'a', '1', '100', '100', 'CS', 'o', '1', 'img/icon/a1.jpg');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES ('1', 'a');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `phone` varchar(100) DEFAULT NULL,
  `sex` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', '0', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('2', 'a', 'a', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('3', 'b', 'b', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('4', 'c', 'c', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('5', 's', 's', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('6', 'd', 'd', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('7', 'q', 'q', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('8', 'w', 'w', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('9', 'e', 'e', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('11', 'z', 'z', '1', '13203366196', 'male', '1316196993@qq.com', 'CS');
INSERT INTO `user` VALUES ('12', 'o', 'o', '1', '1316196993@qq.com', 'female', '13203366196', 'CS');
