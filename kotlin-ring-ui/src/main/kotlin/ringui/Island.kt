@file:JsModule("@jetbrains/ring-ui/components/island/island")
@file:JsNonModule

package ringui

import react.ComponentClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/island/island.js
external interface IslandProps : WithClassName {
    val narrow: Boolean
    val withoutPaddings: Boolean
}

@JsName("default")
external val Island: ComponentClass<IslandProps>

external val AdaptiveIsland: ComponentClass<IslandProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/island/header.js
external interface IslandHeaderProps : WithClassName {
    var border: Boolean
    var wrapWithTitle: Boolean
    var phase: Number
}

@JsName("Header")
external val IslandHeader: ComponentClass<IslandHeaderProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/island/content.js
external interface IslandContentProps : WithClassName {
    var scrollableWrapperClassName: String
    var fade: Boolean
    var bottomBorder: Boolean
    var onScroll: () -> Unit
    var onScrollToBottom: () -> Unit
}

@JsName("Content")
external val IslandContent: ComponentClass<IslandContentProps>
