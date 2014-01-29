# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table course (
  name                      varchar(255) not null,
  professor_email           varchar(255),
  students_limit            integer,
  constraint pk_course primary key (name))
;

create table dean (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_dean primary key (email))
;

create table professor (
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_professor primary key (email))
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

create sequence course_seq;

create sequence dean_seq;

create sequence professor_seq;

create sequence student_seq;

create sequence user_seq;

alter table course add constraint fk_course_professor_1 foreign key (professor_email) references professor (email);
create index ix_course_professor_1 on course (professor_email);



# --- !Downs

drop table if exists course cascade;

drop table if exists dean cascade;

drop table if exists professor cascade;

drop table if exists student cascade;

drop table if exists user cascade;

drop sequence if exists course_seq;

drop sequence if exists dean_seq;

drop sequence if exists professor_seq;

drop sequence if exists student_seq;

drop sequence if exists user_seq;

