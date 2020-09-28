-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2019 at 10:56 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_information_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `students_information`
--

CREATE TABLE `students_information` (
  `id` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `department` varchar(50) NOT NULL,
  `year` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `cgpa` varchar(20) NOT NULL,
  `fathers_name` varchar(100) NOT NULL,
  `mothers_name` varchar(100) NOT NULL,
  `date_of_birth` varchar(100) NOT NULL,
  `blood_group` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `mobile_number` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students_information`
--

INSERT INTO `students_information` (`id`, `name`, `department`, `year`, `semester`, `cgpa`, `fathers_name`, `mothers_name`, `date_of_birth`, `blood_group`, `gender`, `mobile_number`, `email`, `address`) VALUES
('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'),
('1', '1', 'CSE', '1st', '1st', '1', '1', '1', '2-February-1st', 'A+', 'Male', '1', '1', '1'),
('17.02.04.064', 'noor a tanjim', 'CSE', '2nd', '1st', '3.6', 'uncle', 'aunty', '2-February-2nd', 'AB+', 'Male', '0125967', 'aunty', 'jatrabari'),
('z', 'z', 'EEE', '2nd', '1st', 'z', 'z', 'z', '5-May-2nd', 'AB+', 'Male', 'z', 'z', 'z');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students_information`
--
ALTER TABLE `students_information`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
