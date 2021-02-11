package com.example.springmongo.repositories;

import com.example.springmongo.models.Pets;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PetsRepository extends MongoRepository<Pets, String>
{
    Pets findBy_id(ObjectId id);
}
