
/**
 * Write a description of class Unit5A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unit5A
{
    //Q7
    public boolean substringFound(String phrase, String key, int index)
    {
        String part = phrase.substring(index, index + key.length());
        return part.equals(key);
        // 0 <= index < phrase.length() - key.length() would result in no runtime errors
    }
}
