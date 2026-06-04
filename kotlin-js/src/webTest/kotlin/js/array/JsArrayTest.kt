package js.array

import js.numbers.BigInt
import js.numbers.n
import kotlin.test.Test
import kotlin.test.assertEquals

class JsArrayTest {
    @Test
    fun `get operator`() {
        val a = jsArrayOf(1.n, 2.n, 3.n)

        assertEquals(2.n, a[1])
    }

    @Test
    fun `size check (empty)`() {
        val a = jsArrayOf<BigInt>()

        assertEquals(0, a.size)
    }

    @Test
    fun `size check [3]`() {
        val a = jsArrayOf(1.n, 2.n, 3.n)

        assertEquals(3, a.size)
    }

    @Test
    fun `size check [7]`() {
        val a = jsArrayOf(1.n, 2.n, 3.n, 4.n, 5.n, 6.n, 7.n)

        assertEquals(7, a.size)
    }
}
