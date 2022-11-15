class Lamp {
   private  var isOn: Boolean = false

    fun turnOn(){
        isOn = true
        println(isOn)
    }

    fun turnOff(){
        isOn = false
        println(isOn)
    }
    fun displayLight(lamp: String){
        if (isOn == true){
            println("$isOn lamp is on")
        }else{
            println("$isOn lamp is off")
        }
    }
}