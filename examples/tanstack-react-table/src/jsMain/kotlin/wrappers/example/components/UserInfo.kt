package wrappers.example.components

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.div
import web.cssom.Display
import web.cssom.GridAutoFlow
import web.cssom.px

val UserInfo = FC {
    div {
        css {
            padding = 20.px
            display = Display.grid
            gridAutoFlow = GridAutoFlow.column
        }

        SelectedUserModule {
            UserTable()
            UserPanel()
        }
    }
}
