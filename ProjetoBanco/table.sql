CREATE TABLE cliente(
	cod SERIAL,
	nome VARCHAR(50),
	cpf VARCHAR(16),
	rua VARCHAR(100),
	numero INT,
	bairro VARCHAR(80),
	estado CHAR(2),
	telefone VARCHAR(15)	,
	genero VARCHAR(50),
	CONSTRAINT pk_cliente PRIMARY KEY(cod)
);
