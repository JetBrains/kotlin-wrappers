// Automatically generated - do not modify!

package web.canvas

/**
 * The dimensions of a piece of text in the canvas, as created by the CanvasRenderingContext2D.measureText() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics)
 */
sealed external class TextMetrics {
    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxAscent)
     */
    val actualBoundingBoxAscent: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxDescent)
     */
    val actualBoundingBoxDescent: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxLeft)
     */
    val actualBoundingBoxLeft: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxRight)
     */
    val actualBoundingBoxRight: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/alphabeticBaseline)
     */
    val alphabeticBaseline: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightAscent)
     */
    val emHeightAscent: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightDescent)
     */
    val emHeightDescent: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxAscent)
     */
    val fontBoundingBoxAscent: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxDescent)
     */
    val fontBoundingBoxDescent: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/hangingBaseline)
     */
    val hangingBaseline: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/ideographicBaseline)
     */
    val ideographicBaseline: Double

    /**
     * Returns the measurement described below.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/width)
     */
    val width: Double
}
