package com.example.api;

import com.example.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import java.time.OffsetDateTime;

import java.util.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-23T08:41:16.830+01:00[Europe/Belgrade]")

@RestController
@RequestMapping("${openapi.usersCRUDInterface.base-path:/api}")
public class UsersApiController implements UsersApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UsersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    private final Map<UUID, User> userDatabase = new HashMap<>();

    @Override
    public ResponseEntity<UserResponse> createUser(CreateRequest body) {
        User user = body.getUser();
        UUID userId = UUID.randomUUID();
        user.setId(userId);
        userDatabase.put(userId, user);

        RequestHeader requestHeader = new RequestHeader()
                .requestId(UUID.randomUUID())
                .sendDate(OffsetDateTime.now());
        return ResponseEntity.status(201)
                .body(new UserResponse().responseHeader(requestHeader).user(user));
    }

    @Override
    public ResponseEntity<UserListResponse> getAllUsers() {
        List<User> users = new ArrayList<>(userDatabase.values());
        RequestHeader requestHeader = new RequestHeader()
                .requestId(UUID.randomUUID())
                .sendDate(OffsetDateTime.now());
        return ResponseEntity.ok(new UserListResponse().responseHeader(requestHeader).usersList(users));
    }

    @Override
    public ResponseEntity<UserResponse> getUserById(UUID id) {
        User user = userDatabase.get(id);
        if (user == null) {
            return ResponseEntity.status(404).body(null);
        }

        RequestHeader requestHeader = new RequestHeader()
                .requestId(UUID.randomUUID())
                .sendDate(OffsetDateTime.now());
        return ResponseEntity.ok(new UserResponse().responseHeader(requestHeader).user(user));
    }

    @Override
    public ResponseEntity<UserResponse> updateUser(UUID id, UpdateRequest body) {
        User user = userDatabase.get(id);
        if (user == null) {
            return ResponseEntity.status(404).body(null);
        }

        User updatedUser = body.getUser();
        updatedUser.setId(id);
        userDatabase.put(id, updatedUser);

        RequestHeader requestHeader = new RequestHeader()
                .requestId(UUID.randomUUID())
                .sendDate(OffsetDateTime.now());
        return ResponseEntity.ok(new UserResponse().responseHeader(requestHeader).user(updatedUser));
    }

    @Override
    public ResponseEntity<Void> deleteUser(UUID id) {
        if (!userDatabase.containsKey(id)) {
            return ResponseEntity.status(404).build();
        }

        userDatabase.remove(id);
        return ResponseEntity.noContent().build();
    }
}
