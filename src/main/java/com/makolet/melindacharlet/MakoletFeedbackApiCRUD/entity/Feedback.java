package com.makolet.melindacharlet.MakoletFeedbackApiCRUD.entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String gender;
    private String phoneNumber;
    private String email;
    private String feedbackMessage;
}
