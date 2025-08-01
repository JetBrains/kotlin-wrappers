package emotion.css

import csstype.PropertiesBuilder
import js.objects.unsafeJso
import web.cssom.ClassName

inline fun ClassName(
    crossinline block: PropertiesBuilder.() -> Unit,
): ClassName =
    css(unsafeJso(block))

inline fun ClassName(
    vararg classNames: ClassName?,
    crossinline block: PropertiesBuilder.() -> Unit,
): ClassName =
    cx(classNames = classNames + ClassName(block))
