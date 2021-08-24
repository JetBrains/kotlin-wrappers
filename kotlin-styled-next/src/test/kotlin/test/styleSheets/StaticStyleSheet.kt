package test.styleSheets

import kotlinx.css.*
import kotlinx.css.properties.Timing
import kotlinx.css.properties.Transitions
import kotlinx.css.properties.ms
import kotlinx.css.properties.transition
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