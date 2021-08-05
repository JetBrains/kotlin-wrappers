package test

import kotlinx.css.CssBuilder
import kotlinx.css.color
import kotlinx.html.ButtonType
import kotlinx.html.InputType
import react.RProps
import react.dom.*
import react.fc
import runTest
import styled.*
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Check every public interface function in [CssBuilder]
 */
class PseudoClassRulesTest : TestBase() {
    @Test
    fun active() = runTest {
        val styledComponent = fc<RProps> {
            styledButton {
                css {
                    color = firstColor
                    active {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)

        // We can't set :active with plain js
        assertCssInjected("${element.className}:active", listOf("color" to secondColor.toString()))
    }

    @Test
    fun checked() = runTest {
        val styledComponent = fc<RProps> {
            styledInput(type = InputType.checkBox) {
                css {
                    color = firstColor
                    checked {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)

        element.asInput().checked = true

        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun default() = runTest {
        val styledComponent = fc<RProps> {
            styledForm {
                css {
                    "button" {
                        color = firstColor
                        default {
                            color = secondColor
                        }
                    }
                }
                button(type = ButtonType.reset) { }
                button(type = ButtonType.submit) { }
            }
        }
        val element = clearAndInject(styledComponent)
        val button = element.childAt(0)
        val defaultButton = element.childAt(1)
        assertEquals(firstColor.toString(), button.getStyle().color)
        assertEquals(secondColor.toString(), defaultButton.getStyle().color)
    }

    @Test
    fun disabled() = runTest {
        val styledComponent = fc<RProps> {
            styledForm {
                css {
                    "button" {
                        color = firstColor
                        disabled {
                            color = secondColor
                        }
                    }
                }
                styledButton { }
                styledButton { attrs { disabled = true } }
            }
        }
        val element = clearAndInject(styledComponent)
        val button = element.childAt(0)
        val disabledButton = element.childAt(1)
        assertEquals(firstColor.toString(), button.getStyle().color)
        assertEquals(secondColor.toString(), disabledButton.getStyle().color)
    }

    @Test
    fun empty() = runTest {
        val styledComponent = fc<RProps> {
            styledForm {
                css {
                    "button" {
                        color = firstColor
                        empty { color = secondColor }
                    }
                }
                styledButton { +"button" }
                styledButton { }
            }
        }
        val element = clearAndInject(styledComponent)
        val button = element.childAt(0)
        val emptyColor = element.childAt(1)
        assertEquals(firstColor.toString(), button.getStyle().color)
        assertEquals(secondColor.toString(), emptyColor.getStyle().color)
    }

    @Test
    fun enabled() = runTest {
        val styledComponent = fc<RProps> {
            styledForm {
                css {
                    "button" {
                        color = firstColor
                        enabled {
                            color = secondColor
                        }
                    }
                }
                styledButton { }
                styledButton { attrs { disabled = true } }
            }
        }
        val element = clearAndInject(styledComponent)
        val button = element.childAt(0)
        val disabledButton = element.childAt(1)
        assertEquals(firstColor.toString(), disabledButton.getStyle().color)
        assertEquals(secondColor.toString(), button.getStyle().color)
    }

    @Test
    fun firstChild() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div" {
                        color = firstColor
                        firstChild { color = secondColor }
                    }
                }
                div {}
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        val first = element.childAt(0)
        val second = element.childAt(1)
        assertEquals(secondColor.toString(), first.getStyle().color)
        assertEquals(firstColor.toString(), second.getStyle().color)
    }

    @Test
    fun firstOfType() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "span" {
                        color = firstColor
                        firstOfType {
                            color = secondColor
                        }
                    }
                }
                div {}
                span {}
                span {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(secondColor.toString(), element.childAt(1).getStyle().color)
        assertEquals(firstColor.toString(), element.childAt(2).getStyle().color)
    }

    @Test
    fun focus() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                css {
                    color = firstColor
                    focus {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().focus()
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun focusVisible() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                css {
                    color = firstColor
                    focusVisible {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().focus()
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun focusWithin() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    color = firstColor
                    focusWithin {
                        color = secondColor
                    }
                }
                styledInput {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.childAt(0).asInput().focus()
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun hover() = runTest {
        val styledComponent = fc<RProps> {
            styledButton {
                css {
                    color = firstColor
                    hover {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)

        // We can't set :hover with plain js (https://stackoverflow.com/questions/4347116/trigger-css-hover-with-js)
        assertCssInjected("${element.className}:hover", listOf("color" to secondColor.toString()))
    }

    @Test
    fun indeterminate() = runTest {
        val styledComponent = fc<RProps> {
            styledInput(type = InputType.checkBox) {
                css {
                    color = firstColor
                    indeterminate {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().indeterminate = true
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun inRange() = runTest {
        val styledComponent = fc<RProps> {
            styledInput(type = InputType.number) {
                attrs {
                    max = "10"
                    defaultValue = "12"
                }
                css {
                    color = firstColor
                    inRange {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().value = "2"
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun invalid() = runTest {
        val styledComponent = fc<RProps> {
            styledInput(type = InputType.number) {
                attrs {
                    max = "10"
                    defaultValue = "2"
                }
                css {
                    color = firstColor
                    invalid {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().value = "12"
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun lastChild() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div" {
                        color = firstColor
                        lastChild { color = secondColor }
                    }
                }
                div {}
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        val first = element.childAt(0)
        val last = element.childAt(1)
        assertEquals(firstColor.toString(), first.getStyle().color)
        assertEquals(secondColor.toString(), last.getStyle().color)
    }

    @Test
    fun lastOfType() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div" {
                        color = firstColor
                        lastOfType { color = secondColor }
                    }
                }
                div {}
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        val first = element.childAt(0)
        val last = element.childAt(1)
        assertEquals(firstColor.toString(), first.getStyle().color)
        assertEquals(secondColor.toString(), last.getStyle().color)
    }

    @Test
    fun link() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "a" {
                        link {
                            color = firstColor
                        }
                        color = secondColor
                    }
                }
                styledA("https://google.com/") {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.childAt(0).getStyle().color)
    }

    @Test
    fun not() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                css {
                    color = secondColor
                    not(":focus") {
                        color = firstColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().focus()
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun nthChild() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div" {
                        color = firstColor
                        nthChild("3") { color = thirdColor }
                        nthChild("even") { color = secondColor }
                    }
                }
                div {}
                div {}
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        val first = element.childAt(0)
        val second = element.childAt(1)
        val last = element.childAt(2)
        assertEquals(firstColor.toString(), first.getStyle().color)
        assertEquals(secondColor.toString(), second.getStyle().color)
        assertEquals(thirdColor.toString(), last.getStyle().color)
    }

    @Test
    fun nthLastChild() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div" {
                        color = firstColor
                        nthLastChild("even") { color = secondColor }
                        nthLastChild("1") { color = thirdColor }
                    }
                }
                div {}
                div {}
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        val first = element.childAt(0)
        val second = element.childAt(1)
        val last = element.childAt(2)
        assertEquals(firstColor.toString(), first.getStyle().color)
        assertEquals(secondColor.toString(), second.getStyle().color)
        assertEquals(thirdColor.toString(), last.getStyle().color)
    }

    @Test
    fun nthLastOfType() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div" {
                        color = firstColor
                        nthLastOfType("even") { color = secondColor }
                        nthLastOfType("1") { color = thirdColor }
                    }
                }
                span {}
                div {}
                div {}
                div {}
                span {}
            }
        }
        val element = clearAndInject(styledComponent)
        val first = element.childAt(1)
        val second = element.childAt(2)
        val last = element.childAt(3)
        assertEquals(firstColor.toString(), first.getStyle().color)
        assertEquals(secondColor.toString(), second.getStyle().color)
        assertEquals(thirdColor.toString(), last.getStyle().color)
    }

    @Test
    fun nthOfType() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div" {
                        color = firstColor
                        nthOfType("even") { color = secondColor }
                        nthOfType("3") { color = thirdColor }
                    }
                }
                span {}
                div {}
                div {}
                div {}
                span {}
            }
        }
        val element = clearAndInject(styledComponent)
        val first = element.childAt(1)
        val second = element.childAt(2)
        val last = element.childAt(3)
        assertEquals(firstColor.toString(), first.getStyle().color)
        assertEquals(secondColor.toString(), second.getStyle().color)
        assertEquals(thirdColor.toString(), last.getStyle().color)
    }

    @Test
    fun onlyChild() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div, span" {
                        color = firstColor
                        onlyChild {
                            color = secondColor
                        }
                    }
                }
                div {
                    div {}
                }
                span {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.childAt(0).getStyle().color)
        assertEquals(firstColor.toString(), element.childAt(1).getStyle().color)
        assertEquals(secondColor.toString(), element.childAt(0).childAt(0).getStyle().color)
    }

