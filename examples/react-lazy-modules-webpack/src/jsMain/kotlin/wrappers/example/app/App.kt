package wrappers.example.app

import emotion.react.css
import js.import.importAsync
import react.ComponentModule
import react.FC
import react.Props
import react.Suspense
import react.dom.html.ReactHTML.div
import web.cssom.Display

val LazyHeader = react.lazy { importAsync<ComponentModule<Props>>("header.js") }
val LazyContent = react.lazy { importAsync<ComponentModule<Props>>("content.js") }
val LazyFooter = react.lazy { importAsync<ComponentModule<Props>>("footer.js") }

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
