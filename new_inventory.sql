SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `Inventory_database` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `Inventory_database` ;

-- -----------------------------------------------------
-- Table `Inventory_database`.`Inventory`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Inventory_database`.`Inventory` (
  `Product_ID` INT NOT NULL ,
  `Catagory_ID` MEDIUMINT NULL ,
  `Style_ID` MEDIUMINT NULL ,
  `Gender_ID` SMALLINT NULL ,
  `Size_ID` SMALLINT NULL ,
  `Num_in_inventory` INT NULL ,
  `Disabled` TINYINT(1) NULL ,
  `In_stock` TINYINT(1) NULL ,
  `Barcode` INT NULL ,
  `Date_added` DATE NULL ,
  `Last_modified` DATE NULL ,
  `Picture` VARCHAR(45) NULL ,
  PRIMARY KEY (`Product_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Inventory_database`.`Catagory`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Inventory_database`.`Catagory` (
  `Catagory_ID` INT NOT NULL ,
  `Catagory_name` VARCHAR(45) NULL ,
  PRIMARY KEY (`Catagory_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Inventory_database`.`Style`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Inventory_database`.`Style` (
  `Style_ID` INT NOT NULL ,
  `Style_name` VARCHAR(45) NULL ,
  PRIMARY KEY (`Style_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Inventory_database`.`Gender`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Inventory_database`.`Gender` (
  `Gender_ID` INT NOT NULL ,
  `Gender_Name` VARCHAR(45) NULL ,
  PRIMARY KEY (`Gender_ID`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Inventory_database`.`Size`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `Inventory_database`.`Size` (
  `Size_ID` INT NOT NULL ,
  `Size_name` VARCHAR(45) NULL ,
  PRIMARY KEY (`Size_ID`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
