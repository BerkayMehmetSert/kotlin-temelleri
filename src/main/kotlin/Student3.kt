class Student3(name: String, age: Int, var studentNumber: Int) : StudentInterface, Person2(name, age) {

    override fun printInfo() {
        println("Name: $name, Age: $age, Student Number: $studentNumber")
    }
}