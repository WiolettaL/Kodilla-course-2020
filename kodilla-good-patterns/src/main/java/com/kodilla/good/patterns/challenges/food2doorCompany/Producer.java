package com.kodilla.good.patterns.challenges.food2doorCompany;

public class Producer {

    private final String producerName;
    private final String address;
    private final boolean isAvailable;

    public Producer(final String producerName, final String address, final boolean isAvailable) {
        this.producerName = producerName;
        this.address = address;
        this.isAvailable = isAvailable;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getAddress() {
        return address;
    }

    public void process(Order order) {
        System.out.println("Processing new order");
    }

    public boolean isAvailable() {
        if(producerName != null && isAvailable == true) {
            System.out.println("Welcome to " + producerName);
        } else {
            System.out.println("Warning! This provider does not support our services!");
        }
        return isAvailable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Producer producer = (Producer) o;

        if (isAvailable != producer.isAvailable) return false;
        if (!producerName.equals(producer.producerName)) return false;
        return address.equals(producer.address);
    }

    @Override
    public int hashCode() {
        int result = producerName.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "producerName='" + producerName + '\'' +
                ", address='" + address + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}