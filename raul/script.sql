CREATE TABLE Auditing (
	IDENTIFIER SERIAL NOT NULL,
	REGISTER_CODE NUMERIC(20) NOT NULL,
	DATETIME TIMESTAMP NOT NULL,
	CONSTRAINT auditing_pk PRIMARY KEY (IDENTIFIER),
	FOREIGN KEY (REGISTER_CODE) REFERENCES Material (CODE)
);

CREATE TABLE Material (
	CODE NUMERIC(20) NOT NULL,
	NAME VARCHAR(60) NOT NULL,
	PRICE NUMERIC(18,2) NOT NULL,
	PROVIDER VARCHAR(60) NOT NULL,
	LAST_BUY TIMESTAMP NOT NULL,
	CONSTRAINT material_pk PRIMARY KEY (CODE)
);