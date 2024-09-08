package team.karakum.components

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.a
import react.dom.html.ReactHTML.div
import team.karakum.Colors
import web.cssom.FontWeight
import web.cssom.Overflow
import web.cssom.Padding
import web.cssom.px

val Header = FC {
    div {
        css {
            overflow = Overflow.hidden
            backgroundColor = Colors.Background.Gray
            padding = Padding(20.px, 10.px)
        }

        a {
            css {
                fontSize = 25.px
                fontWeight = FontWeight.bold
            }

            +"Kotlin React Table"
        }
    }
}
