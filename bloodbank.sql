-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 08, 2018 at 05:09 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bloodbank`
--

-- --------------------------------------------------------

--
-- Table structure for table `bloodbank`
--

CREATE TABLE `bloodbank` (
  `BloodBankId` int(10) NOT NULL,
  `BranchName` varchar(20) DEFAULT NULL,
  `BranchMobileNo` int(15) DEFAULT NULL,
  `ApositiveBags` int(10) DEFAULT NULL,
  `BpostiveBags` int(10) DEFAULT NULL,
  `AnegativeBags` int(10) DEFAULT NULL,
  `BnegativeBags` int(10) DEFAULT NULL,
  `TotalBloodBags` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bloodbank`
--

INSERT INTO `bloodbank` (`BloodBankId`, `BranchName`, `BranchMobileNo`, `ApositiveBags`, `BpostiveBags`, `AnegativeBags`, `BnegativeBags`, `TotalBloodBags`) VALUES
(1, 'Dhaka', 178888888, 5, 5, 5, 5, 20),
(2, 'khulna', 18777777, 2, 2, 2, 2, 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bloodbank`
--
ALTER TABLE `bloodbank`
  ADD PRIMARY KEY (`BloodBankId`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
