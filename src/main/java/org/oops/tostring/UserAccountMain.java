package org.oops.tostring;

public class UserAccountMain {

    public static void main(String[] args) {
        UserAccount userAccount = new UserAccount("1", "John", 2000);

        System.out.println(userAccount);
        System.out.println(userAccount.toString());
    }
}
