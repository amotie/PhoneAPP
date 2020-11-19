CREATE TABLE `Phone` (
	`Id` INT NOT NULL AUTO_INCREMENT,
	`Valid` BOOLEAN NOT NULL,
	`Localformat` INT NOT NULL,
	`Intlformat` INT NOT NULL,
	`countrycode` varchar NOT NULL,
	`Countryname` varchar NOT NULL,
	`location` varchar NOT NULL,
	`carrier` varchar NOT NULL,
	`linetype` varchar NOT NULL,
	PRIMARY KEY (`Id`)
);
