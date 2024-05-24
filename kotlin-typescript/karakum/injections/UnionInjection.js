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
        .flatMap(declaration => (
            ts.isInterfaceDeclaration(declaration)
                ? (declaration.heritageClauses ?? []).flatMap(it => it.types)
                : ts.isTypeAliasDeclaration(declaration)
                    ? [declaration.type]
                    : []
        ))
        .some(type => isNodeSuccessor(type, context))
}

function isEnumUnion(node, context, enumName) {
    if (
        ts.isTypeAliasDeclaration(node)
        && ts.isUnionTypeNode(node.type)
    ) {
        for (const type of node.type.types) {
            if (!ts.isTypeReferenceNode(type)) return false

            if (
                ts.isQualifiedName(type.typeName)
                && ts.isIdentifier(type.typeName.left)
                && type.typeName.left.text === enumName
            ) continue

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
            const typeChecker = typeScriptService?.program.getTypeChecker()

            const symbol = typeChecker?.getSymbolAtLocation(type.typeName)
            if (!symbol || !symbol.declarations || symbol.declarations.length > 1) return false

            const [declaration] = symbol.declarations
            if (!isEnumUnion(declaration, context, enumName)) return false
        }

        return true
    } else {
        return false
    }
}

const anonymousUnionDeclarationPlugin = karakum.createAnonymousDeclarationPlugin(
    (node, context, render) => {
        if (
            ts.isUnionTypeNode(node)
            && node.types.every(type => isNodeSuccessor(type, context))
        ) {
            const typeParameters = karakum.extractTypeParameters(node, context)

            const renderedTypeParameters = karakum.renderDeclaration(typeParameters, render)

            const name = context.resolveName(node)

            const declaration = `sealed external interface ${name}${karakum.ifPresent(renderedTypeParameters, it => `<${it}>`)} : Node`

            const reference = `${name}${karakum.ifPresent(karakum.renderReference(typeParameters, render), it => `<${it}>`)}`

            return {name, declaration, reference};
        }

        return null
    }
)

const convertUnion = {
    setup(context) {
    },

    traverse(node, context) {
    },

    render(node, context, next) {
        const anonymousUnionDeclaration = anonymousUnionDeclarationPlugin.render(node, context, next)
        if (anonymousUnionDeclaration != null) return anonymousUnionDeclaration

        const unionService = context.lookupService(karakum.unionServiceKey)

        for (const enumName of ["SyntaxKind", "ScriptKind", "CommandTypes"]) {
            if (isEnumUnion(node, context, enumName)) {
                const name = next(node.name)

                const parentNames = unionService?.getParents(node) ?? []
                unionService?.cover(node)

                const heritageClauses = [
                    enumName,
                    ...parentNames,
                ]
                    .filter(Boolean)
                    .join(", ")

                return `sealed external interface ${name}${karakum.ifPresent(heritageClauses, it => ` : ${it}`)}`
            }
        }

        if (
            ts.isTypeAliasDeclaration(node)
            && ts.isUnionTypeNode(node.type)
            && node.type.types.every(type => isNodeSuccessor(type, context))
        ) {
            const name = next(node.name)

            const typeParameters = node.typeParameters
                ?.map(typeParameter => next(typeParameter))
                ?.filter(Boolean)
                ?.join(", ")

            const parentNames = unionService?.getParents(node) ?? []
            unionService?.cover(node)

            const heritageClauses = [
                "Node",
                ...parentNames,
            ]
                .filter(Boolean)
                .join(", ")

            return `sealed external interface ${name}${karakum.ifPresent(typeParameters, it => `<${it}>`)}${karakum.ifPresent(heritageClauses, it => ` : ${it}`)}`
        }

        return null
    },

    inject(node, context, render) {
        return null
    },

    generate(context, render) {
        return anonymousUnionDeclarationPlugin.generate(context, render)
    },
}

export default [
    convertUnion,
    new karakum.UnionInjection(),
]
