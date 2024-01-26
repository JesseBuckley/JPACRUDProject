-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema HealthCareHub
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `HealthCareHub` ;

-- -----------------------------------------------------
-- Schema HealthCareHub
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `HealthCareHub` ;
USE `HealthCareHub` ;

-- -----------------------------------------------------
-- Table `health_care`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `health_care` ;

CREATE TABLE IF NOT EXISTS `health_care` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `patient_name` VARCHAR(200) NOT NULL,
  `medical_records` VARCHAR(400) NULL,
  `healthcare_providers` VARCHAR(200) NOT NULL,
  `appointments` DATETIME NULL,
  `prescriptions` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS health@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'health'@'localhost' IDENTIFIED BY 'health';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'health'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `health_care`
-- -----------------------------------------------------
START TRANSACTION;
USE `HealthCareHub`;
INSERT INTO `health_care` (`id`, `patient_name`, `medical_records`, `healthcare_providers`, `appointments`, `prescriptions`) VALUES (1, 'Requis', 'needs vitamin c', 'Tom', '2024-02-04', 'Vitamin C');
INSERT INTO `health_care` (`id`, `patient_name`, `medical_records`, `healthcare_providers`, `appointments`, `prescriptions`) VALUES (2, 'Biggins', 'needs vitamin d', 'Tom', '2024-02-04', 'Vitamin D');

COMMIT;

