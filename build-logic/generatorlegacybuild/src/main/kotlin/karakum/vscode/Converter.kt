package karakum.vscode

import karakum.common.ConversionResult
import java.io.File

internal fun parseDeclarations(
    definitionsFile: File,
): List<ConversionResult> {
    check(definitionsFile.exists())

    return emptyList()
}
