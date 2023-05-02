package emotion.utils

import js.core.ReadonlyArray
import web.html.HTMLElement
import web.html.HTMLStyleElement

external interface StyleSheet {
    val container: HTMLElement
    val nonce: String?
    val key: String
    fun insert(rule: String)
    fun flush()
    val tags: ReadonlyArray<HTMLStyleElement>
}
