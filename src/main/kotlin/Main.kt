fun main() {
    println("Программа денежных переводов:")
    var procent = 0.75 // коммисия
    var sum = 1000 // сумма перевода
    var minimum = 35 // минимальная сумма перевода
    var resultCom = sum / 100 * procent
    var resultSum =sum - resultCom

    println("Вы хотите перевести $sum рублей")

    if (sum >= minimum) {
        println("Комиссия составит $resultCom рублей")
        println("Будет переведено с учетом комиссии $resultSum рублей")
    } else {
        println("Минимальная сумма для перевода 35 рублей")
    }
}


