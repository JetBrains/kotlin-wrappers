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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as Rule

        return hashCode() == other.hashCode()
                && selector == other.selector
                && css == other.css
    }
}