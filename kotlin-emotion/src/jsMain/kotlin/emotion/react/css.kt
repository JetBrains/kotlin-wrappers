package emotion.react

import csstype.PropertiesBuilder
import emotion.css.ClassName
import react.PropsWithClassName
import web.cssom.ClassName

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
