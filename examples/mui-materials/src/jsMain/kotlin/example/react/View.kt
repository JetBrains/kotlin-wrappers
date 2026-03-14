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

internal val View = FC {
    Box {
        sx {
            maxWidth = 70.vw
            display = Display.flex
            justifyContent = JustifyContent.center
            alignItems = AlignItems.flexStart
            gap = 24.px
            flexWrap = FlexWrap.wrap
            textAlign = TextAlign.left
            padding = 20.px
            backgroundColor = Color("#073763")
            borderRadius = 12.px
            boxShadow = BoxShadow(0.px, 2.px, 6.px, rgb(0, 0, 0, 0.05))
            margin = auto
        }

        fun detailItem(label: String, value: String?, keyValue: String) = Box {
            key = Key("detail-item-$keyValue")
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
                    +label
                }
                Typography {
                    variant = TypographyVariant.body1
                    sx {
                        fontWeight = FontWeight.bold
                        color = NamedColor.white
                    }
                    +value
                }
            }
        }

        detailItem("Name", "John Doe", "name")
        detailItem("Name", "Winner", "title")
    }

    Divider {
        variant = DividerVariant.middle
        sx {
            marginTop = 16.px
            marginBottom = 16.px
        }
    }

}
