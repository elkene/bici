package CodigosX.bici;
public class Rueda {
    private String marca;
    private int tamaño;
    private String material;

    public Rueda(String marca, int tamaño, String material) {
        this.marca = marca;
        this.tamaño = tamaño;
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

// Clase Cuadro
public class Cuadro {
    private String tipo;
    private String material;
    private String color;

    public Cuadro(String tipo, String material, String color) {
        this.tipo = tipo;
        this.material = material;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

// Clase Bicicleta
public class Bicicleta {
    private Rueda ruedaDelantera;
    private Rueda ruedaTrasera;
    private Cuadro cuadro;
    private String marca;
    private String modelo;
    private double precio;

    public Bicicleta(Rueda ruedaDelantera, Rueda ruedaTrasera, Cuadro cuadro, String marca, String modelo, double precio) {
        this.ruedaDelantera = ruedaDelantera;
        this.ruedaTrasera = ruedaTrasera;
        this.cuadro = cuadro;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Rueda getRuedaDelantera() {
        return ruedaDelantera;
    }

    public void setRuedaDelantera(Rueda ruedaDelantera) {
        this.ruedaDelantera = ruedaDelantera;
    }

    public Rueda getRuedaTrasera() {
        return ruedaTrasera;
    }

    public void setRuedaTrasera(Rueda ruedaTrasera) {
        this.ruedaTrasera = ruedaTrasera;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public void setCuadro(Cuadro cuadro) {
        this.cuadro = cuadro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

// Clase Main
public class Main {
    public static void main(String[] args) {
        // Crear las ruedas
        Rueda ruedaDelantera = new Rueda("Michelin", 28, "Aluminio");
        Rueda ruedaTrasera = new Rueda("Michelin", 28, "Aluminio");

        // Crear el cuadro
        Cuadro cuadro = new Cuadro("Montaña", "Carbono", "Rojo");

        // Crear la bicicleta
        Bicicleta bicicleta = new Bicicleta(ruedaDelantera, ruedaTrasera, cuadro, "Giant", "XTC Advanced", 1500.0);

        // Imprimir detalles de la bicicleta
        System.out.println("Detalles de la Bicicleta:");
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Precio: $" + bicicleta.getPrecio());
        System.out.println("Rueda Delantera - Marca: " + bicicleta.getRuedaDelantera().getMarca() +
                           ", Tamaño: " + bicicleta.getRuedaDelantera().getTamaño() +
                           ", Material: " + bicicleta.getRuedaDelantera().getMaterial());
        System.out.println("Rueda Trasera - Marca: " + bicicleta.getRuedaTrasera().getMarca() +
                           ", Tamaño: " + bicicleta.getRuedaTrasera().getTamaño() +
                           ", Material: " + bicicleta.getRuedaTrasera().getMaterial());
        System.out.println("Cuadro - Tipo: " + bicicleta.getCuadro().getTipo() +
                           ", Material: " + bicicleta.getCuadro().getMaterial() +
                           ", Color: " + bicicleta.getCuadro().getColor());
    }
}
