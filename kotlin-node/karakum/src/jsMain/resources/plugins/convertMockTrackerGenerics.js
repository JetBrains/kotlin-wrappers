import ts from "typescript"

function isMockTrackerMethod(node) {
    return (
        ts.isMethodDeclaration(node)
        && node.parent
        && ts.isClassDeclaration(node.parent)
        && node.parent.name?.text === "MockTracker"
    )
}

export default function (node) {
    const sourceFileName = node.getSourceFile()?.fileName ?? "generated.d.ts"
    if (!sourceFileName.endsWith("test.d.ts")) return null

    if (
        ts.isTypeParameterDeclaration(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "MockedObject"
            || node.name.text === "MethodName"
            || node.name.text === "Implementation"
        )

        && node.parent
        && isMockTrackerMethod(node.parent)
    ) {
        return ""
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)

        && node.parent
        && ts.isParameter(node.parent)

        && node.parent.parent
        && isMockTrackerMethod(node.parent.parent)
    ) {
        if (node.typeName.text === "MockedObject") {
            return "Any"
        }

        if (node.typeName.text === "MethodName") {
            return "String"
        }

        if (node.typeName.text === "Implementation") {
            return "Function<*>"
        }

        return null
    }

    if (
        ts.isTypeOperatorNode(node)
        && ts.isTypeReferenceNode(node.type)
        && ts.isIdentifier(node.type.typeName)
        && node.type.typeName.text === "MockedObject"

        && node.parent
        && ts.isParameter(node.parent)

        && node.parent.parent
        && isMockTrackerMethod(node.parent.parent)
    ) {
        return "String"
    }

    if (
        ts.isTypeReferenceNode(node)
        && ts.isIdentifier(node.typeName)
        && node.typeName.text === "Mock"
        && node.typeArguments
        && ts.isUnionTypeNode(node.typeArguments[0])

        && node.parent
        && isMockTrackerMethod(node.parent)
        && node.parent.type === node
    ) {
        return "Mock<Function<*>>"
    }

    if (
        ts.isConditionalTypeNode(node)

        && node.parent
        && isMockTrackerMethod(node.parent)
        && node.parent.type === node
    ) {
        return "Mock<Function<*>>"
    }

    return null
}
