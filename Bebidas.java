public class Bebidas extends ProductosAlimentarios{
    //Atributos
    private char LUGAR_ORIGEN = 'N';
    public char lugarOrigen ;

    //Constructores
    public Bebidas(){
        this.lugarOrigen = this.LUGAR_ORIGEN ;

    }
    public Bebidas(double precioBase, int peso){
        this.precioBase=precioBase;
        this.peso=peso;
        this.lugarOrigen = this.LUGAR_ORIGEN;
    }
    public Bebidas (double precioBase, int peso, char lugarOrigen){
        this.precioBase=precioBase;
        this.peso=peso;
        this.lugarOrigen=lugarOrigen;
    }
    //Metodo
    public void comprobarLugarOrigen(char lugarOrigen){
        //Condicion validar lugar de origen N,I
        /*var precioFinal = 0.00;
        if (lugarOrigen == 'N'){
            precioFinal = precioFinal + 5;
        }
        if (lugarOrigen == 'I'){
            precioFinal = precioFinal + 15;
        }else{
            precioFinal=precioFinal;
        }*/
    }
    //Metodo
    public double calcularPrecio(){
        var precioFinal = super.calcularPrecio();
        var adicion = 0.0;
        //Codigo calcular precio final
        if (lugarOrigen == 'N' || lugarOrigen == 'n'){
            adicion += 5;
        } else if (lugarOrigen == 'I' || lugarOrigen == 'i'){
            adicion += 15;
        }
        precioFinal = precioFinal + adicion;
        //System.out.println("ADICION BEBIDAS: " + adicion);
        //System.out.println("BEBIDAS: " + precioFinal);
        return precioFinal;
    }
}
