package com.jxd.hello.dao;

import com.jxd.hello.model.Emp;

import java.util.List;

public interface IEmpDao {
    List<Emp> selectAll();
}
