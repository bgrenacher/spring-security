CREATE TABLE users (
    id IDENTITY NOT NULL,
    username VARCHAR NOT NULL,
    password_hash VARCHAR NOT NULL,
);