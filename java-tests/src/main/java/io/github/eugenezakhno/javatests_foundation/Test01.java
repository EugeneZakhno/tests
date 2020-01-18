package io.github.eugenezakhno.javatests_foundation;

//https://photos.app.goo.gl/1rSe9bnxgKnm82GN6
public class Test01 {
    public static void main(String[] args) {
        int x = 1;
        Integer y = new Integer(x);
        int[] z = {x};

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
        static void func(int x, Integer y, int [] z){
            x++;
            y++;
            z[0]++;
        }

    /*    Так как передача параметров в  метод осуществляется по значению, то:
    - переменная х хранит то же самое число;
    - переменная у ссылается на тот же самый объект;
    - переменная 2 ссылается на тот же самый массив, что и внешние переменные.

    Изменение значения х не влияет на значение внешней переменной.
    Объекты типа Integer являются неизменяемыми (іmmutable),  поэтому после операции у++
    переменная у будет ссылаться на новый объект (с увеличенным значением), а исходный объект
    останется нетронутым.

    Ссылка на массив позволяет свободно изменять значения элементов массива.
    */
}
