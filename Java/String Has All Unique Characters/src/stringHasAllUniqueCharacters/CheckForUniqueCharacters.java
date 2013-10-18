/**
 * @author Chaitanya Bilgikar
 */
package stringHasAllUniqueCharacters;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckForUniqueCharacters {

        private HashMap<Character, Integer> stringCharacterMap;
        private String inputString;

        public String getInputString() {
                return inputString;
        }

        public void setInputString(String inputString) {
                this.inputString = inputString;
        }

        public HashMap<Character, Integer> getStringCharacterMap() {
                return stringCharacterMap;
        }

        public void setStringCharacterMap(HashMap<Character, Integer> stringCharacterMap) {
                this.stringCharacterMap = stringCharacterMap;
        }
        
        public CheckForUniqueCharacters(String inputText) {
                this.setInputString(inputText);
                this.setStringCharacterMap(new HashMap<Character, Integer>());
        }
        
        public void createHashMap()
        {
                for (char ch : this.getInputString().toCharArray())
                {
                        if(this.getStringCharacterMap().containsKey(ch))
                        {
                                int currentCount = this.getStringCharacterMap().get(ch);
                                this.getStringCharacterMap().put(ch,currentCount+1);
                        }
                        else
                        {
                                this.getStringCharacterMap().put(ch, 1);
                        }
                        
                }
        }
        
        public void testForUniqueness()
        {
                Iterator it = this.getStringCharacterMap().entrySet().iterator();
                boolean isUnique = true;
                while(it.hasNext() && isUnique)
                {
                        Map.Entry<Character, Integer> pairs = (Map.Entry<Character, Integer>) it.next();
                        if(pairs.getValue() > 1)
                        {
                                isUnique=false;
                        }

                }
                if(isUnique)
                {
                        System.out.println("String: "+this.getInputString()+"\n Is Unique");
                }
                else
                {
                        System.out.println("String: "+this.getInputString()+"\n Is NOT Unique");

                }
        }
}