package react.dom

import kotlinx.js.JsPlainObject
import web.http.CrossOrigin

@JsPlainObject
external interface PreconnectOptions {
    // Don't create a helper type.
    // It would have to be in module scope to be inlined in TS tooltips.
    // But then it becomes part of the public API.
    // TODO: Upstream to microsoft/TypeScript-DOM-lib-generator -> w3c/webref
    // since the spec has a notion of a dedicated type: https://html.spec.whatwg.org/multipage/urls-and-fetching.html#cors-settings-attribute
    val crossOrigin: CrossOrigin?
}
