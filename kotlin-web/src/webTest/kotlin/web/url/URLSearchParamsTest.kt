package web.url

import js.iterable.iterator
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class URLSearchParamsTest {
    @Test
    fun `entries iterator of empty params`() {
        val iterator = URLSearchParams("").entries().iterator()

        val entryList = iterator.asSequence().toList()
        assertTrue(entryList.isEmpty())
    }

    @Test
    fun `entries iterator of params with 2 keys`() {
        val iterator = URLSearchParams("key1=value1&key2=value2").entries().iterator()

        val entryList = iterator.asSequence().toList()
        assertEquals(entryList.size, 2)
    }
}
