@file:Suppress(
    "JS_FAKE_NAME_CLASH",
    "NOTHING_TO_INLINE",
)

package csstype

import js.objects.Object

sealed class PropertiesBuilder :
    Properties,
    RuleBuilder<PropertiesBuilder>,
    PseudosRuleBuilder<PropertiesBuilder> {

    inline operator fun Properties?.unaryPlus() {
        Object.assign(this@PropertiesBuilder, this)
    }
}
