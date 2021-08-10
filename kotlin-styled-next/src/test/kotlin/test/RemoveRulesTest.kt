//package test
//
//import Component
//import TestScope
//import kotlinext.js.jsObject
//import kotlinx.browser.document
//import kotlinx.css.color
//import kotlinx.css.padding
//import org.w3c.dom.get
//import react.RProps
//import react.createElement
//import react.dom.render
//import react.dom.unmountComponentAtNode
//import react.fc
//import runTest
//import styled.css
//import styled.sheets.CSSOMSheet
//import styled.styledDiv
//import waitForAnimationFrame
//import kotlin.test.Test
//import kotlin.test.assertEquals
//
//class RemoveRulesTest : TestBase() {
//    private fun TestScope.addComponent(component: Component) {
//        val reactElement = createElement(component, jsObject { })
//        val child = document.createElement("div")
//        getRoot().appendChild(child)
//        render(reactElement, child)
//    }
//
//    private suspend fun TestScope.clearComponents() {
//        for (i in 0 until getRoot().children.length) {
//            unmountComponentAtNode(getRoot().children[i])
//        }
//        waitForAnimationFrame()
//    }
//
//    private fun TestScope.assertRulesEmpty() {
//        assertRulesInjected(0)
//    }
//
//    private fun TestScope.assertRulesInjected(i: Int) {
//        assertEquals(i, (sheet as CSSOMSheet).groups.size)
//        assertEquals(i, getRules().length)
//        assertEquals(0, sheet.scheduledRules.size)
//    }
//
//    @Test
//    fun mountSingleElement() = runTest {
//        val styledComponent = fc<RProps> {
//            styledDiv {
//                css {
//                    color = firstColor
//                }
//            }
//        }
//        addComponent(styledComponent)
//        assertRulesInjected(1)
//        clearComponents()
//        assertRulesInjected(0)
//    }
//
//    @Test
//    fun mountElementMultipleTimes() = runTest {
//        val styledComponent = fc<RProps> {
//            styledDiv {
//                css {
//                    padding = "15px"
//                }
//            }
//        }
//        assertRulesEmpty()
//        addComponent(styledComponent)
//        addComponent(styledComponent)
//        assertRulesInjected(1)
//        clearComponents()
//        assertRulesEmpty()
//    }
//
//    @Test
//    fun multipleElementsOneCss() = runTest {
//        val styledComponent = fc<RProps> {
//            styledDiv {
//                css {
//                    padding = "15px"
//                }
//            }
//            styledDiv {
//                css {
//                    padding = "15px"
//                }
//            }
//        }
//        addComponent(styledComponent)
//        assertRulesInjected(1)
//        clearComponents()
//        assertRulesEmpty()
//    }
//
//    @Test
//    fun multipleElementsMultipleCss() = runTest {
//        val styledComponent = fc<RProps> {
//            styledDiv {
//                css {
//                    padding = "15px"
//                }
//            }
//            styledDiv {
//                css {
//                    color = firstColor
//                }
//            }
//        }
//        addComponent(styledComponent)
//        assertRulesInjected(2)
//        clearComponents()
//        assertRulesEmpty()
//    }
//}