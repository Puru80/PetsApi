package com.example.springmongo.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Pets 
{
    @Id
    public ObjectId _id;

    public String name;
    public String species;
    public String breed;

    public Pets(){}

    public Pets(String name, String species, String breed) {
        this.name = name;
        this.species = species;
        this.breed = breed;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId objectId) {
        this._id = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    };    

}
