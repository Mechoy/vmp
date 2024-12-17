package com.mechoy.vmp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categories {
    private Integer id;

    private String name;

    private String description;

    private Timestamp created_at;

}
