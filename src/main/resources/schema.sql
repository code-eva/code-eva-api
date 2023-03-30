CREATE TABLE IF NOT EXISTS user_account(
	user_id uuid PRIMARY KEY,
	first_name varchar(255) NOT NULL,
	last_name varchar(255) NOT NULL,
	email varchar(255) NOT NULL,
	username varchar(255) NOT NULL,
	"password" varchar(255) NOT NULL,
	is_enabled boolean NOT NULL,
	"role" varchar(255) NULL,
	CONSTRAINT uk_username UNIQUE (username),
	CONSTRAINT fk_user_account_email FOREIGN KEY (email) REFERENCES email(email),
	CONSTRAINT fk_user_account_role FOREIGN KEY ("role") REFERENCES user_role("role")
);

CREATE TABLE IF NOT EXISTS email(
	email varchar(255) PRIMARY KEY,
	verified boolean NOT NULL
);

CREATE TABLE IF NOT EXISTS user_role(
	"role" varchar(255) PRIMARY KEY NOT NULL,
	descirption varchar(255) NULL,
	"permission" varchar(255) NOT NULL,
	CONSTRAINT fk_user_account_permission FOREIGN KEY ("permission") REFERENCES permissions("permission")
);

CREATE TABLE IF NOT EXISTS permissions(
	"permission" varchar(255) NOT NULL,
	description varchar(255) NULL,
	CONSTRAINT uk_permission UNIQUE ("permission")
);