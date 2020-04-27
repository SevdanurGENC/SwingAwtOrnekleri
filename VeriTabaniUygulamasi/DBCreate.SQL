create database vt;

use vt;

create table kisiler(
id int(10) unsigned not null auto_increment,
ad varchar(50) not null,
soyad varchar(50) not null,
yas int(5) unsigned not null,
cinsiyet tinyint(3) unsigned not null,
primary key(id)
);

insert into kisiler (id, ad, soyad, yas, cinsiyet)
values (1, 'Huseyin', 'Sahin', 37, 1),
(2, 'Doguc Can', 'Yildiz', 36, 1),
(3, 'Sevdanur','Genc', 37, 0),
(4, 'Selcuk', 'Genc', 25, 1),
(5, 'Birsen Cenberci', 'Durusoy', 40, 0);

select * from kisiler;
