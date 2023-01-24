class Mano (c1: Carta,c2:Carta,c3: Carta){
   // var c1= Carta(1,'C')
   var cartaInterna= c1
    var listaCartas= mutableListOf<Carta>()
    init{
        listaCartas.add(c2)
        listaCartas.add(c3)
    }

}