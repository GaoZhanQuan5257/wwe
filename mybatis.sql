/*
 Navicat Premium Data Transfer

 Source Server         : muyu
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 25/04/2020 10:20:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for flow
-- ----------------------------
DROP TABLE IF EXISTS `flow`;
CREATE TABLE `flow` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `flow_num` varchar(200) DEFAULT NULL COMMENT '流水号',
  `order_num` bigint(20) unsigned DEFAULT NULL COMMENT '订单号',
  `product_id` bigint(20) unsigned DEFAULT NULL COMMENT '产品主键ID',
  `paid_amount` varchar(200) DEFAULT NULL COMMENT '支付金额',
  `paid_method` int(11) DEFAULT NULL COMMENT '支付方式\r\n            1：支付宝\r\n            2：微信',
  `buy_counts` int(11) DEFAULT NULL COMMENT '购买个数',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=451210139253342209 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `order_num` bigint(20) unsigned DEFAULT NULL COMMENT '订单号',
  `order_status` varchar(200) DEFAULT NULL COMMENT '订单状态\r\n            10：待付款\r\n            20：已付款',
  `order_amount` varchar(50) DEFAULT NULL COMMENT '订单金额',
  `paid_amount` varchar(50) DEFAULT NULL COMMENT '实际支付金额',
  `product_id` bigint(20) unsigned DEFAULT NULL COMMENT '产品表外键ID',
  `buy_counts` int(11) DEFAULT NULL COMMENT '产品购买的个数',
  `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `paid_time` datetime DEFAULT NULL COMMENT '支付时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=451366555356233729 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL COMMENT '产品名称',
  `price` varchar(11) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
BEGIN;
INSERT INTO `product` VALUES (1, '辣椒', '12.5');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名称',
  `birthday` date DEFAULT NULL COMMENT '生日',
  `sex` char(1) DEFAULT NULL COMMENT '性别',
  `address` varchar(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '项羽', NULL, '男', '西楚霸王');
INSERT INTO `user` VALUES (2, '秦王赢驷', NULL, '男', '大秦帝国');
INSERT INTO `user` VALUES (3, '张三', NULL, '女', '阿里巴巴');
INSERT INTO `user` VALUES (4, 'andy', NULL, 'T', 'HUAWEI');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
