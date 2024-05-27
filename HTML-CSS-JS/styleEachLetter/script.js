document.addEventListener("DOMContentLoaded", function() {
    const title = document.getElementById("title");
    const text = title.innerText;
    title.innerHTML = ""; // Clear the original text

    // Create SVG for each letter
    for (let i = 0; i < text.length; i++) {
        const letter = text[i];
        const svg = document.createElementNS("http://www.w3.org/2000/svg", "svg");
        svg.setAttribute("class", "svg-letter");
        svg.setAttribute("viewBox", "0 0 40 60"); // Adjusted to better fit the letter size
        svg.setAttribute("preserveAspectRatio", "xMinYMin meet");

        const textElement = document.createElementNS("http://www.w3.org/2000/svg", "text");
        textElement.setAttribute("x", "0");
        textElement.setAttribute("y", "0"); // Adjusted to better fit the letter position
        textElement.setAttribute("class", `svg-text letter-${i + 1}`);
        textElement.textContent = letter;

        svg.appendChild(textElement);
        title.appendChild(svg);
    }
});
