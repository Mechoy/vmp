package com.mechoy.vmp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Documents {
    private String id;

    private String name;

    private String path;

    private Integer category_id;

    private String uploaded_by;

    private Long size;

    private String file_type;

    private Timestamp created_at;

    private Timestamp updated_at;

    private Integer status;
}
