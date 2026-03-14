package example.mui

import react.FC
import react.useEffect
import react.useState
import web.cssom.Display
import web.cssom.px
import mui.material.Box
import mui.material.Divider
import mui.material.DividerVariant
import mui.material.Typography
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.Key
import react.Props
import web.cssom.*
import web.cssom.Auto.Companion.auto


external interface DetailItemProps: Props {
    var label: String;
    var value: String?
    var keyValue: String
}

internal val DetailItem = FC<DetailItemProps> { props ->
    Box {
        key = Key("detail-item-${props.keyValue}")
        Box {
            sx {
                display = Display.flex
                flexDirection = FlexDirection.column
                minWidth = 160.px
            }
            Typography {
                variant = TypographyVariant.caption
                sx {
                    fontWeight = FontWeight.bolder
                    color = Color("#BFD7EA")
                    textTransform = TextTransform.uppercase
                    letterSpacing = 0.5.px
                }
                +props.label
            }
            Typography {
                variant = TypographyVariant.body1
                sx {
                    fontWeight = FontWeight.bold
                    color = NamedColor.white
                }
                +props.value
            }
        }
    }
}
