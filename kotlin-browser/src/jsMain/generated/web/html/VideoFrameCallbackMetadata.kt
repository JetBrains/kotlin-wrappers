// Automatically generated - do not modify!

package web.html

import js.objects.JsPlainObject
import web.time.DOMHighResTimeStamp

@JsPlainObject
sealed external interface VideoFrameCallbackMetadata {
    var captureTime: DOMHighResTimeStamp?
    var expectedDisplayTime: DOMHighResTimeStamp
    var height: Int
    var mediaTime: Double
    var presentationTime: DOMHighResTimeStamp
    var presentedFrames: Int
    var processingDuration: Double?
    var receiveTime: DOMHighResTimeStamp?
    var rtpTimestamp: Int?
    var width: Int
}
