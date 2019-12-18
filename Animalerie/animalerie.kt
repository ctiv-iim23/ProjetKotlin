import java.util.*

fun main (args: Array<String>) {
    var Chats = Chats()
    var Chiens = Chiens()
    var Lapins = Lapins()
    var Poissons = Poissons()
    var Oiseaux = Oiseaux()

    print("Liste des animaux present dans l'animalerie :\n")
    Chats.nom()
    Chiens.nom()
    Lapins.nom()
    Poissons.nom()
    Oiseaux.nom()

    print("Liste des animaux qui parlent : \n")
    Chats.parler()
    Chiens.parler()
    Oiseaux.parler()
}

interface Animaux {
    fun nom()
    fun quiSuisJe()
    fun parler()
}

class Chats : Animaux {
    override fun nom() {
        println("Chats")
    }
    override fun quiSuisJe() {
        println("je suis un chat ")
    }
    override fun parler() {
        println("Chat : Miaou ")
    }
}

class Chiens : Animaux {
    override fun nom() {
        println("Chiens")
    }
    override fun quiSuisJe() {
        println("je suis un chien ")
    }
    override fun parler() {
        println("Chien : Wouf ")
    }
}

class Lapins : Animaux {
    override fun nom() {
        println("Lapins")
    }
    override fun quiSuisJe() {
        println("je suis un Lapin ")
    }
    override fun parler() {
        println(" ")
    }
}

class Poissons : Animaux {
    override fun nom() {
        println("Poissons")
    }
    override fun quiSuisJe() {
        println("je suis un Poissons ")
    }
    override fun parler() {
        println(" ")
    }
}

class Oiseaux : Animaux {
    override fun nom() {
        println("Oiseaux")
    }
    override fun quiSuisJe() {
        println("je suis un Oiseau ")
    }
    override fun parler() {
        println("Oiseaux : Cui Cui Cui ")
    }
}
