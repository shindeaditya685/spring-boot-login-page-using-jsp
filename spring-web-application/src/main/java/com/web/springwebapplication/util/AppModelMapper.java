package com.web.springwebapplication.util;

import com.web.springwebapplication.dto.UserDTO;
import com.web.springwebapplication.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AppModelMapper {
    private ModelMapper modelMapper = new ModelMapper();

    // DTO to entity
    public UserEntity dtoToEntity(UserDTO userDTO) {
        return modelMapper.map(userDTO, UserEntity.class);
    }

    // entity to DTO
    public UserDTO entityToDTO(UserEntity userEntity) {
        return modelMapper.map(userEntity, UserDTO.class);
    }
}
