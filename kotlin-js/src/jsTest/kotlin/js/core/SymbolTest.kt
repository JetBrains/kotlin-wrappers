package js.core

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class SymbolTest {
    @Test
    fun isForWellKnownSymbol() {
        val s: Any = Symbol.hasInstance

        assertTrue(s is Symbol)
    }

    @Test
    fun isForCustomSymbol() {
        val s: Any = Symbol("custom.symbol")

        assertTrue(s is Symbol)
    }

    @Test
    fun isForObject() {
        val a = Any()

        assertFalse(a is Symbol)
    }

    @Test
    fun isForString() {
        val a: Any = "symbol"

        assertFalse(a is Symbol)
    }
}
