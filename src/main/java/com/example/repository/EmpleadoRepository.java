package com.example.repository;

import com.example.entity.Empleado;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  EmpleadoRepository extends CassandraRepository<Empleado, String> {

    @Query("SELECT * FROM tabla_prueba WHERE rut = ?0 ORDER BY timeAdded DESC LIMIT 1 ALLOW FILTERING")
    List<Empleado> findLastByRut(String rut);

    @Query("SELECT * FROM tabla_prueba WHERE rut = ?0 ALLOW FILTERING")
    List<Empleado> findByRut(String rut);
}
