package com.base.dao;

import com.base.dto.ContactDto;

import java.util.List;

/**
 * Created by noudisan on 2014/11/4.
 */
public interface ContactMapper {

    void save(ContactDto contactDto);

    List<ContactDto> list();

}
