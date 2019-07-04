package styled

import kotlinext.js.*
import kotlinx.css.*
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

            StyledComponents.injectGlobal(builder.toString())
        }
    }
}

class CssHolder(private val sheet: StyleSheet, internal vararg val ruleSets: RuleSet) {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): RuleSet = {
        if (sheet.isStatic && allowClasses) {
            sheet.inject()
            +"${sheet.name}-${property.name}"
        } else {
            styleName.add("${sheet.name}-${property.name}")
            ruleSets.forEach { it() }
        }
    }
}

fun <T : StyleSheet> T.getClassName(getClass: (T) -> KProperty0<RuleSet>): String {
    return "$name-${getClass(this).name}"
}

fun <T : StyleSheet> T.getClassSelector(getClass: (T) -> KProperty0<RuleSet>): String {
    return ".${getClassName(getClass)}"
}
