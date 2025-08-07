# 📘 Java Console-Based Student Management System

A simple **Student Management System** built using **Java** and connected to a **local MySQL database**. This project runs in the console and allows users to **Add, View, and Delete** student records.

---

## 💻 Features

- Add new student (Name, Age, Roll No, Department, Marks)
- View all students
- Delete student by Roll No
- Console menu-based interface

---

## ⚙️ Technologies Used

- Java (JDK 17+)
- IntelliJ IDEA (IDE)
- MySQL (via MySQL Workbench)
- JDBC Driver (Connector/J)

---

## 🔧 Setup Instructions

### 1️⃣ Install Tools

- Java JDK 17+
- IntelliJ IDEA
- MySQL Workbench
- MySQL Server (localhost)
- MySQL Connector/J `.jar` file

### 2️⃣ Create MySQL Database

Open MySQL Workbench and run:

```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  age INT,
  roll_no VARCHAR(50),
  department VARCHAR(100),
  marks DOUBLE
);
3️⃣ Set Up IntelliJ Project
Open IntelliJ → New Project → Java → Finish

Create a folder named lib

Download and place MySQL Connector/J .jar in lib

Download here

Right-click lib → "Add as Library"

Create a new Java class, e.g., Main.java

4️⃣ Connect Java to MySQL
Inside your Java file, use the following credentials:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/studentdb";
String user = "root";
String password = "Rohanraj001$"; // Your MySQL password
▶️ How to Run
Run the Main class

You'll see a menu:

markdown
Copy
Edit
1. Add Student
2. View Students
3. Delete Student
4. Exit
Follow the prompts in console

📌 Sample Interaction
text
Copy
Edit
===== Student Management System =====
1. Add Student
2. View Students
3. Delete Student
4. Exit
Enter your choice: 1

Enter Name: Alice
Enter Age: 20
Enter Roll No: CSE100
Enter Department: CSE
Enter Marks: 85.5

Student added successfully!
🧾 Project Structure
css
Copy
Edit
StudentManagementSystem/
│
├── lib/
│   └── mysql-connector-java-8.x.x.jar
│
├── Main.java
├── README.md
☁️ Push to GitHub (Optional)
Initialize Git

bash
Copy
Edit
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/your-username/student-mgmt-java.git
git push -u origin main
You can also use IntelliJ GUI:

Top menu: VCS > Enable Version Control

also change the username and password of your mySql mainly
