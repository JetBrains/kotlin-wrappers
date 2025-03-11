package wrappers.example.app

import emotion.react.css
import react.FC
import react.dom.html.ReactHTML.div
import web.cssom.Display
import web.cssom.GridAutoFlow
import web.cssom.px
import wrappers.example.components.LoadingIndicator
import wrappers.example.list.PhotoList

val Content = FC {
    val loading = useIsLoading()

    div {
        css {
            padding = 20.px
            display = Display.grid
            gridAutoFlow = GridAutoFlow.column
        }

        if (!loading) {
            PhotoList()
        } else {
            LoadingIndicator()
        }
    }
}
