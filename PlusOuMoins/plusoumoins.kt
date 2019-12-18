import java.util.Scanner

fun main(args: Array<String>) {
        val nb_secret: Int
        var nb_user: Int
        val clavier = Scanner(System.`in`)
        nb_secret = (Math.random() * 999).toInt() + 1
        do {
            print("Quel nombre :")
            nb_user = clavier.nextInt()
            if (nb_user == nb_secret) {
                println("Bingo ! Vous avez gagné !!! :D")
            } else if (nb_user > nb_secret) {
                println("C'est moins !")
            } else {
                println("C'est plus !")
            }
       } while (nb_user != nb_secret)
}