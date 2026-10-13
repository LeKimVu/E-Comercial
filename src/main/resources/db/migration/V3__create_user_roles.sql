CREATE TABLE user_roles (
    user_id VARCHAR(36) NOT NULL,
    role_name VARCHAR(50) NOT NULL,

    PRIMARY KEY (user_id, role_name),

    CONSTRAINT fk_user_roles_user
        FOREIGN KEY (user_id)
        REFERENCES users(id),

    CONSTRAINT fk_user_roles_role
        FOREIGN KEY (role_name)
        REFERENCES roles(name)
);