CREATE TABLE item (
	id	BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	codigo	VARCHAR(40) not null	unique,
	titulo	VARCHAR(80) not null,
	tipo	VARCHAR(10) not null,
	autor	VARCHAR(40) not null,
	edicao	VARCHAR(40) not null,
	disponivel	BOOLEAN not null default true,

	CONSTRAINT ck_tipo_item
        CHECK (tipo IN ('LIVRO', 'REVISTA', 'DVD'))
);

CREATE TABLE usuario(
	id	BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	nome	VARCHAR(40)	not null,
	tipo	VARCHAR(10)	not null,
	limite_itens	INTEGER	not null,
	CONSTRAINT ck_tipo_usuario
        CHECK (tipo IN ('ALUNO', 'PROFESSOR'))
);

CREATE TABLE emprestimo(
	id	BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	item_id	BIGINT	not null,
	usuario_id	BIGINT	not null,
	data_retirada	TIMESTAMPTZ	not null,
	data_devolucao_prevista	TIMESTAMPTZ	not null,
	data_devolucao	TIMESTAMPTZ,
	valor_multa	DECIMAL(10, 2)	not null,

	CONSTRAINT fk_emprestimo_usuario
		FOREIGN KEY (usuario_id) REFERENCES usuario (id)
		ON DELETE RESTRICT,
	CONSTRAINT fk_item_usuario
		FOREIGN KEY (item_id) REFERENCES item (id)
);