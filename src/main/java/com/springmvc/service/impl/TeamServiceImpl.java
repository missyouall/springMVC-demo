package com.springmvc.service.impl;

import com.springmvc.dao.TeamMapper;
import com.springmvc.entity.Team;
import com.springmvc.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/4/18 8:58
 * @Description:
 */
@Service("teamService")
public class TeamServiceImpl implements TeamService {
    @Resource
    TeamMapper mapper;
    @Override
    public void addExample(Team example) {
        mapper.insert(example);
    }

    @Override
    public int deleteByPrimary(int Primary) {
        return  mapper.deleteByPrimaryKey(Primary);
    }

    @Override
    public int updateByExample(Team example) {
        return mapper.updateByPrimaryKey(example);
    }

    @Override
    public List<Team> queryByExample(Team example) {
        return mapper.queryByExample(example);
    }
}
