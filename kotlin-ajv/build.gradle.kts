plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinJs)

    webMainImplementation(projects.kotlinJsPlainObject)

    webMainApi(npm(jspkg.ajv))
}
