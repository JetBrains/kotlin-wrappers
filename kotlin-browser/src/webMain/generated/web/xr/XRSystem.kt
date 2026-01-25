// Automatically generated - do not modify!

package web.xr

import js.promise.Promise
import js.promise.await
import web.events.Event
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import kotlin.js.JsBoolean
import kotlin.js.JsName
import kotlin.js.definedExternally
import kotlin.js.toBoolean

open external class XRSystem
private constructor() :
    EventTarget {
    /**
     * Attempts to initialize an XRSession for the given mode if possible, entering immersive
     * mode if necessary.
     * @param mode
     * @param options
     */
    @JsName("requestSession")
    fun requestSessionAsync(
        mode: XRSessionMode,
        options: XRSessionInit = definedExternally,
    ): Promise<XRSession>

    /**
     * Queries if a given mode may be supported by the user agent and device capabilities.
     * @param mode
     */
    @JsName("isSessionSupported")
    fun isSessionSupportedAsync(mode: XRSessionMode): Promise<JsBoolean>
    var ondevicechange: EventHandler<XRSystemDeviceChangeEvent, *, *>?
    var onsessiongranted: EventHandler<XRSystemSessionGrantedEvent, *, *>?
}

/**
 * Attempts to initialize an XRSession for the given mode if possible, entering immersive
 * mode if necessary.
 * @param mode
 * @param options
 */
suspend inline fun XRSystem.requestSession(
    mode: XRSessionMode,
): XRSession {
    return requestSessionAsync(
        mode = mode,
    ).await()
}

/**
 * Attempts to initialize an XRSession for the given mode if possible, entering immersive
 * mode if necessary.
 * @param mode
 * @param options
 */
suspend inline fun XRSystem.requestSession(
    mode: XRSessionMode,
    options: XRSessionInit,
): XRSession {
    return requestSessionAsync(
        mode = mode,
        options = options,
    ).await()
}

/**
 * Queries if a given mode may be supported by the user agent and device capabilities.
 * @param mode
 */
suspend inline fun XRSystem.isSessionSupported(mode: XRSessionMode): Boolean {
    return isSessionSupportedAsync(
        mode = mode,
    ).await().toBoolean()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XRSystem/devicechange_event)
 */
inline val <C : XRSystem> C.deviceChangeEvent: EventInstance<Event, C, C>
    get() = EventInstance(this, "devicechange")
