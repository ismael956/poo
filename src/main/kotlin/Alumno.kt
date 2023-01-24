class Alumno (dni:String,edad:Int){
    var dni=dni
        get():String{
            return field
        }
        set(valor:String){
            if (valor.length ==9 )
                field=valor
        }
    var edad=edad
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >=0 )
                field=valor
        }
    var notaTrimestre1=-1
        get():Int{
           return field
        }
        set(valor:Int){
         if (valor >=0 && valor <=10)
             field=valor
        }
    var notaTrimestre2=-1
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >=0 && valor <=10)
                field=valor
        }
    var notaTrimestre3=-1
        get():Int{
            return field
        }
        set(valor:Int){
            if (valor >=0 && valor <=10)
                field=valor
        }
    fun notaFinal():Int{
        if(notaTrimestre1==-1 || notaTrimestre2==-1 ||notaTrimestre3==-1){
            return -1
        } else
            return (notaTrimestre1+ notaTrimestre2+notaTrimestre3)/3

    }

    override fun toString(): String {
        return "Alumno(dni='$dni', edad=$edad, notaTrimestre1=$notaTrimestre1, notaTrimestre2=$notaTrimestre2, notaTrimestre3=$notaTrimestre3)"
    }
    fun prueba(){
        print(toString())
    }


}