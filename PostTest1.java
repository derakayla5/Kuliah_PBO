/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

import java.util.ArrayList;
public class PostTest1 {

    public static void main(String[] args) {
        // Buat ArrayList untuk menyimpan objek Blackpink
        ArrayList<Blackpink> members = new ArrayList<>();

        // Inisialisasi objek-objek Blackpink melalui constructor
        Blackpink member1 = new Blackpink("Jennie", 2016, "YG Entertainment");
        Blackpink member2 = new Blackpink("Lisa", 2016, "YG Entertainment");
        Blackpink member3 = new Blackpink("Rosé", 2016, "YG Entertainment");
        Blackpink member4 = new Blackpink("Jisoo", 2016, "YG Entertainment");
        Blackpink member5 = new Blackpink("Dera", 2016, "YG Entertainment");

        // Tambahkan objek-objek Blackpink ke dalam ArrayList
        members.add(member1);
        members.add(member2);
        members.add(member3);
        members.add(member4);
        members.add(member5);

        // Tampilkan informasi Blackpink dalam perulangan
        for (Blackpink member : members) {
            System.out.println(member.getInfo());
        }
    }
}

