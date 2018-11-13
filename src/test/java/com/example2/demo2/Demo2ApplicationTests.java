package com.example2.demo2;

import com.example2.demo2.model.StudentModel;
import com.example2.demo2.service.StudentDao;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo2ApplicationTests {

	@Autowired
	private StudentDao studentDao;

	@Test
	public void testStudentDao() {

		System.out.println("testing StudentDao.findById()....");
		StudentModel studentModel = studentDao.findById(1);
		Assert.assertNotNull(studentModel);
		Assert.assertEquals(1,studentModel.getId());
		Assert.assertEquals("Hello world", studentModel.getText());
		System.out.println("success. Very good");

	}

}
