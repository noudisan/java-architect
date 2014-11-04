package com.ztt.service;

import com.ztt.dao.ContactMapper;
import com.ztt.dto.ContactDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by noudisan on 2014/11/4.
 */
@Service
public class ContactService {
    @Autowired
    private ContactMapper contactMapper;

    public void save(ContactDto contactDto) {
        contactMapper.save(contactDto);
    }
}
