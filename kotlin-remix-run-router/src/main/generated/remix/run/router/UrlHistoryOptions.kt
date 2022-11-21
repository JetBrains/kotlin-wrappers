@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router

import dom.html.Window


external interface UrlHistoryOptions {
    var window: Window?
    var v5Compat: Boolean?
}

