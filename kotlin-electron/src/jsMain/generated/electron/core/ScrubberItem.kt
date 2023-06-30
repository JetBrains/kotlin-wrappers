package electron.core


external interface ScrubberItem {
// Docs: https://electronjs.org/docs/api/structures/scrubber-item
    /**
     * The image to appear in this item.
     */
    var icon: NativeImage?

    /**
     * The text to appear in this item.
     */
    var label: String?
}
