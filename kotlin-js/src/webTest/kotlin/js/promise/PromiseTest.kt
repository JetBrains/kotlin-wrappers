package js.promise

import js.core.BigInt
import js.core.n
import js.core.plus
import js.errors.JsError
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class PromiseTest {
    @Test
    fun then() = runTest {
        val value: BigInt = Promise.resolve(42.n)
            .then { it + 1.n }
            .await()

        assertEquals(43.n, value)
    }

    @Test
    fun flatThen() = runTest {
        val value: BigInt = Promise.resolve(42.n)
            .flatThen { Promise.resolve(it + 1.n) }
            .await()

        assertEquals(43.n, value)
    }

    @Test
    fun catch() = runTest {
        val value: BigInt = Promise.reject(JsError())
            .catch { 44.n }
            .await()

        assertEquals(44.n, value)
    }

    @Test
    fun flatCatch() = runTest {
        val value: BigInt = Promise.reject(JsError())
            .flatCatch { Promise.resolve(44.n) }
            .await()

        assertEquals(44.n, value)
    }
}
