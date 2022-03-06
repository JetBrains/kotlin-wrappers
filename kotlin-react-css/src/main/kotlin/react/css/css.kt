package react.css

import emotion.css.cx
import kotlinx.js.jso
import react.PropsWithClassName

@PublishedApi
internal inline fun className(
    crossinline block: PropertiesBuilder.() -> Unit,
): String =
    emotion.css.css(jso(block))

// Props

inline fun PropsWithClassName.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    className = className(block)
}

inline fun PropsWithClassName.css(
    vararg classNames: String?,
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    className = cx(classNames = classNames + className(block))
}
