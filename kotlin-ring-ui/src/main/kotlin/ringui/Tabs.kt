@file:JsModule("@jetbrains/ring-ui/components/tabs/tabs")
@file:JsNonModule

package ringui

import react.RClass
import react.dom.WithClassName

//https://github.com/JetBrains/ring-ui/blob/master/components/tabs/tabs.js
external interface TabsProps : WithClassName {
    var theme: String
    var selected: String
    var onSelect: (String) -> Unit
    var href: String
    var autoCollapse: Boolean
}

external val Tabs: RClass<TabsProps>

external interface TabProps : WithClassName {
    var title: dynamic // PropTypes.oneOfType([PropTypes.node, PropTypes.func]).isRequired,
    var id: String
}

external val Tab: RClass<TabProps>

external interface SmartTabsProps : WithClassName {
    var initSelected: String
}

external val SmartTabs: RClass<SmartTabsProps>

external interface CustomItemProps : WithClassName

external val CustomItem: RClass<CustomItemProps>
