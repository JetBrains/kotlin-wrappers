package test

import kotlinx.css.backgroundColor
import react.Props
import react.fc
import runTest
import styled.GlobalStyles
import styled.css
import styled.styledSpan
import kotlin.test.Test
import kotlin.test.assertContains

/**
 * Check library APIs that are available in browser and are helping to fetch information about used CSS
 */
class BrowserAPITest : TestBase() {
    @Test
    fun getCss() = runTest {
        val styledComponent = fc<Props> {
            styledSpan { css { backgroundColor = firstColor } }
        }
        clearAndInject(styledComponent)
        val css = js("StyledNext.getCss();") as Array<String>
        assertContains(css, ".ksc-${GlobalStyles.incrementedClassName - 1} { background-color: rgb(1, 1, 1); }")
    }
}
