package js.errors

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class SyntaxErrorTest {
    @Test
    fun testSimpleCreation() {
        val error = SyntaxError()

        assertIs<SyntaxError>(error)
    }

    @Test
    fun testMessage() {
        val error = SyntaxError("!!!SYNTAX ERROR DETECTED!!!")

        assertEquals("!!!SYNTAX ERROR DETECTED!!!", error.message)
    }
}
