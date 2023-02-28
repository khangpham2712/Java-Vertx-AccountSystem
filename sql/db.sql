USE `account`;

CREATE TABLE `accounts` (
	id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    password VARCHAR(255),
    dob DATE
);
