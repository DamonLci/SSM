package org.project.action;

public class LoginAction {

    private String name;
    private String pwd;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }



    public void setPwd(String pwd) {
        this.pwd = pwd;
    }



    public String execute() {

        if("tiger".equals(name) && "123".equals(pwd)) {
            return "success";
        }else {
            return "fail";
        }

    }
}

