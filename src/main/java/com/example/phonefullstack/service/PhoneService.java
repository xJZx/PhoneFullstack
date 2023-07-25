package com.example.phonefullstack.service;

import com.example.phonefullstack.model.Phone;

import java.util.List;

public interface PhoneService {
    public Phone savePhone(Phone phone);

    public List<Phone> getAllPhones();
}
