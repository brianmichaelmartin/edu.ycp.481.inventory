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


INSERT INTO SIZE Values(1, 'S');
INSERT into SIZE Values (2, 'M');
INSERT into SIZE values (3, 'L');
INSERT into SIZE values (4, 'XL');
INSERT into SIZE values (5, '2XL');
INSERT into SIZE values (6, '3XL');
INSERT into SIZE values (7, '4XL');

INSERT into GENDER values (1, 'Men');
INSERT into gender values (2, 'Women');
Insert into gender values (3, 'Kid');

INSERT into catagory values (1, 'Retro Button Up Shirts');
Insert into catagory values (2, 'Polo Sports Shirts');
Insert into catagory values (3, 'T-Shirts');
Insert into catagory values (4, 'Polo Bowling Shirts');

Insert into style values (1, 'LASER : Dry-Excel Elite');
Insert into style values (2, 'Big Dom : 50s Bowling Shirt');
Insert into style values (3, 'Player : Bowling Lounge Shirt');
Insert into style values (4, 'Ladies Betty B Button Down Bowling Shirt');
Insert into style values (5, 'Lady Miami : Womens Bowling Camp Shirt');
Insert into style values (6, 'Ladies Classic Easy to Look Great Button Down');
Insert into style values (7, 'Swing kids Retro Shirt');
Insert into style values (8, 'Kids Rock n Roll 50s Shirt');
Insert into style values (9, 'Kids Classic Retro 50s');
