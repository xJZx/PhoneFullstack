package com.example.phonefullstack.repository;

import com.example.phonefullstack.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// <Phone, Integer> drugi argument bo primary key ma wartosc int

@Repository
public interface PhoneRepository extends JpaRepository<Phone, Integer> {

}
