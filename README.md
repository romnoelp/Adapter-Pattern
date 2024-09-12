# Plugging Devices into Power Outlets

## Overview

This application helps users manage and control various electronic devices by plugging them into power outlets. Devices have different plug types, voltage, and amperage requirements. To ensure compatibility and safety, adapters are used to allow devices to be plugged into standard power outlets.

## Components

### Adaptee Objects

1. **Laptop**
   - **Description**: Represents a laptop device that needs to be plugged into a power source.
   - **Method**: `charge()`
   - **Usage**: `laptop.charge();`

2. **Refrigerator**
   - **Description**: Represents a refrigerator device that requires a power source.
   - **Method**: `startCooling()`
   - **Usage**: `refrigerator.startCooling();`

3. **SmartphoneCharger**
   - **Description**: Represents a smartphone charger that needs to be plugged in for charging.
   - **Method**: `chargePhone()`
   - **Usage**: `smartphoneCharger.chargePhone();`

### Target Object

1. **PowerOutlet**
   - **Description**: Represents a standard power outlet with a common interface for plugging in devices.
   - **Method**: `plugIn()`
   - **Usage**: `powerOutlet.plugIn();`

### Adapter Objects

1. **LaptopAdapter**
   - **Description**: An adapter for plugging a laptop into a standard power outlet. It adapts the `Laptop` to the `PowerOutlet` interface, translating `plugIn()` to `charge()`.
   - **Constructor**: `LaptopAdapter(Laptop laptop)`
   - **Method**: `plugIn()`
   - **Usage**: 
     ```java
     PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
     laptopAdapter.plugIn(); // Calls laptop.charge()
     ```

2. **RefrigeratorAdapter**
   - **Description**: An adapter for plugging a refrigerator into a standard power outlet. It adapts the `Refrigerator` to the `PowerOutlet` interface, translating `plugIn()` to `startCooling()`.
   - **Constructor**: `RefrigeratorAdapter(Refrigerator refrigerator)`
   - **Method**: `plugIn()`
   - **Usage**:
     ```java
     PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
     refrigeratorAdapter.plugIn(); // Calls refrigerator.startCooling()
     ```

3. **SmartphoneAdapter**
   - **Description**: An adapter for plugging a smartphone charger into a standard power outlet. It adapts the `SmartphoneCharger` to the `PowerOutlet` interface, translating `plugIn()` to `chargePhone()`.
   - **Constructor**: `SmartphoneAdapter(SmartphoneCharger charger)`
   - **Method**: `plugIn()`
   - **Usage**:
     ```java
     PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);
     smartphoneAdapter.plugIn(); // Calls smartphoneCharger.chargePhone()
     ```

## Example Usage

Here's how the design-pattern can be implemented in this particular assignment:

```java
// Adaptees
Laptop laptop = new Laptop();
Refrigerator refrigerator = new Refrigerator();
SmartphoneCharger smartphoneCharger = new SmartphoneCharger();

// Adapters
PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
PowerOutlet smartphoneAdapter = new SmartphoneAdapter(smartphoneCharger);

// Plugging in the devices through the adapter.
System.out.println("Plugging in the devices through the adapter:");
laptopAdapter.plugIn();
refrigeratorAdapter.plugIn();
smartphoneAdapter.plugIn();
