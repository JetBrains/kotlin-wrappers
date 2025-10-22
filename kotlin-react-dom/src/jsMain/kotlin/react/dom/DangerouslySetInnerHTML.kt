package react.dom

import js.objects.JsPlainObject
import web.html.HtmlSource

@JsPlainObject
external interface DangerouslySetInnerHTML {
    val __html: HtmlSource
}
