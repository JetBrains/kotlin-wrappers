package js.reflect

import js.array.ArrayLike
import js.array.ReadonlyArray
import js.array.jsArrayOf
import js.numbers.n
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@JsQualifier("Array")
external val isArray: TypeGuard<JsAny?, ReadonlyArray<*>>

@JsQualifier("Array")
@JsName("isArray")
external val isArrayLike: TypeGuard<JsAny?, ArrayLike<*>>

class TypeGuardTest {
    @Test
    fun `is Array`() {
        val a: JsAny = jsArrayOf(1.n, 2.n, 3.n)

        assertTrue(isArray(a))
        assertEquals(2.n, a[1])
    }

    @Test
    fun `is ArrayLike`() {
        val a: JsAny = jsArrayOf(1.n, 2.n, 3.n, 4.n)

        assertTrue(isArrayLike(a))
        assertEquals(3.n, a[2])
    }
}
