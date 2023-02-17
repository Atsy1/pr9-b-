class Avtobaza(var reysotkuda: String, var reyskuda: String, var mark: String, var otmetkareys: Int,var otmetkasostoyania:Int) {
    var t: Boolean = true
    fun info() {
        println(
            "откуда будет рейс:: $reysotkuda\nКуда будет рейс: $reyskuda\nКакая марка автомобиля: $mark\nОтметка рейса от 1 до 5: $otmetkareys\n" +
                    "Отметка состояния автомобиля от 1 до 5: $otmetkasostoyania"
        )
    }

    fun vvod() {
        print("Откуда будет рейс? ")
        reysotkuda = readLine()!!.toString()
        print("Куда будет рейс? ")
        reyskuda = readLine()!!.toString()
        print("Какая марка автомобиля? ")
        mark = readLine()!!.toString()
        print("Отметка рейса от 1 до 5 ")
        otmetkareys = readLine()!!.toInt()
        print("Отметка состояния автомобиля от 1 до 5 ")
        otmetkasostoyania = readLine()!!.toInt()

    }

    fun scan() {
        t = true
        if (reysotkuda >= "a" && reysotkuda <= "z"  reysotkuda >= "A" && reysotkuda <= "Z" || reysotkuda >= "А" && reysotkuda <= "Я")
        if (reyskuda >= "a" && reyskuda <= "z"  reyskuda >= "A" && reyskuda <= "Z" || reyskuda >= "А" && reyskuda <= "Я")
        if (mark >= "a" && mark <= "z"  mark >= "A" && mark <= "Z" || mark >= "А" && mark <= "Я")
        if (otmetkareys >= 1 || otmetkareys <=5)
            if (otmetkasostoyania >= 1 || otmetkasostoyania <=5){

            }
    }
}

