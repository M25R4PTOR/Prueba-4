package zoo;

/**
 * 
 * @author Manuel Jesus Martin Prieto
 * @version 1.0
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /**
     * 
     * @param especie especie de tiburon
     * @param peligroso booleano peligrosidad
     * @param velocidadMaxNatacion velocidad máxima
     * @param tipo tipo 
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /**
     * 
     * @param especie especie de tiburon
     * @param peligroso booleano peligrosidad
     * @param velocidadMaxNatacion velocidad máxima
     * @param tipo tipo 
     * @param habitat enumerado
     * @param comida alimento
     * @param longevidad tiempo de vida
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /**
     * @method Indica el desplazamiento
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /**
     * @method Indica la comida
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
    
    public void nombre(){
        System.out.println("Tiburon " + especie);
    }
}
