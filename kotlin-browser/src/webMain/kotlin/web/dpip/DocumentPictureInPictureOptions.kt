package web.dpip

import js.core.UInt53
import js.objects.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface DocumentPictureInPictureOptions {
    var width: UInt53?
    var height: UInt53?
    var disallowReturnToOpener: Boolean?
    var preferInitialWindowPlacement: Boolean?
}
