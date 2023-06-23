// Automatically generated - do not modify!

package web.screen

/**
 * A screen, usually the one on which the current window is being rendered, and is obtained using window.screen.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen)
 */
sealed external class Screen {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availHeight) */
    val availHeight: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/availWidth) */
    val availWidth: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/colorDepth) */
    val colorDepth: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/height) */
    val height: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/orientation) */
    val orientation: ScreenOrientation

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/pixelDepth) */
    val pixelDepth: Int

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Screen/width) */
    val width: Int
}
