create database dp2022exam;
create user student24 with password '108'
grant all on database dp2022exam to student24;
CREATE TABLE "entity3" (
  "id" serial PRIMARY KEY,
  "name" varchar(50),
  "lenght" integer
);