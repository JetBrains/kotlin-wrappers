package electron.core


external interface Document {
    fun createElement(tagName: String /* 'webview' */): electron.WebviewTag
}
