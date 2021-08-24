package kotlinx.css

open class StyleList<T>(private val delimiter: String) {
    private val list = mutableListOf<T>()

    override fun toString() = when {
        list.isEmpty() -> "none"
        else -> list.joinToString(delimiter)
    }

    fun<R> map(transform: (T) -> R): List<R> {
        return list.map(transform)
    }

    fun clear() = list.clear()

    operator fun plusAssign(item: T) {
        list += item
    }
}
