package emotion.react

import csstype.PropertiesBuilder
import csstype.RuleBuilder
import js.objects.unsafeJso

inline fun GlobalProps.styles(
    crossinline block: RuleBuilder<PropertiesBuilder>.() -> Unit,
) {
    styles = unsafeJso(block)
}
