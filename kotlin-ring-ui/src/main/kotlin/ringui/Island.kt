@file:JsModule("@jetbrains/ring-ui/components/island/island")
@file:JsNonModule

package ringui

import react.RClass
import react.dom.WithClassName

// https://github.com/JetBrains/ring-ui/blob/master/components/island/island.js
external interface IslandProps : WithClassName {
    val narrow: Boolean
    val withoutPaddings: Boolean
}

@JsName("default")
external val Island: RClass<IslandProps>

external val AdaptiveIsland: RClass<IslandProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/island/header.js
external interface IslandHeaderProps : WithClassName {
    var border: Boolean
    var wrapWithTitle: Boolean
    var phase: Number
}

@JsName("Header")
external val IslandHeader: RClass<IslandHeaderProps>

// https://github.com/JetBrains/ring-ui/blob/master/components/island/content.js
external interface IslandContentProps : WithClassName {
    var scrollableWrapperClassName: String
    var fade: Boolean
    var bottomBorder: Boolean
    var onScroll: () -> Unit
    var onScrollToBottom: () -> Unit
}

@JsName("Content")
external val IslandContent: RClass<IslandContentProps>
