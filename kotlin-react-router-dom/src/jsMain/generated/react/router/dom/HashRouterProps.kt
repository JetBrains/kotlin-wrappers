@file:JsModule("react-router-dom")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NAME_CONTAINS_ILLEGAL_CHARS",
)

package react.router.dom

import web.window.Window


external interface HashRouterProps : react.PropsWithChildren {
    var basename: String?
    var window: Window?
}

