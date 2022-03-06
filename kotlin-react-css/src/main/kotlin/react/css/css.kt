package react.css

import csstype.PropertiesBuilder
import react.PropsWithClassName
import emotion.react.css

inline fun PropsWithClassName.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    css(block)
}

inline fun PropsWithClassName.css(
    vararg classNames: String?,
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    css(classNames = classNames, block)
}
