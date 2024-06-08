package lesson6.markerinterfaces.exm;

public class UserService implements
        CurdService<UserDto, UserCreateDto, UserUpdateDto, Long> {
    @Override
    public Long create(UserCreateDto dto) {
        // PECS -> producer extends, consumer super
        Long a = 12L; // 24byte
        // JOL
        long a2 = 12;
        // 8byte
        return 0L;
    }

    @Override
    public UserDto read(Long aLong) {
        return null;
    }

    @Override
    public boolean update(UserUpdateDto dto) {
        return false;
    }

    @Override
    public void delete(Long aLong) {

    }
}
