public class PrecioTotal {
    //Atributos
    private double tProductosAlimentarios;
    private double tBebidas;
    private double tRefrigerados;
    private ProductosAlimentarios[] listaProductosAlimentarios;


    //ConstrutoreePrecioTotal
    public PrecioTotal(){
        this.tProductosAlimentarios = 0;
        this.tBebidas = 0;
        this.tRefrigerados = 0;
        this.listaProductosAlimentarios = new ProductosAlimentarios[0];
    }

    public PrecioTotal(double tProductosAlimentarios, double tBebidas, double tRefrigerados,  ProductosAlimentarios[] listaProductosAlimentarios){
        this.tProductosAlimentarios = tProductosAlimentarios;
        this.tBebidas = tBebidas;
        this.tRefrigerados = tRefrigerados;
        this.listaProductosAlimentarios = listaProductosAlimentarios;
    }

    public PrecioTotal(ProductosAlimentarios[] listaProductosAlimentarios){
        this.tProductosAlimentarios = 0;
        this.tBebidas = 0;
        this.tRefrigerados = 0;
        this.listaProductosAlimentarios = listaProductosAlimentarios;
    }
//Metodo mostrar Total

    public void mostrarTotal() {
        //Codigo calculo de total

        var contador = 0;
        for(var alimento : this.listaProductosAlimentarios) {
            //System.out.println("---------------- POSITION: " + contador + " ----------------");
            var precio = alimento.calcularPrecio();
            //System.out.println("PRECIO FINAL: " + precio);
            this.tProductosAlimentarios += precio;

            if(alimento instanceof Bebidas) {
                this.tBebidas+=precio;
            } else if (alimento instanceof Refrigerados) {
                this.tRefrigerados+=precio;
            }
            contador++;
        }


        System.out.println("El precio total de los Productos Alimentarios es de " + tProductosAlimentarios);
        System.out.println("La suma del precio de las Bebidas es de " + tBebidas);
        System.out.println("La suma del precio de los Refrigerados es de " + tRefrigerados);

    }

    public double gettProductosAlimentariosProductosAlimentarios() {
        return tProductosAlimentarios;
    }

    public void settProductosAlimentarios(double tProductosAlimentarios) {
        this.tProductosAlimentarios = tProductosAlimentarios;
    }
}
