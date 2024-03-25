package js.iterable

import js.function.invoke
import js.generator.AsyncGenerator
import js.generator.AsyncGeneratorFunction
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class AsyncIteratorTest {
    @Test
    fun operatorIterator() = runTest {
        val expectedList = listOf(1, 2, 3)

        val createAsyncGenerator = AsyncGeneratorFunction<AsyncGenerator<Int, *, *>>(
            // language=javascript
            """
            yield await Promise.resolve(1);
            yield await Promise.resolve(2);
            yield await Promise.resolve(3);
            """
        )
        val asyncGenerator = createAsyncGenerator()

        val actualList = mutableListOf<Int>()
        for (element in asyncGenerator) {
            actualList.add(element)
        }

        assertEquals(expectedList, actualList)
    }
}
