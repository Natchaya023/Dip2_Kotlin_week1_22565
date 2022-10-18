fun kDataType1(){
    println("# UnSigned Integral Type\n===============")
    val kByte:UByte = 255u
    val kShort:UShort = 65_535u
    println("kByte = $kByte")
    println("kShort = $kShort")
}

fun kDataType2(){
    println("# Signed Integral Type\n===============")
    val kInt: Int = 2_147_483_647
    val kLong: Long = 9_223_372_036_854_775_807L
    println(kInt)
    println(kLong)
}

fun kDataType3(){
    println("# Boolean Type\n===============")
    val kBoolean1: Boolean = true
    println("Mark = $kBoolean1")
}

fun kDataType4(){
    println("# Floating point Type\n===============")
    val kFloat: Float = 3.14F
    val kDouble: Double = 1.79
    println("KFloating = $kFloat")
    println("kDouble = $kDouble")
}