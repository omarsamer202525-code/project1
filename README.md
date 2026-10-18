# Student Mark Management System - Project 1

A simple Java console application for managing undergraduate and graduate students and their marks.

## Features

- Add more than one student.
- Store marks for each student.
- Change a previously entered mark.
- Calculate the average and display the passing result.
- Undergraduate passing mark: 60. Graduate passing mark: 80.

## Project classes

- `Student`: common student details, marks, average, and pass check.
- `UndergraduateStudent`: uses 60 as the passing mark.
- `GraduateStudent`: uses 80 as the passing mark.
- `Passable`: interface for the passing-mark method.
- `StudentManager`: stores students and finds them by ID.
- `Project1OOP`: displays the menu and reads user input.

## Run the JAR

Install Java 8 or later, then run:

```text
java -jar Project1OOP.jar
```

## Open in Eclipse

1. Create a Java project.
2. Copy the `src/project1` folder into the project's `src` folder.
3. Open `Project1OOP.java` and run it as a Java application.
