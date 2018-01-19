/*
 * This is the class that represents an iteration of the algorithm.
 */
public class State {
    
    // Entries is a character A, B, C, D, E, F, G, H for the related task, or X for unknown
    public char[] entries;
    // Penalty is current penalty value
    public int penalty;
    
    public State(char[] entries) {
        this(entries, 0);
    }
    
    public State(char[] entries, int penalty) {
        this.entries = entries;
        this.penalty = penalty;
    }
    
    
}
