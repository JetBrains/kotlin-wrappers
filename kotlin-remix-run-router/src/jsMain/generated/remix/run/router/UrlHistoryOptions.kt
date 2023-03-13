@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import web.window.Window


sealed external interface UrlHistoryOptions {
    var window: Window?
    var v5Compat: Boolean?
}
