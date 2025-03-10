import ts from "typescript";
import * as karakum from "../karakum.mjs";

function isInstanceType(node) {
    return (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "InstanceType"
    )
}

export default function (node, context, render) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("test.d.ts")) return null

    if (
        ts.isTypeParameterDeclaration(node)
        && node.parent
        && ts.isInterfaceDeclaration(node.parent)
        && node.parent.name.text === "ReporterConstructorWrapper"
    ) {
        if (node.name.text === "T") {
            return `T : Transform`
        }
    }

    if (
        isInstanceType(node)

        && node.parent?.parent
        && ts.isInterfaceDeclaration(node.parent.parent)
        && node.parent.parent.name.text === "ReporterConstructorWrapper"
    ) {
        return render(node.typeArguments[0])
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "T"
    ) {
        const typeScriptService = context.lookupService(karakum.typeScriptServiceKey.get())
        const typeChecker = typeScriptService?.program.getTypeChecker()

        const symbol = typeChecker?.getSymbolAtLocation(node.typeName)

        const typeParameterDeclarations = (symbol?.declarations ?? [])
        const typeParameterDeclaration = typeParameterDeclarations
            .find(declaration => ts.isTypeParameterDeclaration(declaration))

        if (
            typeParameterDeclaration
            && typeParameterDeclaration.parent
            && ts.isInterfaceDeclaration(typeParameterDeclaration.parent)
            && typeParameterDeclaration.parent.name.text === "ReporterConstructorWrapper"
        ) {
            return `JsClass<${render(node)}>`
        }
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "ReporterConstructorWrapper"

        && ts.isTypeQueryNode(node.typeArguments[0])
    ) {
        return `ReporterConstructorWrapper<${render(node.typeArguments[0].exprName)}>`
    }

    return null
}
