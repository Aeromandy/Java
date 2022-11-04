package aulas.poo.company;

public class Main {
    public static void main(String[] args) {
        Frota aeronave1 = new Frota(1, "ERJ-190", "Embraer", 97, 56400);
        Frota aeronave2 = new Frota(2, "A319", "Airbus", 124, 58500);
        Frota aeronave3 = new Frota(3, "A320", "Airbus", 132, 79800);
        Frota aeronave4 = new Frota(4, "B737-700", "Boeing", 138, 20000);
        System.out.println(aeronave1.getModelo());
        System.out.println(aeronave2.getFabricante());
        System.out.println(aeronave3.getPassageiros());
        System.out.println(aeronave4.getCargaUtil());
        System.out.println(aeronave2.getModeloEFacricante());
        aeronave1.setCargaUtil(10000);
        aeronave2.setCargaUtil(60000);
        Rota rota1 = new Rota(1, "GRU-AUA", 2947, "9:45");
        Rota rota2 = new Rota(2, "GRU-BGI", 2680, "11:16");
        Rota rota3 = new Rota(3, "GRU-HAV", 3751, "10:44");
        Rota rota4 = new Rota(4, "GRU-PUJ", 3254, "7:15");
        System.out.println(rota1.getDistanciaMilhas());
        System.out.println(rota2.getOrigemDestino());
        System.out.println(rota3.getTempoDeVoo());
    }
}
