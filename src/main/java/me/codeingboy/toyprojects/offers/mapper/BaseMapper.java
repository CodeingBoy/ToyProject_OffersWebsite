package me.codeingboy.toyprojects.offers.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Define public interfaces of all mybatis mappers
 *
 * @author CodeingBoy
 * @version 1
 */
@Mapper
public interface BaseMapper<T, K> {
    /**
     * Fetch all objects from database table
     *
     * @return A List of objects, or an empty list if there's no objects in table
     */
    List<T> fetchAll();

    /**
     * Fetch object whose primary key correspond to the key argument
     *
     * @param id object's primary key
     * @return An object whose primary key equals to the key argument, or null if there's no such object
     */
    T fetch(K id);

    /**
     * Get the count of records in database
     *
     * @return the count of records in database, or 0 if there's no records
     */
    long count();

    /**
     * Add object into database, this will cause an invocation of an INSERT SQL statement
     *
     * @param t the object you want to add
     */
    void add(T t);

    /**
     * Commit object's modifications to database, this will cause an invocation of an UPDATE SQL statement
     *
     * @param t the object you want to modify
     */
    void modify(T t);

    /**
     * Delete an object from database
     *
     * @param t the object you want to delete
     */
    void delete(T t);
}
