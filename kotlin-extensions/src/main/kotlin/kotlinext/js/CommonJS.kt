package kotlinext.js

import kotlin.js.*

external interface Context: JsFunction1<String, dynamic> {
    fun resolve(module: String): String
    fun keys(): Array<String>
    val id: Int
}

fun requireAll(context: Context) = context.keys().forEach(context::invoke)

external object require {
    fun resolve(module: String): String

    // Note: require.context is a webpack-specific function
    fun context(directory: String, useSubdirectories: Boolean, regExp: RegExp): Context
}

inline operator fun require.invoke(module: String) = asDynamic()(module)
