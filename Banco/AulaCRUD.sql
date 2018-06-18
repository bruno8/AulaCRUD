CREATE DATABASE `aulacrud`;

Use `aulacrud`
CREATE TABLE `aluno` (
  `idAluno` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(100) NOT NULL,
  `Idade` int(11) NOT NULL,
  PRIMARY KEY (`idAluno`));
-- Inserir
Insert into aluno(Nome, Idade) Value('Gilson', 37)

-- selecionar

select * from aluno 

-- atualizar


update aluno set Nome='Polito' where idAluno = 1

-- selecionar com o nome como parâmetro

select idAluno, Nome, Idade from aluno where Nome like '%o%'