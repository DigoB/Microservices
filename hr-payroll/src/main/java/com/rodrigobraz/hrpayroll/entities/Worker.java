package com.rodrigobraz.hrpayroll.entities;

import java.util.Objects;

public class Worker {

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
