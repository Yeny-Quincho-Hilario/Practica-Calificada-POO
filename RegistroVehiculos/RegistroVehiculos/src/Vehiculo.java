
import java.time.LocalDate;
public class Vehiculo {
    String marca;
    String modelo;
    int añoFab;
    double velocidad;
    int year = LocalDate.now().getYear();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFab() {
        return añoFab;
    }

    public void setAñoFab(int añoFab) {
        this.añoFab = añoFab;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int calcularEdad (){
        return (this.year - this.añoFab);
    }
    public String EstadoVehiculo () {
        int estado = this.calcularEdad();
        if (estado < 3) {
            return "Nuevo";
        }
        else if (estado >= 3 && estado <= 10) {
            return "Semi-Nuevo";
        }
        else {
            return "Antiguo";
        }
    }
    public String Acelerar () {
        return  "Este auto está celerarando";
        }

    public String Frenar(){
        return  "Este auto está frenando";

        }

    }

