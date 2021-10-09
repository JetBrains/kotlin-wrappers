@file:Suppress("NOTHING_TO_INLINE")

package ringui

import react.dom.html.AnchorTarget

sealed external interface IFooterItem

inline fun IFooterItem(string: String): IFooterItem =
    string.unsafeCast<IFooterItem>()

external interface FooterItem : IFooterItem {
    var copyright: String
    var url: String
    var label: String
    var title: String
    var target: AnchorTarget
}
