class Calc {
    int a;

    public void add(int n1, int n2) {
        System.out.println("ADD: " + (n1 + n2));
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }
}

public class object1 {
     public static void main(String[] args) {

        int num1 = 23;
        int num2 = 56;

        // 1️⃣ Normal object creation
        Calc c1 = new Calc();
        c1.add(num1, num2);

        // 2️⃣ Anonymous object (no variable name)
        new Calc().add(10, 20);
        // Note: You can call only once here; you can’t reuse it.

        // 3️⃣ Object reference reassignment
        Calc c2 = new Calc();
        c2 = new Calc(); // old object lost (garbage collected)
        c2.add(5, 15);

        // 4️⃣ Multiple references to same object
        Calc c3 = new Calc();
        Calc c4 = c3;  // both point to same object
        c3.add(7, 3);
        c4.add(100, 50);

        // 5️⃣ Object creation + method call + result usage
        int result = new Calc().multiply(6, 9);
        System.out.println("Multiply Result: " + result);

        // 6️⃣ Array of objects
        Calc[] arr = new Calc[2];
        arr[0] = new Calc();
        arr[1] = new Calc();
        arr[0].add(2, 8);
        arr[1].add(4, 9);

        // 7️⃣ Using reference passed to a method
        performOperation(new Calc());
    }

    static void performOperation(Calc obj) {
        obj.add(11, 22);
    }
    
}
