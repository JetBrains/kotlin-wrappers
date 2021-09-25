package react.css

import csstype.Properties
import csstype.RuleBuilder
import react.IntrinsicType

sealed class PropertiesBuilder :
    Properties,
    RuleBuilder<PropertiesBuilder> {

    inline operator fun IntrinsicType<*>.invoke(
        block: PropertiesBuilder.() -> Unit,
    ) {
        unsafeCast<String>()(block)
    }
}
