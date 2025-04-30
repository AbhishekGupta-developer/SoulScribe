package in.co.soulscribe.service;

import in.co.soulscribe.dto.UserResponseDTO;

import java.util.List;

public interface UserService {
    UserResponseDTO addUser(UserResponseDTO userResponseDTO);
    UserResponseDTO getUser(Long id);
    List<UserResponseDTO> getAllUsers();
    UserResponseDTO updateUser(Long id, UserResponseDTO userResponseDTO);
    String removeUser(Long id);

}
