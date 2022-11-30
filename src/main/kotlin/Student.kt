class Student(name: String, age: Int, var studentNumber:Int) :Person2(name, age) {
    override fun printInfo() {
        println("Name: $name, Age: $age, Student Number: $studentNumber")
    }
}