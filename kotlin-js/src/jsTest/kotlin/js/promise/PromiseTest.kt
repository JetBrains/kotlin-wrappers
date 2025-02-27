package js.promise

import js.errors.JsError
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class PromiseTest {
    @Test
    fun then() = runTest {
        val value: Int = Promise.resolve(42)
            .then { it + 1 }
            .await()

        assertEquals(43, value)
    }

    @Test
    fun flatThen() = runTest {
        val value: Int = Promise.resolve(42)
            .flatThen { Promise.resolve(it + 1) }
            .await()

        assertEquals(43, value)
    }

    @Test
    fun catch() = runTest {
        val value: Int = Promise.reject(JsError())
            .catch { 44 }
            .await()

        assertEquals(44, value)
    }

    @Test
    fun flatCatch() = runTest {
        val value: Int = Promise.reject(JsError())
            .flatCatch { Promise.resolve(44) }
            .await()

        assertEquals(44, value)
    }
}
