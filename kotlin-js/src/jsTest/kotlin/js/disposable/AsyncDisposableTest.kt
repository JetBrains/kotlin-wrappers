package js.disposable

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.function.JsFunction
import js.function.invoke
import js.promise.Promise
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertTrue

class AsyncDisposableTest {
    private fun createDisposable(
        onDispose: suspend () -> Unit,
    ): AsyncDisposable {
        val onDisposeAsync = {
            IsolatedCoroutineScope().promise { onDispose() }
        }

        return JsFunction<() -> Promise<Unit>, AsyncDisposable>(
            "onDispose",
            // language=javascript
            "return {[Symbol.asyncDispose]: onDispose}"
        )(onDisposeAsync)
    }

    @Test
    fun using() = runTest {
        var isFirstDisposed = false
        val firstDisposable = createDisposable { isFirstDisposed = true }

        var isSecondDisposed = false
        val secondDisposable = createDisposable { isSecondDisposed = true }

        using {
            use(firstDisposable)
            use(secondDisposable)
        }

        assertTrue(isFirstDisposed)
        assertTrue(isSecondDisposed)
    }

    @Test
    fun usingWithError() = runTest {
        var isFirstDisposed = false
        val firstDisposable = createDisposable { isFirstDisposed = true }

        var isSecondDisposed = false
        val secondDisposable = createDisposable { isSecondDisposed = true }

        val result = runCatching {
            using {
                use(firstDisposable)
                use(secondDisposable)

                error("Test error")
            }
        }

        assertTrue(result.isFailure)
        assertTrue(isFirstDisposed)
        assertTrue(isSecondDisposed)
    }
}
