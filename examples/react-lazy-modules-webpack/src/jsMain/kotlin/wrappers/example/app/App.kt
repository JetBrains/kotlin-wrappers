package wrappers.example.app

import emotion.react.css
import js.import.importAsync
import js.objects.ReadonlyRecord
import react.*
import react.dom.html.ReactHTML.div
import web.cssom.Display

typealias ComponentRecord = ReadonlyRecord<String, ComponentType<Props>>

val LazyHeader = lazy {
    importAsync<ComponentRecord>("../header/header.mjs")
        .then { ComponentModule(it["Header"]!!) }
}

val LazyContent = lazy {
    importAsync<ComponentRecord>("../content/content.mjs")
        .then { ComponentModule(it["Content"]!!) }
}
val LazyFooter = lazy {
    importAsync<ComponentRecord>("../footer/footer.mjs")
        .then { ComponentModule(it["Footer"]!!) }
}

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
