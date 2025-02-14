// Generated by Karakum - do not modify it manually!

package node.events

@js.objects.JsPlainObject
sealed external interface StaticEventEmitterIteratorOptions : StaticEventEmitterOptions {
    /**
     * Names of events that will end the iteration.
     */
    var close: js.array.ReadonlyArray<String>?

    /**
     * The high watermark. The emitter is paused every time the size of events being buffered is higher than it.
     * Supported only on emitters implementing `pause()` and `resume()` methods.
     * @default Number.MAX_SAFE_INTEGER
     */
    var highWaterMark: Double?

    /**
     * The low watermark. The emitter is resumed every time the size of events being buffered is lower than it.
     * Supported only on emitters implementing `pause()` and `resume()` methods.
     * @default 1
     */
    var lowWaterMark: Double?
}
