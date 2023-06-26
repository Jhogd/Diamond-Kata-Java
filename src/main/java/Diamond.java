
public class Diamond {

    public static String print_diamond(String character){
        String new_string = "";
        String top_half = "";
        String bottom_half =  "";
        int number_spaces = Diamond.get_spaces(character);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <= number_spaces; i++){
            String current_char = Character.toString(alphabet.charAt(i));
            if (current_char.equals("A")) {
                top_half = Diamond.prelim_spaces(current_char, character) + Diamond.format_triangle(current_char);
            }
            else{
                top_half += "\n" + Diamond.prelim_spaces(current_char, character) + Diamond.format_triangle(current_char);
            }
        }
        for (int i = number_spaces-1; i>= 0; --i){
            String current_char = Character.toString(alphabet.charAt(i));
            bottom_half += "\n" + Diamond.prelim_spaces(current_char, character) + Diamond.format_triangle(current_char);
        }
        new_string = top_half + bottom_half;
    return new_string;
    }

    public static int get_spaces(String character){
        int number_spaces = 0;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < alphabet.length(); i++){
            String current_char = Character.toString(alphabet.charAt(i));
            if (current_char.equals(character)){
                number_spaces = i;
            }
        }
    return number_spaces;
    }

    public static String format_triangle(String character){
        String new_string = "";
        int number_spaces = Diamond.get_spaces(character);
        if (character.equals("A")){
            new_string = character;
        }
        else {
            new_string = " ".repeat((2 * number_spaces) -1);
            new_string = character + new_string + character;
        }
   return new_string;
    }

    public static String prelim_spaces(String character1, String character2){
        String new_string = "";
        int number_spaces_1 = Diamond.get_spaces(character1);
        int number_spaces_2 = Diamond.get_spaces(character2);
        new_string = " ".repeat(number_spaces_2 - number_spaces_1);
    return new_string;
    }

    public static void main(String[] args){
        System.out.println(Diamond.print_diamond("E"));
    }

}
