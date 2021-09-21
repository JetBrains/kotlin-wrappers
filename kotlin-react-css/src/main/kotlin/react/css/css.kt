package react.css

import emotion.css.CSSBuilder
import emotion.react.css
import react.PropsWithClassName
import react.RElementBuilder

inline fun RElementBuilder<PropsWithClassName>.css(crossinline block: CSSBuilder.() -> Unit) =
    css(block)

