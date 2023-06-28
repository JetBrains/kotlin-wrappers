package styleSheets

import kotlinx.css.*
import styled.StyleSheet

internal class SimpleStyleSheet : StyleSheet(isStatic = false) {
    val simpleProperty by css {
        minHeight = 66.px
        padding = Padding(0.px)
    }

    val specificProperty by css {
        specific {
            padding = Padding(80.px)
            borderStyle = BorderStyle.none
        }
    }
}
