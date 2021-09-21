package csstype

import kotlinext.js.Record
import kotlinext.js.jso

@CssDsl
sealed class PropertiesBuilder: Properties {
    /**
     * DSL for CSS selectors
     */
    inline operator fun String.invoke(block: PropertiesBuilder.() -> Unit) {
        this@PropertiesBuilder.unsafeCast<Record<String, Properties>>()[this] = jso(block)
    }
}
