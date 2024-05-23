-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 23, 2024 at 01:28 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trabajofinal`
--

-- --------------------------------------------------------

--
-- Table structure for table `ideas`
--

CREATE TABLE `ideas` (
  `Nombre` varchar(255) NOT NULL,
  `Creador` varchar(255) NOT NULL,
  `Tipo` varchar(255) NOT NULL,
  `Importancia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ideas`
--

INSERT INTO `ideas` (`Nombre`, `Creador`, `Tipo`, `Importancia`) VALUES
('Idea1', 'Victor', 'Tarea', 'Mucha'),
('Idea2', 'Ivan', 'Tarea', 'Poca'),
('Idea3', 'Victor', 'Otro', 'Sin importancia'),
('Idea4', 'Victor', 'Proyecto', 'Media'),
('Idea5', 'Victor', 'Tarea', 'Poca'),
('Idea6', 'Jorge', 'Otro', 'Sin importancia');

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

CREATE TABLE `proyectos` (
  `Nombre` varchar(255) NOT NULL,
  `NºParticipantes` int(90) NOT NULL,
  `Proceso` varchar(255) NOT NULL,
  `Importancia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`Nombre`, `NºParticipantes`, `Proceso`, `Importancia`) VALUES
('Proyecto1', 5, 'Sin empezar', 'Poca'),
('Proyecto2', 2, 'Acabado', 'Sin importancia'),
('Proyecto3', 10, 'Mitad', 'Mucha'),
('Proyecto4', 115, 'Mitad', 'Mucha'),
('Proyecto5', 1, 'Empezando', 'Poca'),
('Proyecto6', 23, 'Mitad', 'Media');

-- --------------------------------------------------------

--
-- Table structure for table `tareas`
--

CREATE TABLE `tareas` (
  `Nombre` varchar(255) NOT NULL,
  `Usuario` varchar(255) NOT NULL,
  `Proceso` varchar(255) NOT NULL,
  `Importancia` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tareas`
--

INSERT INTO `tareas` (`Nombre`, `Usuario`, `Proceso`, `Importancia`) VALUES
('Tarea1', 'Victini', 'Mitad', 'Poca'),
('Tarea2', 'Victini', 'Empezando', 'Poca'),
('Tarea3', 'Ivanito', 'Acabando', 'Media'),
('Tarea4', 'Ivanito', 'Sin empezar', 'Poca'),
('Tarea5', 'Jorgito', 'Mitad', 'Mucha'),
('Tarea6', 'Victini', 'Empezando', 'Mucha');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(90) NOT NULL,
  `name` varchar(255) NOT NULL,
  `surname` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `surname`, `username`, `password`) VALUES
(22, 'Victor', 'D', 'Victini', '12345'),
(23, 'Ivan', 'C', 'Ivanito', '12345'),
(24, 'Alvaro', 'A', 'Alvarito', '12345'),
(25, 'Jorge', 'J', 'Jorgito', '12345'),
(26, 'Miguel', 'M', 'Miguelito', '12345'),
(27, 'Bruno', 'B', 'Brunito', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ideas`
--
ALTER TABLE `ideas`
  ADD UNIQUE KEY `Nombre` (`Nombre`);

--
-- Indexes for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD UNIQUE KEY `Nombre` (`Nombre`);

--
-- Indexes for table `tareas`
--
ALTER TABLE `tareas`
  ADD UNIQUE KEY `Nombre` (`Nombre`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(90) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
