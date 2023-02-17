//Вариант 1, практическая работа 9(b)
fun main() = try {
    var sam:Avtobaza=Avtobaza("С Екатеринбурга", "В Москву","Мерседес","3","5")

    sam.scan()
    if (sam.t==true) {
        sam.info()
    }
    sam.vvod()
    sam.scan()
    if (sam.t==true) {
        sam.info()
    }
}
catch (e:Exception)
{
    println("Найдена ошибка при вводе данных")
}