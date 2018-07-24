/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost:3306
 Source Schema         : ShoppingWeb

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : 65001

 Date: 23/07/2018 22:13:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `gid` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_goods_id_cart_gid` (`gid`),
  KEY `FK_user_id_cart_uid` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tid` int(11) NOT NULL,
  `gname` varchar(20) NOT NULL,
  `gpic` varchar(50) NOT NULL,
  `details` text NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `details_imgs` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_type_id_goods_tid` (`tid`),
  CONSTRAINT `FK_type_id_goods_tid` FOREIGN KEY (`tid`) REFERENCES `type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
BEGIN;
INSERT INTO `goods` VALUES (1, 1, '男生衣服体恤衫', '1.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。', 598.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (2, 1, '版潮流半袖衣服', '2.jpg', '深色的五分仔裤搭配镂空的针织衫，分外迷人；出位的配饰，可以为这样简单的装扮增添时尚风味。', 420.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (3, 1, '修身体恤潮流', '3.jpg', '裤子有直筒、修身、宽松等）；五是流行元素、设计风格和特点（比如可脱卸、正反穿、一衣多款等）；六是工艺做工；七是建议的服饰搭配和形成的效果。', 398.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (4, 1, '夏装圆领半袖上衣', '4.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。', 348.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (5, 1, '体桖夏装衣服男', '5.jpg', '裤子有直筒、修身、宽松等）；五是流行元素、设计风格和特点（比如可脱卸、正反穿、一衣多款等）；六是工艺做工；七是建议的服饰搭配和形成的效果。', 298.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (6, 1, '体恤打底衫潮流', '6.jpg', '裤子有直筒、修身、宽松等）；五是流行元素、设计风格和特点（比如可脱卸、正反穿、一衣多款等）；六是工艺做工；七是建议的服饰搭配和形成的效果。', 268.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (7, 1, '潮牌衣服修身体恤', '7.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。', 208.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (8, 1, '新款半袖打底衫衣服男', '8.jpg', '裤子有直筒、修身、宽松等）；五是流行元素、设计风格和特点（比如可脱卸、正反穿、一衣多款等）；六是工艺做工；七是建议的服饰搭配和形成的效果。', 168.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (9, 1, '流体恤衫套装男装', '9.jpg', '有机黄瓜,有机豆角, 有机杏鲍菇,有机西红柿,有机红黄彩椒，有机蒜苔,有机茄子,有机散白菜花,有机绿甘蓝，有机小白菜等精选10种有机蔬菜 ', 138.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (10, 2, 'T恤运动服两件套打底衫', '10.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。空心菜，原名蕹菜，又名藤藤菜、蓊菜、通心菜、无心菜、瓮菜、空筒菜、竹叶菜，节节菜。开白色喇叭状花其梗中心是空的，故称“空心菜”。中国南方农村普遍栽培作蔬菜空心菜属蔓生植物，根系分布浅，为须根系，再生能力强。茎蔓生，圆形而中空，柔软，绿色或淡紫色，茎粗1～2厘米。茎有节，每节除腋芽外，还可长出不定根，节间长为3.5～5厘米，最长的可达7厘米 ', 15.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (11, 2, 't恤男士短袖港风夏天打底', '11.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。苦菊是一种廊坊特产的食用植物，苦菊属于菊花的一种，又名苦菜，有抗菌、解热、消炎、明目等作用。苦菊味略苦，颜色碧绿，可炒食或凉拌，是清热去火的美食佳品。因其味感甘中略带苦，且有清热解暑之功效，受到广泛好评。', 15.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (12, 2, '短袖t恤套装男士', '12.jpg', '台湾红梗也叫紫菜头，红菜头、红甜菜或食用红甜菜，属于跟肉根、根皮均呈紫红色，可以直接食用（做成凉拌菜、拼盘等），也可以熟食（如俄罗斯的红菜汤），虽然根型类似圆萝卜，但与萝卜不是一个属的。甜菜属于藜科甜菜属，而萝卜属于十字花科萝卜属。 ', 15.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (13, 2, '少年短袖T恤半袖男夏装\n', '13.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。紫油菜的营养素含量及其食疗价值可称得上蔬菜中的佼佼者，其风味浓郁，爽脆清口，好评度极高。紫油菜富含有膳食纤维，可以降低血脂。还可以解毒消肿、宽肠通便、强身健体。紫油菜含有大量胡萝卜素和维生素C，有助于增强机体免疫能力。紫油菜所含钙量在绿叶蔬菜中为最高，一个成年人一天吃500克紫油菜，所含钙、铁、维生素A和C即可满足生理需求。 ', 20.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (14, 2, '薄款外套斗篷披风夏季', '14.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。韭菜，（学名：A. tuberosum Rottl. ex Spreng.）别名：丰本、草钟乳、起阳草、懒人菜、长生韭、壮阳草、扁菜等；属百合科多年生草本植物，具特殊强烈气味，根茎横卧，鳞茎狭圆锥形，簇生；鳞式外皮黄褐色，网状纤维质；叶基生，条形，扁平；伞形花序，顶生。\r\n叶、花葶和花均作蔬菜食用；种子等可入药，具有补肾，健胃，提神，止汗固涩等功效。在中医里，有人把韭菜称为“洗肠草”。', 15.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (15, 2, '袖蜜桃粉刺绣卫衣男t', '15.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。芹菜，属伞形科植物。有水芹、旱芹、西芹三种，功能相近，药用以旱芹为佳。旱芹香气较浓，称\"药芹\"。但是和香菜不是一个种，芹菜富含蛋白质、碳水化合物、胡萝卜素、B族维生素、钙、磷、铁、钠等，同时，具有有平肝清热，祛风利湿，除烦消肿，凉血止血，解毒宣肺，健胃利血、清肠利便、润肺止咳、降低血压、健脑镇静的功效。常吃芹菜，尤其是吃芹菜叶，对预防高血压、动脉硬化等都十分有益，并有辅助治疗作用。', 15.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (16, 2, '弟t恤带帽衫运动背心男', '16.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。紫背天葵（学名：Begonia fimbristipula Hance）：多年生小草本，高4-12厘米。块茎肉质，球形，无茎。基生叶通常1片；柄纤细，长2-6厘米，有长粗毛；叶片卵状心形，长2.5-7厘米，宽2-6厘米，先端渐尖，基部心形，近对称，边缘有不规则的尖锯齿，基出7-9条脉，两面有伏生粗毛，下面紫色。夏季开粉红色花，花单性同株，2-4朵花组成聚伞状花天酒地序，总花梗纤细，长超过叶片；雄花被片4，雄蕊多数；雌花被片3，子房下位，花柱3。蒴果三角形，有3翅，1翅特大，其他2翅条形。', 18.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (17, 2, '宽松套头连帽T恤情侣潮', '1.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。油麦菜，别名莜麦菜，属菊科、莴苣属植物，是以嫩梢、嫩叶为产品的尖叶型叶用莴苣，叶片呈长披针形，色泽淡绿、质地脆嫩，口感极为鲜嫩、清香、具有独特风味，含有大量维生素A、维生素B1、维生素B2和大量钙、铁等营养成分，是生食蔬菜中的上品，有“凤尾”之称。', 16.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (18, 2, '短袖t恤套装男士', '2.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。不结球白菜俗称小白菜，十字花科-芸苔属，同属大白菜的变种，一年生草本植物，原产我国。', 15.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (19, 2, 't恤男士短袖港风夏天打底', '2.jpg', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。菠菜（Spinacia oleracea L.）又名波斯菜、赤根菜、鹦鹉菜等 [1]  ，属藜科菠菜属，一年生草本植物。植物高可达1米，根圆锥状，带红色，较少为白色，叶戟形至卵形，鲜绿色，全缘或有少数牙齿状裂片。 [2]  菠菜的种类很多，按种子形态可分为有刺种与无刺种两个变种。', 15.00, 'detail-01.jpg');
INSERT INTO `goods` VALUES (20, 2, 't恤男士短袖港风夏天打底', 'images/45.png', '清新有致的浅灰色短裤与T恤，简洁舒适的中性装扮，让整体显得格外时髦,金属项链与之相融和，看上去青春而富有朝气。叶生菜是由中国农科院蔬菜花卉研究所选育的一个优良生菜品种。 叶生菜\r\n特征特性 株高20～22厘米、开展度30～35厘米，叶卵圆形、散生、嫩绿色。叶面褶皱，叶缘波状，美观。单株重300～450克，口感脆嫩，品质好。耐寒、抗病、生长速度快，不耐高温干旱。适宜春秋露地及冬保护地栽培。 ', 15.00, 'detail-01.jpg');
COMMIT;

-- ----------------------------
-- Table structure for indent
-- ----------------------------
DROP TABLE IF EXISTS `indent`;
CREATE TABLE `indent` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `number` varchar(32) NOT NULL,
  `uid` int(11) NOT NULL,
  `gid` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `money` decimal(8,2) DEFAULT NULL,
  `time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_goods_id_indent_gid` (`gid`),
  KEY `FK_user_id_indent_uid` (`uid`),
  CONSTRAINT `FK_goods_id_indent_gid` FOREIGN KEY (`gid`) REFERENCES `goods` (`id`),
  CONSTRAINT `FK_user_id_indent_uid` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of indent
-- ----------------------------
BEGIN;
INSERT INTO `indent` VALUES (3, '1530850157370', 1, 1, 19, 0.00, '2018-07-06 12:09:17');
INSERT INTO `indent` VALUES (4, '1530850157370', 1, 2, 25, 0.00, '2018-07-06 12:09:17');
INSERT INTO `indent` VALUES (5, '1530850157370', 1, 4, 4, 0.00, '2018-07-06 12:09:17');
INSERT INTO `indent` VALUES (6, '1530850157370', 1, 14, 1, 0.00, '2018-07-06 12:09:17');
INSERT INTO `indent` VALUES (7, '1530850421189', 1, 2, 1, 0.00, '2018-07-06 12:13:41');
INSERT INTO `indent` VALUES (8, '1530850421189', 1, 1, 1, 0.00, '2018-07-06 12:13:41');
INSERT INTO `indent` VALUES (9, '1530863270216', 1, 2, 5, 0.00, '2018-07-06 15:47:50');
INSERT INTO `indent` VALUES (10, '1530863270216', 1, 1, 5, 0.00, '2018-07-06 15:47:50');
COMMIT;

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `tel` char(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `addr` text,
  PRIMARY KEY (`id`),
  KEY `FK_user_id_information_uid` (`uid`),
  CONSTRAINT `FK_user_id_information_uid` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for repertory
-- ----------------------------
DROP TABLE IF EXISTS `repertory`;
CREATE TABLE `repertory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `gid` int(11) NOT NULL,
  `gnumber` int(11) NOT NULL,
  `gin` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `FK_goods_id_repertory_gid` (`gid`),
  CONSTRAINT `FK_goods_id_repertory_gid` FOREIGN KEY (`gid`) REFERENCES `goods` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repertory
-- ----------------------------
BEGIN;
INSERT INTO `repertory` VALUES (1, 1, 5, '2018-07-06 15:47:50');
INSERT INTO `repertory` VALUES (2, 2, 5, '2018-07-06 15:47:50');
INSERT INTO `repertory` VALUES (3, 3, 1200, '2018-07-03 23:32:14');
INSERT INTO `repertory` VALUES (4, 4, 1200, '2018-07-06 13:34:41');
INSERT INTO `repertory` VALUES (5, 5, 1200, '2018-07-03 23:32:22');
INSERT INTO `repertory` VALUES (6, 6, 1200, '2018-07-03 23:32:24');
INSERT INTO `repertory` VALUES (7, 7, 1200, '2018-07-03 23:32:28');
INSERT INTO `repertory` VALUES (8, 8, 1200, '2018-07-03 23:32:34');
INSERT INTO `repertory` VALUES (9, 9, 1200, '2018-07-03 23:32:38');
INSERT INTO `repertory` VALUES (10, 10, 1200, '2018-07-03 23:32:43');
INSERT INTO `repertory` VALUES (11, 11, 1200, '2018-07-03 23:32:46');
INSERT INTO `repertory` VALUES (12, 12, 1200, '2018-07-03 23:32:51');
INSERT INTO `repertory` VALUES (13, 13, 1200, '2018-07-03 23:32:59');
INSERT INTO `repertory` VALUES (14, 14, 12001, '2018-07-06 13:34:44');
INSERT INTO `repertory` VALUES (15, 15, 1200, '2018-07-03 23:33:06');
INSERT INTO `repertory` VALUES (16, 16, 1200, '2018-07-03 23:33:09');
INSERT INTO `repertory` VALUES (17, 17, 1200, '2018-07-03 23:33:12');
INSERT INTO `repertory` VALUES (18, 18, 1200, '2018-07-03 23:33:15');
INSERT INTO `repertory` VALUES (19, 19, 1200, '2018-07-03 23:33:19');
INSERT INTO `repertory` VALUES (20, 20, 1200, '2018-07-03 23:33:22');
COMMIT;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tname` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------
BEGIN;
INSERT INTO `type` VALUES (1, '有机蔬菜礼盒');
INSERT INTO `type` VALUES (2, '有机叶菜');
INSERT INTO `type` VALUES (3, '有机果菜');
INSERT INTO `type` VALUES (4, '有机瓜菜、花菜');
INSERT INTO `type` VALUES (5, '有机包菜、菌菇');
INSERT INTO `type` VALUES (6, '新鲜水果');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(20) NOT NULL,
  `pass` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '353058227@qq.com', '7D182F3BA0B6DBDFCAA83ABE74A7D5FD');
INSERT INTO `user` VALUES (2, 'Tstory9@foxmail.com', '7D182F3BA0B6DBDFCAA83ABE74A7D5FD');
COMMIT;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` int(11) NOT NULL,
  `portrait` varchar(50) DEFAULT NULL,
  `balance` decimal(10,2) DEFAULT '10000.00',
  PRIMARY KEY (`id`),
  KEY `FK_user_id_userInfo_uid` (`uid`),
  CONSTRAINT `FK_user_id_userInfo_uid` FOREIGN KEY (`uid`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
BEGIN;
INSERT INTO `userinfo` VALUES (1, 1, NULL, 10000.00);
INSERT INTO `userinfo` VALUES (2, 2, NULL, 10000.00);
COMMIT;

-- ----------------------------
-- View structure for art_show
-- ----------------------------
DROP VIEW IF EXISTS `art_show`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `art_show` AS select `cart`.`uid` AS `uid`,`cart`.`gid` AS `gid`,`cart`.`amount` AS `amount`,`goods`.`gname` AS `gname`,`goods`.`gpic` AS `gpic`,`goods`.`price` AS `price`,`goods`.`id` AS `id`,`type`.`tname` AS `tname` from ((`cart` join `goods` on((`cart`.`gid` = `goods`.`id`))) join `type` on((`goods`.`tid` = `type`.`id`)));

-- ----------------------------
-- View structure for goods_view
-- ----------------------------
DROP VIEW IF EXISTS `goods_view`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `goods_view` AS select `goods`.`id` AS `id`,`goods`.`gname` AS `gname`,`goods`.`gpic` AS `gpic`,`goods`.`details` AS `details`,`goods`.`price` AS `price`,`repertory`.`gnumber` AS `gnumber` from (`goods` join `repertory` on((`goods`.`id` = `repertory`.`gid`)));

-- ----------------------------
-- Procedure structure for proc_addcarts
-- ----------------------------
DROP PROCEDURE IF EXISTS `proc_addcarts`;
delimiter ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `proc_addcarts`(pgoodsid INT ,puid INT)
BEGIN 
   DECLARE pid INT DEFAULT 0;
	 SELECT id into pid FROM cart WHERE gid=pgoodsid AND uid=puid;
	 IF pid !=0 THEN 
	  UPDATE cart SET amount=amount+1 WHERE gid=pgoodsid AND uid=puid;
	 ELSE 
	INSERT INTO cart (uid,gid,amount) VALUES (uid,pgoodsid,1);
   END IF;
	END;
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