    @Test
    fun onlyOfType() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "div, span" {
                        color = firstColor
                        onlyOfType {
                            color = secondColor
                        }
                    }
                }
                div {}
                span {}
                div {}
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.childAt(0).getStyle().color)
        assertEquals(secondColor.toString(), element.childAt(1).getStyle().color)
        assertEquals(firstColor.toString(), element.childAt(2).getStyle().color)
    }

    @Test
    fun optional() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                attrs {
                    required = true
                }
                css {
                    color = firstColor
                    optional {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().required = false
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun outOfRange() = runTest {
        val styledComponent = fc<RProps> {
            styledInput(type = InputType.number) {
                attrs {
                    max = "10"
                    defaultValue = "2"
                }
                css {
                    color = firstColor
                    outOfRange {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().value = "12"
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun readOnly() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                css {
                    color = firstColor
                    readOnly {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().readOnly = true
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun readWrite() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                attrs {
                    readonly = true
                }
                css {
                    color = firstColor
                    readWrite {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().readOnly = false
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun required() = runTest {
        val styledComponent = fc<RProps> {
            styledInput {
                css {
                    color = firstColor
                    required {
                        color = secondColor
                    }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().required = true
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun valid() = runTest {
        val styledComponent = fc<RProps> {
            styledInput(type = InputType.number) {
                attrs {
                    max = "10"
                    defaultValue = "2"
                }
                css {
                    valid {
                        color = firstColor
                    }
                    color = secondColor
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertEquals(firstColor.toString(), element.getStyle().color)
        element.asInput().value = "12"
        assertEquals(secondColor.toString(), element.getStyle().color)
    }

    @Test
    fun visited() = runTest {
        val styledComponent = fc<RProps> {
            styledDiv {
                css {
                    "a" {
                        color = firstColor
                        visited {
                            color = secondColor
                        }
                    }
                }
                styledA("https://google.com/") {}
            }
        }
        val element = clearAndInject(styledComponent)
        // We can't check that the user had visited the link, https://developer.mozilla.org/en-US/docs/Web/CSS/Privacy_and_the_:visited_selector
        assertCssInjected("${element.className} a:visited", listOf("color" to secondColor.toString()))
    }
}