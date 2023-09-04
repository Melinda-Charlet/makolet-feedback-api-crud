package com.makolet.melindacharlet.MakoletFeedbackApiCRUD.controller;

import com.makolet.melindacharlet.MakoletFeedbackApiCRUD.entity.Feedback;
import com.makolet.melindacharlet.MakoletFeedbackApiCRUD.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/* Author Melinda Charlet */

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackService service;

    @PostMapping("/addFeedback")
    public Feedback addFeedback(@RequestBody Feedback feedback){
    return service.saveFeedback(feedback);
    }

    @PostMapping("/addFeedbacks")
    public List <Feedback> addFeedbacks(@RequestBody  List <Feedback> feedbacks){
        return service.saveFeedback(feedbacks);
    }

    @GetMapping("/feedbacks")
    public List <Feedback> findAllFeedback(){
        return service.getFeedbacks();
    }

    @GetMapping("/feedbackById/{id}")
    public Feedback findFeedbackById(@PathVariable int id){
        return service.getFeedbackById(id);
    }

    @GetMapping("/feedbackByName/{name}")
    public Feedback findFeedbackByName(@PathVariable String name){
        return service.getFeedbackByName(name);
    }

    @PutMapping("/update")
    public Feedback updateFeedback (@RequestBody Feedback feedback){
        return service.updateFeedback(feedback);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFeedback(@PathVariable int id){
        return service.deleteFeedback(id);
    }
}
