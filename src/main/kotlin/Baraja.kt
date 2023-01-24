class Baraja {
    var listaCartas= mutableListOf<Carta>()

    init{
        for (n in (1..13))
            for (p in listOf<Char>('C', 'P', 'R', 'T')){
                /*
                val c=Carta(n,numeroAPalo(p))
                listaCartas.add(c)
                 */
                listaCartas.add(Carta(n,p)  )
            }

    }
    fun mostrar(){
        print("mostrar la baraja completa baraja")
        for (cartadelaLista in listaCartas){
            cartadelaLista.mostrarCarta()
        }

    }
    fun verCartaAleatoria(){
        var indiceAleatorio=(0..listaCartas.size-1).random()
        listaCartas[indiceAleatorio].mostrarCarta()
    }
}