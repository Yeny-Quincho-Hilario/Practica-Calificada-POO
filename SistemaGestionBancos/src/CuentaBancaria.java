public class CuentaBancaria {
    String nombre;
    double saldoInical;
    String tipoCuenta;
    double saldoFinal;
    double montoIngreso;

    public double getMontoIngreso() {
        return montoIngreso;
    }

    public void setMontoIngreso(double montoIngreso) {
        this.montoIngreso = montoIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoInical() {
        return saldoInical;
    }

    public void setSaldoInical(double saldoInical) {
        this.saldoInical = saldoInical;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

//METODOS

    public double Depositos () {
        this.saldoFinal  = this.saldoInical + this.montoIngreso;
        return this.saldoFinal;

    }
    public double Retiros () {
        this.saldoFinal  = this.saldoInical - this.montoIngreso;
        return this.saldoFinal;
    }
    public String EstadoCuenta(){
        double saldo = this.saldoFinal;
        if (saldo > 1000 ){
            return "Suficiente";
        } else if (saldo >= 100 && saldo <= 1000) {

            return  "Minimo";
        }
        else {
            return "Critico";
        }
    }
}
