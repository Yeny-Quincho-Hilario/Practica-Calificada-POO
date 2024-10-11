public class Empleado {

    String nombre;
    double salarioHora;
    int horasExt;
    int horasReg;

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasExt() {
        return horasExt;
    }

    public void setHorasExt(int horasExt) {
        this.horasExt = horasExt;
    }
    public int getHorasReg() {
        return horasReg;
    }

    public void setHorasReg(int horasReg) {
        this.horasReg = horasReg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //metodos

    public double salarioTotal (){
        return (this.horasReg * this.salarioHora + 1.50 * this.salarioHora * this.horasExt);
    }

    public String CategoriaSalarial () {
        double salarioo = this.salarioTotal();
        if(salarioo > 5000){
            return  "Alto";
        }
        else if(salarioo >= 3000 && salarioo <= 5000 ){
            return  "Medio";
        }
        else {
            return "Bajo";
        }

    }
}
