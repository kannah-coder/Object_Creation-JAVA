# Object_Creation-JAVA

# ⚙️ Object Creation in Java — Theory

## 🧩 Overview
In Java, **objects** are instances of classes.  
They represent real-world entities and are used to **access variables and methods** defined in the class.

Objects are created using the **`new` keyword**, which allocates memory dynamically in the **heap area**.

---

## 🧠 Why We Need Objects
- To **access non-static methods** and variables.
- To **store and operate** on data inside a class.
- To achieve **object-oriented programming principles** like encapsulation and abstraction.

---

## 🔹 Syntax
- ClassName objectName = new ClassName();


- `Calc` → Class name  
- `c` → Reference variable  
- `new` → Allocates memory  
- `Calc()` → Constructor call  

---

## 🧩 Types of Object Creation in Java

| Type | Example | Description |
|------|----------|-------------|
| **1️⃣ Normal Object** | `Calc c1 = new Calc();` | Common and reusable object |
| **2️⃣ Anonymous Object** | `new Calc().add(10,20);` | Used only once without storing reference |
| **3️⃣ Reassigned Object** | `c2 = new Calc();` | Old reference is replaced; old object gets garbage collected |
| **4️⃣ Multiple References** | `Calc c4 = c3;` | Two references point to the same object |
| **5️⃣ Inline Creation** | `int result = new Calc().multiply(5,6);` | Object created and used in one line |
| **6️⃣ Array of Objects** | `Calc[] arr = new Calc[3];` | Store multiple objects together |
| **7️⃣ Object as Parameter** | `performOperation(new Calc());` | Pass object to methods for operations |

---

## 🧮 Key Notes

- Every time you use `new`, a **new memory space** is created for that object.
- Objects are stored in **heap memory**; references are stored in **stack memory**.
- Unreferenced objects are removed by **Garbage Collector** automatically.
- A **reference variable** can point to only one object at a time.
- You can **pass objects** to methods or **return** them from methods.

---

## 🧰 Memory Representation


- `Calc` → Class (Blueprint)
- `new Calc()` → Object created in heap
- `c1` → Reference stored in stack pointing to heap object

---

## 🧩 Real-Life Analogy
Think of a **class as a design** and an **object as a real product**.

Example:
- Class: `Car` → blueprint  
- Object: `Car myCar = new Car();` → actual car built using blueprint  

You can create multiple cars (objects) from the same class.

---

## 🧱 Garbage Collection
If an object no longer has any reference pointing to it, Java automatically removes it using the **Garbage Collector** to free up memory.


## I provided another file for object creation by accesing it to method (Student.java)
