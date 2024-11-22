package js.import

/**
 * The type of `import.meta`.
 *
 * If you need to declare that a given property exists on `import.meta`,
 * this type may be augmented via interface merging.
 */
external interface ImportMeta {
    val url: String

    fun resolve(
        moduleName: String,
    ): String
}
