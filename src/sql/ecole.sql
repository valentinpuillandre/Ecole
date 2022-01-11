
drop database if exists ecole;
create database ecole;
use ecole

create table matiere
(
idmatiere int(3) not null auto_increment,
nom_matiere varchar(50) not null,
primary key (idmatiere)
);insert into matiere values (null,'maths');
insert into matiere values (null,'Culture Générale');
insert into matiere values (null,'Dev');
insert into matiere values (null,'BDD');
insert into matiere values (null,'Droit');
insert into matiere values (null,'Economie');
insert into matiere values (null,'Algorithme');

create table classe
(
idclasse int(3) not null auto_increment,
niveau varchar(50) not null,
primary key (idclasse)
);insert into classe values (null,'BTS SIO 1 JV');
insert into classe values (null,'BTS SIO 2 JV');
insert into classe values (null,'BTS SIO 1 LM');
insert into classe values (null,'BTS SIO 2 LM');
insert into classe values (null,'BTS SIO 1 INITIAL');
insert into classe values (null,'BTS SIO 2 INITIAL');

create table etudiant
(
idetudiant int(3) not null auto_increment,
nom_etudiant varchar(50) not null,
prenom_etudiant varchar(50) not null,
adresse_etudiant varchar(50) not null,
email_etudiant varchar(50) not null,
tel_etudiant varchar(50) not null,
idclasse int(3) not null,
primary key (idetudiant),
foreign key (idclasse) references classe (idclasse)
);

insert into etudiant values (null,'Jimmy','Jimmy','25 rue de lille','v@gmail.com','0625315494',1);
insert into etudiant values (null,'Yanis','Yanis','25 rue de lille','v@gmail.com','0625315494',2);
insert into etudiant values (null,'Valentin','Valentin','25 rue de lille','v@gmail.com','0625315494',1);
insert into etudiant values (null,'Ianis','Ianis','25 rue de lille','v@gmail.com','0625315494',3);
insert into etudiant values (null,'Felix','Felix','25 rue de lille','v@gmail.com','0625315494',4);
insert into etudiant values (null,'Coumba','Coumba','25 rue de lille','v@gmail.com','0625315494',2);

create table professeur
(
idprofesseur int(3) not null auto_increment,
nom_prof varchar(50) not null,
prenom_prof varchar(50) not null,
matiere_prof varchar(50) not null,
email_prof varchar(50) not null,
tel_prof varchar(50) not null,
idmatiere int(3) not null,
primary key (idprofesseur),
foreign key (idmatiere) references matiere (idmatiere)
);


insert into professeur values (null,'Bernard','Bernard','maths','v@gmail.com','0625315494',1);
insert into professeur values (null,'johnny','johnny','Algorithme','v@gmail.com','0625315494',7);
insert into professeur values (null,'Chouaki','Chouaki','BDD','v@gmail.com','0625315494',4);
insert into professeur values (null,'Okacha','Okacha','Dev','v@gmail.com','0625315494',3);
insert into professeur values (null,'Chagnard','Chagnard','Economie','v@gmail.com','0625315494',6);
insert into professeur values (null,'Malou','Malou','Droit','v@gmail.com','0625315494',5);

create table donner_cours
(
idclasse int(3) not null,
idprofesseur int(3) not null,
primary key(idclasse,idprofesseur),
foreign key (idclasse) references classe (idclasse),
foreign key (idprofesseur) references professeur (idprofesseur)
);

insert into donner_cours values (1,1);
insert into donner_cours values (2,2);
insert into donner_cours values (3,3);
insert into donner_cours values (4,4);