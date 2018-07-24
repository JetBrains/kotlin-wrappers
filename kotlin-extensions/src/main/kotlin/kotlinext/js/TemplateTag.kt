package kotlinext.js

external interface TemplateTag<in T, out R> {
    fun call(ctx: Any?, strings: Array<String>, vararg values: T): R
}

operator fun <T, R> TemplateTag<T, R>.invoke(strings: Array<String>, vararg values: T) =
    this.call(null, strings, *values)

operator fun <T, R> TemplateTag<T, R>.invoke(string: String, vararg values: T) = this(arrayOf(string), *values)
operator fun <T, R> TemplateTag<T, R>.invoke(vararg values: T) = this(emptyArray(), *values)
