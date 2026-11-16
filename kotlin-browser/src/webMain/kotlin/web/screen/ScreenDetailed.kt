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
    open val availLeft: Int

    /**
     * A number representing the y-coordinate (top edge) of the available screen area
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/availTop)
     */
    open val availTop: Int

    /**
     * A number representing the screen's device pixel ratio
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/devicePixelRatio)
     */
    open val devicePixelRatio: Double

    /**
     * A boolean indicating whether the screen is internal to the device or external
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/isInternal)
     */
    open val isInternal: Boolean

    /**
     * A boolean indicating whether the screen is set as the operating system (OS) primary screen or not
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/isPrimary)
     */
    open val isPrimary: Boolean

    /**
     * A string providing a descriptive label for the screen, for example "Built-in Retina Display"
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/label)
     */
    open val label: String

    /**
     * A number representing the x-coordinate (left-hand edge) of the total screen area
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/left)
     */
    open val left: Int

    /**
     * A number representing the y-coordinate (top edge) of the total screen area
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ScreenDetailed/top)
     */
    open val top: Int
}
