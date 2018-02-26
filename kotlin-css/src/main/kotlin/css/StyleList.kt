package css

open class StyleList<in T>(private val delimiter: String) {
    private val list = mutableListOf<T>()

    override fun toString() = when {
        list.isEmpty() -> "none"
        else -> list.joinToString(delimiter)
    }

    fun clear() = list.clear()

    operator fun plusAssign(item: T) {
        list += item
    }
}
