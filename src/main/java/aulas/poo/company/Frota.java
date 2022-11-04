package aulas.poo.company;

public class Frota {
    private int idFrota;
    private String modelo;
    private String fabricante;
    private int passageiros;
    private int cargaUtil;

    public Frota(int idFrota, String modelo, String fabricante, int passageiros, int cargaUtil) {
        this.idFrota = idFrota;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.passageiros = passageiros;
        this.cargaUtil = cargaUtil;
    }

    public int getIdFrota() {
        return idFrota;
    }

    public String getModeloEFacricante() {
        return this.modelo + " " + this.fabricante;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getCargaUtil() {
        return cargaUtil;
    }

    public void setCargaUtil(int cargaUtil) {
        if (cargaUtil <= 20000) {
            this.cargaUtil = cargaUtil;
            System.out.println("Este avião não transporta carga pesada");
        } else {
            System.out.println("Este avião transporta carga pesada");
        }
    }
}


