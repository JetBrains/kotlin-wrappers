package ringui

import kotlinext.js.ReadonlyArray
import react.dom.HTMLAttributeAnchorTarget
import react.dom.WithClassName

external interface FooterItem {
    //Empty, as Footer props accept only plain arrays of either Any (it will convert it into String), either FooterDataItem
}

inline fun FooterItem(string: String): FooterItem = string.unsafeCast<FooterItem>()

external interface FooterDataItem : FooterItem {
    var copyright: String
    var url: String
    var label: String
    var title: String
    var target: HTMLAttributeAnchorTarget
}

external interface FooterProps : WithClassName {
    var floating: Boolean
    var left: ReadonlyArray<FooterItem>
    var center: ReadonlyArray<FooterItem>
    var right: ReadonlyArray<FooterItem>
}
