package styleSheets

import kotlinx.css.*
import styled.StyleSheet

internal class SimpleStyleSheet : StyleSheet(isStatic = false) {
    val simpleProperty by css {
        minHeight = 66.px
        paddingProp = Padding(0.px)
    }

    val specificProperty by css {
        specific {
            padding(80.px)
            borderStyle = BorderStyle.none
        }
    }
}
