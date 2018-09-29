



INSERT INTO `deportes` (`deporteid`, `nombre`) VALUES
(1, 'Futbol'),
(2, 'Baby Futbol'),
(3, 'Basquetbol');


INSERT INTO `divisiones` (`divisionid`, `deporteid`, `nombre`) VALUES
(1, 1, 'Primera Division'),
(2, 1, 'Segunda Division');

INSERT INTO `campeonatos` (`campeonatoid`, `divisionid`, `ano`, `nombre`, `semestre`, `campeon`, `fecha_inicio`, `fecha_termino`, `reglamento`) VALUES
(1, 1, 2018, 'Torneo de Verano', 'Segundo Semestre', NULL, '2018-08-27', '2018-12-15', NULL),
(2, 2, 2018, 'Torneo de Verano Segunda Division', 'Segundo Semestre', NULL, '2018-08-27', '2018-12-15', NULL);


INSERT INTO `equipos` (`equipoid`, `divisionid`, `nombre`, `carrera`, `facultad`) VALUES
(1, 2, 'Informatica', 'Ingenieria civil Informatica', 'Ingenieria'),
(2, 2, 'DIE', 'Ingenieria civil Electrica', 'Ingenieria'),
(3, 2, 'Quimica', 'Ingenieria civil Quimica', 'Ingenieria'),
(4, 2, 'FAUG', 'vacio', 'Arquitectura, Urbanizacion y Geografia'),
(5, 2, 'PMyC', 'Pedagogia en matematica y computacion', 'Educacion'),
(6, 2, 'Biomedica', 'Ingenieria civil Biomedica', 'Ingenieria'),
(7, 2, 'Farmacia', 'Farmacia', 'Farmacia y Nutricion'),
(8, 2, 'Materriales', 'Ingenieria civil Materiales', 'Ingenieria'),
(9, 2, 'Forestal', 'Ciencias Forestales y Agronomia', 'Ciencias Forestales'),
(10, 2, 'Sindicato 3', 'vacio', 'vacio'),
(11, 2, 'Enfermeria', 'Enfermeria y Obstetricia', 'Enfermeria'),
(12, 2, 'Historia', 'Pedagogia en Historia', 'Educacion'),
(13, 2, 'ICM', 'Ingenieria civil Matematica', 'Ciencias fisicas y matematicas'),
(14, 2, 'Geofisica', 'Geofisica', 'Ciencias fisicas y matematicas'),
(15, 2, 'Ballena', 'Oceaonagrafia', 'Ciencias naturales y oceanograficas'),
(16, 2, 'Auditoria', 'Auditoria', 'Ciencias economicas y administrativas'),
(17, 2, 'Ingenieria 85', 'vacio', 'Ingenieria'),
(18, 2, 'Electronica', 'Ingenieria civil Electronica', 'Ingenieria'),
(19, 1, 'DEF', 'Educacion fisica', 'Educacion'),
(20, 1, 'Interlex', 'Derecho', 'Ciencias juridicas y sociales'),
(21, 1, 'Virginio Gomez', 'vacio', 'vacio'),
(22, 1, 'Civil de Minas', 'Ingenieria civil Minas', 'Ingenieria'),
(23, 1, 'Industrial', 'Ingenieria civil Industrial', 'Ingenieria'),
(24, 1, 'Sindicato 1', 'vacio', 'vacio'),
(25, 1, 'Sociales', 'vacio', 'Ciencias sociales'),
(26, 1, 'Educacion', 'vacio', 'Educacion'),
(27, 1, 'Medicina', 'Medicina', 'Medicina'),
(28, 1, 'Derecho', 'Derecho', 'Ciencias juridicas y sociales'),
(29, 1, 'Metalurgica', 'Ingenieria civil Metalurgica', 'Ingenieria'),
(30, 1, 'Ex Alumnos', 'vacio', 'vacio'),
(31, 1, 'Comercial', 'Comercial', 'Ciencias economicas y administrativas'),
(32, 1, 'Geologia', 'Geologia', 'Ciencias quimicas'),
(33, 1, 'CFyM', 'vacio', 'Ciencias fisicas y matematicas'),
(34, 1, 'Mecanica', 'Ingenieria civil Mecanica', 'Ingenieria'),
(35, 1, 'Odontologia', 'Odontologia', 'Odontologia'),
(36, 1, 'Civil', 'Ingenieria Civil', 'Ingenieria');


