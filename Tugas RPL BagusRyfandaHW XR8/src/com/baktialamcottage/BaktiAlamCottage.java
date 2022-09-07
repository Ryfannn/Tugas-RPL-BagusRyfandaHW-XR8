package com.baktialamcottage;

import java.util.Locale;
import java.util.Scanner;

public class BaktiAlamCottage {
    public static void main(String[] args) {
        int harga,jumlah = 0;
        String hari,cottage;
        System.out.println("-=Bakti Alam Cottage=-\n\nCottage yang tersedia :\n1. Duku\n->2 ruangan\n2. Jeruk\n->2 ruangan\n3. Alpukat\n->1 ruangan" +
                "\n4. Jambu Air\n->1 ruangan\n5. Durian\n->2 ruangan\n6. Melon\n->2 ruangan\n7. Belimbing\n->2 ruangan\n8. Mangga\n->2 ruangan" +
                "\n9. Kedondong\n->2 ruangan\n10. Barrack\n->Perorang\n\nMasukkan nama cottage yang anda pilih:");
        Scanner input = new Scanner(System.in);
        cottage = input.next().toLowerCase();
        if (cottage.equals("barrack")) {
            System.out.println("Masukkan jumlah orang : ");
            jumlah = input.nextInt();
        }
        System.out.println("Silahkan masukkan hari (weekdays/weekend/holiday) :");
        hari = input.next().toLowerCase();
        harga = switch (cottage) {
            case "duku","jeruk" -> hari.equals("weekdays") ? 915000 : hari.equals("weekend") ? 1025000 : hari.equals("holiday") ? 1025000 : 0;
            case "alpuka","jambu" -> hari.equals("weekdays") ?  575000 : hari.equals("weekend") ? 695000 : hari.equals("holiday") ? 895000 : 0;
            case "durian","melon" -> hari.equals("weekdays") ? 595000 : hari.equals("weekend") ? 715000 : hari.equals("holiday") ? 915000 : 0;
            case "belimbing","mangga","kedondong" -> hari.equals("weekdays") ? 495000 : hari.equals("weekend") ? 575000
                    : hari.equals("holiday") ? 755000 : 0;
            case "barrack" -> hari.equals("weekdays") ? 25000 : hari.equals("weekend") ? 25000 : hari.equals("holiday") ? 35000 : 0;
            default -> 0;
        };
        String hariCap = hari.substring(0,1).toUpperCase() + hari.substring(1);
        String cottageCap = cottage.substring(0,1).toUpperCase() + cottage.substring(1);
        System.out.println("\n\n");
        if (cottage.equals("barrack")) {
            System.out.printf("-=Bakti Alam Cottage=-\n\nCottage      : %s \nHari         : %s \nJumlah orang : %s\n--------------------------- " +
                    "\nHarga        : Rp.%s,-",cottageCap,hariCap,jumlah,cottage.equals("barrack") ? jumlah*harga : 0);
        } else {
            System.out.printf("-=Bakti Alam Cottage=-\n\nCottage      : %s \nHari         : %s \n--------------------------- " +
                    "\nHarga        : Rp.%s,-",cottageCap,hariCap,harga);
        }

    }
}
