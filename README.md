# Kotlin

## Değişkenler (Variables)

Kotlin değişkenlerini `var` ve `val` anahtar kelimeleri ile tanımlarız.

`var` ile tanımlanan değişkenlerin değeri değiştirilebilirken, `val` ile tanımlanan değişkenlerin değeri değiştirilemez.

```kotlin
var a = 5
var b = 10

println(a) // 5
println(b) // 10

a = 15
println(a) // 15
```

## Sabitler (Constants)

Kotlin sabitlerini `val` anahtar kelimesi ile tanımlarız.

```kotlin
val a = 5
val b = 10

println(a) // 5
println(b) // 10

a = 15 // Hata: Val cannot be reassigned
b = 20 // Hata: Val cannot be reassigned
```

## Integer (Tam Sayılar)

Kotlin integer (tam sayı) veri tipleri `Byte`, `Short`, `Int`, `Long` ve `Long` türleridir.

```kotlin
val byteDataType: Byte = 127
val shortDataType: Short = 32767
val integerDataType: Int = 2147483647
val longDataType: Long = 9223372036854775807
```

## Float (Ondalıklı Sayılar)

Kotlin float (ondalıklı sayı) veri tipleri `Float` ve `Double` türleridir.

```kotlin
val floatDataType: Float = 3.14F
val doubleDataType: Double = 3.14
```

## String (Metin)

Kotlin string (metin) veri tipi `String` türüdür.

```kotlin
val hello: String = "Hello"
println(hello.length) // 5
println(hello[0]) // H
println(hello.toLowerCase()) // hello
println(hello.toUpperCase()) // HELLO
println(hello.substring(0, 3)) // Hel
println(hello.substring(3)) // lo
println(hello.replace("l", "L")) // HeLLo
println(hello.startsWith("H")) // true
println(hello.startsWith("h")) // false
println(hello.endsWith("o")) // true
println(hello.contains("l")) // true
println(hello.indexOf("l")) // 2
println(hello.lastIndexOf("l")) // 3
println(hello.isEmpty()) // false
println(hello.isBlank()) // false
println(hello.equals("Hello")) // true
```

## Boolean (Mantıksal)

Kotlin boolean (mantıksal) veri tipi `Boolean` türüdür.

```kotlin
val booleanDataType: Boolean = true
```

### Mantıksal Operatörler

Kotlin'da `&&` ve `||` operatörleri ile `and` ve `or` mantıksal operatörlerini kullanabiliriz.

```kotlin
val a = 5
val b = 10

println(a > 0 && b > 0) // true
println(a > 0 && b < 0) // false
println(a < 0 && b > 0) // false
println(a < 0 && b < 0) // false

println(a > 0 || b > 0) // true
println(a > 0 || b < 0) // true
println(a < 0 || b > 0) // true
println(a < 0 || b < 0) // false
```

### Karşılaştırma Operatörleri

Kotlin'da `==` ve `!=` operatörleri ile `equal` ve `not equal` karşılaştırma operatörlerini kullanabiliriz.

```kotlin
val a = 5
val b = 10

println(a == b) // false
println(a != b) // true

println(a > b) // false
println(a < b) // true
println(a >= b) // false
println(a <= b) // true

println(a.equals(b)) // false
```

## Veri Dönüşümleri (Type Conversion)

Kotlin'da veri dönüşümleri `toByte()`, `toShort()`, `toInt()`, `toLong()`, `toFloat()`, `toDouble()`, `toChar()`
ve `toString()` fonksiyonları ile yapılır.

```kotlin
val a = 5
val b = 10.5

println(a + b) // 15.5
println(a + b.toInt()) // 15
```

## Diziler (Arrays)

Kotlin'da diziler `arrayOf()` fonksiyonu ile oluşturulur.

```kotlin
val array = arrayOf(1, "Hello", 3.14, true)

println(array[0]) // 1

val numberArray = intArrayOf(1, 2, 3, 4, 5)
val booleanArray = booleanArrayOf(true, false, true, false, true)
val doubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
```

## Listeler (Lists)

Kotlin'da listeler `ArrayList` sınıfı ile oluşturulur.

```kotlin
val list = ArrayList<String>()
list.add("Hello")
list.add("World")

println(list[0] + " " + list[1]) // HelloWorld

val list2 = arrayListOf<Any>()
list2.add(1)
list2.add("Hello")
list2.add(3.14)
list2.add(true)

println(arrayList3[0])  // 1
println(arrayList3[1])  // Hello
println(arrayList3[2])  // 3.14
println(arrayList3[3])  // true
```

