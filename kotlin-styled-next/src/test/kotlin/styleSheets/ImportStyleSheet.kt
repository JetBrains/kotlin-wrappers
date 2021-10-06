package styleSheets

import kotlinx.css.Align
import kotlinx.css.alignContent
import styled.Import
import styled.StyleSheet

internal const val url = "url(\"https://www.example.com/style.css\")"
internal const val filename = "\"/style.css\""
internal val importUrl = Import(url)
internal val importFile = Import(filename)
internal val importWithTypes = Import(filename, listOf("screen", "print"))

internal class ImportStyleSheetStatic : StyleSheet("ImportStyleSheetStatic", isStatic = true, imports = listOf(importUrl, importWithTypes)) {
    val property1 by css { alignContent = Align.end }
}

internal class ImportStyleSheet : StyleSheet("ImportStyleSheet", imports = listOf(importFile, importUrl)) {
    val property1 by css { alignContent = Align.end }
}
