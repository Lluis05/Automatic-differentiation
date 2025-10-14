# 🧮 Automatic Differentiation in Java

A **Java-based Automatic Differentiation (AD)** project implementing both **scalar** and **vectorial** computation of exact derivatives using **dual numbers** and the **chain rule**.

---

## 🚀 Features

- **Scalar & Vectorial AD:** Supports `f: ℝ → ℝ` and `f: ℝⁿ → ℝ`  
- **Dual Numbers:** Encodes value and derivative(s) in one structure  
- **Operator Overloading:** Implements `+`, `−`, `×`, `/`, `sin`, `cos`, `power`, etc.  
- **Gradient Descent:** Finds local minima/maxima in 1D and 2D functions  
- **UML Design:** Class diagrams provided in `.puml` format for both versions  

---

## 🧩 Core Classes

| Class | Description |
|-------|--------------|
| **`DualNumber`** | Stores function value and derivative(s) |
| **`Function`** | Interface for all differentiable functions |
| **`Add`, `Multiply`, `Power`, `Sin`, `Cos`, `Square`** | Arithmetic and trigonometric operations |
| **`X` / `Subscript`** | Represents variable(s) for scalar / vectorial cases |
| **`Constant`** | Constant numeric value |

---

## 🧠 Examples

```java
// Scalar AD
Function x = new X();
Function f = new Sin(new Add(new Constant(Math.PI/2), new Square(x)));
System.out.println(f.evaluate(new DualNumber(4.0, 1.0)).uPrime); // derivative

// Vectorial AD (gradient descent)
Function x1 = new Subscript(1, 2);
Function x2 = new Subscript(2, 2);
Function f2 = new Add(new Multiply(x1, x1), new Multiply(new Constant(0.5, 2), new Multiply(x2, x2)));
