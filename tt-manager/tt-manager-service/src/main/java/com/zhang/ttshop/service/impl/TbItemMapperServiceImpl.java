package com.zhang.ttshop.service.impl;

import com.zhang.ttshop.dao.TbItemMapper;
import com.zhang.ttshop.pojo.po.TbItem;
import com.zhang.ttshop.service.TbItemMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/31/031.
 */

@Service

public class TbItemMapperServiceImpl implements TbItemMapperService{

    @Autowired
    private TbItemMapper  dao;

    @Override
    public TbItem selectByPrimaryKey(Long id) {


        System.out.println("id");
        System.out.println(dao.selectByPrimaryKey(id));
        return dao.selectByPrimaryKey(id);
    }
}
