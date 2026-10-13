CREATE TABLE carts {
	id VARCHAR(36) PRIMARY KEY,
	user_id VARCHAR(50) NOT NULL,
	
	CONSTRAINT fk_user_cart 
	       FOREIGN KEY user_id 
	       REFERENCES user(id)
};