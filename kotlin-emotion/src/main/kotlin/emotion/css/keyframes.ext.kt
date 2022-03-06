@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package emotion.css

import csstype.*
import kotlinx.js.Record
import kotlinx.js.jso

@CssDsl
interface KeyframesBuilder {
    inline operator fun Percentage.invoke(block: Properties.() -> Unit) {
        unsafeCast<Record<Percentage, Properties>>()[this] = jso(block)
    }
}

inline fun keyframes(
    blocks: KeyframesBuilder.() -> Unit,
): AnimationName =
    rawKeyframes(jso(blocks).unsafeCast<Record<Percentage, Properties>>())
