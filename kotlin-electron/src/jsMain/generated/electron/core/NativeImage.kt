@file:JsModule("INTERNAL_ENTITY")

package electron.core

import node.buffer.Buffer
import kotlin.js.Promise


external class NativeImage {
    /**
     * Add an image representation for a specific scale factor. This can be used to
     * explicitly add different scale factor representations to an image. This can be
     * called on empty images.
     */
    fun addRepresentation(options: AddRepresentationOptions): Unit

    /**
     * The cropped image.
     */
    fun crop(rect: Rectangle): NativeImage

    /**
     * The image's aspect ratio.
     *
     * If `scaleFactor` is passed, this will return the aspect ratio corresponding to
     * the image representation most closely matching the passed value.
     */
    fun getAspectRatio(scaleFactor: Double = definedExternally): Double

    /**
     * A Buffer that contains the image's raw bitmap pixel data.
     *
     * The difference between `getBitmap()` and `toBitmap()` is that `getBitmap()` does
     * not copy the bitmap data, so you have to use the returned Buffer immediately in
     * current event loop tick; otherwise the data might be changed or destroyed.
     */
    fun getBitmap(options: BitmapOptions = definedExternally): Buffer

    /**
     * A Buffer that stores C pointer to underlying native handle of the image. On
     * macOS, a pointer to `NSImage` instance would be returned.
     *
     * Notice that the returned pointer is a weak pointer to the underlying native
     * image instead of a copy, so you _must_ ensure that the associated `nativeImage`
     * instance is kept around.
     *
     * @platform darwin
     */
    fun getNativeHandle(): Buffer

    /**
     * An array of all scale factors corresponding to representations for a given
     * nativeImage.
     */
    fun getScaleFactors(): js.core.ReadonlyArray<Double>

    /**
     * If `scaleFactor` is passed, this will return the size corresponding to the image
     * representation most closely matching the passed value.
     */
    fun getSize(scaleFactor: Double = definedExternally): Size

    /**
     * Whether the image is empty.
     */
    fun isEmpty(): Boolean

    /**
     * Whether the image is a template image.
     */
    fun isTemplateImage(): Boolean

    /**
     * The resized image.
     *
     * If only the `height` or the `width` are specified then the current aspect ratio
     * will be preserved in the resized image.
     */
    fun resize(options: ResizeOptions): NativeImage

    /**
     * Marks the image as a template image.
     */
    fun setTemplateImage(option: Boolean): Unit

    /**
     * A Buffer that contains a copy of the image's raw bitmap pixel data.
     */
    fun toBitmap(options: ToBitmapOptions = definedExternally): Buffer

    /**
     * The data URL of the image.
     */
    fun toDataURL(options: ToDataURLOptions = definedExternally): String

    /**
     * A Buffer that contains the image's `JPEG` encoded data.
     */
    fun toJPEG(quality: Double): Buffer

    /**
     * A Buffer that contains the image's `PNG` encoded data.
     */
    fun toPNG(options: ToPNGOptions = definedExternally): Buffer

    /**
     * A `boolean` property that determines whether the image is considered a template
     * image.
     *
     * Please note that this property only has an effect on macOS.
     *
     * @platform darwin
     */
    var isMacTemplateImage: Boolean

    companion object {
// Docs: https://electronjs.org/docs/api/native-image
        /**
         * Creates an empty `NativeImage` instance.
         */
        fun createEmpty(): NativeImage

        /**
         * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
         * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
         */
        fun createFromBitmap(buffer: Buffer, options: CreateFromBitmapOptions): NativeImage

        /**
         * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
         * JPEG first.
         */
        fun createFromBuffer(buffer: Buffer, options: CreateFromBufferOptions = definedExternally): NativeImage

        /**
         * Creates a new `NativeImage` instance from `dataURL`.
         */
        fun createFromDataURL(dataURL: String): NativeImage

        /**
         * Creates a new `NativeImage` instance from the NSImage that maps to the given
         * image name. See `System Icons` for a list of possible values.
         *
         * The `hslShift` is applied to the image with the following rules:
         *
         * * `hsl_shift[0]` (hue): The absolute hue value for the image - 0 and 1 map to 0
         * and 360 on the hue color wheel (red).
         * * `hsl_shift[1]` (saturation): A saturation shift for the image, with the
         * following key values: 0 = remove all color. 0.5 = leave unchanged. 1 = fully
         * saturate the image.
         * * `hsl_shift[2]` (lightness): A lightness shift for the image, with the
         * following key values: 0 = remove all lightness (make all pixels black). 0.5 =
         * leave unchanged. 1 = full lightness (make all pixels white).
         *
         * This means that `[-1, 0, 1]` will make the image completely white and `[-1, 1,
         * 0]` will make the image completely black.
         *
         * In some cases, the `NSImageName` doesn't match its string representation; one
         * example of this is `NSFolderImageName`, whose string representation would
         * actually be `NSFolder`. Therefore, you'll need to determine the correct string
         * representation for your image before passing it in. This can be done with the
         * following:
         *
         * `echo -e '#import <Cocoa/Cocoa.h>\nint main() { NSLog(@"%@", SYSTEM_IMAGE_NAME);
         * }' | clang -otest -x objective-c -framework Cocoa - && ./test`
         *
         * where `SYSTEM_IMAGE_NAME` should be replaced with any value from this list.
         *
         * @platform darwin
         */
        fun createFromNamedImage(imageName: String, hslShift: js.core.ReadonlyArray<Double> = definedExternally): NativeImage

        /**
         * Creates a new `NativeImage` instance from a file located at `path`. This method
         * returns an empty image if the `path` does not exist, cannot be read, or is not a
         * valid image.
         */
        fun createFromPath(path: String): NativeImage

        /**
         * fulfilled with the file's thumbnail preview image, which is a NativeImage.
         *
         * Note: The Windows implementation will ignore `size.height` and scale the height
         * according to `size.width`.
         *
         * @platform darwin,win32
         */
        fun createThumbnailFromPath(path: String, size: Size): Promise<NativeImage>
    }

}
