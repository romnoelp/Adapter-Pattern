import Adapters.*;
import Devices.*;

void main(){
        // Adaptees
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

        // Adapters
        PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphoneAdapter = new SmarthphoneAdapter(smartphoneCharger);

        // Plugging in the devices through the adapter.
        System.out.println("Plugging in the devices throughout the adapter:");
        laptopAdapter.plugIn();
        refrigeratorAdapter.plugIn();
        smartphoneAdapter.plugIn();
}