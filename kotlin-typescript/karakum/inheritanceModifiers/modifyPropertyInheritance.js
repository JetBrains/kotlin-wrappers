import ts from "typescript"

export default (node) => {
    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            node.name.text === "kind"
            || node.name.text === "parent"
        )

        && !(
            node.parent
            && ts.isInterfaceDeclaration(node.parent)
            && (
                node.parent.name.text === "Node"
                || node.parent.name.text === "TypePredicateBase"
                || node.parent.name.text === "CallHierarchyItem"
                || node.parent.name.text === "CommentRange"
                || node.parent.name.text === "CompletionEntry"
                || node.parent.name.text === "CompletionEntryDetails"
                || node.parent.name.text === "DefinitionInfo"
                || node.parent.name.text === "HighlightSpan"
                || node.parent.name.text === "ImplementationLocation"
                || node.parent.name.text === "InlayHint"
                || node.parent.name.text === "InvalidatedProjectBase"
            )
        )
    ) {
        return "override"
    }

    if (
        ts.isPropertySignature(node)
        && ts.isIdentifier(node.name)
        && (
            (
                node.name.text === "left"
                && node.parent
                && node.parent.name?.text === "ArrayDestructuringAssignment"
            )
            || (
                (
                    node.name.text === "body"
                    || node.name.text === "name"
                )
                && node.parent
                && node.parent.name?.text === "ArrowFunction"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "AssertsIdentifierTypePredicate"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "AssertsThisTypePredicate"
            )
            || (
                (
                    node.name.text === "left"
                    || node.name.text === "operatorToken"
                )
                && node.parent
                && node.parent.name?.text === "AssignmentExpression"
            )
            || (
                node.name.text === "value"
                && node.parent
                && node.parent.name?.text === "BigIntLiteralType"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "BindingElement"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ClassDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ClassElement"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ClassLikeDeclarationBase"
            )
            || (
                node.name.text === "moduleSpecifier"
                && node.parent
                && node.parent.name?.text === "CompletionEntryDataResolved"
            )
            || (
                node.name.text === "exportMapKey"
                && node.parent
                && node.parent.name?.text === "CompletionEntryDataUnresolved"
            )
            || (
                node.name.text === "body"
                && node.parent
                && node.parent.name?.text === "ConstructorDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "DeclarationStatement"
            )
            || (
                (
                    node.name.text === "file"
                    || node.name.text === "start"
                    || node.name.text === "length"
                )
                && node.parent
                && node.parent.name?.text === "DiagnosticWithLocation"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "EnumDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "EnumMember"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ExportSpecifier"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "FunctionDeclaration"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "FunctionExpression"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "FunctionOrConstructorTypeNodeBase"
            )
            || (
                (
                    node.name.text === "name"
                    || node.name.text === "body"
                )
                && node.parent
                && node.parent.name?.text === "GetAccessorDeclaration"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "IdentifierTypePredicate"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                && ts.isTypeAliasDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name.text === "ImmediatelyInvokedArrowFunction"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                && ts.isTypeAliasDeclaration(node.parent.parent.parent.parent.parent.parent)
                && node.parent.parent.parent.parent.parent.parent.name.text === "ImmediatelyInvokedArrowFunction"
            )
            || (
                node.name.text === "expression"
                && node?.parent?.parent?.parent // PropertySignature / TypeLiteral / IntersectionType / TypeAliasDeclaration
                && ts.isTypeAliasDeclaration(node.parent.parent.parent)
                && node.parent.parent.parent.name.text === "ImmediatelyInvokedFunctionExpression"
            )
            || (
                node.name.text === "expression"
                && node.parent
                && node.parent.name?.text === "ImportCall"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ImportClause"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ImportEqualsDeclaration"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "ImportSpecifier"
            )
            || (
                node.name.text === "type"
                && node.parent
                && node.parent.name?.text === "IndexSignatureDeclaration"
            )
            || (
                node.name.text === "operatorToken"
                && node.parent
                && node.parent.name?.text === "InstanceofExpression"
            )
            || (
                node.name.text === "name"
                && node.parent
                && node.parent.name?.text === "InterfaceDeclaration"
            )
        )
    ) {
        return "override"
    }

    return null
}
