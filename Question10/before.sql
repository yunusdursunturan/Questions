
CREATE TABLE `Employee` (
  `Employee_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `Salary` varchar(255) DEFAULT NULL,
  `Surname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Employee_Id`),
  UNIQUE KEY `Employee_Id` (`Employee_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


CREATE TABLE `Department` (
  `Department_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Description` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Employee_Id` int(11) NOT NULL,
  PRIMARY KEY (`Department_Id`),
  UNIQUE KEY `Department_Id` (`Department_Id`),
  KEY `FKA9601F725309D6BB` (`Employee_Id`),
  CONSTRAINT `FKA9601F725309D6BB` FOREIGN KEY (`Employee_Id`) REFERENCES `Employee` (`Employee_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


CREATE TABLE `Meetings` (
  `Meetings_Id` int(11) NOT NULL AUTO_INCREMENT,
  `Description` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Department_Id` int(11) NOT NULL,
  PRIMARY KEY (`Meetings_Id`),
  UNIQUE KEY `Meetings_Id` (`Meetings_Id`),
  KEY `FKD07D61B8925825FB` (`Department_Id`),
  CONSTRAINT `FKD07D61B8925825FB` FOREIGN KEY (`Department_Id`) REFERENCES `Department` (`Department_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
