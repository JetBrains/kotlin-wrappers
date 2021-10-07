package test

import kotlinx.browser.document
import kotlinx.css.*
import org.w3c.dom.HTMLStyleElement
import org.w3c.dom.css.CSSRuleList
import org.w3c.dom.css.CSSStyleSheet
import react.Props
import react.fc
import runTest
import styled.*
import styled.sheets.importStyleId
import styleSheets.*
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

    private fun getImportRules(): CSSRuleList {
        val styles = document.getElementById(importStyleId) as HTMLStyleElement
        return (styles.sheet as CSSStyleSheet).cssRules
    }

    @BeforeTest
    override fun before() {
        super.before()
        simpleStyleSheet = SimpleStyleSheet()
        staticStyleSheet = StaticStyleSheet()
        importStyleSheet = ImportStyleSheet()
        importStyleSheetStatic = ImportStyleSheetStatic()
        importUrlSheet = StyleSheet("importUrlSheet", isStatic = true, imports = listOf(importUrl))
        importFileSheet = StyleSheet("importFileSheet", isStatic = true, imports = listOf(importFile))
    }

    @Test
    fun styleSheetInjectedWithoutComponent() = runTest {
        CssBuilder().apply {
            +staticStyleSheet.property1
        }
        val rules = getStylesheet().cssRules
        assertEquals(1, sheet.scheduledGroups.size)
        assertEquals(0, rules.length)
    }

    object SheetWithMarker : StyleSheet("SheetWithMarker", isStatic = true) {
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
    fun styleSheetStatic() = runTest {
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
    fun styleSheetSpecific() = runTest {
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
        assertEquals(4, getImportRules().length)
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


    object StaticStyleSheetObject : StyleSheet("StaticStyleSheetObject", isStatic = true) {
        val property1 by css {
            color = rgb(3, 4, 5)
        }
    }

    @Test
    fun styleSheetGetClassname() = runTest {
        val expectedColor = rgb(3, 4, 5).toString()
        val styledComponent = fc<Props> {
            styledSpan {
                css {
                    +StaticStyleSheetObject.getClassName { it::property1 }
                }
            }
        }
        val element = clearAndInject(styledComponent)
        assertContains(element.className, "StaticStyleSheetObject-property")
        assertEquals(expectedColor, element.color())
        assertCssInjected("StaticStyleSheetObject-property", "color" to expectedColor)
    }
}
