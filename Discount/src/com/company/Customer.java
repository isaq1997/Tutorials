package com.company;

public class Customer {
    private String name;
    private boolean member=false;
    private String membertype;

    public Customer(String name, boolean member, String membertype) {
        this.name = name;
        this.member = member;
        this.membertype = membertype;
    }

    public String getName() {
        return name;
    }


    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", membertype='" + membertype + '\'' +
                '}';
    }
}
