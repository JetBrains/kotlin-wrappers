package example.app

import emotion.react.css
import example.components.LoadingIndicator
import example.list.PhotoList
import react.FC
import react.dom.html.ReactHTML.div
import web.cssom.Display
import web.cssom.GridAutoFlow
import web.cssom.px

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
