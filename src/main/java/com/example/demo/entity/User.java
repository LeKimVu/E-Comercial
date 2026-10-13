package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.JoinColumn;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
    private String id;

	@Column(nullable = false, unique = true, length = 100)
	    private String username;

	 @Column(nullable = false, unique = true, length = 100)
	    private String email;

	 @Column(name = "first_name", nullable = false, length = 50)
	    private String firstName;

	 @Column(name = "last_name", nullable = false, length = 50)
	    private String lastName;

	 @Column(nullable = false, length = 15)
	    private String phone;
	 
    private String address;

    private LocalDate dob;

    private boolean active;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;
    

    @PrePersist
        protected void onCreate() {
     LocalDateTime now = LocalDateTime.now();
     createdAt = now;
     updatedAt = now;
}


    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
    

     @PreUpdate
     protected void onUpdate() {
   updatedAt = LocalDateTime.now();
}

    @ManyToMany
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_name")
    )
    private Set<Roles> roles;
}