package com.boomhope.dao;

import com.boomhope.po.DeployUnit;

public interface DeployUnitMapper {
    int deleteByPrimaryKey(String unitCode);

    int insert(DeployUnit record);

    int insertSelective(DeployUnit record);

    DeployUnit selectByPrimaryKey(String unitCode);

    int updateByPrimaryKeySelective(DeployUnit record);

    int updateByPrimaryKey(DeployUnit record);
}