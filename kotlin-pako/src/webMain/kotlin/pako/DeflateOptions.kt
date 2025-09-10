package pako

import js.objects.JsPlainObject
import kotlin.js.JsAny

@JsPlainObject
external interface DeflateOptions {
    var level: Int? /*-1 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 */
    var windowBits: Int?
    var memLevel: Int?
    var strategy: Strategy?
    var dictionary: JsAny?
    var raw: Boolean?
}
