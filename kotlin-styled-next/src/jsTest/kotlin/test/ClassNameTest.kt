package test

import kotlinx.css.*
import react.Props
import react.fc
import runTest
import styled.css
import styled.styledDiv
import styled.styledSpan
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ClassNameTest : TestBase() {
    private val myPrefix = "my-prefix"

    @Test
    fun classNamePrefix() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css(myPrefix) {
                    backgroundColor = Color.blue
                    height = 15.px
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        val classNames = styledElement.className.split(" ")
        assertContains(classNames, myPrefix)
        assertContains(styledElement.className, "ksc-")
        assertCssInjected(
            ".$myPrefix.ksc-",
            "background-color" to Color.blue.toString(),
            "height" to 15.px.toString()
        )
    }

    @Test
    fun differentClassNameSetup() = runTest {
        val otherClassName = "other-class-name"
        val styledComponent = fc<Props> {
            styledSpan {
                css(myPrefix) {
                    +otherClassName
                    backgroundColor = Color.blue
                    height = 15.px
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        val classNames = styledElement.className.split(" ")
        assertContains(classNames, myPrefix)
        assertContains(classNames, otherClassName)
        assertTrue(classNames.any { it.startsWith("ksc-") })

        assertCssInjected(
            "$myPrefix.ksc-",
            "background-color" to Color.blue.toString(),
            "height" to 15.px.toString()
        )
    }

    @Test
    fun testDescendants() = runTest {
        val styledComponent = fc<Props> {
            styledDiv {
                css {
                    descendants(".$myPrefix") {
                        color = secondColor
                    }
                }
                styledSpan {
                    css(myPrefix) {
                        height = 15.px
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)


        assertCssInjected(
            "$myPrefix.ksc-",
            "height" to 15.px.toString()
        )
        assertEquals(secondColor.toString(), element.childAt(0).color())
    }
}
