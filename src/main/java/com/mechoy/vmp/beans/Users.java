package com.mechoy.vmp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    private String id;

    private String username;

    private String password;

    private String role;

    private Integer status;

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
