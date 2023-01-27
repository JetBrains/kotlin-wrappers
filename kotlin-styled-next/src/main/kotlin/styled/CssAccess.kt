package styled

import js.core.jso
import web.buffer.Blob
import web.buffer.BlobPart
import web.cssom.CSSStyleSheet
import web.dom.Element
import web.dom.document
import web.events.EventType
import web.html.HTMLAnchorElement
import web.location.location
import web.storage.localStorage
import web.uievents.MouseEvent
import web.url.URL
import web.window.window

external interface StyledNext {
    /** download a file with CSS rules that contain partialCss */
    var downloadCss: (partialCss: String?, filename: String?) -> Unit

    /** @return array of all CSS rules that contain partialCss */
    var getCss: (String?) -> Array<String>

    var getStylesheets: () -> Array<CSSStyleSheet>
    var useDevSheet: (Boolean) -> Unit

    /**
     * @param [block] is executed on every CSS text rule in DOM
     * @return resulting array of [block] returned values if they are not null
     */
    fun <T> mapNotNullRules(block: (String) -> T?): Array<T>
}

internal object GlobalCssAccess {
    private enum class SheetType {
        Dev,
        CSSOM
    }

    private const val sheetTypeKey: String = "sheetType"

    @Suppress("UNUSED_PARAMETER")
    private fun downloadFile(blob: BlobPart, name: String) {
        val binaryData = arrayOf(blob)
        val blobUrl = URL.createObjectURL(Blob(binaryData, jso { type = "application/text" }))
        val link = document.createElement("a") as HTMLAnchorElement
        link.href = blobUrl
        link.download = name
        document.body.appendChild(link)
        link.dispatchEvent(MouseEvent(EventType("click"), jso { bubbles = true; cancelable = true; view = window }))
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
        window.asDynamic().StyledNext = jso<StyledNext> {
            this.getStylesheets = {
                buildList {
                    for (i in 0 until document.styleSheets.length) {
                        val node = document.styleSheets.item(i) ?: continue
                        if ((node.ownerNode as Element).id.startsWith("ksc-global-style")) add(node)
                    }
                }.toTypedArray()
            }

            this.asDynamic().mapNotNullRules = { block: (String) -> Any ->
                getStylesheets().flatMap {
                    val rules = it.cssRules
                    (0 until rules.length).mapNotNull { i ->
                        rules.item(i)?.run {
                            block(cssText)
                        }
                    }
                }.toTypedArray()
            }

            this.downloadCss = { partialCss: String?, filename: String? ->
                downloadFile(getCss(partialCss).joinToString("\n"), filename ?: "index.css")
            }

            this.getCss = { partialCss ->
                mapNotNullRules { if (it.contains(partialCss ?: "")) it else null }
            }

            this.useDevSheet = this@GlobalCssAccess::useDevSheet
        }
    }
}
