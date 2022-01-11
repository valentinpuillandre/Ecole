drop database if exists ecole;
create database ecole;
use ecole

create table matiere
(
idmatiere int(3) not null auto_increment,
nom_matiere varchar(50) not null,
primary key (idmatiere)
);


create table classe
(
idclasse int(3) not null auto_increment,
niveau varchar(50) not null,
primary key (idclasse)
);

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


create table donner_cours
	(
 idclasse int(3) not null,
 idprofesseur int(3) not null,
 primary key(idclasse,idprofesseur),
 foreign key (idclasse) references classe (idclasse),
 foreign key (idprofesseur) references professeur (idprofesseur)
		);