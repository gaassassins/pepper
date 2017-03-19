CREATE TABLE category
(
  id    INTEGER PRIMARY KEY NOT NULL,
  title VARCHAR(255)
);

CREATE TABLE recipe
(
  id              INTEGER NOT NULL,
  description     CHARACTER VARYING(255),
  name            CHARACTER VARYING(255),
  portions        INTEGER,
  "time"          INTEGER,
  title_image_url CHARACTER VARYING(255),
  weight          INTEGER,
  CONSTRAINT recipe_pkey PRIMARY KEY (id)
);

CREATE TABLE category_recipe
(
  category_id INTEGER NOT NULL,
  recipe_id   INTEGER NOT NULL,
  CONSTRAINT fkgwuruanm72d9as4tdwg3o5w0b FOREIGN KEY (recipe_id)
  REFERENCES recipe (id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fksfjvxlr4pyein5kiuau8560q8 FOREIGN KEY (category_id)
  REFERENCES category (id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE images
(
  id        INTEGER NOT NULL,
  url       CHARACTER VARYING(255),
  recipe_id INTEGER,
  CONSTRAINT images_pkey PRIMARY KEY (id),
  CONSTRAINT fk3yk8md41sys9hrbte3eenlmua FOREIGN KEY (recipe_id)
  REFERENCES recipe (id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION
);

CREATE TABLE ingredient
(
  id        INTEGER NOT NULL,
  name      CHARACTER VARYING(255),
  volume    INTEGER,
  weight    INTEGER,
  recipe_id INTEGER,
  CONSTRAINT ingredient_pkey PRIMARY KEY (id),
  CONSTRAINT fkj0s4ywmqqqw4h5iommigh5yja FOREIGN KEY (recipe_id)
  REFERENCES recipe (id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION
);
CREATE TABLE step
(
  id          INTEGER NOT NULL,
  description CHARACTER VARYING(255),
  "time"      INTEGER,
  title       CHARACTER VARYING(255),
  recipe_id   INTEGER,
  CONSTRAINT step_pkey PRIMARY KEY (id),
  CONSTRAINT fkpwpbn24pd57073jm669d7dwt9 FOREIGN KEY (recipe_id)
  REFERENCES recipe (id) MATCH SIMPLE
  ON UPDATE NO ACTION ON DELETE NO ACTION
);