INSERT INTO `jugadores` (`jugadorid`, `equipoid`, `nombre`, `edad`, `ano_ingreso`) VALUES
(1, 1, 'Jeremias Torres', 23, 2013),
(2, 2, 'Juan Ignacio Burgos', 20, 2017),
(3, 1, 'Abelardo Norambuena', 23, 2014),
(4, 1, 'Alan Cotal', 18, 2018),
(5, 1, 'Benjamin Rodriguez', 21, 2015),
(6, 2, 'Diego Pulgar', 18, 2018),
(7, 3, 'Vicente Hernandez', 23, 2014),
(8, 3, 'Gonzalo Gutierrez', 19, 2017),
(9, 4, 'Alejandro Fuentes', 24, 2012),
(10, 4, 'Anibal de la Fuente', 25, 2011),
(11, 5, 'Julio Ibarra', 30, 2008),
(12, 5, 'Rodrigo Salazar', 25, 2011),
(13, 6, 'Nicolas Herrera', 19, 2017),
(14, 6, 'Juan Marin', 19, 2017),
(15, 7, 'Jorge Carcamo', 19, 2017),
(16, 7, 'Francisco Ibañez', 22, 2014),
(17, 8, 'Manuel Astroza', 18, 2018),
(18, 8, 'Andres Elgueda', 23, 2013),
(19, 9, 'Bastian Fernandez', 21, 2015),
(20, 9, 'Luis Gatica', 23, 2014),
(21, 10, 'Luis Barril', 34, 2006),
(22, 10, 'Pedro Nuñez', 58, 2006),
(23, 11, 'Paul Concha', 25, 2012),
(24, 11, 'Rodrigo Inzunza', 21, 2015),
(25, 12, 'Pablo Marin', 22, 2015),
(26, 12, 'Nicolas Verdugo', 20, 2016),
(27, 13, 'Leonardo Uribe', 20, 2016),
(28, 13, 'Gabriel Cires', 20, 2016),
(29, 14, 'Domingos Wissi', 21, 2015),
(30, 14, 'Raul Baier', 20, 2016),
(31, 15, 'Hector Gonzalez', 20, 2016),
(32, 15, 'Juan Pablo Morgado', 20, 2016),
(33, 16, 'Angel Maldonado', 23, 2014),
(34, 16, 'Alejandro Leal', 25, 2011),
(35, 17, 'Walter Victtoriano', 23, 2013),
(36, 17, 'Valentin Betancur', 26, 2011),
(37, 18, 'Mauricio Novoa', 20, 2016),
(38, 18, 'Piero Riva', 20, 2016),
(39, 19, 'Luciano Rojas', 23, 2013),
(40, 19, 'Ignacio Riquelme', 20, 2016),
(41, 21, 'Diego Munita', 20, 2016),
(42, 21, 'Jose Inostroza', 20, 2016),
(43, 20, 'Ricardo Oñate', 20, 2016),
(44, 20, 'Carlos Parra', 20, 2016),
(45, 22, 'Omar Zambrano', 22, 2014),
(46, 22, 'Gustavo Salazar', 23, 2013),
(47, 23, 'Felipe Henriquez', 22, 2014),
(48, 23, 'Pablo Campos', 22, 2014),
(49, 24, 'Eduardo Mella', 25, 2011),
(50, 24, 'Christian Pena', 25, 2011),
(51, 25, 'Mauricio Echeverria', 24, 2012),
(52, 25, 'Abraham Pavez', 20, 2016),
(53, 26, 'Francisco Flores', 20, 2015),
(54, 27, 'Pedro Fuentes', 23, 2013),
(55, 28, 'Gabriel Sanhueza', 24, 2011),
(56, 29, 'Nicolas Bizama', 24, 2012),
(57, 30, 'Matias Cleveland', 28, 2008),
(58, 30, 'Leonardo Abarzua', 32, 2006),
(59, 31, 'Pablo Sanhueza', 20, 2016),
(60, 31, 'Erwyn Riquelme', 20, 2016),
(61, 32, 'Nelson Andreau', 25, 2011),
(62, 32, 'Emilio Vergara', 25, 2011),
(63, 33, 'Matias Cartes', 20, 2016),
(64, 33, 'Bastian Reinoso', 20, 2016),
(65, 34, 'Allan Mora', 20, 2017),
(66, 34, 'Victor Perez', 25, 2012),
(67, 35, 'Pablo Hernandez', 20, 2016),
(68, 35, 'Hernan Fuentes', 20, 2016),
(69, 36, 'Felipe Vidal', 23, 2015),
(70, 36, 'Alberto Romero', 23, 2014);

INSERT INTO `lugares` (`lugarid`, `nombre`, `ubicacion`, `capacidad`) VALUES
(1, 'Cancha sintetica Universidad de Concepcion', NULL, '50000 espectadores'),
(2, 'Cancha de Hockey', 'Al lado del edificio Virginio Gomez', '200000 espectadores'),
(3, 'Jaulas', 'Estadio UdeC', '2 personas');



INSERT INTO `sanciones` (`sancionid`, `jugadorid`, `tiempo`, `comentario`) VALUES
(1, 1, '25 fechas', 'Por buen tipo');
INSERT INTO `partidos` (`partidoid`, `equipo_1`, `equipo_2`, `divisionid`, `lugarid`, `ganador`, `fecha`, `hora`) VALUES
(1, 1, 2, 1, 1, NULL, '2018-08-28', '15:00 hrs');

INSERT INTO `partido_jugadors` (`partidoid`, `jugadorid`, `puntos`, `triples`, `amarilla`, `roja`, `faltas_b`) VALUES
(1, 1, 3, 0, 1, 0, 0);


INSERT INTO `arbitros` (`arbitroid`, `nombre`, `carrera`, `fecha_ingreso`) VALUES
(1, 'Nicolas Pavez', 'Ingenieria civil Industrial', '2018-09-10'),
(2, 'Franco Roca', 'Ingenieria civil Metalurgica', '2018-09-02'),
(3, 'Diego Pino', 'Educacion Fisica', '2018-09-02');

INSERT INTO `arbitrajes` (`partidoid`, `arbitroid`, `tipo`) VALUES
(1, 1, 'Juez Central');

INSERT INTO `usuarios` (`usuarioid`, `nombre`, `correo`, `password`, `admin`) VALUES
(1, 'Daniel Ortega', 'chilotesensual@llamame.cl', 'elcostillaresmio', NULL),
(2, 'Julio Zapata', NULL, '12345678', NULL),
(3, 'Julio Zapata', NULL, '12345678', NULL),
(4, 'fzf Zapata', NULL, 'fexrer42', NULL),
(5, 'asdfasdfasdf Zapata', NULL, 'pass', NULL);

