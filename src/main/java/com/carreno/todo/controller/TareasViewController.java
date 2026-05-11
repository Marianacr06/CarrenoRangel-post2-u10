package com.carreno.todo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TareasViewController {

    @GetMapping(value = "/tareas", produces = MediaType.TEXT_HTML_VALUE)
    public String tareas() {
        return """
            <!doctype html>
            <html lang=\"es\">
              <head>
                <meta charset=\"utf-8\" />
                <title>Tareas</title>
              </head>
              <body>
                <h1>Lista de tareas</h1>
                <button id=\"btn-nueva\">Nueva</button>
                <ul>
                  <li class=\"tarea-item\">Demo</li>
                </ul>
              </body>
            </html>
            """;
    }
}
