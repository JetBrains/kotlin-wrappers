package styleSheets

import kotlinx.css.*
import styled.StyleSheet

internal class StaticStyleSheet : StyleSheet("StaticStyleSheet", isStatic = true) {
    val property1 by css {
        alignContent = Align.end
    }

    val property2 by css {
        padding(40.px)
        minHeight = 50.px
    }

    val prefixedProperty by css {
        alignItems = Align.center
    }
}