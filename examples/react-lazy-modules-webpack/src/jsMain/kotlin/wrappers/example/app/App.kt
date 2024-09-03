package wrappers.example.app

import emotion.react.css
import js.import.importAsync
import js.objects.ReadonlyRecord
import js.promise.Promise
import react.*
import react.dom.html.ReactHTML.div
import web.cssom.Display
import react.lazy as reactLazy

typealias ComponentRecord = ReadonlyRecord<String, ComponentType<Props>>

private fun lazyComponent(
    name: String,
    moduleFactory: () -> Promise<ComponentRecord>,
): ComponentType<Props> =
    reactLazy {
        moduleFactory()
            .then { it[name] }
            .then { requireNotNull(it) }
            .then { ComponentModule(it) }
    }

private val LazyHeader = lazyComponent("Header") {
    importAsync("../header/header.mjs")
}

private val LazyContent = lazyComponent("Content") {
    importAsync("../content/content.mjs")
}

private val LazyFooter = lazyComponent("Footer") {
    importAsync("../footer/footer.mjs")
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
