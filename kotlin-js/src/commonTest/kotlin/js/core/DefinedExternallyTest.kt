package js.core

import kotlin.test.Test
import kotlin.test.assertEquals

class DefinedExternallyTest {
    @Test
    fun parameters_0() {
        val a = StringArray()

        assertEquals(0, a.length)
    }

    @Test
    fun parameters_1() {
        val a = StringArray(
            "aaa",
        )

        assertEquals(1, a.length)
    }

    @Test
    fun parameters_2() {
        val a = StringArray(
            "aaa",
            "bbb",
        )

        assertEquals(2, a.length)
    }

    @Test
    fun parameters_3() {
        val a = StringArray(
            "aaa",
            "bbb",
            "ccc",
        )

        assertEquals(3, a.length)
    }

    @Test
    fun parameters_4() {
        val a = StringArray(
            "aaa",
            "bbb",
            "ccc",
            "ddd",
        )

        assertEquals(4, a.length)
    }
}
