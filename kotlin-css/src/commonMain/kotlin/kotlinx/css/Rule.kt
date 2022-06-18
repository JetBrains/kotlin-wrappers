package kotlinx.css

internal typealias Selector = String

data class Rule(
    val selector: Selector,
    val css: CssBuilder,
) {
    private var memoizedHashCode: Int? = null

    override fun hashCode(): Int {
        return memoizedHashCode ?: (selector.hashCode() + css.hashCode()).also { hash -> memoizedHashCode = hash }
    }

    override fun equals(other: Any?) = this.calculateEquals(other) { otherRule ->
        selector == otherRule.selector && css == otherRule.css
    }
}

internal inline fun <reified T : Any> T.calculateEquals(other: Any?, componentEquals: T.(T) -> Boolean): Boolean {
    if (this === other) return true
    if (other == null || this::class != other::class) return false

    other as T
    return this.hashCode() == other.hashCode() && componentEquals(this, other)
}
