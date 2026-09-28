package com.example.demo.Controller;

import com.example.demo.Models.Feedbackform;
import com.example.demo.Models.Question;
import com.example.demo.Services.FeedbackformServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feedback-forms")
public class FeedbackformController {

    private final FeedbackformServices feedbackformServices;

    public FeedbackformController(FeedbackformServices feedbackformServices) {
        this.feedbackformServices = feedbackformServices;
    }

    @PostMapping
    public Feedbackform addFeedbackform(@RequestBody Feedbackform feedbackform) {
        return feedbackformServices.addFeedbackform(feedbackform);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Feedbackform> getFeedbackformById(@PathVariable Long id) {
        return feedbackformServices.getFeedbackformById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/questions")
    public Question addQuestion(@RequestBody Question question) {
        return feedbackformServices.addQuestion(question);
    }
}
