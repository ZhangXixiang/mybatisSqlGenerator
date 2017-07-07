package com.boomhope.dao;

import com.boomhope.po.MacMachine;

public interface MacMachineMapper {
    int deleteByPrimaryKey(String macId);

    int insert(MacMachine record);

    int insertSelective(MacMachine record);

    MacMachine selectByPrimaryKey(String macId);

    int updateByPrimaryKeySelective(MacMachine record);

    int updateByPrimaryKey(MacMachine record);
}