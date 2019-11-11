-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2018 at 04:18 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo2`
--

-- --------------------------------------------------------

--
-- Table structure for table `idbahan`
--

CREATE TABLE `idbahan` (
  `id_bahan` int(10) NOT NULL,
  `nama_bahan` longtext NOT NULL,
  `warna_bahan` varchar(1000) NOT NULL,
  `stok` varchar(20) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `idbahan`
--

INSERT INTO `idbahan` (`id_bahan`, `nama_bahan`, `warna_bahan`, `stok`, `harga`) VALUES
(1, 'Balotelly', 'Abu - Abu', '10m', 110000),
(2, 'Wolfis', 'Pink', '8m', 100000),
(3, 'Katun Jepang', 'Hijau', '8m', 120000),
(4, 'Katun Ima', 'Ungu', '10m', 130000),
(5, 'Sifon', 'Merah', '6m', 90000),
(6, 'Rasfur', 'Orange', '10m', 150000),
(7, 'Flanel', 'Merah', '6m', 110000);

-- --------------------------------------------------------

--
-- Table structure for table `idcustomer`
--

CREATE TABLE `idcustomer` (
  `id_customer` int(10) NOT NULL,
  `nama` varchar(25) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_handphone` bigint(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `idcustomer`
--

INSERT INTO `idcustomer` (`id_customer`, `nama`, `alamat`, `no_handphone`) VALUES
(1, 'Rifqy', 'Jl. Nanas Kediri', 87752410101),
(2, 'Ichang', 'Jl.Mangga Lumajang', 85258660444),
(3, 'Yoga', 'Jl. Baru Lumajang', 89234543654),
(4, 'Aliya', 'Jl. Cokro Lumajang', 85258765456),
(5, 'Edo', 'Jl. Suwandak Lumajang', 89765456543),
(6, 'Wiwit', 'Panjaitan', 89765456321),
(7, 'Wico', 'Wonorejo', 89765432234),
(8, 'Adin', 'Galingan', 89765456654),
(9, 'Danes', 'Lumajang', 809765432123),
(10, 'ayis', 'leces', 234);

-- --------------------------------------------------------

--
-- Table structure for table `idkaryawan`
--

CREATE TABLE `idkaryawan` (
  `id_karyawan` int(15) NOT NULL,
  `nama_karyawan` varchar(30) NOT NULL,
  `jabatan_karyawan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `idkaryawan`
--

INSERT INTO `idkaryawan` (`id_karyawan`, `nama_karyawan`, `jabatan_karyawan`) VALUES
(4, 'Fauzia', 'pemilik'),
(5, 'Fitri', 'Kasir'),
(6, 'Firi', 'Penjahit');

-- --------------------------------------------------------

--
-- Table structure for table `iduser`
--

CREATE TABLE `iduser` (
  `id_user` int(15) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `id_karyawan` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `iduser`
--

INSERT INTO `iduser` (`id_user`, `username`, `password`, `id_karyawan`) VALUES
(4, 'fauzia', '1', 4),
(5, 'kasir', '1', 5),
(6, 'penjahit', '1', 6);

-- --------------------------------------------------------

--
-- Table structure for table `id_pesanann`
--

CREATE TABLE `id_pesanann` (
  `id_pesanan` int(11) NOT NULL,
  `id_customer` int(11) NOT NULL,
  `jenis_pesanan` varchar(20) NOT NULL,
  `model_pesanan` varchar(20) NOT NULL,
  `id_bahan` int(11) NOT NULL,
  `ukuran` enum('S','M','L','XL','XXL') NOT NULL,
  `banyak_pesanan` int(11) NOT NULL,
  `tanggal_pesanan` date NOT NULL,
  `selesai_pesanan` date NOT NULL,
  `harga_per_barang` int(11) NOT NULL,
  `total_harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `id_pesanann`
--

INSERT INTO `id_pesanann` (`id_pesanan`, `id_customer`, `jenis_pesanan`, `model_pesanan`, `id_bahan`, `ukuran`, `banyak_pesanan`, `tanggal_pesanan`, `selesai_pesanan`, `harga_per_barang`, `total_harga`) VALUES
(1, 1, 'Kemeja', 'Flanel Pendek', 7, 'L', 1, '2017-06-05', '2017-06-08', 110000, 110000),
(2, 2, 'Kaus', 'V-NECK Pendek', 5, 'L', 1, '2017-06-06', '2017-06-09', 90000, 90000),
(3, 3, 'Celana', 'Basic Panjang', 3, 'L', 1, '2017-06-10', '2017-06-13', 120000, 120000),
(4, 4, 'Rok', 'Afsari Panjang', 2, 'M', 1, '2017-06-11', '2017-06-14', 100000, 100000),
(5, 2, 'Baju', 'V-NECK Pendek', 5, 'L', 1, '2017-06-14', '2017-06-14', 90000, 90000),
(6, 1, 'Kemeja', 'Flanel Pendek', 3, 'S', 2, '2017-06-14', '2017-06-17', 120000, 240000),
(7, 7, 'Baju', 'Hem', 7, 'S', 2, '2017-10-12', '2017-10-15', 110000, 220000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `idbahan`
--
ALTER TABLE `idbahan`
  ADD PRIMARY KEY (`id_bahan`);

--
-- Indexes for table `idcustomer`
--
ALTER TABLE `idcustomer`
  ADD PRIMARY KEY (`id_customer`);

--
-- Indexes for table `idkaryawan`
--
ALTER TABLE `idkaryawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `iduser`
--
ALTER TABLE `iduser`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `id_karyawan` (`id_karyawan`);

--
-- Indexes for table `id_pesanann`
--
ALTER TABLE `id_pesanann`
  ADD PRIMARY KEY (`id_pesanan`),
  ADD KEY `id_customer` (`id_customer`),
  ADD KEY `id_bahan` (`id_bahan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `idbahan`
--
ALTER TABLE `idbahan`
  MODIFY `id_bahan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `idcustomer`
--
ALTER TABLE `idcustomer`
  MODIFY `id_customer` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `idkaryawan`
--
ALTER TABLE `idkaryawan`
  MODIFY `id_karyawan` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `iduser`
--
ALTER TABLE `iduser`
  MODIFY `id_user` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `id_pesanann`
--
ALTER TABLE `id_pesanann`
  MODIFY `id_pesanan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `iduser`
--
ALTER TABLE `iduser`
  ADD CONSTRAINT `iduser_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `idkaryawan` (`id_karyawan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `id_pesanann`
--
ALTER TABLE `id_pesanann`
  ADD CONSTRAINT `id_pesanann_ibfk_2` FOREIGN KEY (`id_bahan`) REFERENCES `idbahan` (`id_bahan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_pesanann_ibfk_3` FOREIGN KEY (`id_customer`) REFERENCES `idcustomer` (`id_customer`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
