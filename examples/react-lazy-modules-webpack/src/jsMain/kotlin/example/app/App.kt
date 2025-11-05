package example.app

import emotion.react.css
import example.content.Content
import example.footer.Footer
import example.header.Header
import react.FC
import react.Suspense
import react.dom.html.ReactHTML.div
import react.invoke
import web.cssom.Display

val App = FC {
    div {
        css {
            display = Display.grid
        }

        Suspense {
            Header()
        }

        Suspense {
            Content()
        }

        Suspense {
            Footer()
        }
    }
}
