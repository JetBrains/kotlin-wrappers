package emotion.css

import csstype.CssDsl
import csstype.Properties
import js.core.Record
import js.core.jso
import web.cssom.AnimationName
import web.cssom.Percentage
import web.cssom.pct

typealias Keyframes = Record<Percentage, Properties>

private val FROM_PERCENTAGE = 0.pct
private val TO_PERCENTAGE = 100.pct

@CssDsl
class KeyframesBuilder {
    private val keyframes: Keyframes = Record()

    operator fun Percentage.invoke(
        block: Properties.() -> Unit,
    ) {
        keyframes[this] = jso(block)
    }

    fun from(
        block: Properties.() -> Unit,
    ) {
        FROM_PERCENTAGE(block)
    }

    fun to(
        block: Properties.() -> Unit,
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
            .apply(block)
            .build()
    )
