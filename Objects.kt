package com.example.exerciseskevinpiedra

class Objects {
    fun main(){
        val brandBMW = createBrandCar("Ford", 1903, "Germany")
        val brandFord = createBrandCar("BMW", 1897, "E.E.U.U")
        createCar("325", 2007, 250, brandBMW)
        createCar("468", 1999, 220, brandFord)
        val lucio = createCharacter("Lucio", 60, 20, 10, Race.ORC)
        val mei = createCharacter("Mei", 65, 15, 10, Race.HUMAN)

        lucio.reduceHealth(mei.attack)
        mei.reduceHealth(lucio.attack)
        lucio.doDamage(mei)
        mei.doDamage(lucio)

        val spaceShip1 = createSpaceShip("spaceShip1", 150, 50)
        println("The data of the spaceShip is $spaceShip1.")
        //var spaceShip2 = createSpaceShip("spaceShip2", 250, 150)
        var fighterJet1 = FighterJet("fighterJet1", 1)
        println("The data of the fighterJet is $fighterJet1.")
        fighterJet1.shotWithFighterJets()
        fighterJet1.shotWithFighterJets()
        var carrierJet1 = CarrierJet("carrierJet1", 1, 1)
        carrierJet1.shootWithCarrierJets()
        carrierJet1.shootWithCarrierJets()
        carrierJet1.launchJets()
        carrierJet1.launchJets()

        val dog1 = Animal.Dog("Sparky", 6)
        val whale1 = Animal.Whale("Bob", 107)
        val bird1 = Animal.Bird("Poly", 3)
        println(dog1)
        println(whale1)
        println(bird1)
        val user1 = User.AdminUser("someone", "someone@gmail.com")
        val user2 = User.RegularUser("unknown", "unknown@gmail.com")
        println(user1)
        println(user2)

    }
    class CarBrand(val name: String, val creationYear: Int, val homeCountry: String)
    private fun createBrandCar(name: String, creationYear: Int, homeCountry: String): CarBrand {
        return CarBrand(name, creationYear, homeCountry)
    }

    class Car(val model: String, val manufacturingDate: Int, val horsesPower: Int, val brand: CarBrand)
    private fun createCar(model: String, manufacturingDate: Int, homeCountry: Int, brand: CarBrand): Car {
        return Car(model, manufacturingDate, homeCountry, brand)
    }

    enum class Race{
        HUMAN, ELF, ORC
    }

    class Character(val name: String, var health: Int, val attack: Int, val defense: Int, race: Race){

        fun reduceHealth(dmg : Int){
            val dmgReceived = dmg - defense
            if (dmgReceived > 0){
                health -= dmgReceived
                println()
            }
        }
        fun doDamage(other: Character) {
            val damage = attack - other.defense
            if (damage > 0) {
                other.health -= damage
                println("$name attacks ${other.name} and reduces its health by $damage points.")
            } else {
                println("$name attacks ${other.name} but doesn't cause damage.")
            }
        }
    }
    private fun createCharacter(name: String, health: Int, attack: Int, defense: Int, race: Race): Character {
        return Character(name, health, attack, defense, race)
    }

    open class SpaceShip(val name: String, val health: Int, val crew: Int)

    private fun createSpaceShip(name: String, health: Int, crew: Int): SpaceShip {
        return SpaceShip(name, health, crew)
    }

    class FighterJet(name: String, var shotsOfFighterJets: Int): SpaceShip(name,200,10){
        fun shotWithFighterJets(){
            if (shotsOfFighterJets > 0){
                shotsOfFighterJets--
                println("The fighter jet $name has fired. Remaining shots: $shotsOfFighterJets.")
            } else {
                println("The fighter jet $name can't shoot more.")
            }
        }
    }
    class CarrierJet(name: String, var shotsOfCarrierJets: Int, private var numFighterJets: Int):SpaceShip (name, 200, 10){

        fun shootWithCarrierJets(){
            if (shotsOfCarrierJets > 0){
                shotsOfCarrierJets--
            println("The carrier jet $name has fired. Remaining shots: $shotsOfCarrierJets.")
        } else {
            println("The carrier jet $name can't shoot more.")
        }
        }

        fun launchJets(){
            if (numFighterJets > 0) {
                numFighterJets--
                println("$name has launched a fighter. $numFighterJets fighters remain.")
                shootWithCarrierJets()
            } else {
                println("$name has no more fighters.")
            }
        }
    }

    open class Animal(val name: String, val age: Int) {

        class Dog(name: String, age: Int) : Animal(name, age)

        class Bird(name: String, age: Int) : Animal(name, age)

        class Whale(name: String, age: Int) : Animal(name, age)
    }

    open class User(val name: String, val email: String, var role: Role) {

        enum class Role {
            USER,
            ADMIN
        }

        class RegularUser(name: String, email: String) : User(name, email, Role.USER)

        class AdminUser(name: String, email: String) : User(name, email, Role.ADMIN)

    }
}