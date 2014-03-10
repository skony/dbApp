# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table course (
  name                      varchar(255) not null,
  professor_email           varchar(255),
  students_limit            integer,
  constraint pk_course primary key (name))
;

create table person (
  dtype                     varchar(10) not null,
  email                     varchar(255) not null,
  name                      varchar(255),
  password                  varchar(255),
  constraint pk_person primary key (email))
;


create table course_person (
  course_name                    varchar(255) not null,
  person_email                   varchar(255) not null,
  constraint pk_course_person primary key (course_name, person_email))
;
create sequence course_seq;

create sequence person_seq;

alter table course add constraint fk_course_professor_1 foreign key (professor_email) references person (email);
create index ix_course_professor_1 on course (professor_email);



alter table course_person add constraint fk_course_person_course_01 foreign key (course_name) references course (name);

alter table course_person add constraint fk_course_person_person_02 foreign key (person_email) references person (email);

# --- !Downs

drop table if exists course cascade;

drop table if exists course_person cascade;

drop table if exists person cascade;

drop sequence if exists course_seq;

drop sequence if exists person_seq;

