package com.example.demo.Owner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<OwnerModel, Integer> {} // для того, чтобы мы могли использовать
// методы JpaRepository без их имплементации
