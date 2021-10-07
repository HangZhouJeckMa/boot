package com.jxd.hello.service.impl;

import com.jxd.hello.dao.IEmpDao;
import com.jxd.hello.model.Emp;
import com.jxd.hello.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:WWW
 * @Date:2021/9/24 0024
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    private IEmpDao empDao;

    @Override
    public List<Emp> selectAll() {
        return empDao.selectAll();
    }
}
