plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npmv("react-beautiful-dnd"))
}
