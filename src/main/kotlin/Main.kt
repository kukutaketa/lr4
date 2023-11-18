import kotlin.random.Random
fun main() {
    do {

        val choices = arrayOf("камень", "ножницы", "бумага")//массив строк с тремя элементами
        val computerChoice = choices[Random.nextInt(choices.size)]

        println("Сделайте свой выбор: 1 - камень, 2 - ножницы, 3 - бумага")
        val playerChoice = when (readLine()) {
            "1" -> "камень"
            "2" -> "ножницы"
            "3" -> "бумага"
            else -> {
                println("Неверный ввод. Попробуйте еще раз.")
                return
            }
        }
        println("Выбор компьютера: $computerChoice")
        println("Ваш выбор: $playerChoice")

        when {
            computerChoice == playerChoice -> println("Ничья, игра переигрывается")
            computerChoice == "камень" && playerChoice == "ножницы" -> println("Победил компьютер")
            computerChoice == "ножницы" && playerChoice == "бумага" -> println("Победил компьютер")
            computerChoice == "бумага" && playerChoice == "камень" -> println("Победил компьютер")
            else -> println("Вы победили!")
        }

        println("Хотите сыграть еще раз? 1-да, любое другое число - нет")
    } while (readLine() == "1")

}