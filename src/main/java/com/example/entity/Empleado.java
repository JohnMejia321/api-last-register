package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@AllArgsConstructor
@Table("tabla_prueba")
public class Empleado {

    @PrimaryKey
    @CassandraType(type = CassandraType.Name.TEXT)
    private String id;

    @CassandraType(type = CassandraType.Name.UUID)
    private UUID timeAdded;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String rut;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String nombreEmpleado;


}
