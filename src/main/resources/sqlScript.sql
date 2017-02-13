create database MyBatisCodeHelper;

use MyBatisCodeHelper;

CREATE TABLE `my_user` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT COMMENT 'id',
  `cookie` varchar(50) NOT NULL DEFAULT '' COMMENT 'cookie',
  `type` int(12) NOT NULL DEFAULT '-1' COMMENT 'type',
  `user_name` varchar(50) NOT NULL DEFAULT '' COMMENT 'userName',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT 'password',
  `age` int(12) NOT NULL DEFAULT '-1' COMMENT 'age',
  `remaining_amount` decimal(14,4) NOT NULL DEFAULT '0.0000' COMMENT 'remainingAmount',
  `add_time` datetime NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'addTime',
  `serial_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT 'serialId',
  `global_id` bigint(20) NOT NULL DEFAULT '-1' COMMENT 'globalId',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='`my_user`'