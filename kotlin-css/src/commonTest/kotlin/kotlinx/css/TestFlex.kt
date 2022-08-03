package kotlinx.css

import kotlin.test.Test
import kotlin.test.assertEquals

class TestFlex {
    @Test
    fun testFlexCorrectBasis() {
        val cssBuilder = CssBuilder()

        ruleSet {
            flex(1.0, 1.0, 0.pct)
        }.invoke(cssBuilder)

        assertEquals(
            """
                flex: 1 1 0%;

            """.trimIndent(),
            cssBuilder.toString(),
            "Unexpected generated CSS block"
        )
    }
}
