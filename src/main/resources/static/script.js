// ======================================================
// ADD COURSE
// ======================================================

document.getElementById("courseForm").addEventListener("submit", function(event) {

    event.preventDefault();

    const course = {

        courseCode: document.getElementById("courseCode").value,

        courseName: document.getElementById("courseName").value,

        facultyName: document.getElementById("facultyName").value
    };


    console.log("Sending course:", course);


    fetch("/courses", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(course)

    })

        .then(function(response) {

            console.log("POST status:", response.status);

            if (!response.ok) {
                throw new Error("Course could not be added");
            }

            return response.json();

        })

        .then(function(data) {

            console.log("Course saved:", data);

            document.getElementById("message").className = "success";

            document.getElementById("message").innerText =
                "Course added successfully. ID = " + data.id;

            document.getElementById("courseForm").reset();

            // Automatically reload courses
            getCourses();

        })

        .catch(function(error) {

            console.error(error);

            document.getElementById("message").className = "error";

            document.getElementById("message").innerText =
                "Error: " + error.message;

        });

});


// ======================================================
// GET COURSES
// ======================================================

function getCourses() {

    console.log("Getting courses...");


    fetch("/courses")

        .then(function(response) {

            console.log("GET status:", response.status);

            if (!response.ok) {
                throw new Error("Could not get courses");
            }

            return response.json();

        })

        .then(function(data) {

            console.log("Courses received:", data);

            const coursesDiv =
                document.getElementById("courses");

            coursesDiv.innerHTML = "";


            // No courses

            if (data.length === 0) {

                coursesDiv.innerHTML =
                    "<p>No courses found.</p>";

                return;
            }


            // Display every course

            data.forEach(function(course) {

                const div = document.createElement("div");

                div.className = "course";

                div.innerHTML =

                    "<h3>" + course.courseCode + "</h3>" +

                    "<p><b>Course Name:</b> "
                    + course.courseName
                    + "</p>" +

                    "<p><b>Faculty:</b> "
                    + course.facultyName
                    + "</p>" +

                    "<p><b>Course ID:</b> "
                    + course.id
                    + "</p>";


                coursesDiv.appendChild(div);

            });

        })

        .catch(function(error) {

            console.error(error);

            document.getElementById("courses").innerHTML =
                "<p class='error'>Error loading courses.</p>";

        });

}


// ======================================================
// SUBMIT FEEDBACK
// ======================================================

document.getElementById("feedbackForm").addEventListener("submit", function(event) {

    event.preventDefault();


    const feedback = {

        feedbackform: {

            id: Number(
                document.getElementById("feedbackFormId").value
            )

        },

        question: {

            id: Number(
                document.getElementById("questionId").value
            )

        },

        studentId:
        document.getElementById("studentId").value,

        rating:
            Number(
                document.getElementById("rating").value
            )

    };


    console.log("Sending feedback:", feedback);


    fetch("/responses", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(feedback)

    })

        .then(function(response) {

            console.log("Response status:", response.status);

            if (!response.ok) {
                throw new Error("Feedback submission failed");
            }

            return response.json();

        })

        .then(function(data) {

            console.log("Feedback saved:", data);

            document.getElementById("feedbackMessage").className =
                "success";

            document.getElementById("feedbackMessage").innerText =
                "Feedback submitted successfully. Response ID = "
                + data.id;

            document.getElementById("feedbackForm").reset();

        })

        .catch(function(error) {

            console.error(error);

            document.getElementById("feedbackMessage").className =
                "error";

            document.getElementById("feedbackMessage").innerText =
                "Error: " + error.message;

        });

});