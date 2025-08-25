class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        super.bark();
        System.out.println("야옹");
    }
}
