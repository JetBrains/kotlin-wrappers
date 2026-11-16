package web.usb

import js.array.ReadonlyArray
import js.buffer.BufferSource
import js.numbers.JsUInt
import js.promise.Promise
import js.promise.await
import js.void.Void
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice)
 */
@ExperimentalWebApi
open external class USBDevice
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/usbVersionMajor)
     */
    open val usbVersionMajor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/usbVersionMinor)
     */
    open val usbVersionMinor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/usbVersionSubminor)
     */
    open val usbVersionSubminor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceClass)
     */
    open val deviceClass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceSubclass)
     */
    open val deviceSubclass: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceProtocol)
     */
    open val deviceProtocol: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/vendorId)
     */
    open val vendorId: Short /* unsigned short */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/productId)
     */
    open val productId: Short /* unsigned short */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceVersionMajor)
     */
    open val deviceVersionMajor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceVersionMinor)
     */
    open val deviceVersionMinor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/deviceVersionSubminor)
     */
    open val deviceVersionSubminor: Short /* unsigned byte */

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/manufacturerName)
     */
    open val manufacturerName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/productName)
     */
    open val productName: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/serialNumber)
     */
    open val serialNumber: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/configuration)
     */
    open val configuration: USBConfiguration?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/configurations)
     */
    open val configurations: ReadonlyArray<USBConfiguration>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/opened)
     */
    open val opened: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/open)
     */
    @JsName("open")
    open fun openAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/close)
     */
    @JsName("close")
    open fun closeAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/forget)
     */
    @JsName("forget")
    open fun forgetAsync(): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/selectConfiguration)
     */
    @JsName("selectConfiguration")
    open fun selectConfigurationAsync(configurationValue: Short /* unsigned byte */): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/claimInterface)
     */
    @JsName("claimInterface")
    open fun claimInterfaceAsync(interfaceNumber: Short /* unsigned byte */): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/releaseInterface)
     */
    @JsName("releaseInterface")
    open fun releaseInterfaceAsync(interfaceNumber: Short /* unsigned byte */): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/selectAlternateInterface)
     */
    @JsName("selectAlternateInterface")
    open fun selectAlternateInterfaceAsync(
        interfaceNumber: Short, /* unsigned byte */
        alternateSetting: Short, /* unsigned byte */
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/controlTransferIn)
     */
    @JsName("controlTransferIn")
    open fun controlTransferInAsync(
        setup: USBControlTransferParameters,
        length: Short, /* unsigned short */
    ): Promise<USBInTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/controlTransferOut)
     */
    @JsName("controlTransferOut")
    open fun controlTransferOutAsync(
        setup: USBControlTransferParameters,
        data: BufferSource = definedExternally,
    ): Promise<USBOutTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/clearHalt)
     */
    @JsName("clearHalt")
    open fun clearHaltAsync(
        direction: USBDirection,
        endpointNumber: Short, /* unsigned byte */
    ): Promise<Void>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/transferIn)
     */
    @JsName("transferIn")
    open fun transferInAsync(
        endpointNumber: Short, /* unsigned byte */
        length: Short, /* unsigned short */
    ): Promise<USBInTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/transferOut)
     */
    @JsName("transferOut")
    open fun transferOutAsync(
        endpointNumber: Short, /* unsigned byte */
        data: BufferSource,
    ): Promise<USBOutTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/isochronousTransferIn)
     */
    @JsName("isochronousTransferIn")
    open fun isochronousTransferInAsync(
        endpointNumber: Short, /* unsigned byte */
        packetLengths: ReadonlyArray<JsUInt>,
    ): Promise<USBIsochronousInTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/isochronousTransferOut)
     */
    @JsName("isochronousTransferOut")
    open fun isochronousTransferOutAsync(
        endpointNumber: Short, /* unsigned byte */
        data: BufferSource,
        packetLengths: ReadonlyArray<JsUInt>,
    ): Promise<USBIsochronousOutTransferResult>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/USBDevice/reset)
     */
    @JsName("reset")
    open fun resetAsync(): Promise<Void>
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
