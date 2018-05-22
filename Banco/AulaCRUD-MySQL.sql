CREATE SCHEMA AulaCRUD;

USE AulaCRUD;

CREATE TABLE AulaCRUD.Alunos(
id INT NOT NULL AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
idade INT NULL,
PRIMARY KEY(id));

-- Inserir
INSERT INTO Alunos(nome,idade) VALUES('Bruno',16);

-- Atualizar
UPDATE Alunos SET nome = 'Luiz', idade = 29 WHERE id = 1;

-- Deletar
DELETE FROM Alunos WHERE id = 1;

-- Selecionar 
SELECT id, nome, idade FROM Alunos;

-- select column name from information_schema.columns where table name = 'Alunos'

-- Selecionar nome como parâmetro
SELECT id, nome, idade, FROM Alunos WHERE nome LIKE = '%b%' -- %b Termine com 'b' / b% Comece com 'b' / %b% Tenha 'b'