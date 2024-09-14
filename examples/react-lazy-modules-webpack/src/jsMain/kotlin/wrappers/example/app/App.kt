package wrappers.example.app

import emotion.react.css
import react.FC
import react.Suspense
import react.dom.html.ReactHTML.div
import web.cssom.Display
import wrappers.example.content.Content
import wrappers.example.footer.Footer
import wrappers.example.header.Header

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
