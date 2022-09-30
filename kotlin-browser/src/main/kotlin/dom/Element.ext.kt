package dom

// COPIED from `kotlinx.dom`

fun Element.appendText(text: String): Element {
    appendChild(ownerDocument!!.createTextNode(text))
    return this
}
