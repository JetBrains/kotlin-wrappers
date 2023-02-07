package ringui

import react.RBuilder
import react.RHandler

fun RBuilder.Tabs(
    active: String?,
    handler: RHandler<TabsProps>,
) {
    Tabs {
        if (active != null) {
            attrs.selected = active
        }

        handler()
    }
}

fun RBuilder.Tab(
    title: String,
    id: String = title,
    handler: RHandler<TabProps>,
) {
    Tab {
        attrs.title = title
        attrs.id = id

        handler()
    }
}


fun RBuilder.SmartTabs(
    active: String?,
    handler: RHandler<SmartTabsProps>,
) {
    SmartTabs {
        if (active != null) {
            attrs.initSelected = active
        }
        handler()
    }
}
