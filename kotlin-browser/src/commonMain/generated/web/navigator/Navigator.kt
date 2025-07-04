// Automatically generated - do not modify!

package web.navigator

import js.array.ReadonlyArray
import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import seskar.js.JsAsync
import web.clipboard.Clipboard
import web.credentials.CredentialsContainer
import web.fedcm.NavigatorLogin
import web.gamepad.Gamepad
import web.geolocation.Geolocation
import web.http.BodyInit
import web.mediacapabilities.MediaCapabilities
import web.mediadevices.MediaDevices
import web.mediakey.MediaKeySystemAccess
import web.mediakey.MediaKeySystemConfiguration
import web.mediasession.MediaSession
import web.midi.MIDIAccess
import web.midi.MIDIOptions
import web.permissions.Permissions
import web.serviceworker.ServiceWorkerContainer
import web.share.ShareData
import web.url.URL
import web.useractivation.UserActivation
import web.vibration.VibratePattern
import web.wakelock.WakeLock
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`Navigator`** interface represents the state and the identity of the user agent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator)
 */
sealed /* final */
external class Navigator
protected /* private */ constructor() :
    NavigatorAutomationInformation,
    NavigatorBadge,
    NavigatorConcurrentHardware,
    NavigatorContentUtils,
    NavigatorCookies,
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
     * The **`credentials`** read-only property of the Navigator interface returns the CredentialsContainer object associated with the current document, which exposes methods to request credentials.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/credentials)
     */
    val credentials: CredentialsContainer
    val doNotTrack: String?

    /**
     * The **`Navigator.geolocation`** read-only property returns a device.
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
     * The **`maxTouchPoints`** read-only property of the contact points that are supported by the current device.
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
     * The **`permissions`** read-only property of the Navigator interface returns a status of APIs covered by the Permissions API.
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
     * The **`wakeLock`** read-only property of the Navigator interface returns a WakeLock interface that allows a document to acquire a screen wake lock.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/wakeLock)
     */
    val wakeLock: WakeLock

    /**
     * The **`canShare()`** method of the Navigator interface returns `true` if the equivalent call to navigator.share() would succeed.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare)
     */
    fun canShare(data: ShareData = definedExternally): Boolean

    /**
     * The **`Navigator.getGamepads()`** method returns an array of Elements in the array may be `null` if a gamepad disconnects during a session, so that the remaining gamepads retain the same index.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/getGamepads)
     */
    fun getGamepads(): ReadonlyArray<Gamepad?>

    /**
     * The **`requestMIDIAccess()`** method of the Navigator interface returns a Promise representing a request for access to MIDI devices on a user's system.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMIDIAccess)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun requestMIDIAccess(options: MIDIOptions = definedExternally): MIDIAccess

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
     * The **`navigator.sendBeacon()`** method Asynchronous sends an HTTP POST request containing a small amount of data to a web server.
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
     * The **`share()`** method of the Navigator interface invokes the native sharing mechanism of the device to share data such as text, URLs, or files.
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/share)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun share(data: ShareData = definedExternally)

    @JsName("share")
    fun shareAsync(data: ShareData = definedExternally): Promise<Void>

    /**
     * The **`vibrate()`** method of the Navigator interface pulses the vibration hardware on the device, if such hardware exists.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vibrate)
     */
    fun vibrate(pattern: VibratePattern): Boolean
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
    return awaitPromiseLike(
        requestMediaKeySystemAccessAsync(
            keySystem,
            supportedConfigurations
        )
    )
}
