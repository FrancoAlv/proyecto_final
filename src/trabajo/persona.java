
package trabajo;
public class persona {
private final String nombre,apellidos,contraseña,correo,fechadeemision,fechadenacimiento;
private final int numerodecuenta,cvv,numerodetrans;
private int plata;
public persona(String nombre,String apellidos,String contraseña,String correo,String fechadeemision,String fechadenacimiento,int numerodecuenta,int cvv){
 this.nombre=nombre;
 this.apellidos=apellidos; 
 this.contraseña=contraseña;
 this.correo=correo;
 this.fechadeemision=fechadeemision;
 this.fechadenacimiento=fechadenacimiento;
 this.cvv=cvv;
 this.numerodecuenta=numerodecuenta;
 plata=0;
 numerodetrans=(int) (Math.random()*1000000000);
}

    public int getNumerodetrans() {
        return numerodetrans;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public String getNombre() {
        return nombre;
    }

    

    public String getApellidos() {
        return apellidos;
    }

   

    public String getContraseña() {
        return contraseña;
    }

    

    public String getCorreo() {
        return correo;
    }

    public String getFechadeemision() {
        return fechadeemision;
    }
    public String getFechadenacimiento() {
        return fechadenacimiento;
    }
    public int getNumerodecuenta() {
        return numerodecuenta;
    }
    public int getCvv() {
        return cvv;
    }

    @Override
    public String toString() {
        return "'DATOS DEL USUARIO'\n" + "Nombre=\n" + nombre + "\nApellidos=\n" + apellidos  +"\nCorreo=\n" + correo + "\nFecha de emision=\n" + fechadeemision + "\nFecha de nacimiento=\n" + fechadenacimiento + "\nNumero de cuenta=\n" + numerodecuenta + "\nCvv=\n" + cvv + "\nNumero de transferencia bancaria=\n" + numerodetrans + "\nPlata=\n" + plata;
    }

}
