package web.errors

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QuotaExceededErrorOptions {
    var quota: Double?
    var requested: Double?
}
