package com.atvI;

 class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

     public Dog() {
         super();
     }

     @Override
     public void makesound(){
        super.makesound();
        System.out.println("O cachoro late! ");
    }
}
