package emotion.react

import emotion.css.CssBuilder
import kotlinext.js.jso
import react.PropsWithClassName
import react.RElementBuilder

inline fun RElementBuilder<PropsWithClassName>.css(block: CssBuilder.() -> Unit) {
    attrs.className = emotion.css.css(jso(block))
}
