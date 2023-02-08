package styleSheets

import kotlinx.css.*
import styled.HasCssSuffix
import styled.StyleSheet

open class StaticStyleSheet : StyleSheet("StaticStyleSheet") {
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

    val dynamicProperty1 by dynamicCss<String> {
        if (it == "test") {
            justifyItems = JustifyItems.baseline
        }
    }

    val dynamicProperty2 by dynamicCss<Boolean> {
        if (it) {
            justifyContent = JustifyContent.center
        }
    }

    val dynamicProperty3 by dynamicCss<Number> {
        fontSize = it.px
    }

    val dynamicProperty4 by dynamicCss<Color> {
        color = it
    }

    val dynamicProperty5 by dynamicCss<StaticStyleSheetValues> {
        if (it == StaticStyleSheetValues.One) {
            backgroundColor = Color.red
        }
    }

    val dynamicProperty6 by dynamicCss<StaticStyleSheetValuesWithCustomSuffix> {
        if (it == StaticStyleSheetValuesWithCustomSuffix.One) {
            userSelect = UserSelect.none
        }
    }
}

enum class StaticStyleSheetValues { One }

enum class StaticStyleSheetValuesWithCustomSuffix : HasCssSuffix {
    One;

    override val cssSuffix = name.lowercase()
}
