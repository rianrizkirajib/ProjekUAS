-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2023 at 11:16 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vilasitugunung`
--

-- --------------------------------------------------------

--
-- Table structure for table `gajipegawai`
--

CREATE TABLE `gajipegawai` (
  `id_pegawai` char(4) DEFAULT NULL,
  `jumlah_gaji` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gajipegawai`
--

INSERT INTO `gajipegawai` (`id_pegawai`, `jumlah_gaji`) VALUES
('0001', 1500000),
('0002', 9500000),
('0003', 8550000),
('0004', 850000),
('0005', 750000);

-- --------------------------------------------------------

--
-- Table structure for table `kamar`
--

CREATE TABLE `kamar` (
  `id_kamar` char(10) DEFAULT NULL,
  `type_kamar` char(10) DEFAULT NULL,
  `hargakamar` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `kamar`
--

INSERT INTO `kamar` (`id_kamar`, `type_kamar`, `hargakamar`) VALUES
('SP01', 'Standar', 750000),
('SP02', 'Executive', 850000),
('SP03', 'Standar', 950000),
('SP04', 'Executive', 560000),
('SP05', 'Executice', 550000);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` char(4) NOT NULL,
  `nama_pegawai` char(25) DEFAULT NULL,
  `jenis_kelamin` char(10) DEFAULT NULL,
  `alamat` varchar(25) DEFAULT NULL,
  `pw` char(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `jenis_kelamin`, `alamat`, `pw`) VALUES
('0102', 'Meylinda', 'Wanita', 'Bandung', 'mey123'),
('0103', 'Rian Rizki Rajib', 'Pria', 'Selajambe', 'raj123');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` char(4) NOT NULL,
  `nama_pelanggan` char(25) DEFAULT NULL,
  `alamat` char(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`) VALUES
('A006', 'Sadam', 'Sande');

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_kamar` char(4) DEFAULT NULL,
  `id_pelanggan` char(4) DEFAULT NULL,
  `harga_kamar` char(10) DEFAULT NULL,
  `jumlah_pembayaran` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_kamar`, `id_pelanggan`, `harga_kamar`, `jumlah_pembayaran`) VALUES
('SP01', 'A001', '750000', 800000),
('SP02', 'A002', '650000', 7600000),
('SP03', 'A003', '850000', 7300000),
('SP04', 'A004', '350000', 700000),
('SP05', 'A005', '450000', 7050000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
