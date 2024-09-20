package com.example.controller;

import com.example.entity.Empleado;
import com.example.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/empleado")
    public Optional<Empleado> getUltimoEmpleadoPorRut(@RequestParam String rut) {
        return empleadoService.getUltimoEmpleadoPorRut(rut);
    }
}
