package com.example.service;

import com.example.entity.Empleado;
import com.example.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;


    public Optional<Empleado> getUltimoEmpleadoPorRut(String rut) {
        List<Empleado> empleados = empleadoRepository.findByRut(rut);

        if (!empleados.isEmpty()) {
            // Obtener el último empleado basado en timeAdded
            Empleado ultimoEmpleado = empleados.stream()
                    .max(Comparator.comparing(Empleado::getTimeAdded))
                    .orElse(null);

            return Optional.ofNullable(ultimoEmpleado);
        }
        return Optional.empty();
    }
}
