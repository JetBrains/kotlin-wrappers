package react.css

import emotion.css.CssBuilder
import emotion.react.css
import react.PropsWithClassName
import react.RElementBuilder

inline fun RElementBuilder<PropsWithClassName>.css(crossinline block: CssBuilder.() -> Unit) =
    css(block)

