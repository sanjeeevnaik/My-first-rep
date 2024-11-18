# CGPA Calculator in C

A simple **CGPA Calculator** implemented in the C programming language. This program allows students to calculate their **Cumulative Grade Point Average (CGPA)** based on the grades and credit hours of their courses.

The application takes user input for the grades and credit hours of each course, then calculates the CGPA based on a specified grading system (e.g., 4.0 scale).

## Table of Contents

- [About](#about)
- [Features](#features)
- [How It Works](#how-it-works)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## About

This project is designed for students who want a quick way to calculate their CGPA using a simple C program. The program allows users to input the number of courses they have taken, along with the grade and credit hours for each course. It then computes the CGPA according to the inputted grades.

---

## Features

- **User Input for Courses:** Input course name, grade, and credit hours for each subject.
- **CGPA Calculation:** Calculates CGPA based on a 4.0 grading scale (or customizable scale).
- **Multiple Semesters:** Supports multiple courses per semester.
- **Simple Interface:** Text-based interface making it easy to use for beginners in C programming.

---

## How It Works

1. The program asks for the number of courses.
2. It then takes input for each course, including:
   - **Course Name**
   - **Credit Hours**
   - **Grade (e.g., A, B, C, etc.)**
3. Based on the grade input, the program assigns corresponding grade points (e.g., A = 4.0, B = 3.0).
4. The program then calculates the weighted average of grade points, considering the credit hours for each course, to compute the CGPA.

---

## Installation

To run the CGPA Calculator on your local machine, follow the steps below:

### Prerequisites

- A C compiler such as **GCC** (GNU Compiler Collection) installed on your machine.
- A terminal or command prompt to run the C code.

### Steps

1. Clone this repository to your local machine:
   ```bash
   git clone https://github.com/yourusername/cgpa-calculator-c.git
