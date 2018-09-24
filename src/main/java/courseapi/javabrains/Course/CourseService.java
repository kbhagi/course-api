package courseapi.javabrains.Course;

import courseapi.javabrains.springbootstarter.Topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    public CourseRepository courseRepository;


public List<Course> getAllCourses() {
//return topics;
    List<Course> courses = new ArrayList<>();
    courseRepository.findAll()
    .forEach(courses::add);
    return courses;
}

public Course getCourse(String id)
{
    return courseRepository.findOne(id);
}

    public void addCourse(Course topic) {
    courseRepository.save(topic);
    }


    public void updateCourse(Course course) {
        courseRepository.save(course);
    }


    public void deleteCourse(String id) {
     courseRepository.delete(id);
    }
}
