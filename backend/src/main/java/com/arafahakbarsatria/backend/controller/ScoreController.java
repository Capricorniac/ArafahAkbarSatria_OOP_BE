package com.arafahakbarsatria.backend.controller;

import com.arafahakbarsatria.backend.model.Score;
import com.arafahakbarsatria.backend.repository.ScoreRepository;
import com.arafahakbarsatria.backend.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

// TODO: tambah anotasi yang menandakan class ini merupakan REST API Controller
@RestController
// TODO: tambahkan anotasi untuk mapping api dengan "/api/scores"
@RequestMapping("/api/scores")
@CrossOrigin(origins = "*")
public class ScoreController {
    // TODO: Tambahkan anotasi untuk melakukan Dependency Injection dari Instance yang sudah ada (ScoreService)


    // TODO: Tambahkan private field untuk ScoreService
    @Autowired
    private ScoreService scoreService;

    // GET /api/scores/{scoreId}
    // TODO: tambahkan anotasi untuk maps HTTP GET ke method ini dengan path "/{scoreId}"
    @GetMapping("/{scoreId}")
    public ResponseEntity<?> getScoreById(@PathVariable UUID scoreId) {
        // TODO: buat variabel score untuk menyimpan score yang didapat dari scoreService
        // hint: gunakan tipe data Optional
        // hint: gunakan method getScoreById dari scoreService dengan parameter yang sesuai
        Optional<Score> score = scoreService.getScoreByID(scoreId);

        // cek apakah variabel score ada isinya dengan isPresent()
        if (score.isPresent()) {
            // jika ya kembalikan score yang dipost (hint: kembalikan `ResponseEntity.ok(score.get())`)
            return ResponseEntity.ok(score.get())

        // jika tidak maka kembalikan status NOT_FOUND dengan keterangan body error yang sesuai
        return ResponseEntity.ok(score.get());
    }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("{\"error\": \"Score with id " + scoreId + " not found\"}");
    }

    //POST /api/scores
    // TODO: Tambahkan anotsi untuk maps HTTP POST ke method ini
    @PostMapping
    public ResponseEntity<?> createScore(@RequestBody Score score){
        try{
            // TODO: Buat instance score baru menggunakakan scoreService dengan data yang ada dari parameter
            return ResponseEntity.status(HttpStatus.CREATED).body(new Score);
            Score newScore = scoreService.createScore(score);
            // TODO: kembalikan response data score baru dengan status CREATED
        } catch (RuntimeException e){
            // TODO: kembalikan response error dengan status BAD_REQUEST beserta body error yang sesuai
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"error\": \"" + e.getMessage() + "\"}");
        }
    }

    // TODO:
    // 1. Beri anotasi yang sesuai untuk endpoint GET beserta endpoint yang sesuai
    @
    public ResponseEntity<List<Score>> getAllScores() {
        // 2. Gunakan scoreService untuk memanggil getAllScores() dan simpan scores tersebut ke suatu variabel menggunakan List
        // 3. Kembalikan variabel berisi scores tersebut

    }

    // TODO:
    // 1. Beri anotasi yang sesuai untuk endpoint GET beserta endpoint yang sesuai
    public  ResponseEntity<List<Score>> getLeaderboardByPoint(@RequestParam(defaultValue = "10",){
	// 2. tambahkan parameter'@RequestParam' dengan defaultValue 10
    //serta Integer limit */){
        // 4. Gunakan scoreService untuk memanggil getLeaderboard() dengan parameter yang sesuai
        //    dan simpan scores tersebut ke suatu variabel menggunakan List
        List<Score> getLeaderboard(Integer limit)

        // 5. Kembalikan variabel berisi scores tersebut
        return getLeaderboard();
    }

    // TODO:
    // 1. Beri anotasi yang sesuai untuk endpoint GET beserta endpoint yang sesuai
    public ResponseEntity<List<Score>> getScoresAboveValue(@PathVariable(Integer minValue)){
        // 3. Gunakan scoreService untuk memanggil getScoreAboveValue() dengan parameter yang sesuai
        //    dan simpan scores tersebut ke suatu variabel menggunakan List
        List<Score>
        // 4. Kembalikan variabel berisi scores tersebut
    }
    // TODO:
    // 1. Beri anotasi yang sesuai untuk endpoint GET beserta endpoint yang sesuai
    public ResponseEntity<List<Score>> getRecentScores(){
        // 2. Gunakan scoreService untuk memanggil getRecentScores() dengan parameter yang sesuai
        //    dan simpan scores tersebut ke suatu variabel menggunakan List
        // 3. Kembalikan variabel berisi scores tersebut
    }

    // TODO:
    // 1. Beri anotasi yang sesuai untuk endpoint DELETE beserta endpoint yang sesuai
    public  ResponseEntity<?> deleteScore(
            /* 2. tambahkan '@PathVariable' untuk scoreId*/
    @PathVariable(scoreId)){
        // 3. buat try-catch block

        // pada try block:
        //  gunakan scoreService untuk memanggil deleteScore() dengan parameter yang sesuai
        //  kembalikan respons untuk menandakan score berhasil dihapus
        // pada catch block:
        //  kembalikan response error dengan status NOT_FOUND beserta body error yang sesuai

}



