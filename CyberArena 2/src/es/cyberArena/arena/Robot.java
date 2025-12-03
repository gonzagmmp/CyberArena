package es.cyberArena.arena;


	import java.util.Random;


	public class Robot {
	    // Atributos
	    private String nombreRobot;
	    private int vidaRobot = 100;
	    private Arma arma;

	    // Constantes

	    private static final String ARMA_DEFECTO = "Puños de acero";
	    private static final int POTENCIA_DEFECT0 = 10;

	    // Constructores

	    public Robot(String nombreRobot, Arma arma ) {

	        this.nombreRobot = nombreRobot;
	        this.arma = arma;
	    }

	    public Robot(String nombreRobot) {

	        this.nombreRobot = nombreRobot;
	        this.arma = new Arma (ARMA_DEFECTO, POTENCIA_DEFECTO)
	    }

	    //Getters


	    public String getNombreRobot() {
	        return nombreRobot;
	    }

	    public int getVidaRobot() {
	        return vidaRobot;
	    }

	    // Métodos

	    public void atacar(Robot robotEnemigo) { 
	        int daño = 0;
	        Random random = new Random();
	        int factorSuerte = random.nextInt(8);
	        daño = this.arma.getPotenciaArma() + factorSuerte;

	        robotEnemigo.recibirDano(daño);

	        System.out.println(this.getNombreRobot() + " ataca ferozmente a " + robotEnemigo.getNombreRobot() + "con" + arma.getNombreArma());

	    }

	    public void recibirDano(int cantidadDaño) {
	        vidaRobot = vidaRobot - cantidadDaño;

	        if (vidaRobot < 0) {
	            vidaRobot = 0;
	        }

	        System.out.println(this.getNombreRobot() + " recibe " + cantidadDaño + " puntos de daño. Vida restante: " + vidaRobot);
	    }

	    public boolean estaVivo() {

	        if (vidaRobot > 0) {
	            return true;
	        } else {
	            return false;
	        }

	    }
	// Esto no lo entiendo
	    @Override
	    public String toString() {
	        return this.getNombreRobot()+ " armado con " + arma.getNombreArma();
	    }

	}

