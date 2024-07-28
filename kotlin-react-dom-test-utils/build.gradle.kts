plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinBrowser)
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    jsMainImplementation(kotlinx.coroutines.core)
    jsMainImplementation(kotlinx.coroutines.test)

    jsMainApi(npmv("react-dom"))
}
