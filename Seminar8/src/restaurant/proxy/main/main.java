package restaurant.proxy.main;

import restaurant.proxy.clase.IRestaurant;
import restaurant.proxy.clase.ProxyRestaurant;
import restaurant.proxy.clase.Restaurant;

public class main {
    public static void main(String[] args){
        IRestaurant restaurant = new Restaurant("Rovi's");
        restaurant.rezervaMasa(2);

        IRestaurant proxy = new ProxyRestaurant(restaurant);
        proxy.rezervaMasa(2);
        proxy.rezervaMasa(5);

    }
}
