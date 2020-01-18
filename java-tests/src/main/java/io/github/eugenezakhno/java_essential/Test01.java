package io.github.eugenezakhno.java_essential;

//https://photos.app.goo.gl/1rSe9bnxgKnm82GN6
public class Test01 {
    public static void main(String[] args) {
        int x = 1;
        Integer y = new Integer(x);
        int[] z = {x};
        func(x, y, z);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
        static void func(int x, Integer y, int [] z){
            x++;
            y++;
            z[0]++;
        }
}
