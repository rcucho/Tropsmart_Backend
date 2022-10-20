package com.techelper.tropsmart_backend.services;

import com.techelper.tropsmart_backend.models.User;
import com.techelper.tropsmart_backend.resources.comunications.*;

public interface IUserService extends ICrudService<User>{
    FavoriteResponse setFavourited(int userId, int favoriteId);
    BlockedResponse setBlocked(int userId, int blockedId);
    UserResponse findAllUsers();
    UserResponse findAllUsersByType(int userType);
    FavoriteResponse findFavoritesByUserId(int userId);
    BlockedResponse findBlockedsByUserId(int userId);
    FavoriteResponse findAllFavourites();
    BlockedResponse findAllBlockeds();
    UserResponse findUserByEmail(String email);
    UserResponse findUserById(int userId);
    FavoriteResponse findFavoriteByUserIdAndFavoriteId(int userId, int favouriteId);
    BlockedResponse findBlockByUserIdAndBlockedId(int userId, int blockedId);
    FavoriteResponse deleteFavoriteByUserIdAndFavoriteId(int userId, int favoriteId);
    BlockedResponse deleteBlockByUserIdAndBlockId(int userId, int blockedId);

    CustomerResponse findCustomerByUserId(int userId);
    DriverResponse findDriverByUserId(int userId);

}
