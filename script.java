// script.js
document.addEventListener('DOMContentLoaded', () => {
    const contentDiv = document.getElementById('content');

    /*Line for name */
    const name = document.createElement('h1'); /*Header element */
    name.textContent = 'Zyriyah Stoker';
    contentDiv.appendChild(name);

    /*Line for major */
    const major = document.createElement('p'); /*Paragraph element */
    major.textContent = 'Major: Computer Science';
    contentDiv.appendChild(major);

    /*Line for email adress */
    const email = document.createElement('p');
    const emailLink = document.createElement('a');
    emailLink.href = 'mailto:zyrstoker@uat.edu';
    emailLink.textContent = 'zyrstoker@uat.edu';
    email.appendChild(emailLink);
    contentDiv.appendChild(email);

    /*Graduation date line */
    const gradDate = document.createElement('p');
    gradDate.textContent = 'Graduation Date: 2025';
    contentDiv.appendChild(gradDate);
});
