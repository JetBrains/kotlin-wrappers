package kotlinext.js

external object require {
    fun resolve(module: String): String
}

inline operator fun require.invoke(module: String) = asDynamic()(module)
