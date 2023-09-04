package com.makolet.melindacharlet.MakoletFeedbackApiCRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* Author Melinda Charlet */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "FEEDBACK_FORM")
public class Feedback {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String gender;
    private String phoneNumber;
    private String email;
    private String feedbackMessage;
}
