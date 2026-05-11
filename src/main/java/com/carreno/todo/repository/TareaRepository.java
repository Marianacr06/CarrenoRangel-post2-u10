package com.carreno.todo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carreno.todo.entity.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByCompletada(boolean completada);
}
