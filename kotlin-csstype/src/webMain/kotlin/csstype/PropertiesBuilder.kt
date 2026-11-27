package csstype

import js.objects.Object

sealed class PropertiesBuilder :
    Properties,
    RuleBuilder<PropertiesBuilder> {

    inline operator fun Properties?.unaryPlus() {
        Object.assign(this@PropertiesBuilder, this)
    }
}
