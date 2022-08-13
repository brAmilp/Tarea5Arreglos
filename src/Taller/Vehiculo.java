package Taller;

public class Vehiculo {
    private String placa, modelo, marca;
    private int kilometraje, precio;

    Vehiculo(String placa, String modelo, String marca, int kilometraje, int precio){

        setPlaca(placa);
        setModelo(modelo);
        setMarca(marca);
        setKilometraje(Integer.parseInt(kilometraje));
        setPrecio(Integer.parseInt(precio));
    }

    public void setPlaca(String p) { placa = p; }
    public void setModelo(String m ) { modelo = m; }
    public void setMarca(String n ) { marca = n; }
    public void setKilometraje(int k) { kilometraje = k; }
    public void setPrecio(int q) { precio = q;}

    public String getPlaca(){ return placa; }
    public String getModelo(){ return modelo; }
    public String getMarca(){ return marca;}
    public int getKilometraje(){ return kilometraje;}
    public int getPrecio() { return precio;}

    public void mostrarVehiculo(){
        System.out.print("\nPlaca: " +getPlaca()+"\nMarca: "+getMarca()+"\nModelo: "+getModelo()+"\nKilometraje: "+getKilometraje()+"\nPrecio: "+getPrecio() );

    }
}
