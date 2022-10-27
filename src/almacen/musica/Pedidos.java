/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.musica;

/**
 *
 * @author scast
 */
public class Pedidos {
    
    
    private int codigoproducto;
    private int cantidaddeproducto;
    private int preciodeproducto;
    private String articulo;

    public Pedidos(int codigoproducto, int cantidaddeproducto, int preciodeproducto, String articulo) {
        this.codigoproducto = codigoproducto;
        this.cantidaddeproducto = cantidaddeproducto;
        this.preciodeproducto = preciodeproducto;
        this.articulo = articulo;
    }

    public int getCodigoproducto() {
        return codigoproducto;
    }

    public void setCodigoproducto(int codigoproducto) {
        this.codigoproducto = codigoproducto;
    }

    public int getCantidaddeproducto() {
        return cantidaddeproducto;
    }

    public void setCantidaddeproducto(int cantidaddeproducto) {
        this.cantidaddeproducto = cantidaddeproducto;
    }

    public int getPreciodeproducto() {
        return preciodeproducto;
    }

    public void setPreciodeproducto(int preciodeproducto) {
        this.preciodeproducto = preciodeproducto;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    
  public void transporteAereo(){
      
  }
  public void transportePorCarretera(){
      
  }
  public void envioEstandar(){
      
  }  
   public void envioUrgente(){
       
   } 
  
}
