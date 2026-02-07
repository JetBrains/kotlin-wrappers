package vercel.ncc

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface NccWatchOptions :
    NccOptions {
    val watch: Watch
}
