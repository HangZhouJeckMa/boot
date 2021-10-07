package com.jxd.hello.controller;

import com.jxd.hello.model.Emp;
import com.jxd.hello.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:WWW
 * @Date:2021/9/23 0023
 */
@Controller
public class HelloController {
    //将配置文件中的name值赋值给当前属性name
    @Value("${name}")
    private String name;

    //获得对象的属性值
    @Value("${student.name}")
    private String sname;
    @Value("${student.age}")
    private int sage;

    //获取配置文件中数组的属性值
    @Value("${emps[0].ename}")
    private String ename;

    @Autowired
    private IEmpService empService;

    @RequestMapping(value = "/hello" ,produces = "text/html;charset=utf-8")
    @ResponseBody
    public String hello(){
        return "Hello SpringBoot！!sdfsdfsfd" + name + sname + sage + ename ;
    }


    @RequestMapping(value = "/getEmp" )
    @ResponseBody
    public List<Emp> getEmp(){
        return empService.selectAll();
    }

    @RequestMapping(value = "/toBtl" )
    public String  toBtl(Model m){
        m.addAttribute("msg","hello  btl");
        return "hello.btl";
    }

    @RequestMapping(value = "/toTestBtl" )
    public String  toTestBtl(Model m){
        List<Emp> list = empService.selectAll();
        m.addAttribute("list",list);
        System.out.println(1);
        return "testBtl.html";
    }
}
