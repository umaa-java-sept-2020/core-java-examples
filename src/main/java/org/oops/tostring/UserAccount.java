package org.oops.tostring;

public class UserAccount {

    // 1, John, 2000
    private String id;
    private String name;
    private int balance;

    public UserAccount(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        System.out.println(this);
        System.out.println("tostring with this: "+this);
    }

    @Override
    public String toString() {
//        return "UserAccount{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", balance=" + balance +
//                '}';
        String result = id + ", "+ name+", "+balance;
        return result;
    }
}
