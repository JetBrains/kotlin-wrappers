package js.iterable

import js.core.BigInt
import js.core.n
import js.function.invoke
import js.generator.AsyncGenerator
import js.generator.AsyncGeneratorFunction
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class AsyncIteratorTest {
    @Test
    fun `asFlow() extension`() = runTest {
        val expectedList = listOf(1.n, 2.n, 3.n)

        val createAsyncGenerator = AsyncGeneratorFunction<AsyncGenerator<BigInt, *, *>>(
            // language=javascript
            """
            yield await Promise.resolve(1n);
            yield await Promise.resolve(2n);
            yield await Promise.resolve(3n);
            """
        )
        val asyncGenerator = createAsyncGenerator()

        val actualList = asyncGenerator.asFlow().toList()

        assertEquals(expectedList, actualList)
    }
}
