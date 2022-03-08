@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package emotion.css

import csstype.*
import kotlinx.js.Record
import kotlinx.js.jso

typealias Keyframes = Record<Percentage, Properties>

private val FROM_PERCENTAGE = 0.pct
private val TO_PERCENTAGE = 100.pct

@CssDsl
class KeyframesBuilder {
    private val keyframes: Keyframes = Record()

    operator fun Percentage.invoke(
        block: Properties.() -> Unit
    ) {
        keyframes[this] = jso(block)
    }

    fun from(
        block: Properties.() -> Unit
    ) {
        FROM_PERCENTAGE(block)
    }

    fun to(
        block: Properties.() -> Unit
    ) {
        TO_PERCENTAGE(block)
    }

    fun build(): Keyframes = keyframes
}

inline fun keyframes(
    block: KeyframesBuilder.() -> Unit,
): AnimationName =
    keyframes(
        KeyframesBuilder()
            .apply { block() }
            .build()
    )
