package com.tazgi.evergreen;

import com.tazgi.evergreen.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item,String> {

}
