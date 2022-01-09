package com.xtl.base;

/**
 * @author 31925
 * Java类、对象，继承、多态
 */
public class JavaClass {
    public static void main(String[] args) {
        Dog dog=new Dog("黄色",'雄',3);
        System.out.println("小狗的信息：颜色是"+dog.getColor()+"\t性别是"+dog.getSex()+"\t年龄是"+dog.getAge());
        bark(dog);
        Animal cat=new Cat("白色",'雌');
        System.out.println("小猫的信息：颜色是"+cat.color+"\t性别是"+cat.sex);
        bark(cat);
        System.out.println(sum(520,1314));
        System.out.println(sum(3.14,0.618));
    }

    private static void bark(Animal animal){
        if(animal instanceof Dog){
            Dog dog=(Dog)animal;
            dog.bark();
        }else if(animal instanceof Cat){
            Cat cat=(Cat)animal;
            cat.bark();
        }
    }

    private static int sum(int a,int b){
        return a+b;
    }

    private static double sum (double a,double b){
        return a+b;
    }
}

class Animal{
    String color;
    Character sex;

    public Animal(String color, Character sex) {
        this.color = color;
        this.sex = sex;
    }

    public void bark(){
        System.out.println("这是普通的动物叫声");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }
}


class Dog extends Animal{
    public Integer age;

    public Dog(String color, Character sex, Integer age) {
        super(color,sex);
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void bark() {
        System.out.println("这是狗狗的叫声");
    }
}

class Cat extends Animal{
    public Cat(String color,Character sex) {
        super(color,sex);
    }

    @Override
    public void bark() {
        System.out.println("这是猫咪的叫声");
    }
}