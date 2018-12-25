-- auto Generated on 2018-12-25 15:41:59 
-- DROP TABLE IF EXISTS `user_info_pojo`; 
CREATE TABLE user_info_pojo(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '主键',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    `phone` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'phone',
    `sex` INTEGER(12) NOT NULL DEFAULT -1 COMMENT 'sex',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'user_info_pojo';
