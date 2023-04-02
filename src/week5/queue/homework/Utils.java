package week5.queue.homework;

import java.util.Scanner;

public class Utils {
    private Utils(){
    }

    static String getUserInputString(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        String string = scanner.nextLine();
        return string;
    }

    static boolean askUserToContinue(String prompt){
        char answer = getUserInputChar(prompt);

        //check is the input 'e' or 'h'
        while ((answer != 'e') && (answer != 'h')){
            System.out.print("Invalid input. ");
            answer = getUserInputChar(prompt);
        }

        //'e' -> true, 'h' -> false
        return answer == 'e';
    }

    static char getUserInputChar(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt + " ");

        // keep prompting user until they enter a valid input (a single character)
        while (!scanner.hasNextLine() && scanner.nextLine().length() != 1) {
            System.out.print("Invalid input. " + prompt + " ");
            scanner.next();
        }
        char character = scanner.nextLine().charAt(0);
        return character;
    }

    static Stack fillStackWithLetters(Stack stack,String word){
        //transfer the letters of the word to the array.
        char[] letters = word.toCharArray();
        //push all the letters in the stack.
        for (int i = 0; i < letters.length; i++){
            stack.push(letters[i]);
        }
        return stack;
    }
    static Queue fillQueueWithLetters(Queue queue, String word){
        //transfer the letters of the word to the array.
        char[] letters = word.toCharArray();
        //push all the letters in the queue.
        for (int i = 0; i < letters.length; i++){
            queue.enQueue(letters[i]);
        }
        return queue;
    }



}
