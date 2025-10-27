package web.profiler

import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi
import web.time.DOMHighResTimeStamp

@JsPlainObject
@ExperimentalWebApi
external interface ProfilerInitOptions {
    var sampleInterval: DOMHighResTimeStamp
    var maxBufferSize: Int
}
