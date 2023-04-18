package js.import

external interface ImportMeta {
    val url: String

    fun resolve(
        moduleName: String,
    ): String
}
