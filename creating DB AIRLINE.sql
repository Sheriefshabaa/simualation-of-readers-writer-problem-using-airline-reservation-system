create database AirLine;

CREATE TABLE `FLIGHT` (
  `Flight_ID` INT,
  `AirlLine_ID` int,
  `AirLine_Name` VARCHAR(50),
  `From_Location` VARCHAR(50),
  `To_Location` VARCHAR(50),
  `Arrival_Time` VARCHAR(50),
  `Duration` VARCHAR(50),
  `Total_seats` int,
  primary key (`Flight_ID`)
);

CREATE TABLE `Flight_Details` (
  `Flight_ID` INT,
  `Price` int,
  `Available_Seats` int,
  FOREIGN KEY (`Flight_ID`) REFERENCES `FLIGHT`(`Flight_ID`)
);

 

CREATE TABLE `Passenger_Profile` (
  `Profile_ID` INT,
  `First_Name` VARCHAR(50),
  `Last_Name` VARCHAR(50),
  `Address` VARCHAR(50),
  `Tel_Num` int,
  `Email` VARCHAR(50),
  primary key (`Profile_ID`)
);

CREATE TABLE `TICKET_INFO` (
  `Ticket_ID` INT,
  `Profile_ID` int,
  `Flight_ID` int,
  primary key (`Ticket_ID`),
  FOREIGN KEY (`Flight_ID`) REFERENCES `FLIGHT`(`Flight_ID`),
  FOREIGN KEY (`Profile_ID`) REFERENCES `Passenger_Profile`(`Profile_ID`)
);

CREATE TABLE `Flight_Status` (
  `Status_ID` INT,
  `Status` VARCHAR(50),
  `Flight_ID` int,
  `Ticket_ID` INT,
  primary key (`Status_ID`),
  FOREIGN KEY (`Flight_ID`) REFERENCES `FLIGHT`(`Flight_ID`),
  FOREIGN KEY (`Ticket_ID`) REFERENCES `TICKET_INFO`(`Ticket_ID`)
);

