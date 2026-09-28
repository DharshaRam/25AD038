package com.example.demo.Services;

import com.example.demo.Models.Feedbackform;
import com.example.demo.Models.Question;
import com.example.demo.Repository.FeedbackformRepository;
import com.example.demo.Repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FeedbackformServices {

    private final FeedbackformRepository feedbackformRepository;
    private final QuestionRepository questionRepository;

    public FeedbackformServices(FeedbackformRepository feedbackformRepository,
                                QuestionRepository questionRepository) {
        this.feedbackformRepository = feedbackformRepository;
        this.questionRepository = questionRepository;
    }

    public Feedbackform addFeedbackform(Feedbackform feedbackform) {
        return feedbackformRepository.save(feedbackform);
    }

    public Optional<Feedbackform> getFeedbackformById(Long id) {
        return feedbackformRepository.findById(id);
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }
}