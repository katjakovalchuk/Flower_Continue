package ua.edu.ucu.apps.lab7.delivery;

import ua.edu.ucu.apps.lab7.items.Item;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(Item items) {
        System.out.println("Deliver by DHL:" + items.toString());
    }
}
