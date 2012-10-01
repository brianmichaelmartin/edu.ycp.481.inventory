SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `inventory_Updated` ;
USE `inventory_Updated` ;

-- -----------------------------------------------------
-- Table `inventory_Updated`.`SHIRTs`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventory_Updated`.`SHIRTs` (
  `product_id` INT NOT NULL AUTO_INCREMENT ,
  `category` VARCHAR(45) NOT NULL ,
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
  PRIMARY KEY (`product_id`, `category`, `style`, `gender`, `size`, `picture`, `NuminInventory`, `disabled`, `inStock`, `barCode`, `dateAdded`, `lastModified`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
