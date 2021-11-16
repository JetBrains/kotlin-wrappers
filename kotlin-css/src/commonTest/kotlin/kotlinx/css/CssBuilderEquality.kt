package kotlinx.css

import kotlin.test.Test
import kotlin.test.assertEquals

class CssBuilderEquality {
    private fun CssBuilder.addDeclarations() {
        position = Position.relative
        display = Display.inlineBlock
        width = 16.px
        height = 16.px
    }

    @Test
    fun testBuildersEquality() {
        val first = CssBuilder().apply { addDeclarations() }
        val second = CssBuilder().apply { addDeclarations() }
        assertEquals(first, second)
    }

    @Test
    fun testBuildNotChangeEquality() {
        val first = CssBuilder().apply {
            specific { addDeclarations() }
            color = Color.blue
            specific { color = Color.red }
        }
        val second = CssBuilder().apply {
            specific { addDeclarations() }
            color = Color.blue
            specific { color = Color.red }
        }
        first.toString()
        assertEquals(first, second)
    }

    @Test
    fun testDeepBuildersEquality() {
        val first = CssBuilder().apply {
            addDeclarations()
            specific {
                addDeclarations()
                ancestorHover { addDeclarations() }
            }
        }
        val second = CssBuilder().apply {
            addDeclarations()
            specific {
                addDeclarations()
                ancestorHover { addDeclarations() }
            }
        }
        assertEquals(first, second)
    }
}
