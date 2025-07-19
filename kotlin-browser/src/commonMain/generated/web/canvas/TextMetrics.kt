// Automatically generated - do not modify!

package web.canvas

/**
 * The **`TextMetrics`** interface represents the dimensions of a piece of text in the canvas; a `TextMetrics` instance can be retrieved using the CanvasRenderingContext2D.measureText() method.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics)
 */
open external class TextMetrics
private constructor() {
    /**
     * The read-only **`actualBoundingBoxAscent`** property of the TextMetrics interface is a `double` giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the top of the bounding rectangle used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxAscent)
     */
    val actualBoundingBoxAscent: Double

    /**
     * The read-only `actualBoundingBoxDescent` property of the TextMetrics interface is a `double` giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the bottom of the bounding rectangle used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxDescent)
     */
    val actualBoundingBoxDescent: Double

    /**
     * The read-only `actualBoundingBoxLeft` property of the TextMetrics interface is a `double` giving the distance parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign property to the left side of the bounding rectangle of the given text, in CSS pixels; positive numbers indicating a distance going left from the given alignment point.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxLeft)
     */
    val actualBoundingBoxLeft: Double

    /**
     * The read-only `actualBoundingBoxRight` property of the TextMetrics interface is a `double` giving the distance parallel to the baseline from the alignment point given by the CanvasRenderingContext2D.textAlign property to the right side of the bounding rectangle of the given text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/actualBoundingBoxRight)
     */
    val actualBoundingBoxRight: Double

    /**
     * The read-only `alphabeticBaseline` property of the TextMetrics interface is a `double` giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the alphabetic baseline of the line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/alphabeticBaseline)
     */
    val alphabeticBaseline: Double

    /**
     * The read-only `emHeightAscent` property of the TextMetrics interface returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the top of the _em_ square in the line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightAscent)
     */
    val emHeightAscent: Double

    /**
     * The read-only `emHeightDescent` property of the TextMetrics interface returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the bottom of the _em_ square in the line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/emHeightDescent)
     */
    val emHeightDescent: Double

    /**
     * The read-only `fontBoundingBoxAscent` property of the TextMetrics interface returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute, to the top of the highest bounding rectangle of all the fonts used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxAscent)
     */
    val fontBoundingBoxAscent: Double

    /**
     * The read-only `fontBoundingBoxDescent` property of the TextMetrics interface returns the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline attribute to the bottom of the bounding rectangle of all the fonts used to render the text, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/fontBoundingBoxDescent)
     */
    val fontBoundingBoxDescent: Double

    /**
     * The read-only `hangingBaseline` property of the TextMetrics interface is a `double` giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the hanging baseline of the line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/hangingBaseline)
     */
    val hangingBaseline: Double

    /**
     * The read-only `ideographicBaseline` property of the TextMetrics interface is a `double` giving the distance from the horizontal line indicated by the CanvasRenderingContext2D.textBaseline property to the ideographic baseline of the line box, in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/ideographicBaseline)
     */
    val ideographicBaseline: Double

    /**
     * The read-only **`width`** property of the TextMetrics interface contains the text's advance width (the width of that inline box) in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextMetrics/width)
     */
    val width: Double
}
