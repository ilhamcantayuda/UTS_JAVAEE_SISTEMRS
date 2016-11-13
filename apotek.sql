-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 12, 2016 at 04:33 PM
-- Server version: 10.1.16-MariaDB
-- PHP Version: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `klinik`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `kd_dokter` varchar(4) NOT NULL,
  `nm_dokter` varchar(40) NOT NULL,
  `jeniskelamin` varchar(12) NOT NULL,
  `specialist` varchar(20) NOT NULL,
  `alamat` varchar(30) NOT NULL,
  `tlp` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`kd_dokter`, `nm_dokter`, `jeniskelamin`, `specialist`, `alamat`, `tlp`, `password`) VALUES
('d1', 'Dr Ina', 'aa', 'sa', 'aa', '021', 'salammerah');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `kd_obat` varchar(10) NOT NULL,
  `nm_obat` varchar(25) DEFAULT NULL,
  `jenisobat` enum('kapsul','cair','tablet') NOT NULL,
  `tglkadaluarsa` varchar(14) NOT NULL,
  `harga` varchar(14) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`kd_obat`, `nm_obat`, `jenisobat`, `tglkadaluarsa`, `harga`) VALUES
('1', 'a', 'kapsul', '2016-11-11', '1111'),
('b001', 'bodrex', 'kapsul', '2020-08-30', '±'),
('b002', 'sdsdu', 'kapsul', '2008-09-12', '99'),
('B004', 'Antangein', 'cair', '2015-12-30', '2000');

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `kd_pasien` varchar(4) NOT NULL,
  `nm_pasien` varchar(20) NOT NULL,
  `jeniskelamin` varchar(12) NOT NULL,
  `up` varchar(22) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tlp` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`kd_pasien`, `nm_pasien`, `jeniskelamin`, `up`, `alamat`, `tlp`) VALUES
('P002', 'Dimas', 'Laki-Laki', '16', 'Tangerang  ', '0812009898'),
('P003', 'Sobri', 'LakiLaki', '30', '  Pesanggrahan Utara,Jakarta Selatan', '08120987678'),
('P004', 'Doni', 'LakiLaki', '34', '  Cipulir', '0898965547');

-- --------------------------------------------------------

--
-- Table structure for table `resep`
--

CREATE TABLE `resep` (
  `index` int(11) NOT NULL,
  `kd_resep` varchar(4) NOT NULL,
  `kd_dokter` varchar(4) NOT NULL,
  `kd_pasien` varchar(4) NOT NULL,
  `jp` varchar(22) NOT NULL,
  `tglresep` date NOT NULL,
  `kd_obat` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`kd_dokter`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kd_obat`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`kd_pasien`);

--
-- Indexes for table `resep`
--
ALTER TABLE `resep`
  ADD PRIMARY KEY (`index`),
  ADD KEY `kd_obat` (`kd_obat`),
  ADD KEY `kd_obat_2` (`kd_obat`),
  ADD KEY `kd_dokter` (`kd_dokter`),
  ADD KEY `kd_pasien` (`kd_pasien`),
  ADD KEY `kd_obat_3` (`kd_obat`),
  ADD KEY `kd_dokter_2` (`kd_dokter`),
  ADD KEY `kd_pasien_2` (`kd_pasien`),
  ADD KEY `kd_obat_4` (`kd_obat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `resep`
--
ALTER TABLE `resep`
  MODIFY `index` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `resep`
--
ALTER TABLE `resep`
  ADD CONSTRAINT `resep_ibfk_1` FOREIGN KEY (`kd_obat`) REFERENCES `obat` (`kd_obat`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `resep_ibfk_2` FOREIGN KEY (`kd_dokter`) REFERENCES `dokter` (`kd_dokter`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `resep_ibfk_3` FOREIGN KEY (`kd_pasien`) REFERENCES `pasien` (`kd_pasien`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
