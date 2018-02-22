package styled

import kotlinext.js.*

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
    val map = HashMap<String, R>()
    return {
        if (!map.containsKey(it)) {
            map[it] = fn(it)
        }
        map[it]!!
    }
}


fun String.hyphenize() = hyphenize(this)
