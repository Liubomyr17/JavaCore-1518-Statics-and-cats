package com.company;

/*

1518. Level 15 Lection 9. Statics and seals
1. In the Solution class, create a Cat class with a public name field of type String.
2. In a static block, create an object of type Cat and assign it to the variable cat (do not forget to initialize the name field).
3. In the Cat class, do not create constructors with parameters.
4. In the static block, display the name of the created cat on the screen.

Requirements:
1. The Cat class must be created inside the Solution class and be public and static.
2. The Cat class must have a public name field of type String.
3. The variable cat must be initialized in a static block.
4. In the static block, the name of the created cat should be displayed on the screen.
5. The Cat class must not contain constructors with parameters.


 */

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Barsik";
        System.out.println(cat.name);
    }

    public static class Cat {
        public String name;

    }

    public static void main(String[] args) {

    }
}