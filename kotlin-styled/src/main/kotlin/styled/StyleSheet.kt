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
            val keys = this.getOwnPropertyNames()
                .filter { it.endsWith("\$_0") }
                .filter { this.asDynamic()[it] is CssHolder }
                .map {
                    it to this.asDynamic()[it] as CssHolder
                }
                .map { it.first.substring(0, it.first.length - 3) to it.second /*strip '$_0'*/ }
                .map { it.first.substring(0, it.first.lastIndexOf('_')) to it.second }

            val builder = CSSBuilder(allowClasses = false).apply {
                keys.forEach {
                    if (it.first == "root") {
                        ".$name" {
                            for (r in it.second.ruleSets) {
                                r()
                            }
                        }
                    } else {
                        ".$name-${it.first}" {
                            for (r in it.second.ruleSets) {
                                r()
                            }
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
            if (property.name == "root") {
                +sheet.name
            } else {
                +"${sheet.name}-${property.name}"
            }
        } else {
            if (styleName == null) {
                styleName = sheet.name + "-" + property.name
            } else {
                styleName += " "
                styleName += sheet.name + "-" + property.name
            }
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
