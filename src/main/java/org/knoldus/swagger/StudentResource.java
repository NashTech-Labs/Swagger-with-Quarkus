package org.knoldus.swagger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashSet;
import java.util.Set;

@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentResource {

    private Set<Student> students = new HashSet<>();

    public StudentResource() {
        students.add(new Student("Deepak", "MCA"));
        students.add(new Student("Shashi", "B.TECH"));
    }
    /**
     * Get method to get all students list.
     * @return Students list.
     */
    @GET
    public Set<Student> list() {
        return students;
    }

    /**
     * Post method tp Add student.
     * @param student the student.
     * @return added student.
     */
    @POST
    public Set<Student> add(Student student) {
        students.add(student);
        return students;
    }

    /**
     * Delete method to delete student.
     * @param student the student.
     * @return deleted student.
     */
    @DELETE
    public Set<Student> delete(Student student) {
        students.removeIf(existingStudent ->
                existingStudent.name.contentEquals(student.name));
        return students;
    }
}

