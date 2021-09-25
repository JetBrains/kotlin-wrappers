package csstype

sealed class PropertiesBuilder :
    Properties,
    RuleBuilder<PropertiesBuilder>,
    PseudosRuleBuilder<PropertiesBuilder>
