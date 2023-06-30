package electron


external interface Document {
    fun createElement(tagName: String /* 'webview' */): WebviewTag
}
