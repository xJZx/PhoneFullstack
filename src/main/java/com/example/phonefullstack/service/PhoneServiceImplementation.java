package com.example.phonefullstack.service;

import com.example.phonefullstack.model.Phone;
import com.example.phonefullstack.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImplementation implements PhoneService{

   @Autowired
   private PhoneRepository phoneRepository;

    @Override
    public Phone savePhone(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }
}
