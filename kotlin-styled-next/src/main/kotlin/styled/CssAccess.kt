package styled

import kotlinx.browser.window
import kotlinx.js.jso
import web.location.location
import web.storage.localStorage

internal object GlobalCssAccess {
    private enum class SheetType {
        Dev,
        CSSOM
    }

    private const val sheetTypeKey: String = "sheetType"

    @Suppress("UNUSED_PARAMETER")
    private fun downloadFile(blob: dynamic, name: String) {
        js(
            """var binaryData = [];
           binaryData.push(blob);
           var blobUrl = URL.createObjectURL(new Blob(binaryData, {type: 'application/text'}));
           var link = document.createElement('a');
           link.href = blobUrl;
           link.download = name;
           document.body.appendChild(link);
           link.dispatchEvent(new MouseEvent('click', { bubbles: true, cancelable: true, view: window }));
           document.body.removeChild(link);"""
        )
    }

    /**
     * download a file with CSS rules that contain [partialCss]
     */
    private fun downloadCss(partialCss: String? = null, filename: String = "index.css") {
        downloadFile(getCss(partialCss).join("\n"), filename)
    }

    private fun getStylesheets(): dynamic {
        return js(
            """
                var nodes = [];
                for (var i = 0; i < document.styleSheets.length; i++) {
                    var node = document.styleSheets[i];
                    if (node.ownerNode.id.startsWith('ksc-global-style')) nodes.push(node);
                }
                return nodes;"""
        )
    }

    /**
     * @param block is executed on every CSS text rule in DOM
     * @return resulting array of [block] returned values if they are not null
     */
    @Suppress("UNUSED_PARAMETER")
    private fun mapNotNullRules(block: dynamic): dynamic {
        return js(
            """var result = [];
           var stylesheets = StyledNext.getStylesheets();
           for (var i = 0; i < stylesheets.length; i++) {
               var rules = stylesheets[i].rules;
               for (var j = 0; j < rules.length; j++) {
                   var value = block(rules[j].cssText);
                   if (value != null) {
                       result.push(value);
                   }
               }
           }
           return result;"""
        )
    }

    /**
     * @return array of all CSS rules that contain [partialCss]
     */
    @Suppress("UNUSED_PARAMETER")
    internal fun getCss(partialCss: String? = null): dynamic {
        return js(
            """
            StyledNext.mapNotNullRules(function(it) { return it.includes(partialCss || '') ? it : null });
        """
        )
    }

    internal fun useDevSheet(isDev: Boolean = true) {
        localStorage.setItem(sheetTypeKey, if (isDev) SheetType.Dev.name else SheetType.CSSOM.name)
        location.reload()
    }

    fun isDevSheet(): Boolean {
        return localStorage.getItem(sheetTypeKey) == SheetType.Dev.name
    }

    internal fun setupCssHelperFunctions() {
        window.asDynamic().StyledNext = jso {
            if (!isDevSheet()) {
                getCss = { str: String? ->
                    getCss(str)
                }
                getStylesheets = {
                    getStylesheets()
                }
                mapNotNullRules = { block: dynamic ->
                    mapNotNullRules(block)
                }
                downloadCss = { str: String? ->
                    downloadCss(str)
                }
            }
            useDevSheet = { isDev: Boolean ->
                useDevSheet(isDev)
            }
        }
    }
}
