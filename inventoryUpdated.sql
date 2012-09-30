SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `inventoryUpdated` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `inventoryUpdated` ;

-- -----------------------------------------------------
-- Table `inventoryUpdated`.`SHIRTS`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `inventoryUpdated`.`SHIRTS` (
  `product_id` INT NOT NULL ,
  `category` VARCHAR(45) NOT NULL ,
  `style` VARCHAR(45) NOT NULL ,
  `gender` VARCHAR(45) NOT NULL ,
  `size` VARCHAR(45) NOT NULL ,
  `picture` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`product_id`, `picture`, `size`, `gender`, `style`, `category`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
