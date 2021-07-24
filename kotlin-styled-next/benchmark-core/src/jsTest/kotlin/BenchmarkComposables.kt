import kotlinx.css.*
import kotlinx.css.properties.*
import react.FunctionalComponent
import react.RProps
import react.functionalComponent
import styled.*

private fun StyledBuilder<*>.addCss(i: Int) {
    css {
        (1 until i).map {
            when (it % 4) {
                0 -> backgroundColor = Color.aliceBlue
                1 -> paddingLeft = 12.px
                2 -> paddingRight = 12.px
                3 -> padding = "55px 16px"
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

fun getItems(count: Int, withAnimation: Boolean = false): FunctionalComponent<RProps> {
    return functionalComponent {
        (0 until count).map {
            styledDiv {
                +"Hello, world"
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

fun getItems(list: List<String>): FunctionalComponent<RProps> {
    return functionalComponent {
        list.map {
            styledDiv {
                +it
                css {

                }
            }
        }
    }
}