package emotion.css

import csstype.PropertiesBuilder
import js.objects.jso
import web.cssom.ClassName

inline fun ClassName(
    crossinline block: PropertiesBuilder.() -> Unit,
): ClassName =
    css(jso(block))

inline fun ClassName(
    vararg classNames: ClassName?,
    crossinline block: PropertiesBuilder.() -> Unit,
): ClassName =
    cx(classNames = classNames + ClassName(block))
