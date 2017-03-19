INSERT INTO category (id, title) VALUES (1, 'Блюдо за 20 минут');
INSERT INTO category (id, title) VALUES (2, 'Блюдо за час');
INSERT INTO category (id, title) VALUES (3, 'Блюдо за 3 часа');
INSERT INTO category (id, title) VALUES (4, 'Блюдо для вегитареанцев');
INSERT INTO category (id, title) VALUES (5, 'Мясо');
INSERT INTO category (id, title) VALUES (6, 'Жареное');
INSERT INTO category (id, title) VALUES (7, 'Пареное');
INSERT INTO category (id, title) VALUES (8, 'Вареное');
INSERT INTO category (id, title) VALUES (9, 'Постные блюда');
INSERT INTO category (id, title) VALUES (10, 'Национальная еда');

INSERT INTO recipe (id, name, description, portions, time, title_image_url, weight)
VALUES (1, 'Суп грибной', 'Суп с грибами', 4, 120, 'http://host/imgTit1.img', 1000);
INSERT INTO recipe (id, name, description, portions, time, title_image_url, weight)
VALUES (2, 'Щи', 'Не красный борщ', 6, 150, 'http://host/imgTit2.img', 1200);
INSERT INTO recipe (id, name, description, portions, time, title_image_url, weight)
VALUES (3, 'Борщ', 'Не зеленые щи', 3, 70, 'http://host/imgTit3.img', 600);
INSERT INTO recipe (id, name, description, portions, time, title_image_url, weight)
VALUES (4, 'Плов', 'Тушеный рис с мясом', 7, 200, 'http://host/imgTit4.img', 1400);
INSERT INTO recipe (id, name, description, portions, time, title_image_url, weight)
VALUES (5, 'Суп-лапша', 'Суп с лапшой и курицей', 5, 50, 'http://host/imgTit5.img', 500);

INSERT INTO category_recipe (recipe_id, category_id) VALUES (4, 10);
INSERT INTO category_recipe (recipe_id, category_id) VALUES (3, 10);
INSERT INTO category_recipe (recipe_id, category_id) VALUES (3, 8);
INSERT INTO category_recipe (recipe_id, category_id) VALUES (1, 8);
INSERT INTO category_recipe (recipe_id, category_id) VALUES (5, 8);
INSERT INTO category_recipe (recipe_id, category_id) VALUES (5, 2);
INSERT INTO category_recipe (recipe_id, category_id) VALUES (4, 6);

INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (1, 'Макароны', 200, NULL, 5);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (2, 'Курица', 300, NULL, 5);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (3, 'Укроп', 40, NULL, 5);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (4, 'Картошка', 500, NULL, 2);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (5, 'Картошка', 700, NULL, 3);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (6, 'Курица', 400, NULL, 4);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (7, 'Рис', 500, NULL, 4);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (8, 'Вода', NULL, 500, 2);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (9, 'Вода', NULL, 600, 3);
INSERT INTO ingredient (id, name, weight, volume, recipe_id)
VALUES (10, 'Вода', NULL, 300, 5);
