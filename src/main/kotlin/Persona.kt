class Persona constructor (documento:String, nombre:String, edad:Int, telefono:String ){
  //Explicito
    var documento:String=documento
    var nombre:String=nombre
    var edad:Int=edad

      set(value) {
        println("El valor que esta ingresando en el setEdad $value")
        if(value>0){
          field=value
        }else{
          field=0
        }
      }
  var telefono:String=telefono
//Para metodo implicito
  //constructor():this(documento:'', nombre:'', edad:0, telefono:"")
//    var document:String=""
//    var nombre:String=""
//    var edad:Int=0
//    var telefono:String=""


  init {
    println("Edad Antes de Init $edad")
      if (edad<0){
        this.edad=0
        println("Edad Despues de Init $edad")
      }

  }

    fun imprimirDatos(){
        println("Documento: $documento \nNombre: $nombre \nEdad: $edad \nTelefono: $telefono")
      caminar()
    }

fun caminar(){
  println("La persona esta caminando...")
}

}