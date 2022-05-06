package com.bridgelabs.Basic;

import java.util.Arrays;

public class TwoDimenssionalArray {
static int[][] snakePosition = new int[3][2];
static int[][] stairPosition = new int[3][2];


public static void main(String[] args) {
int[][] array = new int[10][10]; // new int[row_count][column_count]
/**column
* 0 1 2 3 -> column_index
* 0 1 2 3 4 // row
* 1 3 4 5 6 (1, 2) = 5
* row_index, column_index
* D2
*
* 12 13 14
*/

/*System.out.print(12);
System.out.print(13);
System.out.print(14);

System.out.println(array[0].length);*/

/*array[0][3] = 7;
array[1][2] = 7;
array[0][1] = 7;

int[] ar = array[0];*/
// System.out.println(ar.length);

// System.out.println(Arrays.toString(array[0]));

// 0 90
int positionleft = 100;
int positionRight = 100;
for (int i = 0; i < array.length; i++) {
if (i % 2 == 0) {
positionRight = positionleft;
for (int j = 0; j < array[i].length; j++) {
array[i][j] = positionRight--;
}
} else {
positionleft = positionRight;
for (int j = array[i].length - 1; j >= 0; j--) {
array[i][j] = positionleft--;
}
}

}

for (int i = 0; i < array.length; i++) {
for (int j = 0; j < array[i].length; j++) {
System.out.print(array[i][j] + "\t");
}
System.out.println();
}
snakePosition[0] = new int[]{94, 15};
snakePosition[1] = new int[]{77, 33};
snakePosition[2] = new int[]{69, 17};

stairPosition[0] = new int[]{45, 11};
stairPosition[1] = new int[]{78, 28};
stairPosition[2] = new int[]{67, 13};
// System.out.println(Arrays.deepToString(array));
//
// int[] arr = {1, 2, 3, 5}; // 4 -> they having 4 columns

/**
* random (0 to 1) including 0 and excluding 1 -> 0.0808, 0, 0.99999999999999
* 0.56/ 3 = 0
* 1 2 3 4 5 6
* 0 1
* 0 1 2
*0 1 2 3 4 5 6
*0, 0.1, 0.2, 0.3, 0.4, 0.9
* if u r dividing a double value with any number
*/


int value = (int) 0.89898;
System.out.println(value); // 0

int playerPosition = 0;
System.out.println("====== dice check =============");
boolean isGameRunning = true;
while (isGameRunning) {
int diceValue = (((int) (Math.random() * 10)) % 6) + 1; // 0 - 5 => 1 - 6
playerPosition = playerPosition + diceValue;
if (playerPosition > 100)
playerPosition = playerPosition - diceValue;
playerPosition = checkForSnake(playerPosition);
playerPosition = checkForStair(playerPosition);

System.out.print(playerPosition + ",");
if (playerPosition == 100)
isGameRunning = false;
}

/**
* 0.98 // 9.8
/* *//*
System.out.println(89.7 / 2);
System.out.println(89f / 2); // 1 44.*/

}

private static Integer checkForSnake(int playerPosition) {
for (int i = 0; i < snakePosition.length; i++) {
if (playerPosition == snakePosition[i][0])
return snakePosition[i][1];
}
return playerPosition;
}

private static Integer checkForStair(int playerPosition) {
for (int i = 0; i < snakePosition.length; i++) {
if (playerPosition == snakePosition[i][1])
return snakePosition[i][0];
}
return playerPosition;
}
}