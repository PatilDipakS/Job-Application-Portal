function validateForm() {
    let isValid = true;

    // Get form fields
    let fullName = document.getElementById("fullName");
    let email = document.getElementById("email");
    let phone = document.getElementById("phone");
    let coverLetter = document.getElementById("coverLetter");
    let resume = document.getElementById("resume");
    let terms = document.getElementById("terms");

    // Clear previous error messages
    document.querySelectorAll(".error-message").forEach(el => el.style.display = "none");

    // Full Name Validation
    if (fullName.value.trim() === "") {
        showError(fullName, "Full Name is required");
        isValid = false;
    }

    // Email Validation
    let emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(email.value.trim())) {
        showError(email, "Enter a valid email address");
        isValid = false;
    }

    // Phone Validation
    let phonePattern = /^[0-9]{10}$/;
    if (!phonePattern.test(phone.value.trim())) {
        showError(phone, "Enter a valid 10-digit phone number");
        isValid = false;
    }

    // Cover Letter Validation
    if (coverLetter.value.trim() === "") {
        showError(coverLetter, "Cover Letter is required");
        isValid = false;
    }

    // Resume Validation
    if (resume.files.length === 0) {
        showError(resume, "Please upload a resume");
        isValid = false;
    } else {
        let allowedTypes = ["application/pdf", "application/msword", 
                            "application/vnd.openxmlformats-officedocument.wordprocessingml.document"];
        if (!allowedTypes.includes(resume.files[0].type)) {
            showError(resume, "Invalid file type. Only PDF, DOC, and DOCX allowed");
            isValid = false;
        }
    }

    // Terms and Conditions Validation
    if (!terms.checked) {
        alert("You must agree to the terms and conditions");
        isValid = false;
    }

    return isValid;
}

// Function to show error message
function showError(input, message) {
    let errorMessage = input.nextElementSibling;
    errorMessage.innerText = message;
    errorMessage.style.display = "block";
}
