package web.screen

import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed)
 */
@ExperimentalWebApi
open external class ScreenDetailed
private constructor() :
    Screen {
    /**
     * A number representing the x-coordinate (left-hand edge) of the available screen area
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/availLeft)
     */
    val availLeft: Int

    /**
     * A number representing the y-coordinate (top edge) of the available screen area
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/availTop)
     */
    val availTop: Int

    /**
     * A number representing the screen's device pixel ratio
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/devicePixelRatio)
     */
    val devicePixelRatio: Double

    /**
     * A boolean indicating whether the screen is internal to the device or external
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/isInternal)
     */
    val isInternal: Boolean

    /**
     * A boolean indicating whether the screen is set as the operating system (OS) primary screen or not
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/isPrimary)
     */
    val isPrimary: Boolean

    /**
     * A string providing a descriptive label for the screen, for example "Built-in Retina Display"
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/label)
     */
    val label: String

    /**
     * A number representing the x-coordinate (left-hand edge) of the total screen area
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/left)
     */
    val left: Int

    /**
     * A number representing the y-coordinate (top edge) of the total screen area
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/top)
     */
    val top: Int
}
