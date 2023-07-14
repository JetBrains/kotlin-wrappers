@file:JsModule("INTERNAL_ENTITY")

package electron.core

import kotlin.js.Promise


external class Dock {
// Docs: https://electronjs.org/docs/api/dock
    /**
     * an ID representing the request.
     *
     * When `critical` is passed, the dock icon will bounce until either the
     * application becomes active or the request is canceled.
     *
     * When `informational` is passed, the dock icon will bounce for one second.
     * However, the request remains active until either the application becomes active
     * or the request is canceled.
     *
     * **Note:** This method can only be used while the app is not focused; when the
     * app is focused it will return -1.
     *
     * @platform darwin
     */
    fun bounce(type: DockBounceType = definedExternally): Double

    /**
     * Cancel the bounce of `id`.
     *
     * @platform darwin
     */
    fun cancelBounce(id: Double): Unit

    /**
     * Bounces the Downloads stack if the filePath is inside the Downloads folder.
     *
     * @platform darwin
     */
    fun downloadFinished(filePath: String): Unit

    /**
     * The badge string of the dock.
     *
     * @platform darwin
     */
    fun getBadge(): String

    /**
     * The application's dock menu.
     *
     * @platform darwin
     */
    fun getMenu(): Menu?

    /**
     * Hides the dock icon.
     *
     * @platform darwin
     */
    fun hide(): Unit

    /**
     * Whether the dock icon is visible.
     *
     * @platform darwin
     */
    fun isVisible(): Boolean

    /**
     * Sets the string to be displayed in the dock’s badging area.
     *
     * @platform darwin
     */
    fun setBadge(text: String): Unit

    /**
     * Sets the `image` associated with this dock icon.
     *
     * @platform darwin
     */
    fun setIcon(image: NativeImage): Unit

    fun setIcon(image: String): Unit

    /**
     * Sets the application's dock menu.
     *
     * @platform darwin
     */
    fun setMenu(menu: Menu): Unit

    /**
     * Resolves when the dock icon is shown.
     *
     * @platform darwin
     */
    fun show(): Promise<Unit>
}
