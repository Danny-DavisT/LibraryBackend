package com.example.demo.webdomain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    public Long id;
    public String name;
    public Long idNum;
    public String address;
    public Long phone;
    public String email;
    public String sex;
    public String plan;
}
