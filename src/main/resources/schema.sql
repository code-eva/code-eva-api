CREATE TABLE IF NOT EXISTS user_account(
	user_id uuid PRIMARY KEY,
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	username varchar(255) NOT NULL,
	"password" varchar(255) NOT NULL,
	is_enabled boolean NOT NULL,
	"role" varchar(255) NULL,
    CONSTRAINT uk_email UNIQUE (email),
	CONSTRAINT uk_username UNIQUE (username),
	CONSTRAINT fk_user_account_email FOREIGN KEY (email) REFERENCES email(email),
	CONSTRAINT fk_user_account_role FOREIGN KEY ("role") REFERENCES user_role("role")
);

CREATE TABLE IF NOT EXISTS email(
	email varchar(255) PRIMARY KEY,
	verified boolean DEFAULT FALSE,
);

CREATE TABLE IF NOT EXISTS user_role(
	"role" varchar(255) PRIMARY KEY,
	descirption varchar(255) NULL,
	"permission" varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS permissions(
	"permission" varchar(255) PRIMARY KEY,
	description varchar(255) NULL
);

CREATE TABLE IF NOT EXISTS role_permissions(
	"role" varchar(255) NOT NULL,
	"permission" varchar(255) NOT NULL,
	CONSTRAINT fk_user_role FOREIGN KEY ("role") REFERENCES user_role("role"),
	CONSTRAINT fk_permission FOREIGN KEY ("permission") REFERENCES permissions("permission"),
	PRIMARY KEY("role","permission")
);
