package com.example.jpatest.entitymanager.exam;

import com.example.jpatest.entitymanager.relation.PrivateInfoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "category")
public class CategoryEntity {
    @Id
    @GeneratedValue
    private Long categoryId;
    private String categoryName;
    private String info;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "category")
    private List<ProductEntity> productlist = new ArrayList<>();

    public CategoryEntity(String categoryName, String info) {

        this.categoryName = categoryName;
        this.info = info;
    }

    public CategoryEntity(List<ProductEntity> productlist) {
        this.productlist = productlist;
    }
}
