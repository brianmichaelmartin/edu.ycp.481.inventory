SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `inventory_Updated` ;
USE `inventory_Updated` ;

-- -----------------------------------------------------
-- Table `inventory_Updated`.`CATEGORY`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory_Updated`.`CATEGORY` (
  `category_id` INT NOT NULL AUTO_INCREMENT ,
  `category_type` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`category_id`, `category_type`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory_Updated`.`STYLE`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory_Updated`.`STYLE` (
  `style_id` INT NOT NULL ,
  `style_type` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`style_id`, `style_type`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory_Updated`.`SIZe`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory_Updated`.`SIZe` (
  `size_id` INT NOT NULL ,
  `size_type` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`size_id`, `size_type`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `inventory_Updated`.`GENDER`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory_Updated`.`GENDER` (
  `gender_id` INT NOT NULL ,
  `gender_type` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`gender_id`, `gender_type`) )
ENGINE = InnoDB;

INSERT INTO SIZE Values(1, 'S');
INSERT into SIZE Values (2, 'M');
INSERT into SIZE values (3, 'L');
INSERT into SIze values (4, 'XL');
INSERT into SIze values (5, '2XL');
INSERT into SIze values (6, '3XL');
INSERT into SIze values (7, '4XL');

INSERT into GENDER values (1, 'Men');
INSERT into gender values (2, 'Women');
Insert into gender values (3, 'Kid');

INSERT into category values (1, 'Retro Button Up Shirts');
Insert into category values (2, 'Polo Sports Shirts');
Insert into category values (3, 'T-Shirts');
Insert into category values (4, 'Polo Bowling Shirts');

Insert into style values (1, 'LASER : Dry-Excel Elite');
Insert into style values (2, 'Big Dom : 50s Bowling Shirt');
Insert into style values (3, 'Player : Bowling Lounge Shirt');
Insert into style values (4, 'Ladies Betty B Button Down Bowling Shirt');
Insert into style values (5, 'Lady Miami : Womens Bowling Camp Shirt');
Insert into style values (6, 'Ladies Classic Easy to Look Great Button Down');
Insert into style values (7, 'Swing kids Retro Shirt');
Insert into style values (8, 'Kids Rock n Roll 50s Shirt');
Insert into style values (9, 'Kids Classic Retro 50s');

INSERT INTO `inventory_updated`.`shirts` (`product_id`, `category_id`, `style_id`, `gender_id`, `size_id`, `picture`, `NuminInventory`, `disabled`, `inStock`, `barCode`, `dateAdded`, `lastModified`, `CATEGORY_category_id`, `CATEGORY_category_type`, `STYLE_style_id`, `STYLE_style_type`, `SIZe_size_id`, `SIZe_size_type`, `GENDER_gender_id`, `GENDER_gender_type`)
VALUES ('1', '1', '1', '1', '1', 'NULL', '5', '0', '1', '564', '2008-11-11', '2008-11-11 00:00:00', '1', '', '1', '', '1', '', '1', '');



-- -----------------------------------------------------
-- Table `inventory_Updated`.`SHIRTs`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory_Updated`.`SHIRTs` (
  `product_id` INT NOT NULL AUTO_INCREMENT ,
  `category` INT NOT NULL ,
  `style` INT NOT NULL ,
  `gender` INT NOT NULL ,
  `size` INT NOT NULL ,
  `picture` VARCHAR(45) NOT NULL ,
  `NuminInventory` INT NOT NULL ,
  `disabled` TINYINT(1) NOT NULL ,
  `inStock` TINYINT(1) NOT NULL ,
  `barCode` INT NOT NULL ,
  `dateAdded` DATE NOT NULL ,
  `lastModified` DATETIME NOT NULL ,
  `CATEGORY_category_id` INT NOT NULL ,
  `CATEGORY_category_type` VARCHAR(45) NOT NULL ,
  `STYLE_style_id` INT NOT NULL ,
  `STYLE_style_type` VARCHAR(45) NOT NULL ,
  `SIZe_size_id` INT NOT NULL ,
  `SIZe_size_type` VARCHAR(45) NOT NULL ,
  `GENDER_gender_id` INT NOT NULL ,
  `GENDER_gender_type` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`product_id`, `category`, `style`, `gender`, `size`, `picture`, `NuminInventory`, `disabled`, `inStock`, `barCode`, `dateAdded`, `lastModified`) ,
  INDEX `fk_SHIRTs_CATEGORY_idx` (`CATEGORY_category_id` ASC, `CATEGORY_category_type` ASC) ,
  INDEX `fk_SHIRTs_STYLE1_idx` (`STYLE_style_id` ASC, `STYLE_style_type` ASC) ,
  INDEX `fk_SHIRTs_SIZe1_idx` (`SIZe_size_id` ASC, `SIZe_size_type` ASC) ,
  INDEX `fk_SHIRTs_GENDER1_idx` (`GENDER_gender_id` ASC, `GENDER_gender_type` ASC) ,
  CONSTRAINT `fk_SHIRTs_CATEGORY`
    FOREIGN KEY (`CATEGORY_category_id` , `CATEGORY_category_type` )
    REFERENCES `inventory_Updated`.`CATEGORY` (`category_id` , `category_type` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHIRTs_STYLE1`
    FOREIGN KEY (`STYLE_style_id` , `STYLE_style_type` )
    REFERENCES `inventory_Updated`.`STYLE` (`style_id` , `style_type` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHIRTs_SIZe1`
    FOREIGN KEY (`SIZe_size_id` , `SIZe_size_type` )
    REFERENCES `inventory_Updated`.`SIZe` (`size_id` , `size_type` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_SHIRTs_GENDER1`
    FOREIGN KEY (`GENDER_gender_id` , `GENDER_gender_type` )
    REFERENCES `inventory_Updated`.`GENDER` (`gender_id` , `gender_type` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
