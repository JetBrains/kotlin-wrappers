package js.typedarrays

import kotlin.test.Test
import kotlin.test.assertIs

class TypedArrayTest {
    @Test
    fun Int32Array_is_TypedArray() {
        val a: Any = Int32Array()

        assertIs<TypedArray<*, *>>(a)
    }

    @Test
    fun BigInt64Array_is_TypedArray() {
        val a: Any = BigInt64Array()

        assertIs<TypedArray<*, *>>(a)
    }

    @Test
    fun Int32Array_companion_is_TypedArrayCompanion() {
        val a: Any = Int32Array

        assertIs<TypedArrayCompanion<*, *>>(a)
    }

    @Test
    fun BigInt64Array_companion_is_TypedArrayCompanion() {
        val a: Any = BigInt64Array

        assertIs<TypedArrayCompanion<*, *>>(a)
    }
}
