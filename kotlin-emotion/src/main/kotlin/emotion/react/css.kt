package emotion.react

import emotion.css.cx
import kotlinx.js.jso
import react.PropsWithClassName
import react.ReactDsl

@PublishedApi
internal inline fun className(
    crossinline block: @ReactDsl PropertiesBuilder.() -> Unit,
): String =
    emotion.css.css(jso(block))

// Props

inline fun PropsWithClassName.css(
    crossinline block: @ReactDsl PropertiesBuilder.() -> Unit,
) {
    className = className(block)
}

inline fun PropsWithClassName.css(
    vararg classNames: String?,
    crossinline block: @ReactDsl PropertiesBuilder.() -> Unit,
) {
    className = cx(classNames = classNames + className(block))
}
