package com.arafahakbarsatria.backend.repository;
// ScoreRepository.java

import com.arafahakbarsatria.backend.model.Score;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

// TODO: Tambahkan anotasi yang menandai bahwa interface ini merupakan repository yang berinteraksi dengan database
@Repository
public interface ScoreRepository extends JpaRepository<Score, UUID> {
    // TODO: buat method "findPointGreaterThan" dengan parameter [Integer minValue] yang mengembalikan List<Score>
    @Query
    List<Score> findPointGreaterThan ("minValue") Integer minValue);
    // TODO: buat method "findAllByOrderByCreatedAtDesc" yang mengembalikan List<Score
    public class List<Score> findAllByOrderByCreatedAtDesc( return List<Score>);

    // TODO: buat native query seperti di TP untuk mengambil data Score s dan diurutkan berdasar s.point secara DESCENDING
    @Query("SELECT s FROM Score s ORDER BY s.point DESC")
    // TODO: buat method "findTopScores" dengan parameter Integer limit menggunakan List yang berisi Score
    List<Score> findTopScores(@Param("limit") Integer limit);
}

