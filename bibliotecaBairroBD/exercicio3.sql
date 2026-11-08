-- exercicio 3

-- 1)

select codigo, titulo, tipo, disponivel from item;

-- 2)

select u.nome, i.titulo
FROM usuario u
JOIN emprestimo e ON u.id = e.usuario_id
JOIN item i ON i.id = e.item_id
WHERE data_devolucao IS NULL

-- 3)

select u.nome, sum(e.valor_multa)
from usuario u
join emprestimo e
on u.id = e.usuario_id
group by u.id

-- 4)

