
package com.kctech.daytwo;

public class VarArgsMo {
    public static void main(String[] args) {
        VarArgsMo var = new VarArgsMo();
        var.sum(1,2);
        var.sum(1,2,3);
        var.sum(1,2,3,4);
    }
    public void sum(int... values) {
        int sum = 0;
        for(int i : values) {
            sum += i;
        }
        System.out.println("Sum of" + values.length + "number:" +sum);
    }
}
