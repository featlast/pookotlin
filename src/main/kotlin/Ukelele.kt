//("", "", "") enseguida de guitarra sedeclara este constructor
class Ukelele : Guitarra {

    //si no quiero declarar el constructor arriba enseguida de guitarra lo
    //puedo crear aca
    var tipo:String=""
    constructor(tipo:String,color:String,nombre:String,tipoInstrumento:String):super (color,nombre,tipoInstrumento){
        this.tipo=tipo
    }

    override fun tocar() {

        println("Toca el $nombre correspondiente al instumento de tipo $tipoInstrumento")
    }

    fun cambiarCuerdas(){
        println("Se estan cambiando las cuerdas del $nombre")
    }
}