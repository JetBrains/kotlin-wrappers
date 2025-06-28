package styled

import js.array.asList
import js.globals.globalThis
import web.blob.Blob
import web.blob.BlobPart
import web.blob.BlobPropertyBag
import web.cssom.CSSStyleSheet
import web.dom.Element
import web.dom.document
import web.html.HtmlTagName
import web.location.location
import web.storage.localStorage
import web.uievents.CLICK
import web.uievents.PointerEvent
import web.uievents.PointerEventInit
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
        val blobUrl = URL.createObjectURL(Blob(binaryData, BlobPropertyBag(type = "application/text")))
        val link = document.createElement(HtmlTagName.a)
        link.href = blobUrl
        link.download = name
        document.body.appendChild(link)
        val clickEvent = PointerEvent(
            type = PointerEvent.CLICK,
            init = PointerEventInit(
                bubbles = true,
                cancelable = true,
                view = window,
            )
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
        globalThis["StyledNext"] = object : StyledNext {
            override fun useDevSheet(isDev: Boolean) {
                this@GlobalCssAccess.useDevSheet(isDev)
            }

            override fun getStylesheets(): Array<CSSStyleSheet> {
                return buildList {
                    for (i in 0 until document.styleSheets.length) {
                        val node = document.styleSheets.item(i) ?: continue
                        if ((node.ownerNode as Element).id.asString().startsWith("ksc-global-style")) add(node)
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

            override fun getCss(partialCss: String?) =
                mapNotNullRules { if (it.contains(partialCss ?: "")) it else null }

            override fun downloadCss(partialCss: String?, filename: String?) {
                downloadFile(getCss(partialCss).joinToString("\n"), filename ?: "index.css")
            }
        }
    }
}
