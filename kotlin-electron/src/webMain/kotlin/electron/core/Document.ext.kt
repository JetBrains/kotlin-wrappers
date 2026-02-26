package electron.core

import web.dom.TagName

object ElectronTagName {
    inline val webview: TagName<WebviewTag>
        get() = TagName("webview")
}
