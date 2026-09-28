const API_URL = "http://localhost:8080";


// ===============================
// ADD COURSE
// ===============================

document.getElementById("courseForm").addEventListener("submit", function(event) {

    event.preventDefault();

    const course = {

        courseCode: document.getElementById("courseCode").value,

        courseName: document.getElementById("courseName").value,

        facultyName: document.getElementById("facultyName").value

    };

    fetch(`${API_URL}/courses`, {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(course)

    })

        .then(response => {

            if (!response.ok) {
                throw new Error("Failed to add course");
            }

            return response.json();

        })

        .then(data => {

            document.getElementById("courseMessage").innerText =
                "Course added successfully! Course ID: " + data.id;

            document.getElementById("courseForm").reset();

            loadCourses();

        })

        .catch(error => {

            document.getElementById("courseMessage").innerText =
                "Error: " + error.message;

        });

});


// ===============================
// GET ALL COURSES
// ===============================

function loadCourses() {

    fetch(`${API_URL}/courses`)

        .then(response => {

            if (!response.ok) {
                throw new Error("Failed to load courses");
            }

            return response.json();

        })

        .then(courses => {

            const courseList = document.getElementById("courseList");

            courseList.innerHTML = "";

            if (courses.length === 0) {

                courseList.innerHTML = "<p>No courses available.</p>";

                return;
            }

            courses.forEach(course => {

                const courseDiv = document.createElement("div");

                courseDiv.className = "course";

                courseDiv.innerHTML = `
                    <strong>${course.courseCode}</strong>
                    <br>
                    ${course.courseName}
                    <br>
                    Faculty: ${course.facultyName}
                    <br>
                    Course ID: ${course.id}
                `;

                courseList.appendChild(courseDiv);

            });

        })

        .catch(error => {

            document.getElementById("courseList").innerHTML =
                "<p>Error loading courses.</p>";

        });
}


// ===============================
// SUBMIT FEEDBACK
// ===============================

document.getElementById("feedbackForm").addEventListener("submit", function(event) {

    event.preventDefault();

    const feedback = {

        feedbackform: {

            id: Number(document.getElementById("feedbackFormId").value)

        },

        question: {

            id: Number(document.getElementById("questionId").value)

        },

        studentId: document.getElementById("studentId").value,

        rating: Number(document.getElementById("rating").value)

    };


    fetch(`${API_URL}/responses`, {

        method: "POST",

        headers: {

            "Content-Type": "application/json"

        },

        body: JSON.stringify(feedback)

    })

        .then(response => {

            if (!response.ok) {

                throw new Error("Failed to submit feedback");

            }

            return response.json();

        })

        .then(data => {

            document.getElementById("feedbackMessage").innerText =
                "Feedback submitted successfully! Response ID: " + data.id;

            document.getElementById("feedbackForm").reset();

        })

        .catch(error => {

            document.getElementById("feedbackMessage").innerText =
                "Error: " + error.message;

        });

}


// Load courses when page opens
loadCourses();