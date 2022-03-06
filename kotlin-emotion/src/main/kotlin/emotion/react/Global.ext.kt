package emotion.react

import csstype.PropertiesBuilder
import kotlinx.js.jso

inline fun GlobalProps.styles(
    crossinline block: PropertiesBuilder.() -> Unit,
) {
    styles = jso(block)
}
