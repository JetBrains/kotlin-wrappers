import ts from 'typescript'

const jsObjectsToAnnotate = [
  'RouteObject',
]

export default (node, context) => {
  if (
    ts.isTypeAliasDeclaration(node)
    && jsObjectsToAnnotate.some(name =>
      node.name.text === name ||
      node.type.types?.some(item => item.getText() === name))

    || context.isAnonymousDeclaration
    && ts.isIntersectionTypeNode(node)
  ) {
    return `@kotlinx.js.JsPlainObject`
  }

  return null
}
