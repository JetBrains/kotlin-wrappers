package tanstack.router.core

import kotlinx.js.JsPlainObject

typealias BuildLocationFn = (
    options: BuildLocationOptions,
) -> ParsedLocation

@JsPlainObject
external interface BuildLocationOptions :
    ToOptions {
    var leaveParams: Boolean?
}
