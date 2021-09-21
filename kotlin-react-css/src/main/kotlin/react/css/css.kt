package react.css

import csstype.PropertiesBuilder
import emotion.react.css
import react.PropsWithClassName
import react.RElementBuilder

inline fun RElementBuilder<PropsWithClassName>.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    css(block)
}

