package wrappers.example.app

import emotion.react.css
import react.FC
import react.Suspense
import react.dom.html.ReactHTML.div
import web.cssom.Display
import wrappers.example.content.LazyContent
import wrappers.example.footer.LazyFooter
import wrappers.example.header.LazyHeader

val App = FC {
    div {
        css {
            display = Display.grid
        }

        Suspense {
            LazyHeader()
        }

        Suspense {
            LazyContent()
        }

        Suspense {
            LazyFooter()
        }
    }
}
