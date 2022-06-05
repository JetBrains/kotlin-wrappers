package emotion.css

import csstype.ClassName
import csstype.PropertiesBuilder
import kotlinx.js.jso

inline fun ClassName(
    crossinline block: PropertiesBuilder.() -> Unit,
): ClassName =
    css(jso(block))

inline fun ClassName(
    vararg classNames: ClassName?,
    crossinline block: PropertiesBuilder.() -> Unit,
): ClassName =
    cx(classNames = classNames + ClassName(block))
