package ex20221122

fun main() {

    // Java
    // for( int i = 0; i<3; i++){
    //       println(i)
    // }

    // Kotlin
    // for( i in 0..2 ) {
    //       println(i)
    // }

    // 1 ~ 10까지 for 문을 사용하여 출력
    for(i in 1..10) print("$i ")

    println()

    // 1,3,5,7,9 를 for 문을 사용하여 출력
    for(i in 1..9 step 2) print("$i ")

    // --------------------------------------
    println()
    // 10 ~ 1 까지 for 문을 사용하여 출력
    for(i in 10 downTo 1 ) print("$i ")

    println()
    // 10,8,6,4,2 를 for 문을 사용하여 출력
    for(i in 10 downTo 2 step 2) print("$i ")

}