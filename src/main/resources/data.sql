CREATE TABLE title
(
    code        VARCHAR(50)  NOT NULL PRIMARY KEY,
    description VARCHAR(255) NOT NULL,
    theme       VARCHAR(255) NOT NULL
);

CREATE TABLE position
(
    id          BIGINT       NOT NULL PRIMARY KEY,
    description VARCHAR(255) NOT NULL
);

CREATE TABLE author
(
    id          VARCHAR(50)  NOT NULL PRIMARY KEY,
    last_name    VARCHAR(255) NOT NULL,
    name        VARCHAR(255) NOT NULL,
    second_name  VARCHAR(255),
    position_id BIGINT       NOT NULL,
    FOREIGN KEY (position_id) REFERENCES position (id)
);

INSERT INTO title(code, description, theme)
VALUES ('A1', 'Официальное письмо марсианам от жителей Земли', 'Добыча полезных ископаемых'),
       ('A2', 'Официальное письмо народу Татуина от землян', 'Озеленение пустыни'),
       ('A3', 'Официальное письмо воганам от жителей Земли', 'Расширение межзвездной навигации');

INSERT INTO position(id, description)
VALUES (7432234555, 'Старший научный сотрудник по добыче полезных ископаемых'),
       (3676545567, 'Директор департамента озеленения пустынь'),
       (6575677888, 'Главный инженер по строительству межзвездных автострад'),
       (9655677677, 'Руководитель отдела взаимодействия с внеземными цивилизациями');

INSERT INTO author(id, last_name, name, second_name, position_id)
VALUES ('ISO_639-1', 'Иванов', 'Иван', 'Иванович', 7432234555),
       ('ISO_965-44', 'Сидорова', 'Наталья', 'Николаевна', 3676545567),
       ('ISO_139-5', 'Петров', 'Петр', 'Петрович', 6575677888),
       ('ISO_8568-51', 'Плюшкина', 'Ирина',null,  7432234555);