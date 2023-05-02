CREATE DATABASE  IF NOT EXISTS `retaguarda` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `retaguarda`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: retaguarda
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bairro`
--

DROP TABLE IF EXISTS `bairro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bairro` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bairro`
--

LOCK TABLES `bairro` WRITE;
/*!40000 ALTER TABLE `bairro` DISABLE KEYS */;
INSERT INTO `bairro` VALUES (3,'1'),(4,'testeBairro');
/*!40000 ALTER TABLE `bairro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cidade`
--

DROP TABLE IF EXISTS `cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cidade` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cidade`
--

LOCK TABLES `cidade` WRITE;
/*!40000 ALTER TABLE `cidade` DISABLE KEYS */;
INSERT INTO `cidade` VALUES (5,'teste cidade'),(6,'1'),(7,'2'),(8,'testeCidade'),(9,'cidade2');
/*!40000 ALTER TABLE `cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classe`
--

DROP TABLE IF EXISTS `classe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classe` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classe`
--

LOCK TABLES `classe` WRITE;
/*!40000 ALTER TABLE `classe` DISABLE KEYS */;
INSERT INTO `classe` VALUES (1,'testeClasse');
/*!40000 ALTER TABLE `classe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `fone1` varchar(15) NOT NULL,
  `fone2` varchar(15) DEFAULT NULL,
  `complementoEndereco` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dtCadastro` varchar(100) NOT NULL,
  `observacao` varchar(100) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(10) NOT NULL,
  `dtNascimento` varchar(100) NOT NULL,
  `sexo` varchar(100) NOT NULL,
  `endereco_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Nome*','Fone 1*','Fone 2','1111','E-mail','2023-04-29 17:17','Observação','Masculino','111.111.111-11','1.111.111','Data de Nascimento','Masculino',0),(2,'1','(11)11111-1111','(11)11111-1111','','','2023-04-30 13:40','','Masculino','111.111.111-11','1.111.111','11/11/1111','Masculino',1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `colaborador`
--

DROP TABLE IF EXISTS `colaborador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colaborador` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `fone1` varchar(15) NOT NULL,
  `fone2` varchar(15) DEFAULT NULL,
  `complementoEndereco` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dtCadastro` varchar(100) NOT NULL,
  `observacao` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `login` varchar(50) NOT NULL,
  `senha` varchar(45) NOT NULL,
  `endereco_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colaborador`
--

LOCK TABLES `colaborador` WRITE;
/*!40000 ALTER TABLE `colaborador` DISABLE KEYS */;
INSERT INTO `colaborador` VALUES (1,'Nome*','Fone 1','Fone 2','Complemento','111111','2023-04-29 17:41','Observação','Ativo','111111','Senha*',0),(2,'testeColaborador','(11)11111-1111','(11)11111-1111','','1111111','2023-04-30 12:50','','Ativo','111111111111','11111111',1);
/*!40000 ALTER TABLE `colaborador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataCompra` varchar(100) NOT NULL,
  `horaCompra` varchar(100) NOT NULL,
  `numeroNF` varchar(100) NOT NULL,
  `tipoNF` varchar(100) DEFAULT NULL,
  `valorDesconto` float DEFAULT NULL,
  `valorAcrescimo` float DEFAULT NULL,
  `totalNF` float DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `fornecedor_id` int NOT NULL,
  `condicaoPgto_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `condicaopgto`
--

DROP TABLE IF EXISTS `condicaopgto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `condicaopgto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricaoCondicao` varchar(50) DEFAULT NULL,
  `numeroParcelas` int DEFAULT NULL,
  `diasPrimeiraParcela` int DEFAULT NULL,
  `diasEntreParcela` int DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `condicaopgto`
--

LOCK TABLES `condicaopgto` WRITE;
/*!40000 ALTER TABLE `condicaopgto` DISABLE KEYS */;
/*!40000 ALTER TABLE `condicaopgto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cupomfiscal`
--

DROP TABLE IF EXISTS `cupomfiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cupomfiscal` (
  `id` binary(16) NOT NULL,
  `dataVenda` varchar(100) NOT NULL,
  `horaVenda` varchar(100) DEFAULT NULL,
  `valorDesconto` float DEFAULT NULL,
  `valorAcrescimo` float DEFAULT NULL,
  `totalCupom` float DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `cliente_id` int NOT NULL,
  `colaborador_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cupomfiscal`
--

LOCK TABLES `cupomfiscal` WRITE;
/*!40000 ALTER TABLE `cupomfiscal` DISABLE KEYS */;
/*!40000 ALTER TABLE `cupomfiscal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id` int NOT NULL AUTO_INCREMENT,
  `logradouro` varchar(60) NOT NULL,
  `cep` varchar(10) NOT NULL,
  `bairro_id` int NOT NULL,
  `cidade_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'teste','11111-111',4,8);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `fone1` varchar(15) NOT NULL,
  `fone2` varchar(15) DEFAULT NULL,
  `complementoEndereco` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `dtCadastro` varchar(100) NOT NULL,
  `observacao` varchar(100) DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `cnpj` varchar(45) DEFAULT NULL,
  `inscEstadual` varchar(45) DEFAULT NULL,
  `contato` varchar(100) DEFAULT NULL,
  `razaoSocial` varchar(60) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(10) DEFAULT NULL,
  `endereco_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historicomovimentacao`
--

DROP TABLE IF EXISTS `historicomovimentacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `historicomovimentacao` (
  `id` binary(16) NOT NULL,
  `data` varchar(100) DEFAULT NULL,
  `hora` varchar(100) DEFAULT NULL,
  `tipo` varchar(100) DEFAULT NULL,
  `qtd` float DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `produto_id` int NOT NULL,
  `itensCompra_id` int NOT NULL,
  `itensCupomFiscal_id` binary(16) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historicomovimentacao`
--

LOCK TABLES `historicomovimentacao` WRITE;
/*!40000 ALTER TABLE `historicomovimentacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `historicomovimentacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itenscompra`
--

DROP TABLE IF EXISTS `itenscompra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itenscompra` (
  `id` int NOT NULL AUTO_INCREMENT,
  `qtdProduto` float NOT NULL,
  `valorUnitarioProduto` float DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `produto_id` int NOT NULL,
  `compra_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itenscompra`
--

LOCK TABLES `itenscompra` WRITE;
/*!40000 ALTER TABLE `itenscompra` DISABLE KEYS */;
/*!40000 ALTER TABLE `itenscompra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itenscupomfiscal`
--

DROP TABLE IF EXISTS `itenscupomfiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `itenscupomfiscal` (
  `id` binary(16) NOT NULL,
  `qtdProduto` float NOT NULL,
  `valorUnitarioProduto` float NOT NULL,
  `status` varchar(100) DEFAULT NULL,
  `cupomFiscal_id` binary(16) NOT NULL,
  `produto_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itenscupomfiscal`
--

LOCK TABLES `itenscupomfiscal` WRITE;
/*!40000 ALTER TABLE `itenscupomfiscal` DISABLE KEYS */;
/*!40000 ALTER TABLE `itenscupomfiscal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(60) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'t'),(2,'testeMarca');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagamento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataPagamento` varchar(100) DEFAULT NULL,
  `horaPagamento` varchar(100) DEFAULT NULL,
  `valorDesconto` float DEFAULT NULL,
  `valorAcrescimo` float DEFAULT NULL,
  `valorPago` float DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `pagar_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagar`
--

DROP TABLE IF EXISTS `pagar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pagar` (
  `id` int NOT NULL AUTO_INCREMENT,
  `dataEmissao` varchar(100) DEFAULT NULL,
  `horaEmissao` varchar(100) DEFAULT NULL,
  `dataVencimento` varchar(100) DEFAULT NULL,
  `valorPagar` float DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  `compra_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagar`
--

LOCK TABLES `pagar` WRITE;
/*!40000 ALTER TABLE `pagar` DISABLE KEYS */;
/*!40000 ALTER TABLE `pagar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao` varchar(100) NOT NULL,
  `valorCompra` float NOT NULL,
  `valorVenda` float NOT NULL,
  `undCompra` varchar(50) NOT NULL,
  `undVenda` varchar(50) NOT NULL,
  `fatorConversao` int NOT NULL,
  `status` varchar(100) DEFAULT NULL,
  `dataCadastro` varchar(100) NOT NULL,
  `barraEntrada` varchar(30) NOT NULL,
  `barraSaida` varchar(30) NOT NULL,
  `estoqueMinimo` float NOT NULL,
  `estoqueMaximo` float NOT NULL,
  `marca_id` int NOT NULL,
  `classe_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'testeProduto',1,1,'1','1',1,'Ativo','2023-04-30 13:00','1','1',1,1,2,1);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-02 17:44:25
