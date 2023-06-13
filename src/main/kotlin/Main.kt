fun main() {
    println("Программа перевода денег:")
    var procent = 0.75 // комиссия
    var sum = 10000000 // сумма которую надо перевести
    var minimum = 35 // минимальная сумма комисии
    var resultCom = sum / 100 * procent
    var resultSum =sum - resultCom
    var perevod = sum - minimum
    println("Вы хотите перевести $sum рублей ")

    if (((sum / 100) * procent) >= (minimum)) {
        println("Комиссия составит $resultCom рублей")
        println("Будет переведено с учетом комиссии $resultSum рублей")
    } else {
        println("Комиссия составит $minimum рублей")
        println("Сумма перевода составит $perevod")
    }
}

