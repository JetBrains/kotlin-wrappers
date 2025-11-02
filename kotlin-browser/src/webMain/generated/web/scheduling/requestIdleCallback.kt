// Automatically generated - do not modify!

package web.scheduling

import kotlin.js.definedExternally

/**
 * The **`window.requestIdleCallback()`** method queues a function to be called during a browser's idle periods. This enables developers to perform background and low priority work on the main thread, without impacting latency-critical events such as animation and input response. Functions are generally called in first-in-first-out order; however, callbacks which have a timeout specified may be called out-of-order if necessary in order to run them before the timeout elapses.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/requestIdleCallback)
 */
external fun requestIdleCallback(
    callback: IdleRequestCallback,
    options: IdleRequestOptions? = definedExternally,
): IdleRequestId
