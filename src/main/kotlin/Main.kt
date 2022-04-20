import javax.swing.text.View

fun main() {
    println("Bienvenidos")
    iniciar()
    Robot.nombre = "RoboCop"
    Robot.iniciar()

    var nombre2: String? = "Jose Omar"
    nombre2 = null
    print(nombre2)

    println()
    println()
//    var miInstrumento: InstrumentoMusical = InstrumentoMusical("Instrumento", "Percusion")
//    miInstrumento.marca = "xyz"
//    miInstrumento.tocar()
//    miInstrumento.limpiar()
    println("Mi Objeto Guitarra")
    var miGuitarra: Guitarra = Guitarra("Negro", "Guitarra", "Cuerdas")
    //miGuitarra.marca="Gato"
    miGuitarra.afinar()
    miGuitarra.tocar()
    miGuitarra.limpiar()
    miGuitarra.tipoSonido()

    println("Mi Objeto Flauta")
    var miFlauta: Flauta = Flauta("Pequeña")
    miFlauta.brillar()
    miFlauta.nombre = "Flauta"
    miFlauta.tipoInstrumento = "Viento"
    miFlauta.marca = "AWS"
    miFlauta.tocar()
    miFlauta.limpiar()
    miFlauta.tipoSonido()

    println("Objeto Ukelele")
    var miUkelele: Ukelele = Ukelele("Tenor", "Rojo", "Ukelele", "Cuerdas")
    miUkelele.afinar()
    miUkelele.limpiar()
    miUkelele.tocar()
    miUkelele.tipoSonido()
}

fun iniciar() {
    //Constructor implicito
    //var miObjetoPersona:Persona=Persona()

//constructor explicito
    var miObjetoPersona: Persona = Persona("123456", "Pepe", 50, "6548971")
    /* miObjetoPersona.document="123456"
     miObjetoPersona.nombre="Jose Omar Herrera"
     miObjetoPersona.edad=30
     miObjetoPersona.telefono="00000"*/
    miObjetoPersona.edad = -30

    miObjetoPersona.imprimirDatos()
    miObjetoPersona.caminar()
    println("Ejemplo de POO")

    //Creamos una lista de personas mutables

//    var listaPersonas:MutableList<Persona> = mutableListOf()
//    listaPersonas.add(miObjetoPersona)
//    listaPersonas.add(Persona("2222","Paola",50,"6548971"))
//    listaPersonas.add(Persona("3333","Carolina",50,"6548971"))

//    println(listaPersonas)
//
//    for (persona in listaPersonas){
//        println("Nombre:  ${persona.nombre}")
//        persona.imprimirDatos()
//    }


    //instancio la clase Estudiante

    var miObjetoEstudiante: Estudiante = Estudiante("Jose", 3, 4, 5)
    println(miObjetoEstudiante.nombre)


}



