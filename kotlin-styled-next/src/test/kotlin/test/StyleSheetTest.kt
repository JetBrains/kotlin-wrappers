package test

import kotlinx.browser.document
import kotlinx.css.*
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.asList
import org.w3c.dom.css.CSSStyleSheet
import react.Props
import react.fc
import runTest
import styleSheets.*
import styled.*
import styled.sheets.importStyleId
import styled.sheets.styleElementsSelector
import waitForAnimationFrame
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class StyleSheetTest : TestBase() {
    private lateinit var simpleStyleSheet: SimpleStyleSheet
    private lateinit var staticStyleSheet: StaticStyleSheet
    private lateinit var importStyleSheet: ImportStyleSheet
    private lateinit var importStyleSheetStatic: ImportStyleSheetStatic
    private lateinit var importUrlSheet: StyleSheet
    private lateinit var importFileSheet: StyleSheet

    private fun getImportRules(): List<String> {
        return document.querySelectorAll(styleElementsSelector(importStyleId)).asList().flatMap { node ->
            node.unsafeCast<HTMLStyleElement>().sheet.unsafeCast<CSSStyleSheet>().cssRules.asList().map {
                it.cssText
            }
        }
    }

    @BeforeTest
    override fun before() {
        super.before()
        simpleStyleSheet = SimpleStyleSheet()
        staticStyleSheet = StaticStyleSheet()
        importStyleSheet = ImportStyleSheet()
        importStyleSheetStatic = ImportStyleSheetStatic()
        importUrlSheet = StyleSheet("importUrlSheet", imports = listOf(importUrl))
        importFileSheet = StyleSheet("importFileSheet", imports = listOf(importFile))
    }

    @Test
    fun injectedWithoutComponent() = runTest {
        CssBuilder().apply {
            +staticStyleSheet.property1
        }
        val rules = getRules()
        assertEquals(1, sheet.scheduledGroups.size)
        assertEquals(0, rules.size)
    }

    object SheetWithMarker : StyleSheet() {
        val marker by cssMarker()
    }

    @Test
    fun cssMarker() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +SheetWithMarker.marker
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertContains(styledElement.className, "SheetWithMarker-marker")
    }

    @Test
    fun cssMarkerWithOtherCss() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    color = firstColor
                }
                css {
                    +SheetWithMarker.marker
                }
                css {
                    backgroundColor = secondColor
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertContains(styledElement.className, "SheetWithMarker-marker")
        assertEquals(firstColor.toString(), styledElement.color())
        assertEquals(secondColor.toString(), styledElement.getStyle().backgroundColor)
    }

    @Test
    fun styleSheetWithoutNameGenerates() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +(object : StyleSheet() {
                        val xxx by css { color = firstColor }
                    }.xxx)
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected("-xxx", "color" to firstColor.toString())
    }

    object AnonymousStyleSheetInherited : StaticStyleSheet()
    object AnonymousStyleSheet : StyleSheet(isStatic = false) {
        val property1 by css { alignContent = Align.end }
    }

    object AnonymousStaticStyleSheet : StyleSheet() {
        val property1 by css { alignContent = Align.end }
    }

    @Test
    fun anonymousStyleSheet() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +AnonymousStyleSheet.property1
                    +AnonymousStaticStyleSheet.property1
                    +AnonymousStyleSheetInherited.property1
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected(".AnonymousStaticStyleSheet-property1")
        assertCssInjected(".StaticStyleSheet-property1")
    }

    @Test
    fun styleSheet() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +simpleStyleSheet.simpleProperty
                }
            }
        }
        val styledElement = clearAndInject(styledComponent)
        assertCssInjected(
            styledElement.className,
            "min-height" to 66.px.toString(),
            "padding" to 0.px.toString()
        )
    }

    @Test
    fun static() = runTest {
        val styledComponent = fc<Props> {
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
            "StaticStyleSheet-property1",
            "align-content" to "end",
        )
        assertCssInjected(
            "StaticStyleSheet-property2",
            "padding" to 40.px.toString(),
            "min-height" to 50.px.toString(),
        )
    }

    @Test
    fun specific() = runTest {
        val styledComponent = fc<Props> {
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
            ".$className.$className",
            "padding" to 80.px.toString(),
            "border" to "none"
        )

        assertEquals("80px", element.getStyle().padding)
    }

    @Test
    fun multipleImportsOneStylesheet() = runTest {
        importStyleSheetStatic.inject()
        assertCssInjected("@import $url", listOf(), getImportRules())
        assertCssInjected("@import url($filename) screen, print;", listOf(), getImportRules())
    }

    @Test
    fun multipleImportsMultipleStylesheets() = runTest {
        importUrlSheet.inject()
        importFileSheet.inject()
        assertCssInjected("@import $url", listOf(), getImportRules())
        assertCssInjected("@import url($filename);", listOf(), getImportRules())
    }

    @Test
    fun injectedOnce() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +importStyleSheet.property1
                    +importStyleSheetStatic.property1
                }
            }
        }
        clearAndInject(styledComponent)
        inject(styledComponent)
        assertEquals(4, getImportRules().size)
    }

    @Test
    fun elementCssPrefixed() = runTest {
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +staticStyleSheet.prefixedProperty
                }
            }
        }
        clearAndInject(styledComponent)
        assertCssInjected("StaticStyleSheet-prefixedProperty", "-webkit-box-align" to "center")
    }


    object StaticStyleSheetObject : StyleSheet() {
        val property1 by css {
            color = rgb(3, 4, 5)
        }
    }

    @Test
    fun getClassnameInjects() = runTest {
        val expectedColor = rgb(3, 4, 5).toString()
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +StaticStyleSheetObject.getClassName { it::property1 }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertContains(element.className, "StaticStyleSheetObject-property1")
        waitForAnimationFrame()
        assertEquals(expectedColor, element.color())
        assertCssInjected("StaticStyleSheetObject-property", "color" to expectedColor)
    }
}
