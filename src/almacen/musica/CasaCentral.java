/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen.musica;

/**
 *
 * @author scast
 */
public class CasaCentral {
    
    private int CodigoProducto;
    private int CantidadDeProducto;
    private int PrecioProducto;
    private String Articulo;

    public CasaCentral(int CodigoProducto, int CantidadDeProducto, int PrecioProducto, String Articulo) {
        this.CodigoProducto = CodigoProducto;
        this.CantidadDeProducto = CantidadDeProducto;
        this.PrecioProducto = PrecioProducto;
        this.Articulo = Articulo;
    }

    public int getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(int CodigoProducto) {
        this.CodigoProducto = CodigoProducto;
    }

    public int getCantidadDeProducto() {
        return CantidadDeProducto;
    }

    public void setCantidadDeProducto(int CantidadDeProducto) {
        this.CantidadDeProducto = CantidadDeProducto;
    }

    public int getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(int PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String Articulo) {
        this.Articulo = Articulo;
    }
    
}
