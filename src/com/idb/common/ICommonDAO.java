
package com.idb.common;

import java.util.List;

public interface ICommonDAO<T> {
    public int save(T t);
    public int update(T t);
    public int delete(int id);
    public List<T> getAll();
}
