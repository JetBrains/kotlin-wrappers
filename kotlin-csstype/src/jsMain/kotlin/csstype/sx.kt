package csstype

import web.cssom.ElementCSSInlineStyle

inline val ElementCSSInlineStyle.sx: Properties
    get() = style.unsafeCast<Properties>()

inline fun ElementCSSInlineStyle.sx(
    block: @CssDsl Properties.() -> Unit,
) {
    block(sx)
}
