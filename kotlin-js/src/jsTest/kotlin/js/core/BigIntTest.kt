package js.core

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class BigIntTest {
    @Test
    fun isForNumberBigInt() {
        val s: Any = 13.n

        assertTrue(s is BigInt)
    }

    @Test
    fun isForStringBigInt() {
        val s: Any = "42".n

        assertTrue(s is BigInt)
    }

    @Test
    fun isForObject() {
        val a = Any()

        assertFalse(a is BigInt)
    }

    @Test
    fun isForString() {
        val a: Any = "bigint"

        assertFalse(a is BigInt)
    }

    @Test
    fun unaryMinus() {
        assertEquals(-13.n, BigInt("-13"))
        assertEquals(-42.n, BigInt("-42"))
    }

    @Test
    fun plus() {
        assertEquals(3.n, 1.n + 2.n)
        assertEquals(55.n, 13.n + 42.n)
    }

    @Test
    fun minus() {
        assertEquals(-1.n, 1.n - 2.n)
        assertEquals(1.n, 2.n - 1.n)
        assertEquals(-29.n, 13.n - 42.n)
        assertEquals(29.n, 42.n - 13.n)
    }

    @Test
    fun times() {
        assertEquals(80.n, 16.n * 5.n)
        assertEquals(546.n, 42.n * 13.n)
    }

    @Test
    fun div() {
        assertEquals(3.n, 16.n / 5.n)
        assertEquals(-3.n, -16.n / 5.n)
        assertEquals(3.n, 42.n / 13.n)
        assertEquals(-3.n, -42.n / 13.n)
    }
}
