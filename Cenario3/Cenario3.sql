create database RodaGigante;

create table person(
	id int primary key auto_increment not null, 
    name varchar(100), 
    age int
);

create table gondola(
	id int primary key auto_increment not null, 
	GondolaNumber int not null unique,
    seat1 int,
    seat2 int,
    foreign key (Seat1) references person(id), 
    foreign key (Seat2) references person(id)
);

insert into person (name, age) 
values ("João", 30),
	   ("Marcos", 14);
       
insert into gondola (GondolaNumber, seat1, seat2)
values (8, 1, 2);
	