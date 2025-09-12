package js.iterable

import js.function.JsFunction
import js.function.invoke
import js.generator.AsyncGenerator
import js.generator.AsyncGeneratorFunction
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class AsyncIterableTest {
    @Test
    fun `should collect all element`() = runTest {
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

        val actualList = asyncGenerator.asFlow().toList()

        assertEquals(expectedList, actualList)
    }

    @Test
    fun `should clean iterator on error`() = runTest {
        val expectedList = listOf(4, 3)

        var isDisposeCalled = false
        val onDispose = { isDisposeCalled = true }

        val createAsyncIterable = JsFunction<() -> Unit, AsyncIterable<Int>>(
            "onDispose",
            // language=javascript
            """
            return ({
                [Symbol.asyncIterator]() {
                    return ({
                        count: 5,
                        async next() {
                            return ({
                                done: this.count-- === 0,
                                value: this.count
                            })
                        },

                        async return() { onDispose() }
                    })
                }
            })
            """
        )
        val asyncIterable = createAsyncIterable(onDispose)

        val actualList = mutableListOf<Int>()

        val result = runCatching {
            asyncIterable.asFlow().collect {
                if (it == 2) {
                    error("Error")
                } else {
                    actualList.add(it)
                }
            }
        }

        assertEquals(expectedList, actualList)
        assertTrue(result.isFailure)
        assertTrue(isDisposeCalled)
    }
}
