package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.Person;
import com.techelper.tropsmart_backend.resources.comunications.PersonResponse;

public interface IPersonService extends ICrudService<Person> {
    PersonResponse findPeopleById(int id);
    PersonResponse findAllPersons();
}
