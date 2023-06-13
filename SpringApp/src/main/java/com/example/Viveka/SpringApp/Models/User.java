    package com.example.Viveka.SpringApp.Models;


    import lombok.Data;
    import lombok.ToString;

    import javax.persistence.*;
    import javax.validation.constraints.Email;
    import javax.validation.constraints.NotBlank;
    import javax.validation.constraints.Size;
    @Data
    @ToString
    @Entity
    @Table( name = "users",
            uniqueConstraints = {
                    @UniqueConstraint(columnNames = "username"),
                    @UniqueConstraint(columnNames = "email")
            })
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Size(max = 20)
        private String username;

        @NotBlank
        @Size(max = 50)
        @Email
        private String email;

        @NotBlank
        @Size(max = 120)
        private String password;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "role_id")
        private Role role;
        


        public User() {
        }

        public User(String username, String email, String password) {
            this.username = username;
            this.email = email;
            this.password = password;

        }

        // getters and setters
    }

