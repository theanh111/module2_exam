package service;

import model.PhoneBook;

import java.util.List;

public interface IService<T> {

    List<T> viewAll();

    void add(T object);

    void update(int numberPhone, T newObject);

    void delete(int numberPhone);

    List<T> findByName(String name);

}
