package com.example.Authentication.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import static jakarta.persistence.GenerationType.AUTO;


@AllArgsConstructor
@NoArgsConstructor
@Data


public class Role {

    private Long id;

    private String name;

}
