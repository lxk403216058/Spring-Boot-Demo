package com.example.security.common.service;

import com.example.security.common.pojo.PageInfo;
import com.example.security.common.pojo.Result;

import java.util.List;

public interface CommonService<V, E,T> {
    Result<PageInfo<V>> page(V entityVo);

    Result<List<V>> list(V entityVo);

    Result<V> get(T id);

    Result<V> save(V entityVo);

    Result<T> delete(T id);
}
