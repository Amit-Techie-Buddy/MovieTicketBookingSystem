package com.xyz.moviebooking.model.user;

import com.xyz.moviebooking.model.Address;
import com.xyz.moviebooking.repository.order.ShoppingCart;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import java.io.Serializable;
import java.util.*;

import javax.validation.constraints.NotNull;

@Document(collection = "user")
@Data
public class User implements Serializable {
    @Id
    private String id;

    @NotNull
    private String firstname;

    @NotNull
    private String lastname;

    @Indexed(unique = true)
    private String email;

    private int age;

    private Address address;

    // db ref :
    @DBRef
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();



}