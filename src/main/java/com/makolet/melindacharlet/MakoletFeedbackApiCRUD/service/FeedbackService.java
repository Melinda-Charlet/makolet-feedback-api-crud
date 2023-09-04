package com.makolet.melindacharlet.MakoletFeedbackApiCRUD.service;

import com.makolet.melindacharlet.MakoletFeedbackApiCRUD.entity.Feedback;
import com.makolet.melindacharlet.MakoletFeedbackApiCRUD.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* Author Melinda Charlet */

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository repository;

    /*  post method to save feedback to database */
    public Feedback saveFeedback(Feedback feedback) {
        return repository.save(feedback);
    }

    /* list of all feedbacks */
    /*  post method to save feedbacks to database */
    public List<Feedback> saveFeedback(List<Feedback> feedbacks) {
        return repository.saveAll(feedbacks);
    }

    /* get method */
    public List<Feedback> getFeedbacks() {
        return repository.findAll();
    }

    /* get method - by id */
    public Feedback getFeedbackById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    /* get method - by name */
    public Feedback getFeedbackByName(String name) {
        return repository.findByName(name);
    }

    /* delete method */
    public String deleteFeedback(Integer id) {
        repository.deleteById(id);
        return "Feedback number "+id+" is removed!";
    }

    /* update method */

    public Feedback updateFeedback (Feedback feedback){
        Feedback existingFeedback = repository.findById(feedback.getId()).orElse(null);
        existingFeedback.setFeedbackMessage(feedback.getFeedbackMessage());
        return repository.save(existingFeedback);
    }

}
