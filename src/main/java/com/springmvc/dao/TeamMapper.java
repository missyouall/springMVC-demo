package com.springmvc.dao;

import com.springmvc.entity.Team;

import java.util.List;

public interface TeamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);

    List<Team> queryByExample(Team record);
}