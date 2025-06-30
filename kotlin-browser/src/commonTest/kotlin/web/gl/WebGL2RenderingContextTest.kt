package web.gl

import js.core.JsPrimitives.toJsInt
import js.core.contains
import js.core.plus
import web.gl.WebGL2RenderingContext.Companion.COLOR_BUFFER_BIT
import web.gl.WebGL2RenderingContext.Companion.DEPTH_BUFFER_BIT
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class WebGL2RenderingContextTest {
    @Test
    fun clearRegularOptions() {
        assertEquals<Any>(DEPTH_BUFFER_BIT, 0x00000100.toJsInt())
        assertEquals<Any>(COLOR_BUFFER_BIT, 0x00004000.toJsInt())
    }

    @Test
    fun clearCombinedOptions() {
        assertEquals<Any>(DEPTH_BUFFER_BIT + COLOR_BUFFER_BIT, 0x00004100.toJsInt())
    }

    @Test
    fun clearContainsOptions() {
        val combined = DEPTH_BUFFER_BIT + COLOR_BUFFER_BIT

        // Test that a combined bitmask contains individual bits
        assertTrue(DEPTH_BUFFER_BIT in combined)
        assertTrue(COLOR_BUFFER_BIT in combined)

        // Test that individual bits don't contain other bits
        assertFalse(DEPTH_BUFFER_BIT in COLOR_BUFFER_BIT)
        assertFalse(COLOR_BUFFER_BIT in DEPTH_BUFFER_BIT)
    }


    fun clearExample(gl: WebGL2RenderingContext) {
        gl.clear(DEPTH_BUFFER_BIT)
        gl.clear(COLOR_BUFFER_BIT)
        gl.clear(DEPTH_BUFFER_BIT + COLOR_BUFFER_BIT)
    }
}
