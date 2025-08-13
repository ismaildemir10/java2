package org.example;

import java.util.ArrayList;

public class AddressManager {
    public static void addAdress(User user,Address address){
        if (user==null&&address == null){
            user.getAddressArrayList().add(address);
            System.out.println(address.getType()+ " başarıyla eklendi");
        }else {
            System.out.println("adres eklenmedi");
        }
    }
    public static void removeAdress(User user,Address address){
        if (user!=null&&address!=null){
            ArrayList<Address> adressses = user.getAddressArrayList();
            if (adressses.remove(address)){
                System.out.println(address.getType()+"adres başarıyla silindi");
            }else {
                System.out.println("adres yok");
            }
        }else {
            System.out.println("adres silinmedi");
        }
    }
}
