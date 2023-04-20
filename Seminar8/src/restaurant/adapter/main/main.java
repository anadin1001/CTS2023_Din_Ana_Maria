package restaurant.adapter.main;

import restaurant.adapter.bar.ISoftBar;
import restaurant.adapter.bar.SoftBar;
import restaurant.adapter.bucatarie.AdapterClaseRestaurant;
import restaurant.adapter.bucatarie.AdapterObiecteRestaurant;
import restaurant.adapter.bucatarie.ISoftRestaurant;
import restaurant.adapter.bucatarie.SoftBucatarie;

public class main {
    public static void imprimare(ISoftRestaurant restaurant, double valoareNota){
        restaurant.printeazaNota(valoareNota);
    }


    public static void main(String[] args){
        ISoftBar bar = new SoftBar("Bar1");
        // bar.printeazaNotaBauturi(230);

        ISoftRestaurant restaurant = new SoftBucatarie("George");
        // restaurant.printeazaNota(300);
        main.imprimare(restaurant, 300);
        //  Main.imprimare(bar, 200);
        AdapterClaseRestaurant adapter = new AdapterClaseRestaurant("Bar1");
        main.imprimare(adapter, 200);

        //folosire adapter de obiecte
        AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
        main.imprimare(adapterObiecte, 120 );
    }
        }
