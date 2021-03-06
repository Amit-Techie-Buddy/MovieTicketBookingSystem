package com.xyz.moviebooking.repository.order;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.xyz.moviebooking.model.Movie;
import com.xyz.moviebooking.model.user.User;
import org.springframework.data.annotation.Id;

public class ShoppingCart implements Serializable {

    @Id
    private String id;

    private User user;

    private Movie movie;

//    @NotNull
//    private Integer stock;

    private Double amount;

    private String status;

    private Date date;

}