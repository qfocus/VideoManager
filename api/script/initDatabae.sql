CREATE TABLE "meta"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "key"          VARCHAR(20)   NOT NULL UNIQUE,
    "value"        VARCHAR(20)   NOT NULL,
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT)
);

CREATE TABLE "video"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "name"         NVARCHAR(20),
    "path"         NVARCHAR(200),
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT)
);

CREATE TABLE "actor"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "name"         VARCHAR(20),
    "alias"        VARCHAR(50),
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT)
);

CREATE TABLE "cast"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "video_id"     INTEGER       NOT NULL,
    "actor_id"     INTEGER       NOT NULL,
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT),
    FOREIGN KEY (video_id) REFERENCES video (id),
    FOREIGN KEY (actor_id) REFERENCES actor (id)
);

CREATE TABLE "tag"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "name"         NVARCHAR(20)  NOT NULL UNIQUE,
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT)
);

CREATE TABLE "tag_video"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "video_id"     INTEGER       NOT NULL,
    "tag_id"       INTEGER       NOT NULL,
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT),
    FOREIGN KEY (video_id) REFERENCES video (id),
    FOREIGN KEY (tag_id) REFERENCES tag (id)
);

CREATE TABLE "tag_actor"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "actor_id"     INTEGER       NOT NULL,
    "tag_id"       INTEGER       NOT NULL,
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT),
    FOREIGN KEY (actor_id) REFERENCES actor (id),
    FOREIGN KEY (tag_id) REFERENCES tag (id)
);

CREATE TABLE "rating_video"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "video_id"     INTEGER       NOT NULL,
    "rating"       INTEGER       NOT NULL,
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT),
    FOREIGN KEY (video_id) REFERENCES video (id)
);

CREATE TABLE "rating_actor"
(
    "id"           INTEGER       NOT NULL UNIQUE,
    "actor_id"     INTEGER       NOT NULL,
    "rating"       INTEGER       NOT NULL,
    "created_time" CHARACTER(19) NOT NULL,
    "updated_time" CHARACTER(19) NOT NULL,
    PRIMARY KEY ("id" AUTOINCREMENT),
    FOREIGN KEY (actor_id) REFERENCES actor (id)
);

