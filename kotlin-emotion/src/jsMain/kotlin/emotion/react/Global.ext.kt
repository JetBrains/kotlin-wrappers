package emotion.react

import csstype.PropertiesBuilder
import csstype.RuleBuilder
import js.objects.jso

inline fun GlobalProps.styles(
    crossinline block: RuleBuilder<PropertiesBuilder>.() -> Unit,
) {
    styles = jso(block)
}
