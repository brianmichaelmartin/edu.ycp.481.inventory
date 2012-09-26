SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `inventory database` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `inventory database` ;

-- -----------------------------------------------------
-- Table `inventory database`.`STYLE`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory database`.`STYLE` (
  `style_id` INT NULL ,
  `button_down` CHAR NOT NULL ,
  `polo` VARCHAR(45) NOT NULL ,
  `tshirt` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`button_down`, `polo`, `tshirt`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory database`.`CATEGORY`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory database`.`CATEGORY` (
  `category_id` INT NOT NULL ,
  `bowling_shirts` CHAR NOT NULL ,
  `dart_Shirts` VARCHAR(45) NOT NULL ,
  `racing_shirts_pitCrew` VARCHAR(45) NOT NULL ,
  `billiard_shirts` VARCHAR(45) NOT NULL ,
  `jazz_shirts` VARCHAR(45) NOT NULL ,
  `poker_shirts` VARCHAR(45) NOT NULL ,
  `rockabilly_shirts` VARCHAR(45) NOT NULL ,
  `camp_shirts` VARCHAR(45) NOT NULL ,
  `charlie_sheen_style_shirts` VARCHAR(45) NOT NULL ,
  `retro_buttonup_shirts` VARCHAR(45) NOT NULL ,
  `polo_bowling_shirts` VARCHAR(45) NOT NULL ,
  `polo_sport_shirts` VARCHAR(45) NOT NULL ,
  `tshirts` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`bowling_shirts`, `dart_Shirts`, `racing_shirts_pitCrew`, `billiard_shirts`, `jazz_shirts`, `poker_shirts`, `rockabilly_shirts`, `camp_shirts`, `charlie_sheen_style_shirts`, `retro_buttonup_shirts`, `polo_bowling_shirts`, `polo_sport_shirts`, `tshirts`, `category_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory database`.`GENDER`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory database`.`GENDER` (
  `gender_id` INT NOT NULL ,
  `womens` VARCHAR(45) NOT NULL ,
  `mens` VARCHAR(45) NOT NULL ,
  `kids` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`gender_id`, `womens`, `mens`, `kids`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory database`.`PRODUCT`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory database`.`PRODUCT` (
  `product_id` INT NOT NULL ,
  `id_number` INT NULL ,
  PRIMARY KEY (`product_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory database`.`SIZE`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory database`.`SIZE` (
  `size_id` INT NULL ,
  `x_small` CHAR NOT NULL ,
  `small` CHAR NOT NULL ,
  `medium` VARCHAR(45) NOT NULL ,
  `large` VARCHAR(45) NOT NULL ,
  `XL` VARCHAR(45) NOT NULL ,
  `2XL` VARCHAR(45) NOT NULL ,
  `3XL` VARCHAR(45) NOT NULL ,
  `4XL` VARCHAR(45) NOT NULL ,
  `5XL` VARCHAR(45) NOT NULL ,
  `child_small` VARCHAR(45) NOT NULL ,
  `child_medium` VARCHAR(45) NOT NULL ,
  `child_large` VARCHAR(45) NOT NULL ,
  `youth_small` VARCHAR(45) NOT NULL ,
  `youth_medium` VARCHAR(45) NOT NULL ,
  `youth_large` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`x_small`, `small`, `medium`, `large`, `XL`, `2XL`, `3XL`, `4XL`, `5XL`, `child_small`, `child_medium`, `child_large`, `youth_small`, `youth_medium`, `youth_large`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory database`.`SHIRTS`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory database`.`SHIRTS` (
  `size_id` INT NOT NULL ,
  `style_id` INT NOT NULL ,
  `gender_id` INT NOT NULL ,
  `category_id` INT NOT NULL ,
  `product_id` INT NOT NULL ,
  `shirt_picture` BINARY NOT NULL ,
  `STYLE_button_down` CHAR NOT NULL ,
  `STYLE_polo` VARCHAR(45) NOT NULL ,
  `STYLE_tshirt` VARCHAR(45) NOT NULL ,
  `CATEGORY_bowling_shirts` CHAR NOT NULL ,
  `CATEGORY_dart_Shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_racing_shirts_pitCrew` VARCHAR(45) NOT NULL ,
  `CATEGORY_billiard_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_jazz_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_poker_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_rockabilly_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_camp_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_charlie_sheen_style_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_retro_buttonup_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_polo_bowling_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_polo_sport_shirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_tshirts` VARCHAR(45) NOT NULL ,
  `CATEGORY_category_id` INT NOT NULL ,
  `GENDER_gender_id` INT NOT NULL ,
  `GENDER_womens` VARCHAR(45) NOT NULL ,
  `GENDER_mens` VARCHAR(45) NOT NULL ,
  `GENDER_kids` VARCHAR(45) NOT NULL ,
  `PRODUCT_product_id` INT NOT NULL ,
  `SIZE_x_small` CHAR NOT NULL ,
  `SIZE_small` CHAR NOT NULL ,
  `SIZE_medium` VARCHAR(45) NOT NULL ,
  `SIZE_large` VARCHAR(45) NOT NULL ,
  `SIZE_XL` VARCHAR(45) NOT NULL ,
  `SIZE_2XL` VARCHAR(45) NOT NULL ,
  `SIZE_3XL` VARCHAR(45) NOT NULL ,
  `SIZE_4XL` VARCHAR(45) NOT NULL ,
  `SIZE_5XL` VARCHAR(45) NOT NULL ,
  `SIZE_child_small` VARCHAR(45) NOT NULL ,
  `SIZE_child_medium` VARCHAR(45) NOT NULL ,
  `SIZE_child_large` VARCHAR(45) NOT NULL ,
  `SIZE_youth_small` VARCHAR(45) NOT NULL ,
  `SIZE_youth_medium` VARCHAR(45) NOT NULL ,
  `SIZE_youth_large` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`size_id`, `style_id`, `gender_id`, `category_id`, `product_id`, `shirt_picture`) ,
  INDEX `fk_SHIRTS_STYLE_idx` (`STYLE_button_down` ASC, `STYLE_polo` ASC, `STYLE_tshirt` ASC) ,
  INDEX `fk_SHIRTS_CATEGORY1_idx` (`CATEGORY_bowling_shirts` ASC, `CATEGORY_dart_Shirts` ASC, `CATEGORY_racing_shirts_pitCrew` ASC, `CATEGORY_billiard_shirts` ASC, `CATEGORY_jazz_shirts` ASC, `CATEGORY_poker_shirts` ASC, `CATEGORY_rockabilly_shirts` ASC, `CATEGORY_camp_shirts` ASC, `CATEGORY_charlie_sheen_style_shirts` ASC, `CATEGORY_retro_buttonup_shirts` ASC, `CATEGORY_polo_bowling_shirts` ASC, `CATEGORY_polo_sport_shirts` ASC, `CATEGORY_tshirts` ASC, `CATEGORY_category_id` ASC) ,
  INDEX `fk_SHIRTS_GENDER1_idx` (`GENDER_gender_id` ASC, `GENDER_womens` ASC, `GENDER_mens` ASC, `GENDER_kids` ASC) ,
  INDEX `fk_SHIRTS_PRODUCT1_idx` (`PRODUCT_product_id` ASC) ,
  INDEX `fk_SHIRTS_SIZE1_idx` (`SIZE_x_small` ASC, `SIZE_small` ASC, `SIZE_medium` ASC, `SIZE_large` ASC, `SIZE_XL` ASC, `SIZE_2XL` ASC, `SIZE_3XL` ASC, `SIZE_4XL` ASC, `SIZE_5XL` ASC, `SIZE_child_small` ASC, `SIZE_child_medium` ASC, `SIZE_child_large` ASC, `SIZE_youth_small` ASC, `SIZE_youth_medium` ASC, `SIZE_youth_large` ASC) ,
  UNIQUE INDEX `shirt_picture_UNIQUE` (`shirt_picture` ASC) ,
  CONSTRAINT `fk_SHIRTS_STYLE`
    FOREIGN KEY (`STYLE_button_down` , `STYLE_polo` , `STYLE_tshirt` )
    REFERENCES `inventory database`.`STYLE` (`button_down` , `polo` , `tshirt` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHIRTS_CATEGORY1`
    FOREIGN KEY (`CATEGORY_bowling_shirts` , `CATEGORY_dart_Shirts` , `CATEGORY_racing_shirts_pitCrew` , `CATEGORY_billiard_shirts` , `CATEGORY_jazz_shirts` , `CATEGORY_poker_shirts` , `CATEGORY_rockabilly_shirts` , `CATEGORY_camp_shirts` , `CATEGORY_charlie_sheen_style_shirts` , `CATEGORY_retro_buttonup_shirts` , `CATEGORY_polo_bowling_shirts` , `CATEGORY_polo_sport_shirts` , `CATEGORY_tshirts` , `CATEGORY_category_id` )
    REFERENCES `inventory database`.`CATEGORY` (`bowling_shirts` , `dart_Shirts` , `racing_shirts_pitCrew` , `billiard_shirts` , `jazz_shirts` , `poker_shirts` , `rockabilly_shirts` , `camp_shirts` , `charlie_sheen_style_shirts` , `retro_buttonup_shirts` , `polo_bowling_shirts` , `polo_sport_shirts` , `tshirts` , `category_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHIRTS_GENDER1`
    FOREIGN KEY (`GENDER_gender_id` , `GENDER_womens` , `GENDER_mens` , `GENDER_kids` )
    REFERENCES `inventory database`.`GENDER` (`gender_id` , `womens` , `mens` , `kids` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHIRTS_PRODUCT1`
    FOREIGN KEY (`PRODUCT_product_id` )
    REFERENCES `inventory database`.`PRODUCT` (`product_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHIRTS_SIZE1`
    FOREIGN KEY (`SIZE_x_small` , `SIZE_small` , `SIZE_medium` , `SIZE_large` , `SIZE_XL` , `SIZE_2XL` , `SIZE_3XL` , `SIZE_4XL` , `SIZE_5XL` , `SIZE_child_small` , `SIZE_child_medium` , `SIZE_child_large` , `SIZE_youth_small` , `SIZE_youth_medium` , `SIZE_youth_large` )
    REFERENCES `inventory database`.`SIZE` (`x_small` , `small` , `medium` , `large` , `XL` , `2XL` , `3XL` , `4XL` , `5XL` , `child_small` , `child_medium` , `child_large` , `youth_small` , `youth_medium` , `youth_large` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
