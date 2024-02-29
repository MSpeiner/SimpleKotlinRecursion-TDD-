package TomteHirrarkinTest

import TomteHirrarkin.Tomteland
import org.junit.Assert.assertEquals
import org.junit.Test

class TomtelandTest {
    val tomteland = Tomteland()

    @Test
    fun testGetUnderlingsTomten() {
        val expectedResult = listOf(
            "bladlusen", "blyger", "butter", "dammråttan", "glader", "gråsuggan",
            "haren", "myran", "nyckelpigan", "räven", "rådjuret", "skumtomten",
            "tröger", "trötter"
        )
        val actualResult = tomteland.getUnderlings("tomten", tomteland.tomteHirrarkin)
        assertEquals(expectedResult, actualResult.sorted())
    }
    @Test
    fun testGetUnderlingsGlader() {
        val expected = listOf("blyger", "dammråttan", "skumtomten", "tröger", "trötter")
        val actualResult = tomteland.getUnderlings("glader", tomteland.tomteHirrarkin)
        assertEquals(expected.sorted(), actualResult.sorted())
    }

    @Test
    fun testGetUnderlingsButter() {
        val expected = listOf("bladlusen", "gråsuggan", "haren", "myran", "nyckelpigan", "räven", "rådjuret")
        val actualResult = tomteland.getUnderlings("butter", tomteland.tomteHirrarkin)
        assertEquals(expected.sorted(), actualResult.sorted())
    }
    @Test
    fun testGetUnderlingsTrötter() {
        val expected = listOf("skumtomten", "dammråttan")
        val actualResult = tomteland.getUnderlings("trötter", tomteland.tomteHirrarkin)
        assertEquals(expected.sorted(), actualResult.sorted())
    }
    @Test
    fun testGetUnderlingsSkumtomten() {
        val expected = listOf("dammråttan")
        val actualResult = tomteland.getUnderlings("skumtomten", tomteland.tomteHirrarkin)
        assertEquals(expected.sorted(), actualResult.sorted())
    }
    @Test
    fun testGetUnderlingsRäven() {
        val expected = listOf("gråsuggan", "myran", "bladlusen")
        val actualResult = tomteland.getUnderlings("räven", tomteland.tomteHirrarkin)
        assertEquals(expected.sorted(), actualResult.sorted())
    }
    @Test
    fun testGetUnderlingsMyran() {
        val expected = listOf("bladlusen")
        val actualResult = tomteland.getUnderlings("myran", tomteland.tomteHirrarkin)
        assertEquals(expected.sorted(), actualResult.sorted())
    }

    @Test
    fun testGetUnderlingsDammråttan() {
        val expected = emptyList<String>()
        val actualResult = tomteland.getUnderlings("dammråttan", tomteland.tomteHirrarkin)
        assertEquals(expected, actualResult)
    }

    @Test
    fun testGetUnderlingsGråsuggan() {
        val expected = emptyList<String>()
        val actualResult = tomteland.getUnderlings("gråsuggan", tomteland.tomteHirrarkin)
        assertEquals(expected, actualResult)
    }

    @Test
    fun testGetUnderlingsBladlusen() {
        val expected = emptyList<String>()
        val actualResult = tomteland.getUnderlings("bladlusen", tomteland.tomteHirrarkin)
        assertEquals(expected, actualResult)
    }
    @Test
    fun testGetUnderlingsBlyger() {
        val expected = emptyList<String>()
        val actualResult = tomteland.getUnderlings("blyger", tomteland.tomteHirrarkin)
        assertEquals(expected, actualResult)
    }
    @Test
    fun testGetUnderlingsTröger() {
        val expected = emptyList<String>()
        val actualResult = tomteland.getUnderlings("tröger", tomteland.tomteHirrarkin)
        assertEquals(expected, actualResult)
    }
    @Test
    fun testGetUnderlingsRådjuret() {
        val expected = emptyList<String>()
        val actualResult = tomteland.getUnderlings("rådjuret", tomteland.tomteHirrarkin)
        assertEquals(expected, actualResult)
    }
    @Test
    fun testGetUnderlingsNyckelpigan() {
        val expected = emptyList<String>()
        val actualResult = tomteland.getUnderlings("nyckelpigan", tomteland.tomteHirrarkin)
        assertEquals(expected, actualResult)
    }

    @Test
    fun testGetUnderlingsHaren() {
        val expected = emptyList<String>()
        val underlings = tomteland.getUnderlings("haren", tomteland.tomteHirrarkin)
        assertEquals(expected, underlings)
    }

}