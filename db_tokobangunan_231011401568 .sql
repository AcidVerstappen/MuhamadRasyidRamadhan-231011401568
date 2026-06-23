-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2026 at 12:52 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_tokobangunan_231011401568`
--

-- --------------------------------------------------------

--
-- Table structure for table `material`
--

CREATE TABLE `material` (
  `id_material` int(11) NOT NULL,
  `kode_material` varchar(20) DEFAULT NULL,
  `nama_material` varchar(100) DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `satuan` varchar(20) DEFAULT NULL,
  `stok` int(11) DEFAULT NULL,
  `harga` double DEFAULT NULL,
  `supplier` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `material`
--

INSERT INTO `material` (`id_material`, `kode_material`, `nama_material`, `kategori`, `satuan`, `stok`, `harga`, `supplier`) VALUES
(2, 'M002', 'Batu Bata Merah', 'Bata', 'Pcs', 5000, 1000, 'UD Bangunan Jaya'),
(3, 'M003', 'Cat Dulux Putih', 'Cat', 'Kaleng', 50, 85000, 'Dulux'),
(4, 'M004', 'Pasir Bangunan', 'Pasir', 'Kubik', 30, 250000, 'CV Pasir Makmur'),
(6, 'M006', 'Keramik Putih', 'Keramik', 'Dus', 80, 65000, 'Roman'),
(7, 'M007', 'Paku 5cm', 'Peralatan', 'Kg', 150, 20000, 'Toko Besi Jaya'),
(8, 'M008', 'Triplek 12mm', 'Kayu', 'Lembar', 70, 95000, 'Kayu Nusantara'),
(9, 'M009', 'Kabel Listrik', 'Elektrikal', 'Roll', 40, 120000, 'Eterna'),
(13, 'M0010', 'Paku Payung', 'Peralatan', 'Kg', 350, 7000, 'Curug Berkah');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'admin', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `material`
--
ALTER TABLE `material`
  ADD PRIMARY KEY (`id_material`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `material`
--
ALTER TABLE `material`
  MODIFY `id_material` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
