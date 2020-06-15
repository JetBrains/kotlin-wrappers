package styled

@JsModule("styled-components")
private external object StyledComponents

fun rawStyled(target: dynamic): Styler =
    StyledComponents.asDynamic().default(target)
