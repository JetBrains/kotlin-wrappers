package styled

import js.array.asList
import js.objects.jso
import web.blob.Blob
import web.blob.BlobPart
import web.cssom.CSSStyleSheet
import web.dom.Element
import web.dom.document
import web.html.HTMLAnchorElement
import web.location.location
import web.storage.localStorage
import web.uievents.MouseEvent
import web.url.URL
import web.window.window

external interface StyledNext {
    fun useDevSheet(isDev: Boolean)

    fun getStylesheets(): Array<CSSStyleSheet>

    /**
     * @param [block] is executed on every CSS text rule in DOM
     * @return resulting array of [block] returned values if they are not null
     */
    fun <T> mapNotNullRules(block: (String) -> T?): Array<T>

    /** @return array of all CSS rules that contain partialCss */
    fun getCss(partialCss: String?): Array<String>

    /** download a file with CSS rules that contain partialCss */
    fun downloadCss(partialCss: String?, filename: String?)
}

internal object GlobalCssAccess {
    private enum class SheetType {
        Dev,
        CSSOM
    }

    private const val sheetTypeKey: String = "sheetType"

    private fun downloadFile(blob: BlobPart, name: String) {
        val binaryData = arrayOf(blob)
        val blobUrl = URL.createObjectURL(Blob(binaryData, jso { type = "application/text" }))
        val link = document.createElement("a") as HTMLAnchorElement
        link.href = blobUrl
        link.download = name
        document.body.appendChild(link)
        val clickEvent = MouseEvent(
            MouseEvent.CLICK,
            // TODO: use strict factory after migration on Kotlin 2.0
            jso<dynamic> {
                bubbles = true
                cancelable = true
                view = window
            }
        )
        link.dispatchEvent(clickEvent)
        document.body.removeChild(link)
    }

    fun useDevSheet(isDev: Boolean = true) {
        localStorage.setItem(sheetTypeKey, if (isDev) SheetType.Dev.name else SheetType.CSSOM.name)
        location.reload()
    }

    fun isDevSheet(): Boolean {
        return localStorage.getItem(sheetTypeKey) == SheetType.Dev.name
    }

    internal fun setupCssHelperFunctions() {
        window.asDynamic().StyledNext = object : StyledNext {
            override fun useDevSheet(isDev: Boolean) {
                this@GlobalCssAccess.useDevSheet(isDev)
            }

            override fun getStylesheets(): Array<CSSStyleSheet> {
                return buildList {
                    for (i in 0 until document.styleSheets.length) {
                        val node = document.styleSheets.item(i) ?: continue
                        if ((node.ownerNode as Element).id.startsWith("ksc-global-style")) add(node)
                    }
                }.toTypedArray()
            }

            override fun <T> mapNotNullRules(block: (String) -> T?): Array<T> {
                return getStylesheets().flatMap { sheet ->
                    sheet.cssRules.asList().mapNotNull { rule ->
                        block(rule.cssText)
                    }
                }.toTypedArray()
            }

            override fun getCss(partialCss: String?) = mapNotNullRules { if (it.contains(partialCss ?: "")) it else null }
            override fun downloadCss(partialCss: String?, filename: String?) {
                downloadFile(getCss(partialCss).joinToString("\n"), filename ?: "index.css")
            }
        }
    }
}
