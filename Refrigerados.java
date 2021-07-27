public class Refrigerados  extends ProductosAlimentarios{
    //Atributos
    private  int TEMPERATURA = 10;
    public   int temperatura;

    //Constructores
    public Refrigerados(){
        this.temperatura = this.TEMPERATURA;

    }
    public Refrigerados(double precioBase, int peso){
        this.temperatura = this.TEMPERATURA;
        this.precioBase=precioBase;
        this.peso=peso;
    }

    public Refrigerados(double precioBase, int peso, int temperatura){
        this.precioBase=precioBase;
        this.peso=peso;
        this.temperatura=temperatura;
    }
    //Metodo
    public double calcularPrecio(){
        var precioFinal = super.calcularPrecio();
        var adicion = 0.0;
        //codigo calcular precio final
        if (temperatura >= 5 & temperatura< 10 ){
            adicion += 20;
        } else if (temperatura >= 10 & temperatura<= 15 ){
            adicion += + 18;
        }else if (temperatura > 15){
            //Documentacion dice 5
            adicion += 10;
        }
        precioFinal = precioFinal + adicion;

        //System.out.println("ADICION REFRIGERADOS: " + adicion);
        //System.out.println("REFRIGERADOS: " + precioFinal);
        return precioFinal;
    }
}

