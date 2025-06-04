// Automatically generated - do not modify!

package web.mediastreams

import web.html.HTMLCanvasElement

/**
 * The **`CanvasCaptureMediaStreamTrack`** interface of the Media Capture and Streams API represents the video track contained in a MediaStream being generated from a canvas following a call to HTMLCanvasElement.captureStream().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack)
 */
external class CanvasCaptureMediaStreamTrack
private constructor() :
    MediaStreamTrack {
    /**
     * The **`canvas`** read-only property of the CanvasCaptureMediaStreamTrack interface returns the HTMLCanvasElement from which frames are being captured.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack/canvas)
     */
    val canvas: HTMLCanvasElement

    /**
     * The **`requestFrame()`** method of the CanvasCaptureMediaStreamTrack interface requests that a frame be captured from the canvas and sent to the stream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack/requestFrame)
     */
    fun requestFrame()
}
