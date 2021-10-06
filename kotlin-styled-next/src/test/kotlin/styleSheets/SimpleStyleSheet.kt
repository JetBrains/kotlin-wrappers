package styleSheets

import kotlinx.css.border
import kotlinx.css.minHeight
import kotlinx.css.padding
import kotlinx.css.px
import styled.StyleSheet

internal class SimpleStyleSheet : StyleSheet("SimpleStyleSheet") {
    val simpleProperty by css {
        minHeight = 66.px
        padding(0.px)
    }

    val specificProperty by css {
        specific {
            padding(80.px)
            border = "none"
        }
    }
}