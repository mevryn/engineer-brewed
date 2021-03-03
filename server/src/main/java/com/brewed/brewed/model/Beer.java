package com.brewed.brewed.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@AllArgsConstructor
@Entity
public class Beer {
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Id
    private UUID id;
    private String name;
    private String type;
    private float price;

    public Beer(String name, String type, float price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
