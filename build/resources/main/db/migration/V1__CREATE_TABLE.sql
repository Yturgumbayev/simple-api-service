
CREATE TABLE countries (
                      id serial NOT NULL,
                      country_name varchar(256) not null unique,
                      capital varchar(256) not null,
                      population BIGINT NOT NULL,
                      is_nato_member BOOLEAN NOT NULL,
                      PRIMARY KEY (id)
);