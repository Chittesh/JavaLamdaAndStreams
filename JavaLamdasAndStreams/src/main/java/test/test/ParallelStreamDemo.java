package test.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CourseUpdated {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public CourseUpdated(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}

public class ParallelStreamDemo {

	public static void main(String[] args) {

		long t1, t2;
		List<CourseUpdated> courses = Arrays.asList(new CourseUpdated("Spring", "Framework", 98, 20000),
				new CourseUpdated("Spring Boot", "Framework", 95, 18000),
				new CourseUpdated("API", "Microservices", 97, 22000),
				new CourseUpdated("Microservices", "Microservices", 96, 25000),
				new CourseUpdated("FullStack", "FullStack", 91, 14000), 
				new CourseUpdated("AWS", "Cloud", 92, 21000),
				new CourseUpdated("Azure", "Cloud", 99, 21000), 
				new CourseUpdated("Docker", "Cloud", 92, 20000),
				new CourseUpdated("Kubernetes", "Cloud", 91, 20000));

		/***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
		t1 = System.currentTimeMillis();
		System.out.println(
				"Sequential Stream Count?= " + courses.stream().filter(course -> course.getReviewScore() > 95).count());

		t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time Taken?= " + (t2 - t1) + "\n");

		/***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
		t1 = System.currentTimeMillis();
		System.out.println("Parallel Stream Count?= "
				+ courses.parallelStream().filter(course -> course.getReviewScore() > 95).count());

		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time Taken?= " + (t2 - t1));
	}
}