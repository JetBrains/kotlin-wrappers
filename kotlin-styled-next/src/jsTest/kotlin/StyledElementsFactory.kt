import kotlinx.css.*
import kotlinx.css.properties.IterationCount
import kotlinx.css.properties.Timing
import kotlinx.css.properties.rotate
import kotlinx.css.properties.transform
import react.fc
import styled.*

private fun StyledBuilder<*>.addCss() {
    css {
        (1..random.nextInt(3, 20)).map {
            val r = random.nextInt()
            when (random.nextInt(29)) {
                0 -> backgroundColor = randomColor()
                1 -> paddingLeft = r.px
                2 -> paddingRight = r.px
                3 -> padding = "${r}px ${r}px"
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

private fun StyledBuilder<*>.addAnimation() {
    css {
        animation(randomTime(), Timing.linear, iterationCount = IterationCount.infinite) {
            from {
                transform {
                    rotate(randomAngle())
                }
            }
            to {
                transform {
                    rotate(randomAngle())
                }
            }
        }
    }
}

object StyledElementsFactory {
    /**
     * @return styled component with [count] styled children, each having random css
     */
    fun getStyledComponent(count: Int, withAnimation: Boolean = false): Component {
        return fc {
            (1..count).map {
                styledDiv {
                    addCss()
                    if (withAnimation) {
                        addAnimation()
                    }
                }
            }
        }
    }

    /** Create [StyledElementBuilder] with dummy element and get [StyledElementBuilder.css] property [count] times
     *  @return list of [CSSBuilder] with random css code inside
     */
    fun getCssBuilders(count: Int): List<CSSBuilder> {
        return (1..count).map {
            val builder = StyledElementBuilder.invoke(fc {})
            builder.addCss()
            builder.css
        }
    }
}

