package org.home.Enum;

public enum WeekEnum {
    MON("星期1"), TUS("星期2"), WES("星期3"), THUR("星期4"), FRI("星期5"), SATU("星期6"), SUN("星期7");
    public String name;

    WeekEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        WeekEnum week = WeekEnum.FRI;
        System.out.println(week);
        week.setName("张三");
        System.out.println(week.getName());
        WeekEnum week1 = WeekEnum.valueOf(WeekEnum.class, "MON");
        System.out.println(week1);
        week1.setName("王四");
        for (WeekEnum weeks : WeekEnum.values()) {
            System.out.println("emmm" + weeks);
        }
        System.out.println(week1.getName());
        //比较位置
        System.out.println(week1.compareTo(week));
        //返回位置
        System.out.println(week1.ordinal());
        //返回哈希吗
        System.out.println(week1.hashCode());
        //返回这个枚举形的class对象
        System.out.println(week1.getDeclaringClass());
        System.out.println();
    }
}
