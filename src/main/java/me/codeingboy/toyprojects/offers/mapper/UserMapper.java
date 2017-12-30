package me.codeingboy.toyprojects.offers.mapper;

import me.codeingboy.toyprojects.offers.model.User;

/**
 * Mapper interface for class {@link User}
 *
 * @author CodeingBoy
 * @version 1
 * @see BaseMapper
 * @see User
 */
public interface UserMapper extends BaseMapper<User, Integer> {
    User fetchByUsername(String username);
}
