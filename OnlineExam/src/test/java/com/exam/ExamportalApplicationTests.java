package com.exam;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.exam.model.Quiz;
import com.exam.model.User;
import com.exam.repository.QuizRepository;
import com.exam.repository.UserRepository;
import com.exam.service.QuizService;

@SpringBootTest
class ExamportalApplicationTests {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	QuizRepository quizRepository;
	
	@Autowired
	QuizService quizService;
	
	@Test
	void addUser() {
 User user=new User(4,"jenny123","jennifer","jenny","jenny123@gmail.com","12876448","designer", true, null);
	userRepository.save(user);
	assertNotNull(userRepository.findById((long) 4).get());
	}
	
	@Test
	 void getQuiz() {
  Quiz quiz=quizService.getQuiz((long) 11) ;

  assertEquals(11,quiz.getqId());

}
}
