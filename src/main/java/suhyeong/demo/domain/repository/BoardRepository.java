package suhyeong.demo.domain.repository;
import suhyeong.demo.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}