## Setler (Sets)

Kotlin'da setler `HashSet, setOf()` fonksiyonları ile oluşturulur. Listelerden farklı olarak setlerde aynı elemandan
birden fazla bulunamaz.

```kotlin
val hashSet = HashSet<String>()
hashSet.add("Hello")
hashSet.add("World")
hashSet.add("Hello")

println(set.size) // 2

val set2 = setOf("Hello", "World", "Hello")

println(set2.size) // 2
```

## Mapler (Maps)

Kotlin'da mapler `HashMap, hasMapOf` sınıfı ile oluşturulur. Maplerde anahtar ve değerler bulunur.

```kotlin
val map = HashMap<String, String>()
map.put("Hello", "Merhaba")
map.put("World", "Dünya")

println(map.get("Hello")) // Merhaba
println(map["World"]) // Dünya

val map2 = hashMapOf("Hello" to "Merhaba", "World" to "Dünya")

println(map2.get("Hello")) // Merhaba
println(map2["World"]) // Dünya
```

## Eğer Kontrolü (If Statement)

Kotlin'da eğer kontrolü `if` anahtar kelimesi ile yapılır.

```kotlin
val a = 5
val b = 10

if (a > b) {
    println("a is greater than b")
} else if (a < b) {
    println("a is less than b")
} else {
    println("a is equal to b")
}
```

## Seçim Kontrolü (When Statement)

Kotlin'da seçim kontrolü `when` anahtar kelimesi ile yapılır.

```kotlin
val a = 5

when (a) {
    1 -> println("a is 1")
    2 -> println("a is 2")
    3 -> println("a is 3")
    4 -> println("a is 4")
    5 -> println("a is 5")
    else -> println("a is not between 1 and 5")
}
```

## Döngüler (Loops)

Kotlin'da döngüler `for` ve `while` anahtar kelimeleri ile yapılır.

### For Döngüsü

```kotlin
val array = arrayOf(1, 2, 3, 4, 5)

for (i in array) {
    println(i)
}

for (index in 0..numberArray2.size - 1) {
    println("Index: $index, Number: ${numberArray2[index]}")
}

array.forEach { number ->
    println(number)
}
```

### While Döngüsü

```kotlin
var i = 0

while (i < 5) {
    println(i)
    i++
}
```

## Fonksiyonlar (Functions)

Kotlin'da fonksiyonlar `fun` anahtar kelimesi ile tanımlanır.

```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b    // tek satırda yazmak için

fun printHello() {
    println("Hello")
}

```

## Sınıflar (Classes)

Kotlin'da sınıflar `class` anahtar kelimesi ile tanımlanır.

```kotlin
class Person {
    var name: String = ""
    var age: Int = 0
}

val person = Person()
person.name = "John"
person.age = 25

println(person.name) // John
println(person.age) // 25
```

### Constructor (Yapıcı Fonksiyon)

Kotlin'da yapıcı fonksiyon `constructor` anahtar kelimesi ile tanımlanır.

```kotlin
class Person {
    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

val person = Person("John", 25)

println(person.name) // John
println(person.age) // 25


// Primary Constructor
class Person2(var name: String, var age: Int) {
    // ...
}

val person2 = Person2("John", 25)
println(person2.name) // John
println(person2.age) // 25
```

## Erişim Belirleyiciler (Access Modifiers)

Kotlin'da erişim belirleyiciler `public, private, protected, internal` anahtar kelimeleri ile tanımlanır.

**public**: Erişim belirleyici her yerden erişilebilir.

**private**: Erişim belirleyici sadece tanımlandığı sınıftan erişilebilir.

**protected**: Erişim belirleyici sadece tanımlandığı sınıftan ve alt sınıflardan erişilebilir.

**internal**: Erişim belirleyici sadece tanımlandığı modülde erişilebilir.

```kotlin
class Person {
    public var name: String = ""
    private var age: Int = 0
    protected var height: Int = 0
    internal var weight: Int = 0
}

val person = Person()
person.name = "John" // Ok
person.age = 25     // Error - sadece tanımlandığı sınıftan erişilebilir
person.height = 180 // Error - sadece tanımlandığı sınıftan ve alt sınıflardan erişilebilir
person.weight = 75 // Ok
```

## Null Safety (Null Güvenliği)

