package typescript.karakum

import io.github.sgrishchenko.karakum.configuration.Granularity
import io.github.sgrishchenko.karakum.configuration.NamespaceStrategy
import io.github.sgrishchenko.karakum.extension.plugins.configurable.UnionInjection
import io.github.sgrishchenko.karakum.generate
import io.github.sgrishchenko.karakum.util.manyOf
import js.import.import
import js.objects.recordOf
import node.path.path
import node.process.process
import node.url.fileURLToPath
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

suspend fun main() {
    val typescriptPackage = import.meta.resolve("typescript/package.json")
        .let { fileURLToPath(it) }
        .let { path.dirname(it) }

    val outputPath = process.argv[2]

    generate {
        plugins = manyOf(
            ContractFunctionApiPlugin(),

            convertArrayInheritance,
            convertCollections,
            convertConflictingOverloads,
            convertIncompatibleParameterName,
            convertJSDocAugmentsTagClassReference,
            convertKindEnums,
            convertSkippedGenerics,
            convertTypealiasParameterBounds,
            convertUtilityTypes,
            convertWithMetadata,
        )
        injections = manyOf(
            injectCommonUnionParents,
            decorateUnionInjection(UnionInjection()),
        )
        annotations = manyOf(
            ::annotateUnusedTypealiasParameter,
            ::annotateVarOverrides,
        )
        nameResolvers = manyOf(
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
        )
        inheritanceModifiers = manyOf(
            ::modifyInterfaceInheritance,
            ::modifyMethodInheritance,
            ::modifyPropertyInheritance,
        )
        varianceModifiers = manyOf(
            ::modifyInterfaceVariance,
        )

        input = manyOf("$typescriptPackage/lib/typescript.d.ts")
        output = outputPath
        ignoreOutput = manyOf(
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
        libraryName = "typescript"
        libraryNameOutputPrefix = true
        granularity = Granularity.topLevel
        moduleNameMapper = recordOf(
            ".+" to "typescript"
        )
        packageNameMapper = recordOf(
            "ts/(.+)" to "typescript/$1",
            "createProgram.kt" to "createProgram.fun.kt",
        )
        importInjector = recordOf(
            ".contract.kt" to arrayOf(
                "kotlin.contracts.contract"
            ),
            "FileWatcherCallback.kt" to arrayOf(
                "js.date.Date"
            ),
            "LanguageService.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "LanguageServiceHost.kt" to arrayOf(
                "js.promise.Promise"
            ),
            "ReadonlyUnderscoreEscapedMap.kt" to arrayOf(
                "js.collections.ReadonlyMap"
            ),
            "SolutionBuilderHostBase.kt" to arrayOf(
                "js.date.Date"
            ),
            "System.kt" to arrayOf(
                "js.date.Date"
            )
        )
        namespaceStrategy = recordOf(
            "ScriptSnapshot" to NamespaceStrategy.`object`,
            "JsTyping" to NamespaceStrategy.`object`,
            "ts" to NamespaceStrategy.`package`
        )
        disclaimer = "// Automatically generated - do not modify!"
    }
}
