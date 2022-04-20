class Flauta (tam:String) : InstrumentoMusical(nombre="", tipoInstrumento = "") {
    var tam:String=tam

    override fun tocar() {
        //super.tocar()
        println("Sostener el instumento $nombre")
        println("llevar a la boca y soplarla")
    }

    //creacion de members de la clase abstracta padre
    override fun tipoSonido() {
        println("$nombre Tiene un sonido suave")
    }


    fun brillar(){
        println("se esta brillando la Flauta $tam")
    }
}