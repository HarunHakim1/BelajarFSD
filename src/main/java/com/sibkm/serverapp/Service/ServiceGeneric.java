package com.sibkm.serverapp.Service;

import java.util.List;

public interface ServiceGeneric<T, ID> {
    public T create(T t);

    public void delete(ID id);

    public List<T> getAll();

    public T update(T t);
}