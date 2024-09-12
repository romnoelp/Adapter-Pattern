package Adapters;

import Devices.SmartphoneCharger;

public class SmarthphoneAdapter implements PowerOutlet {
    private final SmartphoneCharger charger;

    public SmarthphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void plugIn() {
        charger.chargePhone();
    }
}
