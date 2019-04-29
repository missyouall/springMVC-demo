package com.springmvc.service;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/4/22 17:50
 * @Description:
 */
public interface BaseService<T>{
    /**
     * 新增
     */
    public T add(T obj);

    /**
     * 修改
     */
    public void update(T obj);

    /**
     *查看
     */
    public T get(Integer id);

    /**
     * 批量删除
     */
    public int delete(Integer[] id_array);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询总数量
     */
    public int findCount(T obj);

    /**
     * 查询所有
     */
    List<T> getList(T obj);

}
