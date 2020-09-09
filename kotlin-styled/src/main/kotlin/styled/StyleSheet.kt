package styled

import kotlinx.css.CSSBuilder
import kotlinx.css.RuleSet
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0

open class StyleSheet(var name: String, val isStatic: Boolean = false) {
    private var isLoaded = false

    private val holders: MutableList<CssHolder> = mutableListOf()

    constructor(name: String, parent: StyleSheet, isStatic: Boolean = false) : this(parent.name + "-" + name, isStatic)

    fun dependsOn(handler: () -> StyleSheet) {
        handler().inject()
    }

    fun css(vararg parents: RuleSet, builder: RuleSet) =
        CssHolder(this, *parents, builder)
            .also { addCssHolder(it) }

    internal fun addCssHolder(holder: CssHolder) {
        holders.add(holder)
    }

    fun inject() {
        if (!isLoaded && isStatic) {
            isLoaded = true

            val builder = CSSBuilder(allowClasses = false).apply {
                holders.forEach {
                    ".${getClassName(it.property)}" {
                        for (r in it.ruleSets) {
                            r()
                        }
                    }
                }
            }

            injectGlobal(builder.toString())
        }
    }
}

class CssHolder(private val sheet: StyleSheet, internal vararg val ruleSets: RuleSet) {
    lateinit var property: KProperty<*>

    operator fun provideDelegate(thisRef: Any?, providingProperty: KProperty<*>): ReadOnlyProperty<Any?, RuleSet> {
        this.property = providingProperty
        return ReadOnlyProperty { _, property ->
            {
                if (sheet.isStatic) {
                    +(sheet.getClassName(property))
                    sheet.inject()
                }

                if (!sheet.isStatic || !allowClasses) {
                    styleName.add(sheet.getClassName(property))
                    ruleSets.forEach { it() }
                }
            }
        }
    }
}

fun <T : StyleSheet> T.getClassName(getClass: (T) -> KProperty0<RuleSet>): String {
    return getClassName(getClass(this))
}

private fun StyleSheet.getClassName(property: KProperty<*>): String {
    return "$name-${property.name}"
}

fun <T : StyleSheet> T.getClassSelector(getClass: (T) -> KProperty0<RuleSet>): String {
    return ".${getClassName(getClass)}"
}

/**
 * Use this function to assign a CSS class without any properties to an element
 */
fun StyleSheet.cssMarker() =
    CssHolder(this, {})
        .also { addCssHolder(it) }
