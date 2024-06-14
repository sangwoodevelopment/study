package com.example.jpatest.entitymanager.exam;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
@Rollback(value = false)
class CategoryEntityTest {
    @PersistenceContext
    EntityManager entityManager;
    @Test
    public void test1(){
        List<ProductEntity> productlist = new ArrayList<>();
        productlist.add(new ProductEntity("싱크대","흰색","test1.jpg",240000));
        productlist.add(new ProductEntity("시ㅣㄱ탁","한샘","test1.jpg",350000));

        List<ProductEntity> productlist2 = new ArrayList<>();
        productlist2.add(new ProductEntity("쇼파","검정색","test1.jpg",240000));
        productlist2.add(new ProductEntity("TV장","한샘","test1.jpg",350000));

        CategoryEntity category1 = new CategoryEntity("주방가구","식탁과수납장");
        CategoryEntity category2 = new CategoryEntity("거실가구","쇼파와수납장");
        CategoryEntity category3 = new CategoryEntity("침구","침대와협탁");

        entityManager.persist(category1);
        entityManager.persist(category2);
        entityManager.persist(category3);

    }
    @Test
    public void readtest(){
        ProductEntity productEntity = entityManager.find(ProductEntity.class,1L);
        System.out.println(productEntity);

        CategoryEntity categoryEntity = entityManager.find(CategoryEntity.class,1L);
        System.out.println(categoryEntity);
    }

}