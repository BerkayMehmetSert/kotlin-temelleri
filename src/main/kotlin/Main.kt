fun main(args: Array<String>) {

    println("------Variables(Değişkenler)------")
    var a = 10
    var b = 20
    println(a + b)

    a = 15
    b = 20
    println(a + b)

    println("------Constants(Sabitler)------")
    val x = 10
    val y = 20
    println(x + y)

    // x = 15 // Error
    // y = 20 // Error

    println("------Integer(Tam sayı)------")
    var byteDataType: Byte = 127
    var shortDataType: Short = 32767
    var integerDataType: Int = 2147483647
    var longDataType: Long = 9223372036854775807

    println("Byte: $byteDataType")
    println("Short: $shortDataType")
    println("Integer: $integerDataType")
    println("Long: $longDataType")

    println("------Float(Ondalık sayı)------")
    var floatDataType: Float = 3.14F
    var doubleDataType: Double = 3.14

    println("Float: $floatDataType")
    println("Double: $doubleDataType")

    println("------String(Metinsel)------")
    var hello: String = "Hello"
    var world: String = "World"

    println(hello + " " + world)

    println("------VeriDönüşümleri(Type Conversion)------")
    var number1: Int = 10
    var number2: Int = 20

    var result: Double = number1.toDouble() + number2.toDouble()
    println(result)

    println("------Arrays(Diziler)------")
    var array = arrayOf(1, "Hello", 3.14, true)
    println(array[0])

    var numberArray = intArrayOf(1, 2, 3, 4, 5)
    println(numberArray[0])

    var stringArray = arrayOf("Hello", "World")
    println(stringArray[0])

    var booleanArray = booleanArrayOf(true, false)
    println(booleanArray[0])

    var doubleArray = doubleArrayOf(1.0, 2.0, 3.0)
    println(doubleArray[0])

    println("------Lists(Listeler)------")
    var arrayList = ArrayList<String>()
    arrayList.add("Hello")
    arrayList.add("World")
    println(arrayList[0] + " " + arrayList[1])

    var arrayList2 = arrayListOf<String>("Hello", "World")
    println(arrayList2[0] + " " + arrayList2[1])

    var arrayList3 = arrayListOf<Any>()
    arrayList3.add("Hello")
    arrayList3.add(1)
    arrayList3.add(3.14)
    arrayList3.add(true)

    println(arrayList3[0])
    println(arrayList3[1])
    println(arrayList3[2])
    println(arrayList3[3])

    println("------Sets(Kümeler)------")
    var hashSet = HashSet<String>()
    hashSet.add("Hello")
    hashSet.add("World")
    hashSet.add("Hello")

    println(hashSet.size)

    var hashSet2 = hashSetOf<String>("Hello", "World", "Hello")
    println(hashSet2.size)

    println("------Maps(Sözlükler)------")
    var hashMap = HashMap<String, String>()
    hashMap.put("Hello", "Merhaba")
    hashMap.put("World", "Dünya")

    println(hashMap.get("Hello"))
    println(hashMap["World"])

    var hashMap2 = hashMapOf<String, String>("Hello" to "Merhaba", "World" to "Dünya")
    println(hashMap2.get("Hello"))
    println(hashMap2["World"])

    println("------If-Else(Koşullu İfadeler)------")
    var number3: Int = 10
    var number4: Int = 20

    if (number3 > number4) {
        println("Number3 is bigger than Number4")
    } else if (number3 < number4) {
        println("Number3 is smaller than Number4")
    } else {
        println("Number3 is equal to Number4")
    }

    println("------When(Koşullu İfadeler)------")
    var number5: Int = 5

    when (number5) {
        1 -> println("Number is 1")
        2 -> println("Number is 2")
        3 -> println("Number is 3")
        4 -> println("Number is 4")
        5 -> println("Number is 5")
        else -> println("Number is not between 1 and 5")
    }

    println("------For(Döngüler)------")
    var numberArray2 = intArrayOf(1, 2, 3, 4, 5)

    for (number in numberArray2) {
        println(number)
    }

    for (index in 0..numberArray2.size - 1) {
        println("Index: $index, Number: ${numberArray2[index]}")
    }

    numberArray2.forEach { number ->
        println(number)
    }
    println("------While(Döngüler)------")
    var number6: Int = 0

    while (number6 < 10) {
        println(number6)
        number6++
    }

    println("------fun(Fonksiyonlar)------")
    fun sum(number7: Int, number8: Int): Int {
        return number7 + number8
    }
    println(sum(10, 20))

    fun sum2(number9: Int, number10: Int) = number9 + number10
    println(sum2(10, 20))

    println("------Classes(Sınıflar)------")
    var person = Person()
    person.name = "John"
    person.age = 20
    println("Name: ${person.name}, Age: ${person.age}")

    println("------Constructors(Yapıcı Metotlar)------")
    var user = User("John", 20)
    println("Name: ${user.name}, Age: ${user.age}")

    println("------NullSafety(Null Güvenliği)------")
    var name: String? = null
    println(name?.length)

    var age: Int? = null
    println(age?.inc())
    println(age ?: 5)   // age is null, return 5

    println("------Inheritance(Miras)------")
    var student = Student("John", 20, 123)
    println(student.printInfo())

    var person2 = Person2("John", 20)
    println(person2.printInfo())

    println("------Abstract Classes(Soyut Sınıflar)------")
    var student2 = Student2("John", 20, 123)
    println(student2.printInfo())

    println("------Interfaces(Arayüzler)------")
    var student3 = Student3("John", 20, 123)
    println(student3.printInfo())

    println("------Data Classes(Data Sınıfları)------")
    var product = Product(1, "Laptop", 5000.0)
    println(product.toString())

    if (product.price.equals(5000.0)) {
        println("Price is 5000.0")
    } else {
        println("Price is not 5000.0")
    }
}
