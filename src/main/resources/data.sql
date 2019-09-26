CREATE TABLE  IF NOT EXISTS  tags_type (
id number,
name character varying(256),
color character varying(256),
description character varying,
PRIMARY KEY (id)
);

CREATE TABLE  IF NOT EXISTS  tags (
id number,
name character varying(256),
description character varying,
type number,
PRIMARY KEY (id),
FOREIGN KEY (id) REFERENCES tags_type (id)
);


INSERT INTO tags_type VALUES(1, 'Module', '#ffffff"', 'Description');
INSERT INTO tags_type VALUES(2, 'Module_example_2', '#fffsss"', 'Description');
INSERT INTO tags VALUES(1, 'tags_example', 'Description"', 1);
INSERT INTO tags VALUES(2, 'tags_example_2', 'Description"', 2);