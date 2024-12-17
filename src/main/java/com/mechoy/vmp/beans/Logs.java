package com.mechoy.vmp.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Logs {
    private Long id;
    private String userId;
    private String operationType;
    private String message;
    private Timestamp createdAt;
}
