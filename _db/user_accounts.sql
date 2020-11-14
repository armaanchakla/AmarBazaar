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
-- Table structure for table `user_accounts`
--

CREATE TABLE `user_accounts` (
  `userID` varchar(4) NOT NULL,
  `userName` varchar(30) NOT NULL,
  `name` varchar(60) NOT NULL,
  `password` varchar(30) NOT NULL,
  `balance` double(10,2) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `phone` int(11) NOT NULL,
  `address` text NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_accounts`
--

INSERT INTO `user_accounts` (`userID`, `userName`, `name`, `password`, `balance`, `gender`, `phone`, `address`, `status`) VALUES
('1101', 'MohaimenNoor', 'Mohaimen Bin Noor', 'mohaimen', 100000.00, 'Male', 1234567891, 'Road : 06,\r\nBuilding : 10,\r\nBashundhara R/A, Dhaka.', 'Admin'),
('1102', 'JamiJoy', 'Abdullah Al Jmai Joy', 'jamijoy', 50000.00, 'Male', 1779611966, 'Road : 02,\r\nBuilding : 248,\r\nBashundhara R/A, Dhaka.', 'Admin'),
('1103', 'EstiakAhmed', 'Md Estiak Ahmed', 'estiak', 50000.00, 'Male', 1766461990, 'Shamoli Road no: 02,\r\nShyamoli, Dhaka.', 'Admin'),
('1104', 'SamiraSobhan', 'Samira Sobhan', 'samira', 50000.00, 'Female', 1742237347, 'Stuff Quarter,\r\nBuet Campus, Shahabag,\r\nDhaka.', 'Admin'),
('1105', 'ArmaanChaklader', 'Armaan Hossain Sanjeed Chaklader', 'armaan', 50000.00, 'Male', 1785973940, 'Taltola, Agargaon,\r\nShyamoli, Dhaka.', 'Admin'),
('2212', 'SajidRafi', 'Al Sajid Rafi', 'rafi', 10000.00, 'Others', 1521435677, 'Road : 02,\r\nBuilding : 246,\r\nBashundhara R/A, Dhaka.', 'Seller'),
('2243', 'FoysalNitu', 'Foysal Ahmed Nitu', 'nitu', 10000.00, 'Others', 1855570816, 'Mohakhali DOHS,\r\nMohakhali, Dhaka.\r\n', 'Seller'),
('3343', 'MajnuMia', 'Mister Majnu Mia', 'majnu', 1500.00, 'Male', 1523111767, 'Kuril Chaurasta,\r\nDhaka, Bangladesh.', 'Customer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_accounts`
--
ALTER TABLE `user_accounts`
  ADD PRIMARY KEY (`userID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
