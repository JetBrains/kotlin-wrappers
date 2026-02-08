// Automatically generated - do not modify!

package web.navigator

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.await
import web.badge.NavigatorBadge
import web.clipboard.Clipboard
import web.credentials.CredentialsContainer
import web.experimental.ExperimentalWebApi
import web.fedcm.NavigatorLogin
import web.gamepad.Gamepad
import web.geolocation.Geolocation
import web.gpu.NavigatorGPU
import web.http.BodyInit
import web.keyboard.Keyboard
import web.locks.NavigatorLocks
import web.mediacapabilities.MediaCapabilities
import web.mediadevices.MediaDevices
import web.mediakey.MediaKeySystemAccess
import web.mediakey.MediaKeySystemConfiguration
import web.mediasession.MediaSession
import web.midi.MIDIAccess
import web.midi.MIDIOptions
import web.permissions.Permissions
import web.presentation.Presentation
import web.serviceworker.ServiceWorkerContainer
import web.share.ShareData
import web.storage.NavigatorStorage
import web.url.URL
import web.usb.USB
import web.useractivation.UserActivation
import web.vibration.VibratePattern
import web.wakelock.WakeLock
import web.xr.XRSystem
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Navigator`** interface represents the state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator)
 */
open external class Navigator
private constructor() :
    NavigatorAutomationInformation,
    NavigatorBadge,
    NavigatorConcurrentHardware,
    NavigatorContentUtils,
    NavigatorCookies,
    NavigatorGPU,
    NavigatorID,
    NavigatorLanguage,
    NavigatorLocks,
    NavigatorOnLine,
    NavigatorPlugins,
    NavigatorStorage {
    /**
     * The **`clipboard`** read-only property of the Navigator interface returns a Clipboard object used to read and write the clipboard's contents.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clipboard)
     */
    val clipboard: Clipboard

    /**
     * The **`credentials`** read-only property of the Navigator interface returns the CredentialsContainer object associated with the current document, which exposes methods to request credentials. The CredentialsContainer interface also notifies the user agent when an interesting event occurs, such as a successful sign-in or sign-out. This interface can be used for feature detection.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/credentials)
     */
    val credentials: CredentialsContainer

    /**
     * The **`Navigator.doNotTrack`** property returns the user's Do Not Track setting, which indicates whether the user is requesting websites and advertisers to not track them.
     */
    val doNotTrack: String?

    /**
     * The **`Navigator.geolocation`** read-only property returns a Geolocation object that gives Web content access to the location of the device. This allows a website or app to offer customized results based on the user's location.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/geolocation)
     */
    val geolocation: Geolocation

    /**
     * The **`login`** read-only property of the Navigator interface provides access to the browser's NavigatorLogin object, which a federated identity provider (IdP) can use to set its login status when a user signs into or out of the IdP.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/login)
     */
    val login: NavigatorLogin

    /**
     * The **`maxTouchPoints`** read-only property of the Navigator interface returns the maximum number of simultaneous touch contact points that are supported by the current device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/maxTouchPoints)
     */
    val maxTouchPoints: Int

    /**
     * The **`mediaCapabilities`** read-only property of the Navigator interface references a MediaCapabilities object that can expose information about the decoding and encoding capabilities for a given media format and output capabilities.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaCapabilities)
     */
    val mediaCapabilities: MediaCapabilities

    /**
     * The **`mediaDevices`** read-only property of the Navigator interface returns a MediaDevices object, which provides access to connected media input devices like cameras and microphones, as well as screen sharing.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaDevices)
     */
    val mediaDevices: MediaDevices

    /**
     * The **`mediaSession`** read-only property of the Navigator interface returns a MediaSession object that can be used to share with the browser metadata and other information about the current playback state of media being handled by a document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaSession)
     */
    val mediaSession: MediaSession

    /**
     * The **`permissions`** read-only property of the Navigator interface returns a Permissions object that can be used to query and update permission status of APIs covered by the Permissions API.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/permissions)
     */
    val permissions: Permissions

    /**
     * The **`serviceWorker`** read-only property of the Navigator interface returns the ServiceWorkerContainer object for the associated document, which provides access to registration, removal, upgrade, and communication with the ServiceWorker.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/serviceWorker)
     */
    val serviceWorker: ServiceWorkerContainer

    /**
     * The read-only **`userActivation`** property of the Navigator interface returns a UserActivation object which contains information about the current window's user activation state.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/userActivation)
     */
    val userActivation: UserActivation

    /**
     * The **`wakeLock`** read-only property of the Navigator interface returns a WakeLock interface that allows a document to acquire a screen wake lock. While a screen wake lock is active, the user agent will try to prevent the device from dimming the screen, turning it off completely, or showing a screensaver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/wakeLock)
     */
    val wakeLock: WakeLock

    /**
     * The **`canShare()`** method of the Navigator interface returns true if the equivalent call to navigator.share() would succeed.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare)
     */
    fun canShare(data: ShareData = definedExternally): Boolean

    /**
     * The **`Navigator.getGamepads()`** method returns an array of Gamepad objects, one for each gamepad connected to the device.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/getGamepads)
     */
    fun getGamepads(): ReadonlyArray<Gamepad?>

    /**
     * The **`requestMIDIAccess()`** method of the Navigator interface returns a Promise representing a request for access to MIDI devices on a user's system. This method is part of the Web MIDI API, which provides a means for accessing, enumerating, and manipulating MIDI devices.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMIDIAccess)
     */
    @JsName("requestMIDIAccess")
    fun requestMIDIAccessAsync(options: MIDIOptions = definedExternally): Promise<MIDIAccess>

    /**
     * The **`requestMediaKeySystemAccess()`** method of the Navigator interface returns a Promise which delivers a MediaKeySystemAccess object that can be used to access a particular media key system, which can in turn be used to create keys for decrypting a media stream.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMediaKeySystemAccess)
     */
    @JsName("requestMediaKeySystemAccess")
    fun requestMediaKeySystemAccessAsync(
        keySystem: String,
        supportedConfigurations: ReadonlyArray<MediaKeySystemConfiguration>,
    ): Promise<MediaKeySystemAccess>

    /**
     * The **`navigator.sendBeacon()`** method asynchronously sends an HTTP POST request containing a small amount of data to a web server.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/sendBeacon)
     */
    fun sendBeacon(
        url: String,
        data: BodyInit? = definedExternally,
    ): Boolean

    fun sendBeacon(
        url: URL,
        data: BodyInit? = definedExternally,
    ): Boolean

    /**
     * The **`share()`** method of the Navigator interface invokes the native sharing mechanism of the device to share data such as text, URLs, or files. The available share targets depend on the device, but might include the clipboard, contacts and email applications, websites, Bluetooth, etc.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/share)
     */
    @JsName("share")
    fun shareAsync(data: ShareData = definedExternally): Promise<Void>

    /**
     * The **`vibrate()`** method of the Navigator interface pulses the vibration hardware on the device, if such hardware exists. If the device doesn't support vibration, this method has no effect. If a vibration pattern is already in progress when this method is called, the previous pattern is halted and the new one begins instead.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vibrate)
     */
    fun vibrate(pattern: VibratePattern): Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/keyboard)
     */
    @ExperimentalWebApi
    val keyboard: Keyboard

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/presentation)
     */
    @ExperimentalWebApi
    val presentation: Presentation

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/usb)
     */
    @ExperimentalWebApi
    val usb: USB

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/xr)
     */
    val xr: XRSystem
}

/**
 * The **`requestMIDIAccess()`** method of the Navigator interface returns a Promise representing a request for access to MIDI devices on a user's system. This method is part of the Web MIDI API, which provides a means for accessing, enumerating, and manipulating MIDI devices.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMIDIAccess)
 */
suspend inline fun Navigator.requestMIDIAccess(): MIDIAccess {
    return requestMIDIAccessAsync().await()
}

/**
 * The **`requestMIDIAccess()`** method of the Navigator interface returns a Promise representing a request for access to MIDI devices on a user's system. This method is part of the Web MIDI API, which provides a means for accessing, enumerating, and manipulating MIDI devices.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMIDIAccess)
 */
suspend inline fun Navigator.requestMIDIAccess(options: MIDIOptions): MIDIAccess {
    return requestMIDIAccessAsync(
        options = options,
    ).await()
}

/**
 * The **`requestMediaKeySystemAccess()`** method of the Navigator interface returns a Promise which delivers a MediaKeySystemAccess object that can be used to access a particular media key system, which can in turn be used to create keys for decrypting a media stream.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMediaKeySystemAccess)
 */
suspend inline fun Navigator.requestMediaKeySystemAccess(
    keySystem: String,
    supportedConfigurations: ReadonlyArray<MediaKeySystemConfiguration>,
): MediaKeySystemAccess {
    return requestMediaKeySystemAccessAsync(
        keySystem = keySystem,
        supportedConfigurations = supportedConfigurations,
    ).await()
}

/**
 * The **`share()`** method of the Navigator interface invokes the native sharing mechanism of the device to share data such as text, URLs, or files. The available share targets depend on the device, but might include the clipboard, contacts and email applications, websites, Bluetooth, etc.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/share)
 */
suspend inline fun Navigator.share() {
    shareAsync().await()
}

/**
 * The **`share()`** method of the Navigator interface invokes the native sharing mechanism of the device to share data such as text, URLs, or files. The available share targets depend on the device, but might include the clipboard, contacts and email applications, websites, Bluetooth, etc.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/share)
 */
suspend inline fun Navigator.share(data: ShareData) {
    shareAsync(
        data = data,
    ).await()
}
