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

    return result
}

export default [
    injectCommonUnionParents,
    new karakum.UnionInjection(),
]
