package styled

import kotlinext.js.*
import kotlinx.css.*
import react.*
import kotlin.reflect.*

open class StyleSheet(var name: String, val isStatic: Boolean = false) {
    private var isLoaded = false

    constructor(name: String, parent: StyleSheet, isStatic: Boolean = false) : this(parent.name + "-" + name, isStatic)

    fun dependsOn(handler: () -> StyleSheet) {
        handler().inject()
    }

    fun css(vararg parents: RuleSet, builder: RuleSet) = CssHolder(this, *parents, builder)

    fun inject() {
        if (!isLoaded && isStatic) {
            isLoaded = true

            // Unmangle the keys, e.g. "wrapper_r2j0kd$_0" -> "wrapper"
            val keys = this.getOwnPropertyNames()
                .filter { it.endsWith("\$_0") }
                .filter { this.asDynamic()[it] is CssHolder }
                .map { it to this.asDynamic()[it] as CssHolder }
                .map { it.first.removeSuffix("\$_0") to it.second }
                .map { it.first.substring(0, it.first.lastIndexOf('_')) to it.second }

            val builder = CSSBuilder(allowClasses = false).apply {
                keys.forEach {
                    ".$name-${it.first}" {
                        for (r in it.second.ruleSets) {
                            r()
                        }
                    }
                }
            }

            injectGlobal(builder.toString())
        } else if (js("process.env.NODE_ENV !== 'production'")) {
            // styled-components 5.x uses useRef() in development mode to check if a component has been created
            // dynamically, so we include a corresponding call here to have a matching count of hook invocations
            try {
                useRef(undefined)
            } catch (e: Throwable) {}
        }
    }
}

class CssHolder(private val sheet: StyleSheet, internal vararg val ruleSets: RuleSet) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): RuleSet = {
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
fun StyleSheet.cssMarker() = CssHolder(this, {})
