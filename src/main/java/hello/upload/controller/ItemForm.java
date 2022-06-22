package hello.upload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

// 상ㅍ무 저장용 폼
@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private List<MultipartFile> imageFiles; // 이미지를 다중 업로드 하기위해 사용
    private MultipartFile attachFile; // 멀티파트는 @ModelAttribute에서 사용 가능


}
