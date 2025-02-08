package web.gl

import web.gl.WebGL2RenderingContext.Companion.COLOR_BUFFER_BIT
import web.gl.WebGL2RenderingContext.Companion.DEPTH_BUFFER_BIT
import kotlin.test.Test
import kotlin.test.assertEquals

class WebGL2RenderingContextTest {
    @Test
    fun clearRegularOptions() {
        assertEquals<Any>(DEPTH_BUFFER_BIT, 0x00000100)
        assertEquals<Any>(COLOR_BUFFER_BIT, 0x00004000)
    }

    @Test
    fun clearCombinedOptions() {
        assertEquals<Any>(DEPTH_BUFFER_BIT + COLOR_BUFFER_BIT, 0x00004100)
    }

    fun clearExample(gl: WebGL2RenderingContext) {
        gl.clear(DEPTH_BUFFER_BIT)
        gl.clear(COLOR_BUFFER_BIT)
        gl.clear(DEPTH_BUFFER_BIT + COLOR_BUFFER_BIT)
    }
}
