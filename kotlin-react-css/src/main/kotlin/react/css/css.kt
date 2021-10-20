package react.css

import emotion.css.cx
import kotlinext.js.jso
import react.PropsWithClassName
import react.RElementBuilder

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

// Builder

inline fun RElementBuilder<PropsWithClassName>.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    attrs.css(block)
}

inline fun RElementBuilder<PropsWithClassName>.css(
    vararg classNames: String?,
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    attrs.css(classNames = classNames, block = block)
}


