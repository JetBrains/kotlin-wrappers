import ts from "typescript";
import * as karakum from "karakum";

function isNodeSuccessor(node, context) {
    let name

    if (ts.isTypeReferenceNode(node)) {
        name = node.typeName
    } else if (ts.isExpressionWithTypeArguments(node)) {
        name = node.expression
    } else {
        return false
    }

    if (
        ts.isIdentifier(name)
        && name.text === "Node"
    ) {
        return true
    }

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const typeChecker = typeScriptService?.program.getTypeChecker()

    const symbol = typeChecker?.getSymbolAtLocation(name)
    if (!symbol || !symbol.declarations) return false

    return symbol.declarations
        .some(declaration => {
            if (ts.isInterfaceDeclaration(declaration)) {
                return (declaration.heritageClauses ?? [])
                    .flatMap(it => it.types)
                    .some(type => isNodeSuccessor(type, context))
            } else if (ts.isTypeAliasDeclaration(declaration)) {
                if (ts.isIntersectionTypeNode(declaration.type)) {
                    return declaration.type.types.some(type => isNodeSuccessor(type, context))
                } else if (ts.isUnionTypeNode(declaration.type)) {
                    return declaration.type.types.every(type => isNodeSuccessor(type, context))
                } else {
                    return isNodeSuccessor(declaration.type, context)
                }
            } else {
                return false
            }
        })
}

function isEnumMemberType(node, context, enumName) {
    let name

    if (ts.isTypeReferenceNode(node)) {
        name = node.typeName
    } else {
        return false
    }

    if (
        ts.isQualifiedName(name)
        && ts.isIdentifier(name.left)
        && name.left.text === enumName
    ) {
        return true
    }

    const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
    const typeChecker = typeScriptService?.program.getTypeChecker()

    const symbol = typeChecker?.getSymbolAtLocation(name)
    if (!symbol || !symbol.declarations) return false

    return symbol.declarations
        .some(declaration => {
            if (ts.isTypeAliasDeclaration(declaration)) {
                if (ts.isUnionTypeNode(declaration.type)) {
                    return declaration.type.types.every(type => isEnumMemberType(type, context, enumName))
                } else {
                    return isEnumMemberType(declaration.type, context, enumName)
                }
            } else {
                return false
            }
        })
}

const injectCommonUnionParents = (node, context, render) => {
    const result = []

    for (const enumName of ["SyntaxKind", "ScriptKind", "CommandTypes"]) {
        if (
            context.type === karakum.InjectionType.HERITAGE_CLAUSE
            && ts.isUnionTypeNode(node)
            && node.types.every(type => isEnumMemberType(type, context, enumName))
        ) {
            result.push(enumName)
        }
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.types.every(type => isNodeSuccessor(type, context))
    ) {
        result.push("Node")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "BindingName"
    ) {
        result.push("DeclarationName")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "ModuleName"
    ) {
        result.push("DeclarationStatementName")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "MemberName"
    ) {
        result.push("DeclarationName")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && (
            node.parent.name.text === "KeywordTypeSyntaxKind"
            || node.parent.name.text === "ModifierSyntaxKind"
        )
    ) {
        result.push("KeywordSyntaxKind")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "JsonObjectExpression"
    ) {
        result.push("Expression")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "EntityNameExpression"
    ) {
        result.push("LeftHandSideExpression")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)
        && node.parent
        && ts.isTypeAliasDeclaration(node.parent)
        && node.parent.name.text === "ObjectLiteralElementLike"
    ) {
        result.push("ObjectLiteralElement")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)

        && node.parent
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "name"

        && node.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "DeclarationStatement"
    ) {
        result.push("DeclarationName")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)

        && node.parent
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "expression"

        && node.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "JsxTagNamePropertyAccess"
    ) {
        result.push("LeftHandSideExpression")
    }

    if (
        context.type === karakum.InjectionType.HERITAGE_CLAUSE
        && ts.isUnionTypeNode(node)

        && node.parent
        && ts.isPropertySignature(node.parent)
        && ts.isIdentifier(node.parent.name)
        && node.parent.name.text === "expression"

        && node.parent.parent
        && ts.isTypeLiteralNode(node.parent.parent)

        && node.parent.parent.parent
        && ts.isIntersectionTypeNode(node.parent.parent.parent)

        && node.parent.parent.parent.parent
        && ts.isPropertySignature(node.parent.parent.parent.parent)
        && ts.isIdentifier(node.parent.parent.parent.parent.name)
        && node.parent.parent.parent.parent.name.text === "class"

        && node.parent.parent.parent.parent.parent
        && ts.isInterfaceDeclaration(node.parent.parent.parent.parent.parent)
        && (
            node.parent.parent.parent.parent.parent.name.text === "JSDocAugmentsTag"
            || node.parent.parent.parent.parent.parent.name.text === "JSDocImplementsTag"
        )
    ) {
        result.push("LeftHandSideExpression")
    }

    return result
}

function decorateUnionInjection(unionInjection) {
    return {
        setup: (...args) => unionInjection.setup(...args),
        traverse: (...args) => unionInjection.traverse(...args),
        render: (...args) => unionInjection.render(...args),
        generate: (...args) => unionInjection.generate(...args),

        inject: (...args) => unionInjection.inject(...args)
                ?.filter(it => (
                    it !== "EditorSettingsIndentStyle"
                    && it !== "ExternalFileScriptKind"
                    && it !== "CompilerOptionsModule"
                    && it !== "CompilerOptionsJsx"
                    && it !== "CompilerOptionsModuleResolution"
                    && it !== "CompilerOptionsNewLine"
                    && it !== "CompilerOptionsTarget"
                    && it !== "ConvertScriptKindNameResult"
                    && it !== "WatchOptionsFallbackPolling"
                    && it !== "WatchOptionsWatchDirectory"
                    && it !== "WatchOptionsWatchFile"
                    && it !== "CustomTransformersAfterDeclarationsItemTypeArgument"
                )) ?? null,
    }
}

export default [
    injectCommonUnionParents,
    decorateUnionInjection(new karakum.UnionInjection()),
]
