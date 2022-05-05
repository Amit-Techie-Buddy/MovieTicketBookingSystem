package com.xyz.moviebooking.repository;

import com.xyz.moviebooking.model.MemberDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface MemberDetailRepository extends MongoRepository <MemberDetail, String > {
    /**
     * This method will retrieve the member details pertaining to
     * the name passed in.
     */
    @Query("{ 'name' : {$regex: ?0, $options: 'i' }}")
    MemberDetail findByName(final String name);
}
