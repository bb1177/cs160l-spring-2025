package edu.sdsu.cs160l.datastructure.queue;

import edu.sdsu.cs160l.student.Student;
import edu.sdsu.cs160l.student.StudentLevel;
import edu.sdsu.cs160l.student.StudentMajor;
import jdk.javadoc.internal.tool.JavadocTodo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * In class explanation + demonstration
 * Note a queue in java is implemented as a {@link java.util.LinkedList}
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add an element - takes O(1)
        queue.add(1);
        queue.offer(2);

        //check top most element takes O(1) time
        Integer top = queue.peek();

        //remove element take O(1) time
        Integer ele = queue.poll();

        queue.clear();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(6);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        // TODO - Create a queue of students 5 students
        // TODO - initialise 5 students and add them to the queue
        // TODO - remove the first two students and add 1 student
        // TODO - print the final queue

        Queue<Student> studentQueue = new LinkedList<>();

        Student s1 = new Student(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        Student s2 = new Student(2L, "Jane", 3.8, StudentLevel.SOPHOMORE, StudentMajor.COMPUTER_ENGINEERING);
        Student s3 = new Student(3L, "Mike", 3.5, StudentLevel.JUNIOR, StudentMajor.COMPUTER_SCIENCE);
        Student s4 = new Student(4L, "Sara", 3.9, StudentLevel.SENIOR, StudentMajor.COMPUTER_ENGINEERING);
        Student s5 = new Student(5L, "Alex", 3.7, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
        
        studentQueue.add(s1);
        studentQueue.add(s2);
        studentQueue.add(s3);
        studentQueue.add(s4);
        studentQueue.add(s5);
        
        studentQueue.poll();
        studentQueue.poll();
        
        Student s6 = new Student(6L, "Chris", 3.6, StudentLevel.JUNIOR, StudentMajor.COMPUTER_ENGINEERING);
        studentQueue.add(s6);
        
        while (!studentQueue.isEmpty()) {
            Student s = studentQueue.poll();
            System.out.println(s.getRedId() + " " + s.getName());
        }

        Student john = new Student(1L, "John", 4.0, StudentLevel.FRESHMAN, StudentMajor.COMPUTER_SCIENCE);
    }
}
