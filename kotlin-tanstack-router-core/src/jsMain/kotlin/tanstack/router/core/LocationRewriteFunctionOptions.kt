package tanstack.router.core

import kotlinx.js.JsPlainObject
import web.url.URL

@JsPlainObject
internal /* raw */
external interface LocationRewriteFunctionOptions {
    val url: URL
}
