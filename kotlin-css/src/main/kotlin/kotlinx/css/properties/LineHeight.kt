package kotlinx.css.properties

import kotlinx.css.*

class LineHeight(val value: String) {
    companion object {
        val normal = LineHeight("normal")
        val initial = LineHeight("initial")
        val inherit = LineHeight("inherit")
    }

    override fun toString() = value
}

val LinearDimension.lh get() = LineHeight(this.value)
