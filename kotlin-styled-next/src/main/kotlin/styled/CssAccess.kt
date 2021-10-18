package styled

import kotlinext.js.jso
import kotlinx.browser.window

internal object GlobalCssAccess {
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

    private fun getStylesheet(): dynamic {
        return js(
            """for (var i = 0; i < document.styleSheets.length; i++) {
               var node = document.styleSheets[i];
               if (node.ownerNode.id === 'ksc-global-style') return node;
           }"""
        )
    }

    /**
     * @param block is executed on every CSS text rule in DOM
     * @return resulting array of [block] returned values if they are not null
     */
    @Suppress("UNUSED_PARAMETER")
    private fun mapNotNullRules(block: dynamic): dynamic {
        return js(
            """var rules = StyledNext.getStylesheet().rules;
           var result = [];
           for (var i = 0; i < rules.length; i++) {
               var value = block(rules[i].cssText);
               if (value != null) {
                   result.push(value);
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

    internal fun setupCssHelperFunctions() {
        window.asDynamic().StyledNext = jso {
            getCss = { str: String? ->
                getCss(str)
            }
            getStylesheet = {
                getStylesheet()
            }
            mapNotNullRules = { block: dynamic ->
                mapNotNullRules(block)
            }
            downloadCss = { str: String? ->
                downloadCss(str)
            }
        }
    }
}
