package spring.boot.core.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 用户持久层操作接口
 *
 * Created by bysocket on 21/07/2017.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
