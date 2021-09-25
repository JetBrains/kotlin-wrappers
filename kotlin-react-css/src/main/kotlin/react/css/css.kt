package react.css

import csstype.PropertiesBuilder
import kotlinext.js.jso
import react.PropsWithClassName
import react.RElementBuilder

inline fun RElementBuilder<PropsWithClassName>.css(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    attrs.className = emotion.css.css(jso(block))
}

