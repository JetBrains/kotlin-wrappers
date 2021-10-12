package styled

import kotlinx.browser.window

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
 * download file with CSS rules which contains [partialCss]
 */
internal fun downloadCss(partialCss: String? = null, filename: String = "index.css") {
    downloadFile(getCss(partialCss), filename)
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
internal fun mapNotNullRules(block: dynamic): dynamic {
    return js(
        """var rules = getStylesheet().rules;
                 var result = [];
                 for (var i = 0; i < rules.length; i++) {
                     var value = block(rules[i].cssText);
                     if (value != null) {
                         result.push(value);
                     }
                 }
                 return result;
    """
    )
}

/**
 * @return CSS text, which contains [partialCss]
 */
@Suppress("UNUSED_PARAMETER")
internal fun getCss(partialCss: String? = null): String {
    return js(
        """
            console.log(partialCss);
            mapNotNullRules(function(it) { return it.includes(partialCss || '') ? it : null }).join("\n");
        """
    ) as String
}

internal fun setupCssHelperFunctions() {
    window.asDynamic().getCss = { str: String? ->
        getCss(str)
    }
    window.asDynamic().getStylesheet = {
        getStylesheet()
    }
    window.asDynamic().mapNotNullRules = { block: dynamic ->
        mapNotNullRules(block)
    }
    window.asDynamic().downloadCss = { str: String? ->
        downloadCss(str)
    }
}
