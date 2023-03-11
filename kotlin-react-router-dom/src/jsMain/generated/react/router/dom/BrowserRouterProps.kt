@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.router.dom

import web.window.Window


external interface BrowserRouterProps : react.PropsWithChildren {
    var basename: String?
    var window: Window?
}
