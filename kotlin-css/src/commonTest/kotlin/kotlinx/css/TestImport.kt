package kotlinx.css

import kotlin.test.Test
import kotlin.test.assertEquals

class TestImport {
    @Test
    fun testImport() {
        val builder = CSSBuilder().apply {
            import("url('https://fonts.googleapis.com/css2?family=Roboto&display=swap')")
            p {
                fontFamily = "'Roboto', sans-serif"
            }
        }
        assertEquals("""
            @import url('https://fonts.googleapis.com/css2?family=Roboto&display=swap');
            p {
            font-family: 'Roboto', sans-serif;
            }
            
        """.trimIndent(), builder.toString())
    }
}