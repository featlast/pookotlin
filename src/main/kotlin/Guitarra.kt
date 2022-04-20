import java.awt.Color

open class Guitarra : InstrumentoMusical{
    var color:String=""
     constructor(color: String, nombre:String, tipoInstrumento:String): super (nombre,tipoInstrumento){
         this.color=color
     }
    override fun tocar() {
        //acceder a la funcion padre
        //super.tocar()
        println("Tocar el instumento $nombre de tipo $tipoInstrumento de marca $marca")
        println("Mirar la partitura")
        println("Tocar Las Cuerdas")
    }

    //creacion de members de la calse abstracta
    override fun tipoSonido() {
        println("$nombre Tiene un sonido acustico")
    }

    //constructor(color: Color)
    fun afinar(){
        println("Se esta afinando la guitarra de color $color")
    }
}