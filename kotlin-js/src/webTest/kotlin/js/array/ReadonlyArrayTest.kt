package js.array

import js.numbers.BigInt
import js.numbers.n
import kotlin.test.Test
import kotlin.test.assertEquals

class ReadonlyArrayTest {
    @Test
    fun `get operator - collection literal`() {
        val a: ReadonlyArray<BigInt> = [1.n, 2.n, 3.n]

        assertEquals(2.n, a[1])
    }

    @Test
    fun `size check (empty) - collection literal`() {
        val a: ReadonlyArray<BigInt> = []

        assertEquals(0, a.size)
    }

    @Test
    fun `size check [3] - collection literal`() {
        val a: ReadonlyArray<BigInt> = [1.n, 2.n, 3.n]

        assertEquals(3, a.size)
    }

    @Test
    fun `size check [7] - collection literal`() {
        val a: ReadonlyArray<BigInt> = [1.n, 2.n, 3.n, 4.n, 5.n, 6.n, 7.n]

        assertEquals(7, a.size)
    }

    @Test
    fun `toList - from non-nulable - collection literal`() {
        val a: ReadonlyArray<BigInt> = [1.n, 4.n, 7.n]

        assertEquals(listOf(1.n, 4.n, 7.n), a.toList())
    }

    @Test
    fun `toList - from nullable - collection literal`() {
        val a: ReadonlyArray<BigInt?> = [1.n, null, 4.n, null, 7.n]

        assertEquals(listOf(1.n, null, 4.n, null, 7.n), a.toList())
    }
}
