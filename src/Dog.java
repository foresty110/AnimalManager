class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        super.bark();
        System.out.println("멍멍");
    }
}
