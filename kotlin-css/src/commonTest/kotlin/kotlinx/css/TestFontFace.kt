package kotlinx.css

import kotlin.test.Test
import kotlin.test.assertEquals

class TestFontFace {
    @Test
    fun testTwoFontFaces() {
        val cssBuilder = CssBuilder()

        ruleSet {
            fontFace {
                fontFamily = "'Roboto'"
                put("src", "url('Roboto.woff2') format('woff2')")
                fontWeight = FontWeight.normal
                fontStyle = FontStyle.normal
            }

            fontFace {
                fontFamily = "'Roboto'"
                put("src", "url('Roboto-Bold.woff2') format('woff2')")
                fontWeight = FontWeight.bold
                fontStyle = FontStyle.normal
            }
        }.invoke(cssBuilder)

        assertEquals(
            """
            @font-face {
            font-family: 'Roboto';
            src: url('Roboto.woff2') format('woff2');
            font-weight: normal;
            font-style: normal;
            }
            @font-face {
            font-family: 'Roboto';
            src: url('Roboto-Bold.woff2') format('woff2');
            font-weight: bold;
            font-style: normal;
            }
    
            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }
}
