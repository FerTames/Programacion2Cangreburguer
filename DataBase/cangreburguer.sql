-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-09-2017 a las 02:35:15
-- Versión del servidor: 10.1.25-MariaDB
-- Versión de PHP: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cangreburguer`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `NIT` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB AVG_ROW_LENGTH=4096 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`NIT`, `nombre`, `direccion`, `telefono`) VALUES
(2, '2', '2', 2),
(65, 'jhgf', 'iuy', 542),
(6523, 'swdfgb', 'dsfvgb', 85),
(6555, 'sdf', 'sdf', 5855),
(85963, 'patricio', 'bajo del mar', 987654321),
(89562345, 'POP', 'POP', 8956);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallesdepedido`
--

CREATE TABLE `detallesdepedido` (
  `codigoPedidos` int(11) NOT NULL,
  `codigoProducto` int(11) NOT NULL,
  `precio_unidad` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `detallesdepedido`
--

INSERT INTO `detallesdepedido` (`codigoPedidos`, `codigoProducto`, `precio_unidad`, `cantidad`) VALUES
(1, 1, 0, 1),
(4, 1, 0, 1),
(5, 4, 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `codigoEmpleado` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `fecha_contrato` date NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `cargo` varchar(50) NOT NULL
) ENGINE=InnoDB AVG_ROW_LENGTH=1638 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`codigoEmpleado`, `nombre`, `apellidos`, `direccion`, `telefono`, `fecha_contrato`, `fecha_nacimiento`, `cargo`) VALUES
(502, 'pop', 'pop', 'fdfafds', '895623', '0017-08-08', '0012-05-05', 'asdfg'),
(985, 'sdfgh', 'sdfghsd', 'defrg', '8523', '0017-08-08', '0012-08-08', 'swdefg'),
(1010, 'Fernanda', 'Tames', 'America', '77451607', '2016-05-03', '1999-03-16', 'cajero'),
(40605, 'POP', 'POP', 'PIOI', '9658', '0019-08-08', '0017-08-08', 'POIUYF'),
(40606, 'CAMILA', 'GAY', 'POP STREET', '87456230', '0016-08-08', '0012-09-09', 'LIMPIA PISO'),
(56985, 'bob', 'esponja', 'bajo del  mar', '123456789', '0017-08-08', '0009-03-07', 'cajero de la cangreburguer'),
(78654, '7854', '7845', '78587654', '865786', '0008-08-08', '0009-09-09', '646');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `envios`
--

CREATE TABLE `envios` (
  `codigoEnvio` int(11) NOT NULL,
  `empresa` varchar(20) NOT NULL,
  `telefono` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `envios`
--

INSERT INTO `envios` (`codigoEnvio`, `empresa`, `telefono`) VALUES
(1, 'Correcaminos', 4444444),
(2, 'Mototaxi VIP', 71756325),
(3, 'mototaxi SER', 4563985);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `numero` int(11) NOT NULL,
  `NIT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `codigoPedidos` int(11) NOT NULL,
  `NIT` int(11) NOT NULL,
  `codigoEmpleado` int(11) NOT NULL,
  `codigoEnvio` int(11) DEFAULT NULL,
  `fecha_pedido` date NOT NULL,
  `fecha_entrega` date NOT NULL,
  `fecha_envio` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pedidos`
--

INSERT INTO `pedidos` (`codigoPedidos`, `NIT`, `codigoEmpleado`, `codigoEnvio`, `fecha_pedido`, `fecha_entrega`, `fecha_envio`) VALUES
(1, 6523, 985, 1, '2017-09-04', '2017-09-04', '2017-09-04'),
(4, 89562345, 40606, 1, '2017-09-04', '2017-09-04', '2017-09-04'),
(5, 89562345, 40606, 3, '2017-09-04', '2017-09-04', '2017-09-04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `codigoProducto` int(11) NOT NULL,
  `cantidad_unidad` int(11) NOT NULL,
  `precio_unidad` int(11) NOT NULL,
  `unidades_pedido` int(11) NOT NULL,
  `nombreProducto` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='added new field';

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`codigoProducto`, `cantidad_unidad`, `precio_unidad`, `unidades_pedido`, `nombreProducto`) VALUES
(1, 20, 15, 0, 'Combo Chesseburguer'),
(2, 50, 20, 0, 'Combo EmmentalBurguer'),
(3, 50, 0, 0, 'Combo MonsterBurguer'),
(4, 60, 20, 0, ' Combo LacangreBurguer');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`NIT`);

--
-- Indices de la tabla `detallesdepedido`
--
ALTER TABLE `detallesdepedido`
  ADD PRIMARY KEY (`codigoProducto`,`codigoPedidos`),
  ADD KEY `FK_detalle de pedidos_pedidos_codigoPedidos` (`codigoPedidos`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`codigoEmpleado`);

--
-- Indices de la tabla `envios`
--
ALTER TABLE `envios`
  ADD PRIMARY KEY (`codigoEnvio`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`numero`),
  ADD KEY `FK_factura_cliente_NIT` (`NIT`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`codigoPedidos`),
  ADD KEY `FK_pedidos_cliente_NIT` (`NIT`),
  ADD KEY `FK_pedidos_empleados_codigoEmpleado` (`codigoEmpleado`),
  ADD KEY `FK_pedidos_envios_codigoEnvio` (`codigoEnvio`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`codigoProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `NIT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=89562346;
--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `codigoEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=78655;
--
-- AUTO_INCREMENT de la tabla `envios`
--
ALTER TABLE `envios`
  MODIFY `codigoEnvio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `numero` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `codigoPedidos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `codigoProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detallesdepedido`
--
ALTER TABLE `detallesdepedido`
  ADD CONSTRAINT `FK_detalle de pedidos_pedidos_codigoPedidos` FOREIGN KEY (`codigoPedidos`) REFERENCES `pedidos` (`codigoPedidos`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_detalle de pedidos_productos_codigoProducto` FOREIGN KEY (`codigoProducto`) REFERENCES `productos` (`codigoProducto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `factura`
--
ALTER TABLE `factura`
  ADD CONSTRAINT `FK_factura_cliente_NIT` FOREIGN KEY (`NIT`) REFERENCES `cliente` (`NIT`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `FK_pedidos_cliente_NIT` FOREIGN KEY (`NIT`) REFERENCES `cliente` (`NIT`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_pedidos_empleados_codigoEmpleado` FOREIGN KEY (`codigoEmpleado`) REFERENCES `empleados` (`codigoEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_pedidos_envios_codigoEnvio` FOREIGN KEY (`codigoEnvio`) REFERENCES `envios` (`codigoEnvio`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
