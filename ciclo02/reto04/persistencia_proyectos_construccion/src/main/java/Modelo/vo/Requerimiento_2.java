package Modelo.vo;
//consulta 3
public class Requerimiento_2 {

    private String  Nombre;
    private String  Primer_Apellido;
    private String  Ciudad_Residencia;
    private String  Cargo;
    private String  Salario;

    
    public Requerimiento_2() {
    }


    public Requerimiento_2(String cargo, String salario) {
        Cargo = cargo;
        Salario = salario;
    }

    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }
    public void setPrimer_Apellido(String primer_Apellido) {
        Primer_Apellido = primer_Apellido;
    }
    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }
    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }
    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    public String getSalario() {
        return Salario;
    }
    public void setSalario(String salario) {
        Salario = salario;
    }

    

}
