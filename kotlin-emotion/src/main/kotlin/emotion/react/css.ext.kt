package emotion.react

import emotion.css.CSSBuilder
import kotlinext.js.jso
import react.PropsWithClassName
import react.RElementBuilder

inline fun RElementBuilder<PropsWithClassName>.css(block: CSSBuilder.() -> Unit) {
    attrs.className = emotion.css.css(jso(block))
}
