## kotlin-react-dom

Kotlin wrapper for React DOM library. Major version number of this wrapper matches that of React DOM itself.

### Installation

1. `npm i @jetbrains/kotlin-react-dom`

2. `npm run gen-idea-libs`

See the [Bintray page](https://bintray.com/kotlin/kotlin-js-wrappers/kotlin-react-dom) for Maven and Gradle 
installation instructions.

### Internals
[Imports.kt](src/main/kotlin/react/dom/Imports.kt) contains type definitions for ReactDOM. The remaining classes 
([ReactDOM.kt](src/main/kotlin/react/dom/ReactDOM.kt) and others) provide higher-level APIs on top of that definition.