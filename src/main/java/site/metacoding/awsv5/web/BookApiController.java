package site.metacoding.awsv5.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.awsv5.service.BookService;
import site.metacoding.awsv5.web.dto.BookRespDto;
import site.metacoding.awsv5.web.dto.BookSaveReqDto;

@RequiredArgsConstructor
@RestController
public class BookApiController {

    private final BookService bookService;

    @GetMapping("/")
    public String home() {
        return "<h1>aws-v5 \n " +
                "CICD 무중단 배포를 성공!!</h1> " +
                "IAM 생성 후 git setting에서 Access Key 설정도 완료!" +
                "환경변수 오타 수정!";
    }

    @PostMapping("/api/book")
    public ResponseEntity<?> bookSave(@RequestBody BookSaveReqDto reqDto) {
        BookRespDto respDto = bookService.책등록(reqDto);
        return new ResponseEntity<>(respDto, HttpStatus.CREATED);
    }

    @GetMapping("/api/book")
    public ResponseEntity<?> bookList() {
        List<BookRespDto> respDtos = bookService.책목록보기();
        return new ResponseEntity<>(respDtos, HttpStatus.OK);
    }
}
