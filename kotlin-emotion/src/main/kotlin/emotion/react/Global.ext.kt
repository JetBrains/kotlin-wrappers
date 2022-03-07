package emotion.react

import csstype.PropertiesBuilder
import csstype.RuleBuilder
import csstype.Rules
import kotlinx.js.jso

inline fun GlobalProps.styles(
    crossinline block: RuleBuilder<PropertiesBuilder>.() -> Unit,
) {
    styles = jso(block).unsafeCast<Rules>()
}
