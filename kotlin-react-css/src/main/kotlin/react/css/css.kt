package react.css

import csstype.PropertiesBuilder
import emotion.react.css
import react.PropsWithClassName

@Deprecated(
    message = "Will be removed soon! Use `emotion.react.css` instead.",
)
inline fun PropsWithClassName.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    css(block)
}

@Deprecated(
    message = "Will be removed soon! Use `emotion.react.css` instead.",
)
inline fun PropsWithClassName.css(
    vararg classNames: String?,
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    css(classNames = classNames, block)
}
