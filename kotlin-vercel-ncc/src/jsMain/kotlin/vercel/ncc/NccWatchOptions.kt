package vercel.ncc

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NccWatchOptions : NccOptions {
    var watch: Watch
}
