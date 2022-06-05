package emotion.react

import csstype.ClassName
import csstype.PropertiesBuilder
import emotion.css.ClassName
import react.PropsWithClassName

inline fun PropsWithClassName.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    className = ClassName(block)
}

inline fun PropsWithClassName.css(
    vararg classNames: ClassName?,
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    className = ClassName(classNames = classNames, block)
}
