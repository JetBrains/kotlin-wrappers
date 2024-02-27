package kotlinx.css.properties

import kotlinx.css.CssValue
import kotlinx.css.LinearDimension

data class LineHeight(override val value: String) : CssValue(value) {
    override fun toString() = value

    companion object {
        val normal = LineHeight("normal")
        val initial = LineHeight("initial")
        val inherit = LineHeight("inherit")
    }
}

val LinearDimension.lh get() = LineHeight(this.value)
