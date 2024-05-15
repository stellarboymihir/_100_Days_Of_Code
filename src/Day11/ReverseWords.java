package Day11;

public class ReverseWords {

    public static void reverseWords(char[] message){
        reverse(message, 0, message.length - 1);

        int start =0;
        for (int end = 0; end < message.length; end++){
            if (message[end] == ' '){
                reverse(message, start, end - 1);
                start = end + 1;
            }
        }
        reverse(message, start, message.length - 1);
    }

    public static void reverse(char[] arr, int left, int right){
        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] message = {
                'c', 'a', 'k', 'e', ' ',
                'p','o','u','n','d', ' ',
                's', 't', 'e', 'a', 'l'};

        reverseWords(message);
        System.out.println(new String(message));



        };


    }
