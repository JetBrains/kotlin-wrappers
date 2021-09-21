package emotion.css

import csstype.CSSDsl
import csstype.Properties
import kotlinext.js.Record
import kotlinext.js.jso

@CSSDsl
sealed class CSSBuilder: Properties {
    /**
     * DSL for CSS selectors
     */
    inline operator fun String.invoke(block: CSSBuilder.() -> Unit) {
        this@CSSBuilder.unsafeCast<Record<String, Properties>>()[this] = jso(block)
    }
}
