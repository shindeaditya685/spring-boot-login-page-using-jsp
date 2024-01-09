package com.web.springwebapplication.service;

import com.web.springwebapplication.dto.UserDTO;
import com.web.springwebapplication.entity.UserEntity;
import com.web.springwebapplication.repository.UserJpaRepository;
import com.web.springwebapplication.util.AppModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private AppModelMapper appModelMapper;

    @Override
    public void saveUser(UserDTO userDTO) {
//        UserEntity userEntity = new UserEntity();
        // Not good way for 100 no.of attributes
//        userEntity.setFirst_name(userDTO.getFirst_name());
//        userEntity.setLast_name(userDTO.getLast_name());
//        userEntity.setEmail(userDTO.getEmail());
//        userEntity.setPassword(userDTO.getPassword());
        // hence we use model mapper concept.  Modelmapper will create only single object for 100 or any no. of user
        UserEntity userEntity = appModelMapper.dtoToEntity(userDTO);
        userJpaRepository.save(userEntity);
    }

    @Override
    public Boolean findByEmail(String email) {
        UserEntity userEntity = userJpaRepository.findByEmail(email);
        if (userEntity != null) {
            return Boolean.TRUE;
        }else {
            return Boolean.FALSE;
        }

    }
}
