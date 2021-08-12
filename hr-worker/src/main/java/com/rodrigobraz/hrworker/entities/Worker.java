package com.rodrigobraz.hrworker.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_worker")
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double dailyIncome;

    public Worker() {
    }

    public Worker(String name, Double dailyIncome) {
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return getId().equals(worker.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
