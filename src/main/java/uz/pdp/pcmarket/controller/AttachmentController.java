package uz.pdp.pcmarket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.pcmarket.payload.ApiResponse;
import uz.pdp.pcmarket.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    AttachmentService attachmentService;


    @PostMapping("/upload")
    public ApiResponse upload(MultipartHttpServletRequest request){
        return attachmentService.upload(request);
    }
    @GetMapping("/download/{id}")
    public ApiResponse download(@PathVariable Integer id, HttpServletResponse response){
        return attachmentService.getFile(id,response);
    }

}
