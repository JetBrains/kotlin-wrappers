package example.mui

import mui.material.Box
import mui.material.Typography
import mui.material.styles.TypographyVariant
import mui.system.sx
import react.FC
import react.Key
import react.PropsWithValue
import web.cssom.*

external interface DetailItemProps :
    PropsWithValue<String?> {
    var label: String
}

internal val DetailItem = FC<DetailItemProps> { props ->
    Box {
        key = Key("detail-item-${props.label.lowercase()}")

        Box {
            sx {
                display = Display.flex
                flexDirection = FlexDirection.column
                minWidth = 160.px
            }

            Typography {
                sx {
                    fontWeight = FontWeight.bolder
                    color = Color("#BFD7EA")
                    textTransform = TextTransform.uppercase
                    letterSpacing = 0.5.px
                }

                variant = TypographyVariant.caption

                +props.label
            }
            Typography {
                sx {
                    fontWeight = FontWeight.bold
                    color = NamedColor.white
                }

                variant = TypographyVariant.body1

                +props.value
            }
        }
    }
}
