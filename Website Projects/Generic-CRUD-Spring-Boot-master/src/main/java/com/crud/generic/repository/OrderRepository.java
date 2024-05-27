package com.crud.generic.repository;

import com.crud.generic.entity.Order;
import com.crud.generic.repository.generic.GenericRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends GenericRepository<Order> {
//    List<Order> findAllByCustomerId(Long id);

    @Query(value = "select amount, tbp.product_name, amount * tbp.price, tbp.image, tbp.color, order_date from tbl_order as tbo inner join tbl_customer as tbc on tbo.customer_id = tbc.id\n" +
            "inner join tbl_product as tbp on tbo.product_id = tbp.id where tbc.id = ?1", nativeQuery = true)
    List<Object> findProduct(Long id);
}
