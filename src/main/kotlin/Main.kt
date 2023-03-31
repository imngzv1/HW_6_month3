fun main(args: Array<String>) {
    val words = "переменная функция метод аргумент параметр привязка длина высота размер"
    words(words)

    val wordstwo = "java kotlin python javascript nodejs go react react native swift"
    twowords(wordstwo)

    val numbers: Array<Int> =
        arrayOf(9, 9, 9, 1, 8, 2, 1, 9, 2, 3, 2, 8, 3, 2, 2, 2, 1, 1, 2, 0, 0, 0, 9, 0, 0, 3, 0, 0, 3, 3, 1, 2, 3, 3)
    arrayNumbers(numbers)

    val chetAndNechetNum: Array<Int> =
        arrayOf(1, 0, 0, 0, 2, 2, 9, 3, 1, 2, 3, 4, 3, 5, 2, 9, 6, 3, 5, 4, 8, 1, 6, 9, 9, 2, 9, 8, 4, 8, 8, 4, 3, 8)
    chetAndNechet(chetAndNechetNum)

    val numbersss: Array<Int> =
        arrayOf(1, 2, 0, 0, 1, 2, 9, 3, 8, 4, 1, 2, 3, 8, 4, 9, 0, 9, 3, 4, 5, 3, 4, 2, 8, 9, 0, 0, 1, 0, 0, 2, 0, 0, 3)
    finalnumbers(numbersss)
}

fun words(words: String) {
    val glas = "а,у,о,ы,э,я,ю,ё,и,е"
    var soglas = ""
    var answer = ""
    for (i in words) {
        if (i in glas) {
            answer += i
        } else {
            soglas += i
        }
    }
    println("Гласные буквы :  $answer")

    println("Согласные буквы :  $soglas")
}

fun twowords(wordstwo: String) {
    val glas = "a,e,i,o,u,y"
    var soglas = ""
    var answer = ""
    for (i in wordstwo) {
        if (i in glas) {
            answer += i
        } else {
            soglas += i
        }
    }
    println("Гласные буквы :  $answer")

    println("Согласные буквы :  $soglas")

    val firstWord = "integer"
    val secondWord = "print"
    println("Первое слово $firstWord и второе слово $secondWord")
}

fun arrayNumbers(numbers: Array<Int>) {
    numbers.sort()
    for (i in numbers) {
        print(i)
    }
    println("")
}

fun chetAndNechet(chetAndNechetNum: Array<Int>) {
    var chet = ""
    var nechet = ""
    for (i in chetAndNechetNum) {
        if (i % 2 == 0) {
            chet += i
        } else {
            nechet += i
        }
    }
    println("Четные числа: $chet")

    println("Нечетные числа: $nechet")
}

fun finalnumbers(numbers: Array<Int>) {
    var chet = 0
    var nechet = 1
    for (i in numbers) {
        if (i % 2 == 0) {
            chet += i
        } else {
            nechet *= i
        }
    }
    println("Сумма: $chet")

    println("Произведение: $nechet")
}
