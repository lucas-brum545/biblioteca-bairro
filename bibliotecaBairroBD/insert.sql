INSERT INTO item (codigo, titulo, tipo, autor, edicao) VALUES
('L001', 'Clean Code', 'LIVRO', 'Fulano', '02/2026'),
('L002', 'Estruturas de Dados', 'LIVRO', 'Beltrano', '02/1999'),
('L003', 'Extraordinário', 'LIVRO', 'R.J. Palacio', '05/2022'),
('L004', 'O Hobbit', 'LIVRO', 'Ciclano', '01/1994');
INSERT INTO item (codigo, titulo, tipo, autor, edicao) VALUES(
'R001', 'Recreio', 'REVISTA', 'Editora Abril', '05/2005'
);

INSERT INTO usuario (nome, tipo, limite_itens) VALUES
('Ana Paula Souza', 'ALUNO', 3),
('Jorge Moura Brandão', 'PROFESSOR', 5);

INSERT INTO emprestimo (item_id, usuario_id, data_retirada, data_devolucao_prevista) VALUES
(1, 1, '2026-08-28 00:00:00-03', '2026-09-22 23:00:00-03', '2026-09-04 23:00:00-03'),
(2, 2, '2026-09-01 14:00:00-03', '2026-09-06 13:00:00-03')
;