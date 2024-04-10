package com.Product.ProductServiceApplication.Entity;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", length = 25)
    private String name;

    @Column(name="price", length = 25)
    private double price;

    @Version
    private Long version; // for optimistic locking

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Product(Long id, String name, double price, Long version) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", version=" + version +
                '}';
    }

    public Product() {
    }
}
