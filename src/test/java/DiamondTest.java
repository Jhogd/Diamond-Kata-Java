import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class DiamondTest {
    @Test
    void print_diamond (){
        assertEquals("A", Diamond.print_diamond("A"));
        assertEquals(" A\nB B\n A", Diamond.print_diamond("B"));
        assertEquals("  A\n B B\nC   C\n B B\n  A", Diamond.print_diamond("C"));
    }

    @Test
    void get_spaces (){
        assertEquals(0 , Diamond.get_spaces("A"));
        assertEquals(1 , Diamond.get_spaces("B"));
        assertEquals(2 , Diamond.get_spaces("C"));
        assertEquals(25 , Diamond.get_spaces("Z"));
    }

    @Test
    void format_triangle (){
        assertEquals("A" , Diamond.format_triangle("A"));
        assertEquals("B B" , Diamond.format_triangle("B"));
        assertEquals("C   C" , Diamond.format_triangle("C"));
        assertEquals("D     D" , Diamond.format_triangle("D"));
    }

    @Test
    void prelim_space (){
        assertEquals("" , Diamond.prelim_spaces("A", "A"));
        assertEquals(" " , Diamond.prelim_spaces("A", "B"));
        assertEquals("  " , Diamond.prelim_spaces("A", "C"));
        assertEquals("   " , Diamond.prelim_spaces("A", "D"));
    }
}