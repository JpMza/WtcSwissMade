package com.wtc.swissmade.swm.services.Impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface EntityService<T, Long extends Serializable> {

    T create(final T entity);

    void remove(final T entity);

    void update(final T entity);

    void removeById(final Long id);

    Optional<T> findById(final Long id);

    List<T> findAll();

}
