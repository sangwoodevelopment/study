package com.example.mongo.controller;

import com.example.mongo.dto.ScoreDTO;
import com.example.mongo.service.ScoreMongoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/score")
@RequiredArgsConstructor
public class ScoreController {
    private final ScoreMongoService service;

    @GetMapping("/list")
    public String mongolist(Model model){
        List<ScoreDTO> list = service.findAll();
        model.addAttribute("mongolist", list);
        return "mongo/list";
    }
    //insert
    @GetMapping("/insert")
    public String insertPage(){
        return "mongo/mongo_insert";
    }
    @PostMapping("/insert")
    public String insert(ScoreDTO document){
        System.out.println("컨트롤러:"+document);
        service.insertDocument(document);
        return "redirect:/score/list";
    }
    @GetMapping("/multi/insert")
    public String multiInsert(){
        List<ScoreDTO> docs = new ArrayList<>();
        ScoreDTO document = null;
        for(int i=1; i<=10; i++) {
            document = new ScoreDTO(null, "multi" + i, "multi" + i, "전산실", "서울특별시", 100, 100);
            docs.add(document);
        }
        service.insertAllDocument(docs);
        return "redirect:/score/list";
    }
    @GetMapping("/paginglist")
    public String pagelist(@RequestParam("pageNo") String pageNo,Model model){
        List<ScoreDTO> pagelist = service.findAll(Integer.parseInt(pageNo));
        model.addAttribute("mongolist",pagelist);
        return "mongo/list";
    }
}
