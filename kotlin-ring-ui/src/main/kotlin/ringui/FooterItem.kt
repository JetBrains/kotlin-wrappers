package by.enrollie.eversity_web.components

import react.dom.HTMLAttributeAnchorTarget

sealed external interface IFooterItem {
    //Empty, as Footer props accept only plain arrays of either Any (it will convert it into String), either FooterItem
}

inline fun FooterItem(string: String): IFooterItem =
    string.unsafeCast<IFooterItem>()

external interface FooterItem : IFooterItem {
    var copyright: String
    var url: String
    var label: String
    var title: String
    var target: HTMLAttributeAnchorTarget
}
