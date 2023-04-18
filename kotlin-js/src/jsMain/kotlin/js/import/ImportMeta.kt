package js.import

import kotlin.js.Promise

external interface ImportMeta {
    val url: String

    fun resolve(
        moduleName: String,
    ): Promise<String>
}
