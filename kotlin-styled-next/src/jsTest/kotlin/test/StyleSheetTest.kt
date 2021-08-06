package test

import kotlinx.css.*
import react.RProps
import react.fc
import runTest
import styled.GlobalStyles
import styled.css
import styled.styledSpan
import test.styleSheets.SimpleStyleSheet
import test.styleSheets.StaticStyleSheet
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class StyleSheetTest : TestBase() {
    private lateinit var simpleStyleSheet: SimpleStyleSheet
    private lateinit var staticStyleSheet: StaticStyleSheet

    @BeforeTest
    override fun before() {
        super.before()
        simpleStyleSheet = SimpleStyleSheet()
        staticStyleSheet = StaticStyleSheet()
    }

    @Test
    fun styleSheetNotInjectedWithoutComponent() = runTest {
        CssBuilder().apply {
            +staticStyleSheet.property1
        }
        val rules = getStylesheet().cssRules
        assertEquals(GlobalStyles.scheduledRules.size, 1)
        assertEquals(0, rules.length)
    }

    @Test
    fun styleSheet() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    +simpleStyleSheet.simpleProperty
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertCssInjected(
            styledElement.className, listOf(
                "min-height" to 66.px.toString(),
                "padding" to 0.px.toString()
            )
        )
    }

    @Test
    fun styleSheetStaticTest() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    +staticStyleSheet.property1
                    +staticStyleSheet.property2
                }
            }
        }
        val classNames = clearAndInject(styledComponent).className.split(" ")
        assertContains(classNames, "StaticStyleSheet-property1")
        assertContains(classNames, "StaticStyleSheet-property2")
        assertCssInjected(
            "StaticStyleSheet-property1", listOf(
                "align-content" to "end",
            )
        )
        assertCssInjected(
            "StaticStyleSheet-property2", listOf(
                "padding" to 40.px.toString(),
                "min-height" to 50.px.toString(),
            )
        )
    }

    @Test
    fun styleSheetSpecificTest() = runTest {
        val styledComponent = fc<RProps> {
            styledSpan {
                css {
                    +simpleStyleSheet.simpleProperty
                    +simpleStyleSheet.specificProperty
                }
            }
        }
        val element = clearAndInject(styledComponent)
        val className = element.className
        assertCssInjected(
            ".$className.$className", listOf(
                "padding" to 80.px.toString(),
                "border" to "none"
            )
        )

        assertEquals("80px", element.getStyle().padding)
    }
}