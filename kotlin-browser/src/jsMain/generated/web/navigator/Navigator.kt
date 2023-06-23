// Automatically generated - do not modify!

package web.navigator

import js.core.ReadonlyArray
import js.core.Void
import web.clipboard.Clipboard
import web.credentials.CredentialsContainer
import web.gamepad.Gamepad
import web.geolocation.Geolocation
import web.http.BodyInit
import web.media.capabilities.MediaCapabilities
import web.media.devices.MediaDevices
import web.media.key.MediaKeySystemAccess
import web.media.key.MediaKeySystemConfiguration
import web.media.session.MediaSession
import web.midi.MIDIAccess
import web.midi.MIDIOptions
import web.permissions.Permissions
import web.serviceworker.ServiceWorkerContainer
import web.share.ShareData
import web.url.URL
import web.useractivation.UserActivation
import web.vibration.VibratePattern
import web.wakelock.WakeLock
import kotlin.js.Promise

/**
 * The state and the identity of the user agent. It allows scripts to query it and to register themselves to carry on some activities.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator)
 */
sealed external class Navigator :
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
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/clipboard)
     */
    val clipboard: Clipboard

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/credentials)
     */
    val credentials: CredentialsContainer
    val doNotTrack: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/geolocation) */
    val geolocation: Geolocation

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/maxTouchPoints) */
    val maxTouchPoints: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaCapabilities) */
    val mediaCapabilities: MediaCapabilities

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaDevices)
     */
    val mediaDevices: MediaDevices

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/mediaSession) */
    val mediaSession: MediaSession

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/permissions) */
    val permissions: Permissions

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/serviceWorker)
     */
    val serviceWorker: ServiceWorkerContainer

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/userActivation) */
    val userActivation: UserActivation

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/wakeLock) */
    val wakeLock: WakeLock

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare)
     */
    fun canShare(data: ShareData = definedExternally): Boolean

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/getGamepads) */
    fun getGamepads(): ReadonlyArray<Gamepad?>

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMIDIAccess)
     */
    fun requestMIDIAccess(options: MIDIOptions = definedExternally): Promise<MIDIAccess>

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/requestMediaKeySystemAccess)
     */
    fun requestMediaKeySystemAccess(
        keySystem: String,
        supportedConfigurations: ReadonlyArray<MediaKeySystemConfiguration>,
    ): Promise<MediaKeySystemAccess>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/sendBeacon) */
    fun sendBeacon(
        url: String,
        data: BodyInit? = definedExternally,
    ): Boolean

    fun sendBeacon(
        url: URL,
        data: BodyInit? = definedExternally,
    ): Boolean

    /**
     * Available only in secure contexts.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/share)
     */
    fun share(data: ShareData = definedExternally): Promise<Void>

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/vibrate) */
    fun vibrate(pattern: VibratePattern): Boolean
}
