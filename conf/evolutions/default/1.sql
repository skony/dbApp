# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table dziekanat (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_dziekanat primary key (email))
;

create table kurs (
  name                      varchar(255) not null,
  students_limit            integer,
  selection                 varchar(255),
  constraint pk_kurs primary key (name))
;

create table profesor (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_profesor primary key (email))
;

create table student (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_student primary key (email))
;

create table user (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_user primary key (email))
;

create sequence dziekanat_seq;

create sequence kurs_seq;

create sequence profesor_seq;

create sequence student_seq;

create sequence user_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists dziekanat;

drop table if exists kurs;

drop table if exists profesor;

drop table if exists student;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists dziekanat_seq;

drop sequence if exists kurs_seq;

drop sequence if exists profesor_seq;

drop sequence if exists student_seq;

drop sequence if exists user_seq;

