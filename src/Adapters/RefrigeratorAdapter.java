package Adapters;

import Devices.Refrigerator;

public class RefrigeratorAdapter implements PowerOutlet {
    private final Refrigerator refrigirator;

    public RefrigeratorAdapter(Refrigerator refrigirator) {
        this.refrigirator = refrigirator;
    }

    @Override
    public void plugIn() {
        refrigirator.startCooling();
    }
}
