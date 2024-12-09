package vercel.ncc

import js.objects.JsPlainObject

@JsPlainObject
external interface NccWatchOptions :
    NccOptions {
    val watch: Watch
}
