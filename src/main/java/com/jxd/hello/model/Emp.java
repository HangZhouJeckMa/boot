package com.jxd.hello.model;

/**
 * @Author:WWW
 * @Date:2021/9/24 0024
 */
public class Emp {
    private String ename;
    private int empno;
    private String job;

    public Emp(String ename, int empno, String job) {
        this.ename = ename;
        this.empno = empno;
        this.job = job;
    }

    public Emp() {
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
