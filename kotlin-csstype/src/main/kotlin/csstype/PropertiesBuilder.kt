package csstype

import kotlinx.js.Object

sealed class PropertiesBuilder :
    Properties,
    RuleBuilder<PropertiesBuilder>,
    PseudosRuleBuilder<PropertiesBuilder> {

    inline operator fun Properties?.unaryPlus() {
        Object.assign(this@PropertiesBuilder, this)
    }
}
