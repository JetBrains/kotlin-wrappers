package js.coroutines

import js.core.Void
import js.coroutines.internal.IsolatedCoroutineScope
import js.errors.JsError
import js.errors.name
import js.promise.catch
import js.symbol.Symbol
import kotlinx.coroutines.test.runTest
import kotlin.coroutines.suspendCoroutine
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class CoroutineScopeTest {
    @Test
    fun promise() = runTest {
        val scope = IsolatedCoroutineScope()
        val promise = scope.promise<Void> {
            suspendCoroutine { }
        }

        promise[Symbol.dispose]()

        val result = promise.catch { it }.await()

        assertIs<JsError>(result)
        assertEquals(JS_CANCELLATION_ERROR, result.name)
    }
}
