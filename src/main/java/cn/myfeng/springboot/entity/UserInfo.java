package cn.myfeng.springboot.entity;

public class UserInfo {
    private String name;
    private String info;

    public UserInfo(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
