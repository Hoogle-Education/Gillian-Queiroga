CREATE TABLE users (
   id BINARY(16) NOT NULL,
   email VARCHAR(255) NULL,
   password VARCHAR(255) NULL,
   enabled BIT(1) NOT NULL,
   CONSTRAINT pk_users PRIMARY KEY (id)
);

CREATE TABLE roles (
   id BIGINT AUTO_INCREMENT NOT NULL,
   authority VARCHAR(255) NOT NULL,
   CONSTRAINT pk_roles PRIMARY KEY (id)
);

CREATE TABLE confidentialities (
   id BIGINT AUTO_INCREMENT NOT NULL,
   name VARCHAR(255) NULL,
   level VARCHAR(255) NULL,
   CONSTRAINT pk_confidentialities PRIMARY KEY (id)
);

----------------------------------------------------------

CREATE TABLE user_roles (
   role_id BIGINT NOT NULL,
   user_id BINARY(16) NOT NULL,
   CONSTRAINT pk_user_roles PRIMARY KEY (role_id, user_id)
);

ALTER TABLE user_roles ADD CONSTRAINT fk_userol_on_role FOREIGN KEY (role_id) REFERENCES roles (id);
ALTER TABLE user_roles ADD CONSTRAINT fk_userol_on_user FOREIGN KEY (user_id) REFERENCES users (id);

----------------------------------------------------------

CREATE TABLE confidentiality_roles (
   confidentiality_id BIGINT NOT NULL,
   role_id BIGINT NOT NULL,
   CONSTRAINT pk_confidentiality_roles PRIMARY KEY (confidentiality_id, role_id)
);

ALTER TABLE confidentiality_roles ADD CONSTRAINT fk_conrol_on_confidentiality FOREIGN KEY (confidentiality_id) REFERENCES confidentialities (id);
ALTER TABLE confidentiality_roles ADD CONSTRAINT fk_conrol_on_role FOREIGN KEY (role_id) REFERENCES roles (id);
