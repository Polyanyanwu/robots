# Robots Movement simulation

## Purpose

The program will take instructions from a user and move the robot to the desired location represented by x and y coordinates and the final direction of the robot.

## Run the App

Open a terminal and type java robot.java

## Command format

The robot takes command
L: Turn the robot left
R: Turn the robot right
F: Move forward on it's facing direction
Sample command string: LFLRFLFF

The program runs on the command line and the user is prompted to make two inputs:

1. the size of the grid, e.g 5x5
2. the instructions to give to the robot e.g. LFLRFLFF

The application will respond with the current position of the robot after executing the instructions. The response is a printout on the command line.

Note that it is assumed that the user is entering valid data as validation of the inputted data is not considered. However. entering wrong grid size will cause the program to default to 5x5 instead of crashing.

For the instructions, entering letters outside of the "LRF" will be ignored.

## Test Case

The application was thoroughly tested including edge cases. Some of the test samples are given below:

| Grid | Command | Expected Outcome | Result      | Note                                                                                                           |
|------|---------|------------------|-------------|----------------------------------------------------------------------------------------------------------------|
| 3X3  | RFFFFFF | 3,1, East        | 3,1, East   | Robot ireaches the maximum x cordinate and ignores the rest of the F command                                   |
| 3X3  | LFFFFFF | 1,1, West        | 1,1, West   | Robot turns left and faces West, its already at x=1 and the remaining F commands are ignored                   |
| 3X3  | LLFFFF  | 1,1, South       | 1,1, South  | Robot turns left twice faces South, its already at 1 and can't move further south                              |
| 3X3  | FFFLLF  | 1, 2, South      | 1, 2, South | Robot moves forward 3 times reaches 1, 3 then turns left twice faces South moves once and ends up at 1,2 South |
