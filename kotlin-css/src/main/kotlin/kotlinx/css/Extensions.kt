package kotlinx.css

private val hyphenize: (String) -> String = memoizeString {
    buildString {
        it.forEach {
            append(when (it) {
                in 'A'..'Z' -> "-${it.toLowerCase()}"
                else -> it
            })
        }
    }
}

private fun <R> memoizeString(fn: (String) -> R): (String) -> R {
    val map = LinkedHashMap<String, R>()
    return {
        synchronized(map) {
            if (!map.containsKey(it)) {
                map[it] = fn(it)
            }

            map[it]!!
        }
    }
}


fun String.hyphenize() = hyphenize(this)


operator fun String.times(n: Int): String {
    return when (n) {
        0 -> ""
        1 -> this
        else -> {
            var i = 0
            var result: String = this
            while (++i < n) {
                result += this
            }
            result
        }
    }
}
