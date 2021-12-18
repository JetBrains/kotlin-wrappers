package emotion.css

import kotlinext.js.ReadonlyArray
import org.w3c.dom.HTMLElement
import org.w3c.dom.HTMLStyleElement

external interface StyleSheet {
    val container: HTMLElement
    val nonce: String?
    val key: String
    fun insert(rule: String)
    fun flush()
    val tags: ReadonlyArray<HTMLStyleElement>
}
