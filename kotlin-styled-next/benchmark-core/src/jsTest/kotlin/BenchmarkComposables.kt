import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import styled.*

private fun StyledBuilder<*>.addCss(i: Int) {
    css {
        (1 until i).map {
            when (it % 4) {
                0 -> backgroundColor = Color.aliceBlue
                1 -> paddingLeft = 12.px
                2 -> paddingRight = 12.px
                3 -> padding = "55px 16px"
                // TODO
            }
        }
    }
}

private fun StyledBuilder<*>.addAnimation() {
    css {
        animation(5.s, Timing.linear, iterationCount = IterationCount.infinite) {
            from {
                transform {
                    rotate(0.deg)
                }
            }
            to {
                transform {
                    rotate(360.deg)
                }
            }
        }
    }
}

fun getStyledComponent(position: Int, withAnimation: Boolean = false): ComponentType<RProps> {
    return fc {
        (0 until position).map {
            styledDiv {
                addCss(it)
                if (withAnimation) {
                    addAnimation()
                }
                css {
                    backgroundColor = Color.red
                }
            }
        }
    }
}

fun getDeclaration(position: Int): Pair<String, Any> {
    val declarations: List<Pair<String, Any>> = listOf(
        "alignContent" to Align.center,
        "alignItems" to Align.baseline,
        "alignSelf" to Align.flexEnd,
        "appearance" to Appearance.auto,
        // TODO
    )
    return declarations[position % declarations.size]
}

fun getCssBuilders(count: Int): List<CSSBuilder> {
    return (0 until count).map {
        val css = CSSBuilder()
        (0 until it).forEach {
            val (key, value) = getDeclaration(it)
            css.declarations[key] = value
        }
        css
    }
}
