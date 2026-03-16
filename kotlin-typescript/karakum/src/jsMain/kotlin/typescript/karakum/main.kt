package typescript.karakum

import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.configuration.`object`
import io.github.sgrishchenko.karakum.configuration.`package`
import io.github.sgrishchenko.karakum.extension.plugins.configurable.UnionInjection
import io.github.sgrishchenko.karakum.generate
import js.array.ReadonlyArray
import typescript.karakum.annotations.annotateUnusedTypealiasParameter
import typescript.karakum.annotations.annotateVarOverrides
import typescript.karakum.inheritanceModifiers.modifyInterfaceInheritance
import typescript.karakum.inheritanceModifiers.modifyMethodInheritance
import typescript.karakum.inheritanceModifiers.modifyPropertyInheritance
import typescript.karakum.injections.decorateUnionInjection
import typescript.karakum.injections.injectCommonUnionParents
import typescript.karakum.nameResolvers.*
import typescript.karakum.plugins.*
import typescript.karakum.varianceModifiers.modifyInterfaceVariance

suspend fun main(args: ReadonlyArray<String>) {
    generate(args) {
        plugins = listOf(
            ContractFunctionApiPlugin(),

            convertArrayInheritance,
            convertConflictingOverloads,
            convertIncompatibleParameterName,
            convertJSDocAugmentsTagClassReference,
            convertKindEnums,
            convertSkippedGenerics,
            convertTypealiasParameterBounds,
            convertUtilityTypes,
            convertWithMetadata,
        )
        injections = listOf(
            injectCommonUnionParents,
            decorateUnionInjection(UnionInjection()),
        )
        annotations = listOf(
            ::annotateUnusedTypealiasParameter,
            ::annotateVarOverrides,
        )
        nameResolvers = listOf(
            ::resolveChangePropertyTypesPropertyName,
            ::resolveCustomTransformersAfterDeclarationsItemTypeArgumentName,
            ::resolveFunctionReturnTypeItemName,
            ::resolveFunctionReturnTypePredicateName,
            ::resolveInterfaceMethodParameterItemName,
            ::resolveInterfaceMethodReturnTypeNullableUnionName,
            ::resolveInterfaceMethodTypeParameterConstraintName,
            ::resolveInterfacePropertyConflictingName,
            ::resolveInterfacePropertyIntersectionPropertyName,
            ::resolveInterfacePropertyTypeReferenceItemName,
            ::resolveInterfacePropertyArrayTypeItemName,
            ::resolveInterfacePropertyNullableUnionName,
            ::resolveInterfacePropertyPropertyName,
            ::resolveTypeAliasIntersectionPropertyName,
            ::resolveTypeAliasIntersectionBaseName,
            ::resolveTypeAliasNullableUnionName,
            ::resolveTypeAliasNullableUnionPropertyName,
            ::resolveUserPreferencesImportModuleSpecifierEndingJsName,
        )
        inheritanceModifiers = listOf(
            ::modifyInterfaceInheritance,
            ::modifyMethodInheritance,
            ::modifyPropertyInheritance,
        )
        varianceModifiers = listOf(
            ::modifyInterfaceVariance,
        )

        input = listOf("lib/typescript.d.ts")
        ignoreOutput = listOf(
            "**/server/**",
            "**/CompletionsTriggerCharacter.kt",
            "**/SignatureHelpRetriggerCharacter.kt",
            "**/SignatureHelpTriggerCharacter.kt",
            "**/SignatureDeclarationBaseKind.kt",
            "**/isTypeOnlyExportDeclaration.contract.kt",
            "**/isTypeOnlyExportDeclaration.kt",
            "**/isTypeOnlyImportDeclaration.contract.kt",
            "**/isTypeOnlyImportDeclaration.kt",
        )
        isolatedOutputPackage = true
        packageNameMapper = mapOf(
            "lib/typescript" to "/",
            "^ts/(.+)" to "typescript/$1",
            "createProgram.kt" to "createProgram.fun.kt",
        )
        importInjector = mapOf(
            ".contract.kt" to listOf(
                "kotlin.contracts.contract"
            ),
        )
        namespaceStrategy = mapOf(
            "ScriptSnapshot" to NamespaceStrategy.`object`,
            "JsTyping" to NamespaceStrategy.`object`,
            "ts" to NamespaceStrategy.`package`
        )
    }
}
