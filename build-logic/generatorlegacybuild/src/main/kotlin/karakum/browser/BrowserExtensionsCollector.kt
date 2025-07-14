package karakum.browser

import karakum.common.SuspendExtensionsCollector

internal class BrowserSuspendExtensionsCollector private constructor(
    parentName: String?,
    parentTypeParameters: String?,
) : SuspendExtensionsCollector(parentName, parentTypeParameters) {

    override fun getResult(): String {
        val extensions = super.getResult()
        return when (parentName) {
            "CustomElementRegistry" -> extensions.replace(
                "CustomElementRegistry.whenDefined(name: String): CustomElementConstructor",
                "<T : HTMLElement> CustomElementRegistry.whenDefined(name: TagName<T>): CustomElementConstructor<T>"
            )

            "Clients" -> extensions.replace("matchAllAsync()", "matchAllAsync<T>()")
            else -> extensions
        }
    }

    companion object {
        /**
         * Returned collector will generate suspend extensions to the `parentName`.
         */
        fun forParent(parentName: String, parentTypeParameters: String?): BrowserSuspendExtensionsCollector {
            return BrowserSuspendExtensionsCollector(parentName, parentTypeParameters)
        }

        /**
         * Returned collector will generate regular suspend functions.
         */
        fun forGlobal(): BrowserSuspendExtensionsCollector {
            return BrowserSuspendExtensionsCollector(null, null)
        }
    }
}
