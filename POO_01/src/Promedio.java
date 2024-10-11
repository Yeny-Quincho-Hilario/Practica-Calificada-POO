public class Promedio {
        String nombre;
        int nota1;
        int nota2;
        int nota3;
        int nota4;
  //  get  retorna valor de variable nombre
    public String getNombre() {
        return nombre;
    }
  // set asigna valor a variable nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNota1() {
        return nota1;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public int getNota3() {
        return nota3;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    public int getNota4() {
        return nota4;
    }
    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }
    // metodos

    public int PromedioFinal (){
        return  (this.nota1+ this.nota2+this.nota3+this.nota4)/4;
    }

    public String CondicionFinal (){
        int promedio  = this.PromedioFinal();
        if ( promedio >= 13){
            return  "APROBADO";
        }
        else if ( promedio >= 10 && promedio <= 12){
            return  "RECUPERACION";
        }
        else {
            return  "DESPROBADO";
        }
    }
}
