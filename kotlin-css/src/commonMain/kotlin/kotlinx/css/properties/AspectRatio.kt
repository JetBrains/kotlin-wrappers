package kotlinx.css.properties

import kotlinx.css.CssValue

class AspectRatio(value: String) : CssValue(value) {
    constructor(ratio: Number) : this(ratio.toString())

    constructor(widthRatio: Number, heightRatio: Number) : this("$widthRatio / $heightRatio")

    companion object {
        val inherit = AspectRatio("inherit")
        val initial = AspectRatio("initial")
        val revert = AspectRatio("revert")
        val revertLayer = AspectRatio("revert-layer")
        val unset = AspectRatio("unset")
        val auto = AspectRatio("auto")
    }
}
