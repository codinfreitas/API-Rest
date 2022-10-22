package com.example.demo.service;

import com.example.demo.handler.exception.NotFoundException;
import com.example.demo.persistance.UserEntity;
import com.example.demo.persistance.UserRepository;
import com.example.demo.view.UserViews;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity save(UserViews userViews) {

        var entity = new UserEntity();
        entity.setFullName(userViews.getFullName());
        entity.setEmail(userViews.getEmail());

        return userRepository.save(entity);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public UserEntity findById(Long id) {

      return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Não foi econtrado o id:" + id));
    }

    public UserEntity fullUpdate(Long id, UserViews userViews) {

        var entity = new UserEntity();
        entity.setId(id);
        entity.setFullName(userViews.getFullName());
        entity.setEmail(userViews.getEmail());

        return userRepository.save(entity);
    }

    public UserEntity patch(Long id, UserViews userViews) {

        var entity = findById(id);

        if (userViews.getFullName() != null) {
            entity.setFullName(userViews.getFullName());
        }
        if (userViews.getEmail() != null) {
            entity.setEmail(userViews.getEmail());
        }

        return userRepository.save(entity);
    }
}
