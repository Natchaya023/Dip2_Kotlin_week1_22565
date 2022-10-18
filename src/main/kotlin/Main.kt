fun main(){

    println("# UnSigned Intergral Type\n===============")
    val kByte:UByte = 255u
    val kShort:UShort = 65_535u

    println("# Signed Intergral Type\n===============")
    val kInt: Int = 2_147_483_647
    val kLong: Long = 9_223_372_036_854_775_807L
    println(kByte)
    println(kShort)
    println(kInt)
    println(kLong)

    println("# Boolean Type\n===============")
    val kBoolean1: Boolean = true
    println("Mark = $kBoolean1")

    println("# Floating Point Type\n===============")
    val kFloat: Float = 3.14F
    val kDouble: Double = 1.79
    println("kFloating = $kFloat")
    println("kDouble = $kDouble")

    println("# Any Type\n===============")
    val kAny1: Any = 20
    val kAny2: Any = 100.4
    val kAny3: Any = "Mark Zuckerberg"
    println("kAny1 = $kAny1")
    println("kAny2 = $kAny2")
    println("kAny3 = $kAny3")
//    val a = 10 ; val b = 5 ; val c = a+b
//    println(c)
//    println("Hello Kotlin")
//    println("สวัสดีชาวโลก")
//    println(5+5)
//    println("วันนี้" + "วันอังคาร")
//    println("เข้าสู่การเขียนโปรแกรม \n")
//    println("\tสำหรับผู้มาใหม่")
}