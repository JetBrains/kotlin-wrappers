import kotlinx.css.*
import react.fc
import styled.StyledBuilder
import styled.StyledElementBuilder
import styled.css
import styled.styledDiv
import kotlin.random.Random

private fun StyledBuilder<*>.addCss(n: Int) {
    css {
        (1..n % 20).map {
            val randomCount = Random(123456789)
            when (randomCount.nextInt(29)) {
                0 -> backgroundColor = randomColor()
                1 -> paddingLeft = randomLinearDimension()
                2 -> paddingRight = randomLinearDimension()
                3 -> padding = randomLinearDimension().toString()
                4 -> alignContent = randomAlign()
                5 -> alignItems = randomAlign()
                6 -> alignSelf = randomAlign()
                7 -> backgroundColor = randomColor()
                8 -> borderStyle = randomBorderStyle()
                9 -> borderTopStyle = randomBorderStyle()
                10 -> borderRightStyle = randomBorderStyle()
                11 -> borderBottomStyle = randomBorderStyle()
                12 -> borderLeftStyle = randomBorderStyle()
                13 -> borderWidth = randomLinearDimension()
                14 -> borderTopWidth = randomLinearDimension()
                15 -> borderRightWidth = randomLinearDimension()
                16 -> borderBottomWidth = randomLinearDimension()
                17 -> borderLeftWidth = randomLinearDimension()
                18 -> borderColor = randomColor()
                19 -> borderTopColor = randomColor()
                20 -> borderRightColor = randomColor()
                21 -> borderBottomColor = randomColor()
                22 -> borderLeftColor = randomColor()
                23 -> borderSpacing = randomLinearDimension()
                24 -> borderRadius = randomLinearDimension()
                25 -> borderTopLeftRadius = randomLinearDimension()
                26 -> borderTopRightRadius = randomLinearDimension()
                27 -> borderBottomLeftRadius = randomLinearDimension()
                29 -> height = 15.px
                else -> borderBottomRightRadius = randomLinearDimension()
            }
        }
    }
}

object StyledElementsFactory {
    /**
     * @return styled component with [count] styled children, each having random css
     */
    fun getStyledComponent(count: Int): Component {
        return fc {
            (1..count).map {
                styledDiv {
                    addCss(it)
                }
            }
        }
    }

    /** Create [StyledElementBuilder] with dummy element and get [StyledElementBuilder.css] property [count] times
     *  @return list of [CssBuilder] with random css code inside
     */
    fun getCssBuilders(count: Int): List<CssBuilder> {
        return (1..count).map {
            val builder = StyledElementBuilder.invoke(fc {})
            builder.addCss(it)
            builder.css
        }
    }
}

