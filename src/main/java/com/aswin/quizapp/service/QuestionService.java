package com.aswin.quizapp.service;

import com.aswin.quizapp.model.Question;
import com.aswin.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category)
    {
        return questionDao.findByCategory(category);
    }
}
