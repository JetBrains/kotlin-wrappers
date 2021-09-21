package csstype

import kotlinext.js.jso

@CssDsl
sealed class PropertiesBuilder : Properties {
    /**
     * DSL for CSS selectors
     */
    inline operator fun String.invoke(
        block: PropertiesBuilder.() -> Unit,
    ) {
        this@PropertiesBuilder.asDynamic()[this] = jso(block)
    }
}
