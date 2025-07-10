package karakum.browser

import karakum.common.SuspendExtensionsCollector

internal class BrowserSuspendExtensionsCollector(
    parentName: String,
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
}
