import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UTest {

    @Test
    public void UnitTest(){
        List<String> list = Arrays.asList(
                "The cow jumped over the moon."  ,
                "The cowboy jumped over the moon.",
                "The cow...., jumped! over3 4the6 moon."
        );



        Assertions.assertEquals(6, StringUtils.lengthOfLongestWord(list.get(0)));
        Assertions.assertEquals(Collections.singletonList("jumped"), StringUtils.longestWords(list.get(0)));

        Assertions.assertEquals(6, StringUtils.lengthOfLongestWord(list.get(1)));
        Assertions.assertEquals(Arrays.asList("cowboy", "jumped") , StringUtils.longestWords(list.get(1)));

        Assertions.assertEquals(6, StringUtils.lengthOfLongestWord(list.get(2)));
        Assertions.assertEquals(Collections.singletonList("jumped"), StringUtils.longestWords(list.get(2)));

    }

    @Test
    public void Test(){
        String str = "The cow jumped over the moon.";
        StringUtils.showLongestWords(str);


    }
}
