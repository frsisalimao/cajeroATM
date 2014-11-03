/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloCajeroATM;

/**
 *
 * @author fabricio
 */
public class Cuenta {
  int  idcuenta;
  String numero_cuenta;
  int idusuario;
  String tipo;
  double saldo;

    public Cuenta(int idcuenta, String numero_cuenta, int idusuario, String tipo, double saldo) {
        this.idcuenta = idcuenta;
        this.numero_cuenta = numero_cuenta;
        this.idusuario = idusuario;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public int getIdcuenta() {
        return idcuenta;
    }

    public void setIdcuenta(int idcuenta) {
        this.idcuenta = idcuenta;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
  
  
}
