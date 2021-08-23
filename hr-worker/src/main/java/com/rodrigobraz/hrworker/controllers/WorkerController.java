package com.rodrigobraz.hrworker.controllers;

import com.rodrigobraz.hrworker.entities.Worker;
import com.rodrigobraz.hrworker.repositories.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

    @Autowired
    private WorkerRepository repository;

    @Autowired
    private Environment env;

    @GetMapping
    public ResponseEntity<List<Worker>> listAll() {

        List<Worker> list = repository.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id) {

        logger.info("Searching for worker by id: " + id);
        logger.info("PORT = " + env.getProperty("local.server.port"));
        Worker worker = repository.findById(id).get();

        return ResponseEntity.ok(worker);
    }
}
