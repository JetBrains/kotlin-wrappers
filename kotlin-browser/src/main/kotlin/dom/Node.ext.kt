package dom

// COPIED from `kotlinx.dom`

fun Node.clear() {
    while (hasChildNodes()) {
        removeChild(firstChild as Node)
    }
}
