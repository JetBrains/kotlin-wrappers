package web.usb

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB)
 */
@ExperimentalWebApi
open external class USB
private constructor() :
    EventTarget {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/connect_event)
     */
    var onconnect: EventHandler<USBConnectionEvent, USB, USB>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/disconnect_event)
     */
    var ondisconnect: EventHandler<USBConnectionEvent, USB, USB>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/getDevice)
     */
    @JsName("getDevices")
    fun getDevicesAsync(): Promise<ReadonlyArray<USBDevice>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/requestDevice)
     */
    @JsName("requestDevice")
    fun requestDeviceAsync(options: USBDeviceRequestOptions): Promise<USBDevice>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/getDevice)
 */
@ExperimentalWebApi
suspend inline fun USB.getDevices(): ReadonlyArray<USBDevice> =
    getDevicesAsync().await()

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/requestDevice)
 */
@ExperimentalWebApi
suspend inline fun USB.requestDevice(options: USBDeviceRequestOptions): USBDevice =
    requestDeviceAsync(options).await()

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/connect_event)
 */
@ExperimentalWebApi
inline val <C : USB> C.connectEvent: EventInstance<USBConnectionEvent, C, C>
    get() = EventInstance(this, "connect")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USB/disconnect_event)
 */
@ExperimentalWebApi
inline val <C : USB> C.disconnectEvent: EventInstance<USBConnectionEvent, C, C>
    get() = EventInstance(this, "disconnect")
