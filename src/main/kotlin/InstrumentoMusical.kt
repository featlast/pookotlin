abstract class InstrumentoMusical constructor(nombre:String,tipoInstrumento:String) {
    var nombre:String=nombre;
    var marca:String="Por Defecto Algo"
    var tipoInstrumento:String=tipoInstrumento

    abstract fun tocar()
//    {
//        println("Esta Tocando el instrumento de tipo $tipoInstrumento de nombre $nombre y de marca $marca")
//    }

    abstract fun tipoSonido()
    fun limpiar(){
        println("esta limpiando el instrumento")
    }
}