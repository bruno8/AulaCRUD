CREATE DATABASE aulacrud;

Use aulacrud
CREATE TABLE aluno (
  idAluno int(11) NOT NULL AUTO_INCREMENT,
  Nome varchar(100) NOT NULL,
  Idade int(11) NOT NULL,
  PRIMARY KEY (`idAluno`));
