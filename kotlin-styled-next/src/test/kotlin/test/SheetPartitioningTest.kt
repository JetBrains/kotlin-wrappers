package test

import Component
import TestScope
import createDOMElement
import kotlinx.css.height
import kotlinx.css.px
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import react.FC
import react.Props
import react.fc
import runTest
import styled.GlobalStyles
import styled.css
import styled.sheets.CSSOMSheet
import styled.sheets.RemoveMode
import styled.sheets.RuleType
import styled.styledDiv
import unmount
import waitForAnimationFrame
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class SheetPartitioningTest : TestBase() {
    private val secondRoot by lazy { createDOMElement() }
    private val thirdRoot by lazy { createDOMElement() }

    private suspend fun TestScope.injectAdditional(component: Component, root: HTMLElement = secondRoot): Element {
        renderComponent(component, root)
        val element = root.firstElementChild
        assertNotNull(element)
        waitForAnimationFrame()
        return element
    }

    @BeforeTest
    override fun before() = runTest {
        clearStyles()
        GlobalStyles.sheet = CSSOMSheet(RuleType.REGULAR, RemoveMode.Instantly, maxRulesPerSheet = 100)
    }

    @Test
    fun rulesAddedToOneSheetInOneBatch() = runTest {
        val styledComponent = getFC(1..250)
        inject(styledComponent)
        assertEquals(250, getRules().size)
        assertEquals(listOf(250), getStylesheets().map { it.cssRules.length })
    }

    @Test
    fun rulesAddedToNewStyleSheets() = runTest {
        val styledComponent1 = getFC(1..100)
        val styledComponent2 = getFC(101..200)
        val styledComponent3 = getFC(201..250)

        inject(styledComponent1)
        assertEquals(100, getRules().size)
        assertEquals(listOf(100), getStylesheets().map { it.cssRules.length })

        injectAdditional(styledComponent2, secondRoot)
        injectAdditional(styledComponent3, thirdRoot)

        assertEquals(250, getRules().size)
        assertEquals(listOf(100, 100, 50), getStylesheets().map { it.cssRules.length })
    }

    @Test
    fun rulesAddedToOldAndNewStyleSheets() = runTest {
        val styledComponent1 = getFC(1..50)
        val styledComponent2 = getFC(51..150)
        val styledComponent3 = getFC(151..250)

        inject(styledComponent1)
        assertEquals(50, getRules().size)
        assertEquals(listOf(50), getStylesheets().map { it.cssRules.length })

        injectAdditional(styledComponent2, secondRoot)
        injectAdditional(styledComponent3, thirdRoot)

        assertEquals(250, getRules().size)
        assertEquals(listOf(50, 100, 100), getStylesheets().map { it.cssRules.length })
    }

    @Test
    fun compressSheetsAfterRulesDeletion() = runTest {
        val styleRanges = listOf(
            0 until 25,
            25 until 100,
            100 until 125,
            125 until 200,
            200 until 300,
            300 until 350,
            350 until 400,
            400 until 450
        )
        val roots = styleRanges.map {
            createDOMElement()
        }
        val components = styleRanges.map {
            getFC(it)
        }
        components.zip(roots).forEach { (component, root) ->
            injectAdditional(component, root)
        }
        assertEquals(450, getRules().size)
        assertEquals(listOf(100, 100, 100, 100, 50), getStylesheets().map { it.cssRules.length })
        val rules = getRules()

        unmount(roots[1])
        unmount(roots[3])

        assertEquals(300, getRules().size)
        assertEquals(listOf(50, 100, 100, 50), getStylesheets().map { it.cssRules.length })
        val rules1 = rules - rules.slice(styleRanges[1]).toSet() - rules.slice(styleRanges[3]).toSet()
        assertEquals(rules1, getRules())

        unmount(roots[5])

        assertEquals(250, getRules().size)
        assertEquals(listOf(50, 100, 100), getStylesheets().map { it.cssRules.length })
        val rules2 = rules1 - rules.slice(styleRanges[5]).toSet()
        assertEquals(rules2, getRules())
    }

    private fun getFC(range: IntRange): FC<Props> {
        return fc {
            styledDiv {
                css {
                    range.forEach {
                        descendants("k$it") {
                            height = 0.px
                        }
                    }
                }
            }
        }
    }
}