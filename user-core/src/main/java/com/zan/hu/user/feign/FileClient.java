package com.zan.hu.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @version 1.0
 * @Author hupeng
 * @Date 2019-06-17 10:33
 * @Description todo
 **/
@FeignClient(value = "file-server", configuration = com.zan.hu.FeignMultipartSupportConfig.class)
@RequestMapping("/api/file")
public interface FileClient {

    @PostMapping(value = "/upload", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    String singleUpload(@RequestPart(value = "file") MultipartFile file);

    @PostMapping(value = "/uploads", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    List<String> multiUpload(@RequestPart("files") MultipartFile[] files);
}
