package react.css

import csstype.Properties
import csstype.PseudosRuleBuilder
import csstype.RuleBuilder
import react.IntrinsicType

sealed class PropertiesBuilder :
    Properties,
    RuleBuilder<PropertiesBuilder>,
    PseudosRuleBuilder<PropertiesBuilder> {

    inline operator fun IntrinsicType<*>.invoke(
        block: PropertiesBuilder.() -> Unit,
    ) {
        unsafeCast<String>()(block)
    }
}
