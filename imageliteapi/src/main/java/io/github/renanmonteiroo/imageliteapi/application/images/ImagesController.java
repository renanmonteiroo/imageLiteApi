package io.github.renanmonteiroo.imageliteapi.application.images;



import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/v1/images")
@Slf4j
public class ImagesController {

    @PostMapping
    public ResponseEntity save(
        @RequestParam(value ="file", required = false) MultipartFile file,
        @RequestParam("name") String name,
        @RequestParam("tags") List<String> tags
        ){
    log.info("Imagem recebida: name: {} , size: {}" , file.getOriginalFilename(),file.getSize());
    log.info("Nome definido para imagem: {}", tags);
    return ResponseEntity.ok().build();
    }

}
