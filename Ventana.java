package Recuperacion;

import java.time.LocalTime;

public class Ventana {
	
	private boolean tienePersiana;
    private int orientacion;
    private double ancho;
    private double alto;
    private int numeroHojas;
    private String color;
    private int tipoVidrio;
    
    public final static int NORTE=0;
    public final static int SUR=1;
    public final static int ESTE=2;
    public final static int OESTE=3;
    
    public final static int VIDRIO_SIMPLE=0;
    public final static int VIDRIO_DOBLE=1;
    public final static int VIDRIO_TRIPLE=2;

    // Constructor
    public Ventana(boolean tienePersiana, int orientacion, double ancho, double alto, int numeroHojas, String color, int tipoVidrio) {
        this.tienePersiana = tienePersiana;
        this.orientacion = orientacion;
        this.ancho = ancho;
        this.alto = alto;
        this.numeroHojas = numeroHojas;
        this.color = color;
        this.tipoVidrio = tipoVidrio;
    }

    // Getters
    public boolean TienePersiana() {
        return tienePersiana;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public String getColor() {
        return color;
    }

    public int getTipoVidrio() {
        return tipoVidrio;
    }

    // Setters
    public void setTienePersiana(boolean tienePersiana) {
        this.tienePersiana = tienePersiana;
    }

    public void setOrientacion(int orientacion) {
        this.orientacion = orientacion;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoVidrio(int tipoVidrio) {
        this.tipoVidrio = tipoVidrio;
    }
    
    // MÉTODOS DE LA CLASE
    public void ajustarPersiana() {
    	
    	while(true) {
    		
    		LocalTime horaActual = LocalTime.now();
            int hora = horaActual.getHour();
    		
    		if(this.TienePersiana()) {
    			switch (this.getOrientacion()) {
                case 0:
                    if (hora >= 12 && hora < 18 && (leerSensorInterior()<leerSensorExterior())) {
                        BajarPersiana();
                    }else {
                    	SubirPersiana();
                    }
                    break;
                case 1:
                    if (hora >= 8 && hora < 18 && (leerSensorInterior()<leerSensorExterior())) {
                    	BajarPersiana();
                    }else {
                    	SubirPersiana();
                    }
                    break;
                case 2:
                    if (hora >= 6 && hora < 12 && (leerSensorInterior()<leerSensorExterior())) {
                    	BajarPersiana();
                    }else {
                    	SubirPersiana();
                    }
                    break;
                case 3:
                    if (hora >= 12 && hora < 20 && (leerSensorInterior()<leerSensorExterior())) {
                    	BajarPersiana();
                    }else {
                    	SubirPersiana();
                    }
                    break;
            }
        	}
    		
    	}
    	
    }
    
    public void BajarPersiana() {
    	// Por implementar
    }
    
    public void SubirPersiana() {
    	// Por implementar
    }
    
    public int leerSensorExterior() {
    	int temperatura = 0;
    	return temperatura;
    }
    
    public int leerSensorInterior() {
    	int temperatura = 0;
    	return temperatura;
    }
    
}
