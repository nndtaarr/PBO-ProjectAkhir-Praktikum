-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Jun 2022 pada 02.39
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaurant`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kategori`
--

CREATE TABLE `kategori` (
  `kategori` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `kategori`
--

INSERT INTO `kategori` (`kategori`) VALUES
('Bumbu'),
('Daging'),
('Minuman'),
('Sayuran'),
('Seafood'),
('Shabu - Shabu');

-- --------------------------------------------------------

--
-- Struktur dari tabel `supplier`
--

CREATE TABLE `supplier` (
  `supplier` varchar(100) NOT NULL,
  `contact` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `supplier`
--

INSERT INTO `supplier` (`supplier`, `contact`) VALUES
('PT Agrosery', '098677549002'),
('PT Blended Beverages', '087543871973'),
('PT Cedea', '098547681241'),
('PT Eleven Stars Seafood', '088576892351'),
('PT Indofood', '098554531324'),
('PT Meatshop OriCow', '086722956781'),
('PT Shou', '081567982451');

-- --------------------------------------------------------

--
-- Struktur dari tabel `supply`
--

CREATE TABLE `supply` (
  `id_supply` int(10) NOT NULL,
  `kategori` varchar(100) NOT NULL,
  `supplier` varchar(100) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `jumlah_produk` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `supply`
--

INSERT INTO `supply` (`id_supply`, `kategori`, `supplier`, `nama_produk`, `jumlah_produk`) VALUES
(1, 'Sayuran', 'PT Agrosery', 'Pakcoy', 450),
(2, 'Bumbu', 'PT Indofood', 'Kecap', 250),
(3, 'Daging', 'PT Meatshop OriCow', 'Wagyu', 500),
(4, 'Minuman', 'PT Blended Beverages', 'Blackcurrant', 350),
(5, 'Seafood', 'PT Eleven Stars Seafood', 'Udang', 300),
(6, 'Shabu - Shabu', 'PT Shou', 'Crab Stick', 250),
(7, 'Daging', 'PT Meatshop OriCow', 'Sirloin', 400),
(8, 'Bumbu', 'PT Indofood', 'Black Papper', 400);

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `id_user` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'admin', '12345');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`kategori`);

--
-- Indeks untuk tabel `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`supplier`);

--
-- Indeks untuk tabel `supply`
--
ALTER TABLE `supply`
  ADD PRIMARY KEY (`id_supply`),
  ADD KEY `fk_kategori` (`kategori`),
  ADD KEY `fk_supplier` (`supplier`);

--
-- Indeks untuk tabel `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `supply`
--
ALTER TABLE `supply`
  MODIFY `id_supply` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `supply`
--
ALTER TABLE `supply`
  ADD CONSTRAINT `fk_kategori` FOREIGN KEY (`kategori`) REFERENCES `kategori` (`kategori`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_supplier` FOREIGN KEY (`supplier`) REFERENCES `supplier` (`supplier`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
