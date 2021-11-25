-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2021 at 05:05 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `customer`
--

-- --------------------------------------------------------

--
-- Table structure for table `chitiethoadon`
--

CREATE TABLE IF NOT EXISTS `chitiethoadon` (
`id` int(11) NOT NULL,
  `hdso` varchar(255) NOT NULL,
  `mahh` varchar(255) DEFAULT NULL,
  `soluong` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `hanghoa`
--

CREATE TABLE IF NOT EXISTS `hanghoa` (
`id` int(11) NOT NULL,
  `mahh` varchar(255) NOT NULL,
  `tenhh` varchar(255) DEFAULT NULL,
  `quicach` varchar(255) DEFAULT NULL,
  `dvtinh` varchar(255) DEFAULT NULL,
  `dongia` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2147483647 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hanghoa`
--

INSERT INTO `hanghoa` (`id`, `mahh`, `tenhh`, `quicach`, `dvtinh`, `dongia`) VALUES
(1, '001', 'A', 'abcd', 'VND', '1000'),
(2, '002', 'B', 'abcd', 'VND', '13000'),
(3, '003', 'C', 'abcd', 'VND', '2000'),
(4, '004', 'D', 'abcd', 'VND', '4000'),
(2147483647, 'Banh01', 'Banh deo', 'banh deo', 'gam', '23000');

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE IF NOT EXISTS `hoadon` (
`id` int(11) NOT NULL,
  `hdso` varchar(255) NOT NULL,
  `ngay` varchar(255) DEFAULT NULL,
  `makh` varchar(255) DEFAULT NULL,
  `trigia` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2147483647 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`id`, `hdso`, `ngay`, `makh`, `trigia`, `status`) VALUES
(1, '1', '1', '1', '1', NULL),
(2, '1212', '2021-10-28', '001', '1212', 1),
(3, 'abcdas', '2021-10-28', '004', '17000.0', 1),
(112233, 'MS01', '02/02/2012', '280620', '23600', 0),
(112234, '', '2021-10-29', '001', '2000.0', 0),
(2147483647, 'Keo002', '09/08/2021', 'KH006', '12000', 0);

-- --------------------------------------------------------

--
-- Table structure for table `khachhang`
--

CREATE TABLE IF NOT EXISTS `khachhang` (
`id` int(11) NOT NULL,
  `makh` varchar(255) NOT NULL,
  `tenkh` varchar(255) DEFAULT NULL,
  `dth` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2147483647 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `khachhang`
--

INSERT INTO `khachhang` (`id`, `makh`, `tenkh`, `dth`) VALUES
(0, '001', 'Thao', '0121212'),
(2, '003', 'Linh', '03444222222'),
(3, 'KH10', 'Trang', '098888888'),
(4, 'Kh11', 'Phuong', '098822222'),
(5, '280620', 'Thao', '0362195760'),
(2147483647, 'SV001', '?? Th?o', '0362195888');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hanghoa`
--
ALTER TABLE `hanghoa`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `khachhang`
--
ALTER TABLE `khachhang`
 ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chitiethoadon`
--
ALTER TABLE `chitiethoadon`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `hanghoa`
--
ALTER TABLE `hanghoa`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2147483647;
--
-- AUTO_INCREMENT for table `hoadon`
--
ALTER TABLE `hoadon`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2147483647;
--
-- AUTO_INCREMENT for table `khachhang`
--
ALTER TABLE `khachhang`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2147483647;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
