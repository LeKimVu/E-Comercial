CREATE TABLE orders {
	id VARCHAR(36) PRIMARY KEY,
	user_id VARCHAR(50) NOT NULL,
	total_amount DECIMAL(10,2) not null,
	status VARCHAR(30) NOT NULL DEFAULT 'PENDING',
	created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
	
	CONSTRAINT fk_user_orders 
	       FOREIGN KEY user_id
	       REFERENCES user(id)
};
