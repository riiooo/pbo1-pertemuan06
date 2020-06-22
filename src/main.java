public class main {
    public static void main(String[] args) {

        // memanggil Consraktornya

        player data = new player();
        player data1 = new player("ryzen");
        player data2 = new player("ryzen",20);

        //memanggil methodnya

        data.namaplayernya();
        data.alamat();
        data.namatimnya();
        data.umurnya();
        data.levelnya();

        //Memanggil Overloading

        int dataplayer = data.dataplayer(15,60);
        int dataplayer2 = data.dataplayer(15,60,5);
        double dataplayer3 = data.dataplayer(15,60);
        System.out.println("data menang dan level = "+dataplayer);
        System.out.println("data menang total dan kalah pertama = "+dataplayer2);
        System.out.println("data menang total dalam double= "+dataplayer3);
    }
}


