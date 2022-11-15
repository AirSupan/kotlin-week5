fun main(){
    val l1 = Lamp() //Create l1 object of Lamp() class
    val l2 = Lamp() //Create l2 object of Lamp() class
    val ac = Account()

    l1.turnOn()
    l2.turnOff()

    l1.displayLight("$l1")
    l2.displayLight("$l2")
    ac.insert(5555,"Billgate", 1000000f)
}