package com.makolet.melindacharlet.MakoletFeedbackApiCRUD.repository;

import com.makolet.melindacharlet.MakoletFeedbackApiCRUD.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

/* Author Melinda Charlet */

public interface FeedbackRepository extends JpaRepository <Feedback, Integer>{
    Feedback findByName(String name);
}
