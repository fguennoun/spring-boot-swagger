package org.faycal.swagger.api.impl.controller;

import org.faycal.swagger.api.v1.model.User;
import org.faycal.swagger.api.v1.model.UserWithId;
import org.faycal.swagger.api.v1.rest.UserApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@RestController
public class UserController implements UserApi {
    @Override
    public ResponseEntity<Void> deleteById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getById(UUID id) {
        return null;
    }

    @Override
    public ResponseEntity<UserWithId> getUsers() {
        var user = new UserWithId();
        user.setUserId(UUID.randomUUID());
        user.setLogin("f.guennoun");
        user.setPassword("password");
        user.setType(UserWithId.TypeEnum.ADMIN);
        user.setAvatar("AVATAR");
        return ResponseEntity.ok(user);
    }

    @Override
    public ResponseEntity<Void> patchUser(UUID id, User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> postUser(User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> uploadAvatar(UUID id, MultipartFile receipt) {
        return null;
    }
}
