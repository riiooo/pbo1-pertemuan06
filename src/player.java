import javax.swing.*;

public class player {
    //atributnya//

    String nama="Ryzen";
    String namatim="Bigetron";
    int umur=20;
    int menang;
    int level=60;
    int alamat;

    //contructor//

    player(){
    }

    player(String x){
        nama = x;
    }

    player(String x, int y){
        nama = x;
        umur = y;
    }

    //methodnya//

    void namaplayernya(){
        System.out.println("nama Player = "+nama);
    }
    void alamat(){
        System.out.println("Jakarta");
    }
    void levelnya(){
        System.out.println("Level = "+ level);
    }
    void namatimnya(){
        System.out.println("nama tim = "+ namatim);
    }
    void umurnya(){
        System.out.println("Umur player= "+umur);
    }

    //OverLoading//
    int dataplayer(int menang , int level){

        int data = menang = level;
        return data;
    }
    int dataplayer(int menang , int level , int kalah){
        int data = menang = level = kalah;
        return data;
    }
    double dataplayer(double menang , int level){
        double data = menang = level;
        return  data;
    }
}
