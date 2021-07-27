public class ProductosAlimentarios {
    //Atributos
    private double PRECIO_BASE = 80.0;
    private   int PESO_BASE = 5;
    private   char TIPO_ALIMENTO = 'N';
    public   double precioBase;
    public   int peso;
    public  char tipoAlimento;

    //Constructores
    public ProductosAlimentarios(){
        this.precioBase= this.PRECIO_BASE;
        this.peso= this.PESO_BASE;
        this.tipoAlimento= this.TIPO_ALIMENTO;
    }
    public ProductosAlimentarios(double precioBase, int peso){
        this.precioBase=precioBase;
        this.peso=peso;
        this.tipoAlimento = this.TIPO_ALIMENTO;
    }
    public ProductosAlimentarios(double precioBase, int peso, char tipoAlimento){
        this.precioBase=precioBase;
        this.peso=peso;
        this.tipoAlimento=tipoAlimento;
    }
    //Metodo
    public void comprobarTipoAlimento (char tipoAlimento){
        //Condicion validar tipo de alimento N,C
        //var precioFinal = 0.0;
        //codigobcalcular precio final
        /*if (tipoAlimento == 'N') {
            precioFinal = precioBase + 40.0;
        }
        if (tipoAlimento == 'C') {
            precioFinal = precioBase + 20.0;
        }*/
    }
    //Metodo
    public double calcularPrecio(){

        var adicion = 0.0;

        if (tipoAlimento == 'N') {
            adicion += 40.0;
        }else if (tipoAlimento == 'C') {
            adicion += 20.0;
        }

        if (peso >=0 && peso<=9) {
            adicion += 6;
        } else if (peso >9 && peso<=16) {
            adicion += 8;
        } else if (peso >16) {
            adicion += 20;
        }
        var precioFinal = precioBase + adicion;

        //System.out.println("ADICION ALIMENTARIO: " + adicion);
        //System.out.println("ALIMENTARIO: " + precioFinal);
        return precioFinal;
    }
}
