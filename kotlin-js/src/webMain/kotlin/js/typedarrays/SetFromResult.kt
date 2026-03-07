package js.typedarrays

import js.numbers.Int53
import kotlinx.js.JsPlainObject

// TODO: merge with `TextEncoderEncodeIntoResult`?
@JsPlainObject
external interface SetFromResult {
    var read: Int53
    var written: Int53
}
