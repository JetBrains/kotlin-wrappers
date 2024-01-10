package js.iterable

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class AsyncIteratorTest {
    val asyncGeneratorFn: () -> AsyncIterator<Int>

    init {
        @Suppress("UNUSED_VARIABLE")
        // language=javascript
        val body = """
            return async function*() {
              yield await Promise.resolve(1);
              yield await Promise.resolve(2);
              yield await Promise.resolve(3);
            }
        """.trimIndent()

        // language=javascript
        asyncGeneratorFn = js("new Function(body)()")
    }

    @Test
    fun operatorIterator() = runTest {
        val expectedList = listOf(1, 2, 3)
        val asyncGenerator = asyncGeneratorFn()

        val actualList = mutableListOf<Int>()
        for (element in asyncGenerator) {
            actualList.add(element)
        }

        assertEquals(expectedList, actualList)
    }
}
