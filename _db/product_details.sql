-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2018 at 09:12 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `b25`
--

-- --------------------------------------------------------

--
-- Table structure for table `product_details`
--

CREATE TABLE `product_details` (
  `pID` int(4) NOT NULL,
  `pName` varchar(40) NOT NULL,
  `pQuantity` int(3) NOT NULL,
  `pPrice` double(7,2) NOT NULL,
  `pCategory` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_details`
--

INSERT INTO `product_details` (`pID`, `pName`, `pQuantity`, `pPrice`, `pCategory`) VALUES
(1001, 'Olempic Brerad', 20, 50.00, 'beverage'),
(1002, 'Mango Jam', 20, 70.00, 'beverage'),
(1003, 'Orange Jam', 20, 80.00, 'beverage'),
(1004, 'Pran Chocolate Juice', 20, 20.00, 'beverage'),
(1005, 'Pran Froto Juice', 20, 15.00, 'beverage'),
(1006, 'frutika Mango Juice ', 20, 15.00, 'beverage'),
(1007, 'Nescafe Coffee 500g', 20, 10.00, 'beverage'),
(1008, 'Arong Milk 1kg', 20, 55.00, 'beverage'),
(1009, 'Ispahani Mirjapur Tea Pack 50 piece', 10, 110.00, 'beverage'),
(1010, '7up 1L', 15, 65.00, 'beverage'),
(2001, 'Fullcopi', 40, 40.00, 'vegetable'),
(2002, 'Alu', 40, 18.00, 'vegetable'),
(2003, 'Sim', 10, 70.00, 'vegetable'),
(2004, 'Begun', 10, 40.00, 'vegetable'),
(2005, 'Borboti', 6, 80.00, 'vegetable'),
(2006, 'Motor', 5, 90.00, 'vegetable'),
(2007, 'Dherosh', 10, 47.00, 'vegetable'),
(2008, 'Potol', 13, 56.00, 'vegetable'),
(2009, 'Korolla', 20, 38.00, 'vegetable'),
(2010, 'Tomato', 20, 78.00, 'vegetable'),
(3001, 'Detol Soup', 20, 50.00, 'groceries'),
(3002, 'Maggi Noodles 8 Piece', 10, 65.00, 'groceries'),
(3003, 'Ahmed Baking Powder', 20, 35.00, 'groceries'),
(3004, 'Pran Sauce', 12, 95.00, 'groceries'),
(3005, 'Tir Moyda 1 kg', 25, 60.00, 'groceries'),
(3006, 'Tir Ata', 15, 70.00, 'groceries'),
(3007, 'Moshuri Dal', 15, 57.00, 'groceries'),
(3008, 'Ada', 10, 120.00, 'groceries'),
(3009, 'Rosun', 10, 150.00, 'groceries'),
(3010, 'Peyaj', 15, 40.00, 'groceries'),
(4001, 'katol fish', 10, 400.00, 'fish'),
(4002, 'Bowal fish', 4, 300.00, 'fish'),
(4003, 'Rui fish', 7, 200.00, 'fish'),
(4004, 'Ilish fish', 7, 900.00, 'fish'),
(4005, 'Tengra fish', 9, 130.00, 'fish'),
(4006, 'Rup chada fish', 6, 980.00, 'fish'),
(4007, 'Ayil fsh', 8, 380.00, 'fish'),
(4008, 'koral fish', 4, 490.00, 'fish'),
(4009, 'Chingri fish', 20, 400.00, 'fish'),
(4010, 'Telapia fish', 8, 120.00, 'fish'),
(5001, 'Shopon Soyabin Oil', 87, 120.00, 'oil'),
(5002, 'Rupchada Soyabin Oil', 35, 119.00, 'oil'),
(5003, 'Bashundhara Soyabin Oil', 34, 115.95, 'oil'),
(5004, 'Radhuni Khati Soyabin Oil', 1, 125.65, 'oil'),
(5005, 'Jester Olive Oil', 19, 1500.00, 'oil'),
(5006, 'Parasuite Coconut Oil', 231, 70.13, 'oil'),
(5007, 'Jaccabi Custurd Oil', 45, 800.00, 'oil'),
(5008, 'Sunflower Olive Oil', 122, 1600.82, 'oil'),
(5009, 'Rohomot Kalijira Oil', 233, 55.00, 'oil'),
(5010, 'Amond Custurd Oil', 22, 600.00, 'oil'),
(6001, 'Maxpro 5 mg', 122, 70.00, 'medicine'),
(6002, 'Napa 0.5 mg', 72, 20.00, 'medicine'),
(6003, 'Napa Extra', 22, 25.00, 'medicine'),
(6004, 'Napa Extend', 21, 30.00, 'medicine'),
(6005, 'Ace', 64, 15.00, 'medicine'),
(6006, 'Fexil 0.5 mg', 56, 65.00, 'medicine'),
(6007, 'Seclo 20 mg', 20, 50.50, 'medicine'),
(6008, 'Revetrol 100 mg', 50, 105.00, 'medicine'),
(6009, 'Alatrol 5 mg', 75, 12.00, 'medicine'),
(6010, 'Tip tin 10 mg', 38, 10.00, 'medicine');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product_details`
--
ALTER TABLE `product_details`
  ADD PRIMARY KEY (`pID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
