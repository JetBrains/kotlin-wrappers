// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

open external class ImageView : View {
    /**
     * ImageView
     */
    constructor ()
// Docs: https://electronjs.org/docs/api/image-view
    /**
     * Emitted when the view's bounds have changed in response to being laid out. The
     * new bounds can be retrieved with `view.getBounds()`.
     */

    /**
     * Sets the image for this `ImageView`. Note that only image formats supported by
     * `NativeImage` can be used with an `ImageView`.
     *
     * @experimental
     */
    fun setImage(image: NativeImage)

    @web.events.JsEvent("bounds-changed")
    override val boundsChangedEvent: node.events.EventInstance<js.array.Tuple>
}
