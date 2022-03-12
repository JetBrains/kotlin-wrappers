package emotion.react

import csstype.ClassName
import csstype.PropertiesBuilder
import emotion.css.cx
import kotlinx.js.jso
import react.PropsWithClassName

@PublishedApi
internal inline fun className(
    crossinline block: PropertiesBuilder.() -> Unit,
): ClassName =
    emotion.css.css(jso(block))

// Props

inline fun PropsWithClassName.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    className = className(block)
}

inline fun PropsWithClassName.css(
    vararg classNames: ClassName?,
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    className = cx(classNames = classNames + className(block))
}
