package csstype

import js.reflect.unsafeCast
import web.cssom.ElementCSSInlineStyle

inline val ElementCSSInlineStyle.sx: Properties
    get() = unsafeCast(style)

inline fun ElementCSSInlineStyle.sx(
    block: @CssDsl Properties.() -> Unit,
) {
    block(sx)
}
