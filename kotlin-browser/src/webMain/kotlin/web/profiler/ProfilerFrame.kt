package web.profiler

import js.core.UInt53
import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface ProfilerFrame {
    val name: String
    val resourceId: UInt53?
    val line: UInt53?
    val column: UInt53?
}
