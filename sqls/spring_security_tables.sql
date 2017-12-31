create table authorities (
  user_id int not null,
  username varchar(50) not null,
  authority varchar(50) not null,
  foreign key (user_id) references Users (ID),
  unique index authorities_idx_1 (username, authority)
) engine = InnoDb;

create table groups (
  id bigint unsigned not null auto_increment primary key,
  group_name varchar(50) not null
) engine = InnoDb;

create table group_authorities (
  group_id bigint unsigned not null,
  authority varchar(50) not null,
  foreign key (group_id) references groups (id)
) engine = InnoDb;

create table group_members (
  id bigint unsigned not null auto_increment primary key,
  username varchar(50) not null,
  group_id bigint unsigned not null,
  foreign key (group_id) references groups (id)
) engine = InnoDb;