Kotlin'da null güvenliği `?` ve `!!` operatörleri ile sağlanır. `?` operatörü null değerlerine izin verirken `!!`
operatörü null değerlerine izin vermez.

```kotlin
var name: String? = null
println(name?.length) // null

var name2: String? = "John"
println(name2?.length) // 4

```

### Elvis Operatörü (Elvis Operator)

Sonuç null ise belirtilen değeri döndürür. Null değilse sonucu döndürür.

```kotlin
var age: Int? = null

println(age ?: 5) // 5
```

### Non-null Assert Operatörü (Non-null Assert Operator)

Sonuç null ise hata verir. Null değilse sonucu döndürür.

```kotlin
var name: String? = null

println(name!!.length) // Error - null değerine izin vermez
```

## Encapsulation (Kapsülleme)

Kotlin'da kapsülleme `private` ve ` public` er işim belirleyicileri ile sağlanır.

```kotlin
class Person(var name: String, var age: Int) {
    private var height: Int = 0
    private var weight: Int = 0

    fun getHeight(): Int {
        return height
    }

    fun setHeight(height: Int) {
        this.height = height
    }

    fun getWeight(): Int {
        return weight
    }

    fun setWeight(weight: Int) {
        this.weight = weight
    }
}

val person = Person("John", 25)
person.setHeight(180)
person.setWeight(75)

println(person.getHeight()) // 180
```

## Inheritance (Kalıtım)

Kotlin'da kalıtım `open` ve `override` anahtar kelimeleri ile sağlanır.

```kotlin
open class Person(var name: String, var age: Int) {
    open fun printInfo() {
        println("Name: $name, Age: $age")
    }
}

class Student(name: String, age: Int, var studentNo: Int) : Person(name, age) {
    override fun printInfo() {
        println("Name: $name, Age: $age, Student No: $studentNo")
    }
}

val person = Person("John", 25)
person.printInfo() // Name: John, Age: 25

val student = Student("John", 25, 123)
student.printInfo() // Name: John, Age: 25, Student No: 123
```

## Polymorphism (Çok Biçimlilik)

Kotlin'da çok biçimlilik `override` anahtar kelimesi ile sağlanır.

```kotlin
open class Person(var name: String, var age: Int) {
    open fun printInfo() {
        println("Name: $name, Age: $age")
    }
}

class Student(name: String, age: Int, var studentNo: Int) : Person(name, age) {
    override fun printInfo() {
        println("Name: $name, Age: $age, Student No: $studentNo")
    }
}

val person = Person("John", 25)
person.printInfo() // Name: John, Age: 25

val student = Student("John", 25, 123)
student.printInfo() // Name: John, Age: 25, Student No: 123
```

## Abstract Class (Soyut Sınıf)

Kotlin'da soyut sınıf `abstract` anahtar kelimesi ile tanımlanır.

```kotlin
abstract class Person() {
    abstract fun printInfo()
}

class Student(name: String, age: Int, var studentNo: Int) : Person {
    override fun printInfo() {
        println("Name: $name, Age: $age, Student No: $studentNo")
    }
}

val person = Person() // Error - soyut sınıflar nesne olarak tanımlanamaz

val student = Student("John", 25, 123)
student.printInfo() // Name: John, Age: 25, Student No: 123
```

## Interface (Arayüz)

Kotlin'da arayüz `interface` anahtar kelimesi ile tanımlanır.

```kotlin
interface Person {
    fun printInfo()
}

class Student(var name: String, var age: Int, var studentNo: Int) : Person {
    override fun printInfo() {
        println("Name: $name, Age: $age, Student No: $studentNo")
    }
}

val person = Person() // Error - arayüzler nesne olarak tanımlanamaz

val student = Student("John", 25, 123)
student.printInfo() // Name: John, Age: 25, Student No: 123
```

## Data Class (Veri Sınıfı)

Kotlin'da veri sınıfı `data` anahtar kelimesi ile tanımlanır. Veri
sınıfları `toString()`, `equals()`, `hashCode()`, `copy()` ve `componentN()` fonksiyonlarını otomatik olarak üretir.

```kotlin
data class Person(var name: String, var age: Int)

val person = Person("John", 25)

println(person.toString()) // Person(name=John, age=25)
println(person.equals(Person("John", 25))) // true
```

## Enum (Sıralı Değerler)

Kotlin'da sıralı değerler `enum class` anahtar kelimesi ile tanımlanır.

```kotlin
enum class Color {
    RED, GREEN, BLUE
}

val color = Color.RED

println(color) // RED
```
