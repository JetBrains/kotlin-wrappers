package web.usb

import js.array.ReadonlyArray
import js.buffer.BufferSource
import js.core.JsUInt
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice)
 */
@ExperimentalWebApi
open external class USBDevice
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/usbVersionMajor)
     */
    val usbVersionMajor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/usbVersionMinor)
     */
    val usbVersionMinor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/usbVersionSubminor)
     */
    val usbVersionSubminor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceClass)
     */
    val deviceClass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceSubclass)
     */
    val deviceSubclass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceProtocol)
     */
    val deviceProtocol: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/vendorId)
     */
    val vendorId: Short /* unsigned short */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/productId)
     */
    val productId: Short /* unsigned short */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceVersionMajor)
     */
    val deviceVersionMajor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceVersionMinor)
     */
    val deviceVersionMinor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceVersionSubminor)
     */
    val deviceVersionSubminor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/manufacturerName)
     */
    val manufacturerName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/productName)
     */
    val productName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/serialNumber)
     */
    val serialNumber: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/configuration)
     */
    val configuration: USBConfiguration?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/configurations)
     */
    val configurations: ReadonlyArray<USBConfiguration>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/opened)
     */
    val opened: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/open)
     */
    @JsName("open")
    fun openAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/close)
     */
    @JsName("close")
    fun closeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/forget)
     */
    @JsName("forget")
    fun forgetAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/selectConfiguration)
     */
    @JsName("selectConfiguration")
    fun selectConfigurationAsync(configurationValue: Short /* unsigned byte */): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/claimInterface)
     */
    @JsName("claimInterface")
    fun claimInterfaceAsync(interfaceNumber: Short /* unsigned byte */): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/releaseInterface)
     */
    @JsName("releaseInterface")
    fun releaseInterfaceAsync(interfaceNumber: Short /* unsigned byte */): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/selectAlternateInterface)
     */
    @JsName("selectAlternateInterface")
    fun selectAlternateInterfaceAsync(
        interfaceNumber: Short, /* unsigned byte */
        alternateSetting: Short, /* unsigned byte */
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/controlTransferIn)
     */
    @JsName("controlTransferIn")
    fun controlTransferInAsync(
        setup: USBControlTransferParameters,
        length: Short, /* unsigned short */
    ): Promise<USBInTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/controlTransferOut)
     */
    @JsName("controlTransferOut")
    fun controlTransferOutAsync(
        setup: USBControlTransferParameters,
        data: BufferSource = definedExternally,
    ): Promise<USBOutTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/clearHalt)
     */
    @JsName("clearHalt")
    fun clearHaltAsync(
        direction: USBDirection,
        endpointNumber: Short, /* unsigned byte */
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/transferIn)
     */
    @JsName("transferIn")
    fun transferInAsync(
        endpointNumber: Short, /* unsigned byte */
        length: Short, /* unsigned short */
    ): Promise<USBInTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/transferOut)
     */
    @JsName("transferOut")
    fun transferOutAsync(
        endpointNumber: Short, /* unsigned byte */
        data: BufferSource,
    ): Promise<USBOutTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/isochronousTransferIn)
     */
    @JsName("isochronousTransferIn")
    fun isochronousTransferInAsync(
        endpointNumber: Short, /* unsigned byte */
        packetLengths: ReadonlyArray<JsUInt>,
    ): Promise<USBIsochronousInTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/isochronousTransferOut)
     */
    @JsName("isochronousTransferOut")
    fun isochronousTransferOutAsync(
        endpointNumber: Short, /* unsigned byte */
        data: BufferSource,
        packetLengths: ReadonlyArray<JsUInt>,
    ): Promise<USBIsochronousOutTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/reset)
     */
    @JsName("reset")
    fun resetAsync(): Promise<Void>
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/open)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.open() {
    openAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/close)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.close() {
    closeAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/forget)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.forget() {
    forgetAsync().await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/selectConfiguration)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.selectConfiguration(configurationValue: Short /* unsigned byte */) {
    selectConfigurationAsync(
        configurationValue = configurationValue,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/claimInterface)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.claimInterface(interfaceNumber: Short /* unsigned byte */) {
    claimInterfaceAsync(
        interfaceNumber = interfaceNumber,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/releaseInterface)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.releaseInterface(interfaceNumber: Short /* unsigned byte */) {
    releaseInterfaceAsync(
        interfaceNumber = interfaceNumber,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/selectAlternateInterface)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.selectAlternateInterface(
    interfaceNumber: Short, /* unsigned byte */
    alternateSetting: Short, /* unsigned byte */
) {
    selectAlternateInterfaceAsync(
        interfaceNumber = interfaceNumber,
        alternateSetting = alternateSetting,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/controlTransferIn)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.controlTransferIn(
    setup: USBControlTransferParameters,
    length: Short, /* unsigned short */
): USBInTransferResult {
    return controlTransferInAsync(
        setup = setup,
        length = length,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/controlTransferOut)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.controlTransferOut(
    setup: USBControlTransferParameters,
): USBOutTransferResult {
    return controlTransferOutAsync(
        setup = setup,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/controlTransferOut)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.controlTransferOut(
    setup: USBControlTransferParameters,
    data: BufferSource,
): USBOutTransferResult {
    return controlTransferOutAsync(
        setup = setup,
        data = data,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/clearHalt)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.clearHalt(
    direction: USBDirection,
    endpointNumber: Short, /* unsigned byte */
) {
    clearHaltAsync(
        direction = direction,
        endpointNumber = endpointNumber,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/transferIn)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.transferIn(
    endpointNumber: Short, /* unsigned byte */
    length: Short, /* unsigned short */
): USBInTransferResult {
    return transferInAsync(
        endpointNumber = endpointNumber,
        length = length,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/transferOut)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.transferOut(
    endpointNumber: Short, /* unsigned byte */
    data: BufferSource,
): USBOutTransferResult {
    return transferOutAsync(
        endpointNumber = endpointNumber,
        data = data,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/isochronousTransferIn)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.isochronousTransferIn(
    endpointNumber: Short, /* unsigned byte */
    packetLengths: ReadonlyArray<JsUInt>,
): USBIsochronousInTransferResult {
    return isochronousTransferInAsync(
        endpointNumber = endpointNumber,
        packetLengths = packetLengths,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/isochronousTransferOut)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.isochronousTransferOut(
    endpointNumber: Short, /* unsigned byte */
    data: BufferSource,
    packetLengths: ReadonlyArray<JsUInt>,
): USBIsochronousOutTransferResult {
    return isochronousTransferOutAsync(
        endpointNumber = endpointNumber,
        data = data,
        packetLengths = packetLengths,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/reset)
 */
@ExperimentalWebApi
suspend inline fun USBDevice.reset() {
    resetAsync().await()
}
