package com.wtc.swissmade.swm.services.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public abstract class ServiceImpl<T, Long extends Serializable> implements EntityService<T, Long> {

    protected JpaRepository<T, Long> repository;

    public ServiceImpl(JpaRepository<T, Long> repository) {
        this.repository = repository;
    }


    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public void update(T entity) {
        repository.save(entity);
    }

    @Override
    public void remove(T entity) {
        repository.delete(entity);
    }

    @Override
    public void removeById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<T> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }


}