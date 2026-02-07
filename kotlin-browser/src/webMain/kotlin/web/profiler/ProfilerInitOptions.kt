package web.profiler

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi
import web.time.DOMHighResTimeStamp

@JsPlainObject
@ExperimentalWebApi
external interface ProfilerInitOptions {
    var sampleInterval: DOMHighResTimeStamp
    var maxBufferSize: Int
}
