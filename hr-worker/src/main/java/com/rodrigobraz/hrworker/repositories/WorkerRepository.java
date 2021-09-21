package com.rodrigobraz.hrworker.repositories;

import com.rodrigobraz.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
