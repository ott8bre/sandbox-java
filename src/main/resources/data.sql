DROP TABLE IF EXISTS parents;

CREATE TABLE parents (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INT NOT NULL
);

INSERT INTO parents (id, name, age) VALUES
  (1, 'Mario', 27),
  (2, 'Carlo', 43),
  (3, 'Luisa', 39),
  (4, 'Adele', 28),
  (5, 'Bruno', 32);


DROP TABLE IF EXISTS children;

CREATE TABLE children (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  parent_id INT NOT NULL
);

INSERT INTO children (name, parent_id) VALUES
  ('Luca', 3),
  ('Sara', 3),
  ('Gino', 4),
  ('Lara', 4),
  ('Remo', 1),
  ('Mina', 1),
  ('Vito', 5);