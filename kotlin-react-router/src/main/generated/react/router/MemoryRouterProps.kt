@file:JsModule("react-router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router

import remix.run.router.InitialEntry


external interface MemoryRouterProps : react.Props {
    var basename: String?
    var children: react.ReactNode?
    var initialEntries: Array<InitialEntry>?
    var initialIndex: Double?
}

