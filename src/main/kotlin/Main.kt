fun main(args: Array<String>) {
    val miBaraja=Baraja()
    miBaraja.mostrar()
    println("aleatoria ")
    miBaraja.verCartaAleatoria()

    /*
    var listaCartas= mutableListOf<Carta>()
    for (n in (1..13))
        for (p in (0..3)){
            /*
            val c=Carta(n,numeroAPalo(p))
            listaCartas.add(c)

             */
            listaCartas.add(Carta(n,numeroAPalo(p))  )
        }
    for (cartadelaLista in listaCartas){
        cartadelaLista.mostrarCarta()
    }

    /*
        val pepe=Alumno("77777777U",21)
        val ana=Alumno("88888888Y",41)


        pepe.notaTrimestre1=6
        pepe.notaTrimestre2=7
        pepe.notaTrimestre3=9

        //pepe.informeAlumno()
        ana.notaTrimestre1=4
        ana.notaTrimestre2=6

        ana.informeAlumno()
    */

     */
}
