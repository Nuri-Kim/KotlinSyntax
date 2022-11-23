package ex20221122

    fun todayWeather(){
        println("오늘 광주 날씨는 맑음")
    }

// ::함수이름 -> 함수를 호출해서 변수에 대입이 가능
// ::(reflection) -> KClass -> JavaClass로 바꾸는 기능
    var weather = ::todayWeather

    fun main() {
        // 함수를 참조하여 변수처럼 사용하기
        // 변수명 뒤에 .call() 붙여줘야 함
//        weather.call() 1.1 에서 사용하던 것
        weather()


    }



