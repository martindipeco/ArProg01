package pkg00.producto;

public class Producto {
    
    private int codigo;
    private double precio;
    private int stock;
    
    public Producto(int codigo, double precio, int stock)
    {
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }
    
    public int GetCodigo()
    {
        return codigo;
    }
    
    public void SetCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    
    public double GetPrecio()
    {
        return precio;
    }
    
    public void SetPrecio(double precio)
    {
        this.precio = precio;
    }
    
    public int GetStock()
    {
        return stock;
    }
    
    public void SetStock(int stock)
    {
        this.stock = stock;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto = new Producto(345, 23.2, 5);
        System.out.println("Este producto tiene el código "+producto.codigo+", cuesta " + producto.precio + " y tiene" + producto.stock + " unidades disponibles");
    }
    
}
