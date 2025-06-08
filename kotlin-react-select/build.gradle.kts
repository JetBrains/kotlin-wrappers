plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinReact)
    jsMainApi(projects.kotlinReactDom)

    commonMainApi(npm(jspkg.reactSelect))
}
