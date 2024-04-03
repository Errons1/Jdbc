create schema demo;

create table books
(
    id    int auto_increment,
    title varchar(255) not null,
    pages int          not null,
    constraint books_pk
        primary key (id)
);