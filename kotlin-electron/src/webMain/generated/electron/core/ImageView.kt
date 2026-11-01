// Automatically generated - do not modify!

@file:JsModule("INTERNAL_ENTITY")

package electron.core

open external class ImageView : View {
    /**
     * ImageView
     */
    constructor ()

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
