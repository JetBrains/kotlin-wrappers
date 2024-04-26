import ts from "typescript";
import * as karakum from "karakum";

const isNull = type => ts.isLiteralTypeNode(type) && type.literal.kind === ts.SyntaxKind.NullKeyword
const isUndefined = type => type.kind === ts.SyntaxKind.UndefinedKeyword

export const isNullableType = type => isNull(type) || isUndefined(type)

export default {
    setup(context) {
        this.unionParents = new Map()
        this.handledUnionParents = new Set()
    },

    traverse(node, context) {
        if (
            ts.isUnionTypeNode(node)
            && node.types.every(type => ts.isTypeReferenceNode(type))
        ) {
            const nameResolverService = context.lookupService(karakum.tnameResolverServiceKey)

            const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
            const typeChecker = typeScriptService?.program.getTypeChecker()

            for (const type of node.types) {
                const symbol = typeChecker?.getSymbolAtLocation(type.typeName)

                let name

                if (
                    ts.isTypeAliasDeclaration(node.parent)
                    && node.parent.type === node
                ) {
                    name = node.parent.name.text
                } else {
                    name = nameResolverService?.resolveName(node, context) ?? "Anonymous"
                }

                if (symbol && name) {
                    const parentNames = this.unionParents.get(symbol) ?? []

                    parentNames.push(name)

                    this.unionParents.set(symbol, parentNames)
                }
            }
        }
    },

    render(node, context, next) {
        return null
    },

    inject(node, context, render) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey)
        const typeChecker = typeScriptService?.program.getTypeChecker()

        if (context.type === karakum.InjectionType.HERITAGE_CLAUSE) {
            if (ts.isClassDeclaration(node) && node.name) {
                const symbol = typeChecker?.getSymbolAtLocation(node.name)
                if (!symbol) return null

                const parentNames = this.unionParents.get(symbol)
                if (!parentNames) return null

                this.handledUnionParents.add(symbol)

                return parentNames
            }

            if (ts.isInterfaceDeclaration(node)) {
                const symbol = typeChecker?.getSymbolAtLocation(node.name)
                if (!symbol) return null

                const parentNames = this.unionParents.get(symbol)
                if (!parentNames) return null

                this.handledUnionParents.add(symbol)

                return parentNames
            }
        }

        return null
    },

    generate(context) {
        for (const symbol of this.unionParents.keys()) {
            if (!this.handledUnionParents.has(symbol)) {
                console.log("Name: ", symbol.declarations[0].name.text)
                console.log("Declarations: ", symbol.declarations.length)
                console.log("Value declaration: ", Boolean(symbol.valueDeclaration))
            }
        }

        return []
    },
}
