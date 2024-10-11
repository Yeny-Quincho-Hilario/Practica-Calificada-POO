public class Asistencia {
    String nombreEst;
    double diasAsist;

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public double getDiasAsist() {
        return diasAsist;
    }

    public void setDiasAsist(int diasAsist) {
        this.diasAsist = diasAsist;
    }

    public double PorcentajeAsistencia (){
        return  (100 * this.diasAsist/30);
    }

    public String EstadoEstudiante (){
        double estado = this.PorcentajeAsistencia();
        if ( estado > 75){
            return "Aprobado";
        }
        else if (estado >= 50 && estado <= 75){
            return "Condicional";
        }
        else{
            return "Reprobado";
        }
    }

}
