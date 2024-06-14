package com.example.jpatest.entitymanager.exam;

import com.example.jpatest.entitymanager.entity.PublicInfoEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product")
public class ProductEntity extends PublicInfoEntity {
    @Id
    @GeneratedValue
    private Long productNo;
    private String productName;
    private String info;
    private String image;
    private int price;
//    CategoryEntity category;

    public ProductEntity(String productName, String info, String image, int price) {
        this.productName = productName;
        this.info = info;
        this.image = image;
        this.price = price;
    }
}
