package js.reflect

import js.core.BigInt
import js.core.n
import js.globals.globalThis
import js.objects.set
import kotlin.test.Test
import kotlin.test.assertEquals

external fun externalFunctionWithUnitReturn()

external fun externalFunctionWithBigIntReturn(): BigInt

external interface F

class FunctionUnsafeCastTest {
    @Test
    fun `function with zero parameters with 'Unit' return type`() {
        globalThis["externalFunctionWithUnitReturn"] = unsafeCast<F>(value = { 37 })

        assertEquals(Unit, externalFunctionWithUnitReturn())
    }

    @Test
    fun `function with zero parameters with 'BigInt' return type`() {
        globalThis["externalFunctionWithBigIntReturn"] = unsafeCast<F>(provider = { 42.n })

        assertEquals(42.n, externalFunctionWithBigIntReturn())
    }
}
