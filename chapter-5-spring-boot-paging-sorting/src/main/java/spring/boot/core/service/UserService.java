package spring.boot.core.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import spring.boot.core.domain.User;

/**
 * User 业务层接口
 *
 * Created by bysocket on 24/07/2017.
 */
public interface UserService {

    Page<User> findByPage(Pageable pageable);

    User insertByUser(User user);
}
