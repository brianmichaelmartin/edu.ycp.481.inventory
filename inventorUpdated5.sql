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


-- -----------------------------------------------------
-- Table `inventory_Updated`.`SHIRTs`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory_Updated`.`SHIRTs` (
  `product_id` INT NOT NULL AUTO_INCREMENT ,
  `category` INT NOT NULL ,
  `style` VARCHAR(45) NOT NULL ,
  `gender` VARCHAR(45) NOT NULL ,
  `size` VARCHAR(45) NOT NULL ,
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
