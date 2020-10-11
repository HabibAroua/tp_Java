Create database examen;

Create table equipe
(
	id int primary key Auto_increment,
	types varchar(25)
);

CREATE table devloppeur
(
    id int PRIMARY key AUTO_INCREMENT,
    nom varchar(30),
    prenom varchar(30),
    bureau varchar(30),
    salaire double,
    id_equipe int
);

alter table devloppeur add CONSTRAINT fk1 FOREIGN key (id_equipe) REFERENCES equipe(id);

create table goublet
(
    id int PRIMARY Key AUTO_INCREMENT,
    boisson varchar(20),
    type varchar(30),
    prix_unitaire double,
    semaine int,
    id_dev int
)

alter table goublet add CONSTRAINT fk2 FOREIGN key (id_dev) REFERENCES devloppeur(id);


insert into Equipe values(null,'jour');
insert into Equipe values(null,'nuit');


insert into devloppeur values(null,'Foulan1','Ben Foulen1','Bureau dev',1000,1);
insert into devloppeur values(null,'Foulan2','Ben Foulen2','Bureau dev',2500,1);
insert into devloppeur values(null,'Foulan3','Ben Foulen3','Bureau test',2500,1);
insert into devloppeur values(null,'Foulan4','Ben Foulen4','Bureau test',3050,1);
insert into devloppeur values(null,'Foulan5','Ben Foulen5','Bureau Marketing',1000,1);

insert into devloppeur values(null,'Foulan6','Ben Foulen6','Bureau dev',1000,2);
insert into devloppeur values(null,'Foulan7','Ben Foulen7','Bureau dev',1000,2);
insert into devloppeur values(null,'Foulan8','Ben Foulen8','Bureau test',3000,2);
insert into devloppeur values(null,'Foulan9','Ben Foulen9','Bureau test',4000,2);
insert into devloppeur values(null,'Foulan10','Ben Foulen10','Bureau dev',1500,2);
insert into devloppeur values(null,'Foulan11','Ben Foulen11','Bureau dev',1700,2);