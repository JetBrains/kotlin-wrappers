@file:Suppress(
    "DECLARATION_CANT_BE_INLINED",
)

package mui.material.styles

import csstype.PropertiesBuilder
import js.core.ReadonlyRecord
import js.core.Record
import js.core.jso

external interface TypographyOptions :
    ReadonlyRecord<TypographyVariant, CSSProperties>,
    CSSProperties /* FontStyleOptions */

inline fun TypographyOptions(
    crossinline block: TypographyOptionsBuilder.() -> Unit,
): TypographyOptions =
    jso(block)

sealed interface TypographyOptionsBuilder : TypographyOptions, Record<TypographyVariant, CSSProperties> {
    inline operator fun TypographyVariant.invoke(
        block: PropertiesBuilder.() -> Unit,
    ) {
        set(this, jso(block))
    }
}
