package org.w3c.dom.css

import csstype.CssDsl
import csstype.Properties

inline val ElementCSSInlineStyle.sx: Properties
    get() = style.unsafeCast<Properties>()

inline fun ElementCSSInlineStyle.sx(
    block: @CssDsl Properties.() -> Unit,
) {
    block(sx)
}
