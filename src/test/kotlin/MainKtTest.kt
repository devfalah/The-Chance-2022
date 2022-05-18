import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainKtTest {

    @Test
    fun should_returnMinus1_whenGivenEmptyList() {
        //given
        val characters= listOf<String>()

        //when
        val result =calculatePercentageOfCharacterA(characters)


        //then
        assertEquals(-1.0,result)

    }
    @Test
    fun should_returnMinus1_whenAnyItemInListContainMoreThanOneCharacter() {
        //given
        val characters = listOf("aaa", "bbb", "bbb")
        //when
        val result = calculatePercentageOfCharacterA(characters)
        //then
        assertEquals(-1.0, result)
    }
    @Test
    fun should_returnMinus1_whenGivenIncorrectList() {
        //given
        val characters=listOf("as","v","a")
        //when
        val result =calculatePercentageOfCharacterA(characters)

        //then
        assertEquals(-1.0,result)
    }
    @Test
    fun should_returnPercentageOfCharacterA_whenGivenCorrectList() {
        //given
        val characters=listOf("a","b","b")
        val characters2=listOf("a","a","b")
        //when
        val result =calculatePercentageOfCharacterA(characters)
        val result2 =calculatePercentageOfCharacterA(characters2)

        //then
        assertEquals(33.3,result)
        assertEquals(66.7,result2)
    }
    @Test
    fun should_return100_whenOnlyCharacterAInList() {
        //given
        val characters = listOf("a", "a", "a")
        //when
        val result = calculatePercentageOfCharacterA(characters)
        //then
        assertEquals(100.0, result)
    }
    @Test
    fun should_return0_whenNoCharacterAInList() {
        //given
        val characters = listOf("b", "b", "b")
        //when
        val result = calculatePercentageOfCharacterA(characters)
        //then
        assertEquals(0.0, result)
    }


}