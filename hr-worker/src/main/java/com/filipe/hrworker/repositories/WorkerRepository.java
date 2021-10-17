package com.filipe.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.filipe.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
