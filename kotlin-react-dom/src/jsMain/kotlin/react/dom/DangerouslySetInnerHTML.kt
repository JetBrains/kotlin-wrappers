package react.dom

import kotlinx.js.JsPlainObject
import web.html.HtmlSource

@JsPlainObject
external interface DangerouslySetInnerHTML {
    val __html: HtmlSource
}
