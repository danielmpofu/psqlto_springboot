drop table if exists application_user cascade;
drop table if exists media_file cascade;
drop table if exists id_document cascade;
drop table if exists address cascade;
drop table if exists proof_of_res cascade;
drop table if exists contact cascade;
drop table if exists institution cascade;
drop table if exists certificate cascade;
drop table if exists banking_detail cascade;
drop table if exists people_relationship cascade;

-- institution
-- certificate
-- contact (add to user, inst)
-- next_of_kin (separate table)
-- banking details
-- proof of residency
-- dependents

create table application_user
(
    id             varchar(255) unique primary key not null,
    title          varchar(255)                    not null,
    first_name     varchar(255)                    not null,
    surname        varchar(255)                    not null,
    id_number      varchar(255)                    not null unique,
    id_type        int,
    dob            varchar(255)                    not null,
    gender         varchar(255)                    not null,
    mobile         varchar(255)                    not null,
    contact        varchar(255)                    not null,
    address        varchar(255)                    not null,
    email          varchar(255)                    not null,
    preferred_name varchar(255)                    null,
    nationality    varchar(255)                    not null,
    current_city   varchar(255),
    deleted        bool default (false),
    date_created   date default (current_timestamp),
    date_modified  date,
    created_by     varchar(255)                    null,
    modified_by    varchar(255),
    deleted_at     date                            null
);

create table id_document
(
    id_type       serial primary key,
    name          varchar(255) not null,
    description   varchar(255) not null,
    validity      varchar(255) not null,
    deleted       bool default (false),
    date_created  date default (current_timestamp),
    date_modified date,
    created_by    varchar(255) null,
    modified_by   varchar(255),
    deleted_at    date         null,
--     nationality
-- id number
);

create table people_relationship
(
    id            varchar(255) primary key,
    relationship  varchar(255) not null,
    owner_id      varchar(255) not null,
    other_person  varchar(25)  not null,
    deleted       bool default (false),
    date_created  date default (current_timestamp),
    date_modified date,
    created_by    varchar(255) null,
    modified_by   varchar(255),
    deleted_at    date         null
);

create table media_file
(
    id             varchar(255) unique primary key not null,
    upload_path    text                            not null,
    file_name      varchar(255)                    not null,
    file_extension varchar(255)                    not null,
    file_size      bigint,
    file_purpose   varchar(255),
    file_owner     varchar                         not null,
    date_uploaded  varchar(255)                    not null,
    deleted        bool default (false),
    date_created   date default (current_timestamp),
    date_modified  date,
    created_by     varchar(255)                    null,
    modified_by    varchar(255),
    deleted_at     date                            null
);

create table address
(
    id                 varchar(255) not null primary key,
    country            varchar(255) not null,
    name               varchar(255) not null,
    city               varchar(255) not null,
    street             varchar(255) not null,
    owner_id           varchar(255) not null,
    proof_of_residency varchar(255),
    deleted            bool default (false),
    date_created       date default (current_timestamp),
    date_modified      date,
    created_by         varchar(255) null,
    modified_by        varchar(255),
    deleted_at         date         null
);

create table proof_of_res
(
    id            varchar(255) not null primary key,
    address       varchar(255) not null,
    owner_id      varchar(255) not null,
    document      varchar(255) null,
    name          varchar(255) not null,
    description   varchar(255) not null,
    type          varchar(255) not null,
    deleted       bool default (false),
    date_created  date default (current_timestamp),
    date_modified date,
    created_by    varchar(255) null,
    modified_by   varchar(255),
    deleted_at    date         null
);

create table contact
(
    id            varchar(255) primary key not null,
    is_primary    bool default (false),
    in_use        bool default (true),
    name          varchar(255)             not null,
    email_address varchar(255),
    phone         varchar(255),
    country_code  varchar(255),
    address       varchar(255),
    website       varchar(255),
    verified      bool default (false),
    verified_date date                     null,
    deleted       bool default (false),
    date_created  date default (current_timestamp),
    date_modified date,
    created_by    varchar(255)             null,
    modified_by   varchar(255),
    deleted_at    date                     null
);

create table institution
(
    id            varchar(255) not null unique primary key,
    name          varchar(255) not null,
    description   varchar(255) null,
    logo          varchar(255) null,
    address       varchar(255) not null,
    type          varchar(255) not null,
    contact       varchar(255) not null,

    deleted       bool default (false),
    date_created  date default (current_timestamp),
    date_modified date,
    created_by    varchar(255) null,
    modified_by   varchar(255),
    deleted_at    date         null
);

create table certificate
(
    id               varchar(255) primary key,
    name             varchar(255) not null,
    type             varchar(255) not null,
    institution      varchar(255),
    date_awarded     date         not null,
    expiry           varchar(255),
    owner_id         varchar(255),
    certificate_file varchar(255),
    verified         bool default (false),
    verified_date    date         null,

    deleted          bool default (false),
    date_created     date default (current_timestamp),
    date_modified    date,
    created_by       varchar(255) null,
    modified_by      varchar(255),
    deleted_at       date         null
);

create table banking_detail
(
    id                  varchar(255) primary key not null,
    institute_id        varchar(255)             not null,
    bank_name           varchar(255)             not null,
    account_number      varchar(255),
    account_type        varchar(255),
    currency            varchar(255),
    alternate_signatory varchar(255)             null,
    owner_id            varchar(255)             not null,
    deleted             bool default (false),
    date_created        date default (current_timestamp),
    date_modified       date,
    created_by          varchar(255)             null,
    modified_by         varchar(255),
    deleted_at          date                     null
);

alter table banking_detail
    add foreign key (institute_id) references institution (id);

alter table banking_detail
    add foreign key (owner_id) references application_user (id);

alter table certificate
    add foreign key (institution) references institution (id);

alter table certificate
    add foreign key (certificate_file) references media_file (id);

alter table certificate
    add foreign key (owner_id) references application_user (id);

alter table people_relationship
    add foreign key (owner_id) references application_user (id);

alter table people_relationship
    add foreign key (other_person) references application_user (id);

alter table institution
    add foreign key (address) references address (id);

alter table institution
    add foreign key (logo) references media_file (id);

alter table institution
    add foreign key (contact) references contact (id);

alter table proof_of_res
    add foreign key (owner_id) references application_user (id);

alter table proof_of_res
    add foreign key (document) references media_file (id);

alter table proof_of_res
    add foreign key (address) references address (id);

alter table address
    add foreign key (owner_id) references application_user (id);

-- alter table address
--     add foreign key (contact) references contact (id);

alter table media_file
    add foreign key (file_owner) references application_user (id);

alter table application_user
    add foreign key (id_type) references id_document (id_type);

alter table application_user
    add foreign key (contact) references contact (id);

alter table application_user
    add foreign key (address) references address (id);


-- create table





