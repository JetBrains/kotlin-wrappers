package emotion.css

import csstype.CssDsl
import csstype.Properties
import kotlinext.js.Record
import kotlinext.js.jso

@CssDsl
sealed class CssBuilder: Properties {
    /**
     * DSL for CSS selectors
     */
    inline operator fun String.invoke(block: CssBuilder.() -> Unit) {
        this@CssBuilder.unsafeCast<Record<String, Properties>>()[this] = jso(block)
    }
}
