package example.react

import react.FC
import react.Props
import react.dom.html.ReactHTML.title
import react.dom.svg.ReactSVG.animateMotion
import react.dom.svg.ReactSVG.circle
import react.dom.svg.ReactSVG.rect
import react.dom.svg.ReactSVG.svg
import react.invoke
import react.unaryPlus
import web.svg.RepeatCount
import web.svg.indefinite

// Kotlin example for React SVG animation
// https://developer.mozilla.org/en-US/docs/Web/SVG/Guides/SVG_animation_with_SMIL#example_1_linear_motion
internal val View: FC<Props> = FC {
    svg {
        xmlns = "http://www.w3.org/2000/svg"
        width = 300.0
        height = 100.0

        title {
            +"SVG SMIL Animate with Path"
        }

        rect {
            x = 0.0
            y = 0.0
            width = 300.0
            height = 100.0
            stroke = "black"
            strokeWidth = 1.0
        }

        circle {
            cx = 0.0
            cy = 50.0
            r = 15.0
            fill = "blue"
            stroke = "black"
            strokeWidth = 1.0

            animateMotion {
                path = "M 0 0 H 300 Z"
                dur = "3s"
                repeatCount = RepeatCount.indefinite
            }
        }

        circle {
            cx = 0.0
            cy = 100.0
            r = 15.0
            fill = "red"
            stroke = "black"
            strokeWidth = 1.0

            animateMotion {
                path = "M 0 0 H 300 Z"
                dur = "3s"
                repeatCount = RepeatCount(3.0)
            }
        }
    }
}
