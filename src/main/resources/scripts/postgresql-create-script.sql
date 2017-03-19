CREATE TABLE category (
  id    SERIAL PRIMARY KEY NOT NULL,
  title VARCHAR(80)        NOT NULL
);

CREATE TABLE recipe (
  id              SERIAL PRIMARY KEY NOT NULL,
  name            VARCHAR(80)        NOT NULL,
  title_image_url VARCHAR(80)        NOT NULL,
  description     VARCHAR(1500),
  time            INT                NOT NULL
);

CREATE TABLE step (
  id          SERIAL PRIMARY KEY NOT NULL,
  title       VARCHAR(80)        NOT NULL,
  description VARCHAR(1500),
  time        INT                NOT NULL,
  recipe      INT REFERENCES recipe (id)
);

CREATE TABLE ingredient (
  name   VARCHAR(40) PRIMARY KEY NOT NULL,
  weight INT,
  volume INT,
  recipe INT REFERENCES recipe (id)
);

CREATE TABLE recipe_images (
  int    SERIAL PRIMARY KEY NOT NULL,
  recipe INT REFERENCES recipe (id),
  image  VARCHAR(80)
);

CREATE TABLE category_recipe (
  id       SERIAL PRIMARY KEY                      NOT NULL,
  category INT REFERENCES category (id)            NOT NULL,
  recipe   INT REFERENCES recipe (id)              NOT NULL
);
