package test.styleSheets

import kotlinx.css.*
import styled.Import
import styled.StyleSheet

internal const val url = "url(\"https://www.example.com/style.css\")"
internal const val filename = "\"/style.css\""
internal val importUrl = Import(url)
internal val importFile = Import(filename)
internal val importWithTypes = Import(filename, listOf("screen", "print"))

internal class ImportStyleSheet : StyleSheet("ImportStyleSheet", isStatic = true, imports = listOf(importUrl, importWithTypes)) {
    val property1 by css {
        alignContent = Align.end
    }
}
