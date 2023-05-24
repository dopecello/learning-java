package access_control.package2;

import access_control.package1.Access1; // import the class from another package 

public class Access3 extends Access1 {
    public static void main(String[] args) { // main method
        Access3 a = new Access3();
        System.out.println(a.hours);
        System.out.println(a.minutes);
    }
}
