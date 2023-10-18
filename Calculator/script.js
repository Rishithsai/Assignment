// Function to display values on screen
function display(value) {
    // Selecting the input element
    let res = document.getElementById("result");
  
    // Appending the values
    res.value += value;
  }
  
  // Function to evaluate the expression
  function solve() {
    // Selecting the input element
    let res = document.getElementById("result");
  
    // Evaluating the expression and storing the result
    let ans = eval(res.value);
  
    // Displaying the result
    res.value = ans;
  }
  
  // Function to clear the screen
  function clearScreen() {
    // Selecting the input element
    let res = document.getElementById("result");
  
    // Setting the value to empty string
    res.value = "";
  }
  
  