package wrappersgenerator.tanstack.react.virtual

import arrow.core.raise.nullable
import io.github.sgrishchenko.karakum.extension.Context
import io.github.sgrishchenko.karakum.extension.plugins.typeScriptServiceKey
import js.numbers.contains
import typescript.EntityName
import typescript.SymbolFlags

// `Virtualizer` -> `declare class Virtualizer<...>`
fun resolveDeclaration(typeName: EntityName, context: Context) = nullable {
    val typeScriptService = context.requireService(typeScriptServiceKey)
    val typeChecker = typeScriptService.program.getTypeChecker()

    val symbol = ensureNotNull(typeChecker.getSymbolAtLocation(typeName))

    val target = if (SymbolFlags.Alias in symbol.flags) {
        typeChecker.getAliasedSymbol(symbol)
    } else {
        symbol
    }

    ensureNotNull(target.declarations?.singleOrNull())
}
