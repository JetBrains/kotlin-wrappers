@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package emotion.css

import csstype.*
import kotlinx.js.Record
import kotlinx.js.jso

typealias Keyframes = Record<Percentage, Properties>

@CssDsl
interface KeyframesBuilder {
    inline operator fun Percentage.invoke(
        block: Properties.() -> Unit
    ) {
        unsafeCast<Keyframes>()[this] = jso(block)
    }

    inline fun from(
        block: Properties.() -> Unit
    ) {
        0.pct(block)
    }

    inline fun to(
        block: Properties.() -> Unit
    ) {
        100.pct(block)
    }
}

inline fun keyframes(
    blocks: KeyframesBuilder.() -> Unit,
): AnimationName =
    rawKeyframes(jso(blocks).unsafeCast<Keyframes>())
