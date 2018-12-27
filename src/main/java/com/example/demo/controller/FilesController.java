package com.example.demo.controller;

import com.example.demo.domain.JasonData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class FilesController {
    @RequestMapping(value = "/api/v1/test")
    public Object index(){
        return "index";
    }

    @RequestMapping(value = "/api/v1/po")
    public Object index2(){
        return "po";
    }

    private static String filePath="D://Project/demo/src//main/resources/static/images/";

    @RequestMapping(value = "upload")
    @ResponseBody
    public JasonData upload(@RequestParam("head_img")MultipartFile file, HttpServletRequest request){

        //获取提交表单的name参数
        String name=request.getParameter("name");

        //获取选择的文件名
        String filenameame=file.getOriginalFilename();

        //获取后缀
        String fixName=filenameame.substring(filenameame.lastIndexOf("."));

        String fileNewName= UUID.randomUUID()+fixName;
        File dest= new File(filePath+fileNewName);

        try {
            file.transferTo(dest);
            return new JasonData(1,"上传成功",fileNewName);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JasonData(0,"上传失败",null);


    }


}
