CREATE TABLE cart_items { 
	id VARCHAR(36) PRIMARY KEY,
	cart_id VARCHAR(36) NOT NULL,
	product_id VARCHAR(36) NOT NULL,
	quantity INT NOT NULL DEFAULT 1,
	
	CONSTRAINT fk_cart_cart_item
	          FOREIGN KEY cart_id
	          REFERENCES cart(id,
	          
	CONSTRAINT fk_product_cart_item 
	          FOREIGN KEY product_id
	          REFERENCES product(id),
	          
	CONSTRAINT uq_cart_product
        UNIQUE (cart_id, product_id)
	
	
	
};


   