package com.springmvc.service;

import com.springmvc.entity.Team;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/4/18 8:57
 * @Description:
 */
public interface TeamService {
    //增加
    void addExample(Team example);

    //删除
    int deleteByPrimary(int Primary);

    //修改
    int updateByExample(Team example);

    //查询
    List<Team> queryByExample(Team example);
}
